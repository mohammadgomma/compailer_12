package parseTree;

import ANT.*;
import ast.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class ASTBuilder extends HtmlParserBaseVisitor<ASTNode> {

    @Override
    public DocumentNode visitStart(HtmlParser.StartContext ctx) {
        List<ElementNode> elements = new ArrayList<>();
        PythonProgramNode pythonProgram = null;

        if (ctx.pythonFullContent() != null) {
            pythonProgram = (PythonProgramNode) visit(ctx.pythonFullContent());
        }

        if (ctx.program() != null) {
            HtmlParser.ProgramContext programCtx = ctx.program();
            if (programCtx.element() != null) {
                for (HtmlParser.ElementContext elemCtx : programCtx.element()) {
                    ASTNode node = visit(elemCtx);
                    if (node instanceof ElementNode) {
                        elements.add((ElementNode) node);
                    }
                }
            }
        }

        Token startToken = ctx.getStart();
        return new DocumentNode(startToken.getLine(), startToken.getCharPositionInLine(),
                elements, pythonProgram);
    }

    @Override
    public ElementNode visitElement(HtmlParser.ElementContext ctx) {
        if (ctx.htmlElement() != null) {
            return (ElementNode) visit(ctx.htmlElement());
        } else if (ctx.jinjaExpression() != null) {
            return (ElementNode) visit(ctx.jinjaExpression());
        } else if (ctx.jinjaBlock() != null) {
            return (ElementNode) visit(ctx.jinjaBlock());
        } else if (ctx.styleElement() != null) {
            return (ElementNode) visit(ctx.styleElement());
        } else if (ctx.TEXT() != null) {
            Token token = ctx.TEXT().getSymbol();
            return new TextNode(token.getLine(), token.getCharPositionInLine(),
                    ctx.TEXT().getText());
        }
        return null;
    }

    @Override
    public HtmlElementNode visitDoctypeElement(HtmlParser.DoctypeElementContext ctx) {
        return buildHtmlElement(ctx, ctx.htmlParts(), true, false, new ArrayList<>());
    }

    @Override
    public HtmlElementNode visitPairedElement(HtmlParser.PairedElementContext ctx) {
        List<ElementNode> children = new ArrayList<>();
        if (ctx.element() != null) {
            for (HtmlParser.ElementContext elemCtx : ctx.element()) {
                ASTNode child = visit(elemCtx);
                if (child instanceof ElementNode) {
                    children.add((ElementNode) child);
                }
            }
        }
        return buildHtmlElement(ctx, ctx.htmlParts(), false, false, children);
    }

    @Override
    public HtmlElementNode visitSelfClosingElement(HtmlParser.SelfClosingElementContext ctx) {
        return buildHtmlElement(ctx, ctx.htmlParts(), false, true, new ArrayList<>());
    }

    private HtmlElementNode buildHtmlElement(HtmlParser.HtmlElementContext ctx,
            HtmlParser.HtmlPartsContext partsCtx,
            boolean isDoctype, boolean selfClosing,
            List<ElementNode> children) {
        Token token = ctx.getStart();
        String tagName = "";
        List<AttributeNode> attributes = new ArrayList<>();

        if (partsCtx != null) {
            if (partsCtx.htmlTagName() != null) {
                tagName = partsCtx.htmlTagName().getText();
            }

            if (partsCtx.htmlAttribute() != null) {
                for (HtmlParser.HtmlAttributeContext attrCtx : partsCtx.htmlAttribute()) {
                    String name = attrCtx.HTML_NAME().getText();
                    String value = attrCtx.HTML_STRING() != null ? attrCtx.HTML_STRING().getText() : "";
                    Token attrToken = attrCtx.HTML_NAME().getSymbol();
                    attributes.add(new AttributeNode(attrToken.getLine(),
                            attrToken.getCharPositionInLine(), name, value));
                }
            }
        }

        return new HtmlElementNode(token.getLine(), token.getCharPositionInLine(),
                tagName, attributes, children, selfClosing, isDoctype);
    }

    @Override
    public StyleElementNode visitStyleElement(HtmlParser.StyleElementContext ctx) {
        Token token = ctx.getStart();
        List<AttributeNode> attributes = new ArrayList<>();

        if (ctx.styleAttribute() != null) {
            for (HtmlParser.StyleAttributeContext attrCtx : ctx.styleAttribute()) {
                String name = attrCtx.STYLE_ATTR_NAME().getText();
                String value = attrCtx.STYLE_ATTR_VALUE() != null ? attrCtx.STYLE_ATTR_VALUE().getText() : "";
                Token attrToken = attrCtx.STYLE_ATTR_NAME().getSymbol();
                attributes.add(new AttributeNode(attrToken.getLine(),
                        attrToken.getCharPositionInLine(), name, value));
            }
        }

        List<CssRuleNode> cssRules = new ArrayList<>();
        if (ctx.cssContent() != null) {
            String cssText = ctx.cssContent().getText();
            // Parse CSS content
            CssLexer cssLexer = new CssLexer(CharStreams.fromString(cssText));
            CommonTokenStream cssTokens = new CommonTokenStream(cssLexer);
            CssParser cssParser = new CssParser(cssTokens);
            CssParser.StylesheetContext cssTree = cssParser.stylesheet();

            CssASTBuilder cssAstBuilder = new CssASTBuilder();
            cssRules = cssAstBuilder.buildRules(cssTree);
        }

        return new StyleElementNode(token.getLine(), token.getCharPositionInLine(), attributes, cssRules);
    }

    @Override
    public JinjaExpressionNode visitJinjaExpression(HtmlParser.JinjaExpressionContext ctx) {
        Token token = ctx.getStart();
        String expression = ctx.jinjaExprContent() != null ? ctx.jinjaExprContent().getText() : "";
        List<JinjaFilterNode> filters = new ArrayList<>();
        return new JinjaExpressionNode(token.getLine(), token.getCharPositionInLine(),
                expression, filters);
    }

    @Override
    public ElementNode visitIfBlock(HtmlParser.IfBlockContext ctx) {
        Token token = ctx.getStart();
        String condition = ctx.jinjaBlockExpr(0) != null ? ctx.jinjaBlockExpr(0).getText() : "";

        List<ElementNode> thenBody = new ArrayList<>();
        if (ctx.element().size() > 0 && ctx.element(0) != null) {
            ElementNode elem = (ElementNode) visit(ctx.element(0));
            if (elem != null)
                thenBody.add(elem);
        }

        List<JinjaElifBlockNode> elifBlocks = new ArrayList<>();
        List<ElementNode> elseBody = new ArrayList<>();

        return new JinjaIfBlockNode(token.getLine(), token.getCharPositionInLine(),
                condition, thenBody, elifBlocks, elseBody);
    }

    @Override
    public ElementNode visitForBlock(HtmlParser.ForBlockContext ctx) {
        Token token = ctx.getStart();
        String variable = ctx.JINJA_BLOCK_ID() != null ? ctx.JINJA_BLOCK_ID().getText() : "";
        String iterable = ctx.jinjaBlockExpr() != null ? ctx.jinjaBlockExpr().getText() : "";

        List<ElementNode> body = new ArrayList<>();
        if (ctx.element().size() > 0) {
            for (HtmlParser.ElementContext elemCtx : ctx.element()) {
                ElementNode elem = (ElementNode) visit(elemCtx);
                if (elem != null)
                    body.add(elem);
            }
        }

        return new JinjaForBlockNode(token.getLine(), token.getCharPositionInLine(),
                variable, iterable, body);
    }

    @Override
    public PythonProgramNode visitPythonFullContent(HtmlParser.PythonFullContentContext ctx) {
        Token token = ctx.getStart();
        List<StatementNode> statements = new ArrayList<>();

        if (ctx.statement() != null) {
            for (HtmlParser.StatementContext stmtCtx : ctx.statement()) {
                StatementNode stmt = (StatementNode) visit(stmtCtx);
                if (stmt != null) {
                    statements.add(stmt);
                }
            }
        }

        return new PythonProgramNode(token.getLine(), token.getCharPositionInLine(), statements);
    }

    @Override
    public StatementNode visitStatement(HtmlParser.StatementContext ctx) {
        if (ctx.import_stmt() != null) {
            return (StatementNode) visit(ctx.import_stmt());
        } else if (ctx.assign_stmt() != null) {
            return (StatementNode) visit(ctx.assign_stmt());
        } else if (ctx.func_def() != null) {
            return (StatementNode) visit(ctx.func_def());
        } else if (ctx.return_stmt() != null) {
            return (StatementNode) visit(ctx.return_stmt());
        } else if (ctx.expr_stmt() != null) {
            return (StatementNode) visit(ctx.expr_stmt());
        }
        return null;
    }

    @Override
    public ImportStatementNode visitImport_stmt(HtmlParser.Import_stmtContext ctx) {
        Token token = ctx.getStart();
        boolean isFromImport = ctx.FROM() != null;
        String module = null;
        List<ImportAliasNode> imports = new ArrayList<>();

        if (isFromImport && ctx.NAME() != null) {
            module = ctx.NAME().getText();
            if (ctx.imported_names() != null) {
                HtmlParser.Imported_namesContext importedNames = ctx.imported_names();
                for (HtmlParser.Imported_nameContext importCtx : importedNames.imported_name()) {
                    String name = importCtx.NAME(0).getText();
                    String alias = importCtx.NAME().size() > 1 ? importCtx.NAME(1).getText() : null;
                    Token importToken = importCtx.getStart();
                    imports.add(new ImportAliasNode(importToken.getLine(),
                            importToken.getCharPositionInLine(), name, alias));
                }
            }
        } else if (ctx.import_list() != null) {
            HtmlParser.Import_listContext importList = ctx.import_list();
            for (HtmlParser.Module_nameContext moduleCtx : importList.module_name()) {
                String name = moduleCtx.NAME(0).getText();
                String alias = moduleCtx.NAME().size() > 1 ? moduleCtx.NAME(1).getText() : null;
                Token moduleToken = moduleCtx.getStart();
                imports.add(new ImportAliasNode(moduleToken.getLine(),
                        moduleToken.getCharPositionInLine(), name, alias));
            }
        }

        return new ImportStatementNode(token.getLine(), token.getCharPositionInLine(),
                module, imports, isFromImport);
    }

    @Override
    public AssignmentNode visitAssign_stmt(HtmlParser.Assign_stmtContext ctx) {
        Token token = ctx.getStart();
        String variable = ctx.NAME().getText();
        ExpressionNode value = ctx.expression() != null ? (ExpressionNode) visit(ctx.expression()) : null;

        return new AssignmentNode(token.getLine(), token.getCharPositionInLine(), variable, value);
    }

    @Override
    public FunctionDefNode visitFunc_def(HtmlParser.Func_defContext ctx) {
        Token token = ctx.getStart();
        String name = ctx.NAME().getText();

        List<DecoratorNode> decorators = new ArrayList<>();
        if (ctx.decorators() != null) {
            for (HtmlParser.DecoratorContext decoratorCtx : ctx.decorators().decorator()) {
                DecoratorNode decorator = (DecoratorNode) visit(decoratorCtx);
                if (decorator != null) {
                    decorators.add(decorator);
                }
            }
        }

        List<ParameterNode> parameters = new ArrayList<>();
        if (ctx.params() != null && ctx.params().param() != null) {
            for (HtmlParser.ParamContext paramCtx : ctx.params().param()) {
                ParameterNode param = (ParameterNode) visit(paramCtx);
                if (param != null) {
                    parameters.add(param);
                }
            }
        }

        List<StatementNode> body = new ArrayList<>();
        if (ctx.suite() != null && ctx.suite().statement() != null) {
            for (HtmlParser.StatementContext stmtCtx : ctx.suite().statement()) {
                StatementNode stmt = (StatementNode) visit(stmtCtx);
                if (stmt != null) {
                    body.add(stmt);
                }
            }
        }

        return new FunctionDefNode(token.getLine(), token.getCharPositionInLine(),
                name, parameters, body, decorators);
    }

    @Override
    public ParameterNode visitParam(HtmlParser.ParamContext ctx) {
        Token token = ctx.getStart();
        String name = ctx.NAME().getText();
        ExpressionNode defaultValue = ctx.expression() != null ? (ExpressionNode) visit(ctx.expression()) : null;

        return new ParameterNode(token.getLine(), token.getCharPositionInLine(), name, defaultValue);
    }

    @Override
    public DecoratorNode visitDecorator(HtmlParser.DecoratorContext ctx) {
        Token token = ctx.getStart();
        String name = ctx.decorator_name() != null ? ctx.decorator_name().getText() : "";
        List<ExpressionNode> arguments = new ArrayList<>();

        return new DecoratorNode(token.getLine(), token.getCharPositionInLine(), name, arguments);
    }

    @Override
    public ExpressionNode visitExpression(HtmlParser.ExpressionContext ctx) {
        return ctx.logical_expr() != null ? (ExpressionNode) visit(ctx.logical_expr()) : null;
    }

    @Override
    public ExpressionNode visitLogical_expr(HtmlParser.Logical_exprContext ctx) {
        if (ctx.comparison_expr().size() == 1) {
            return (ExpressionNode) visit(ctx.comparison_expr(0));
        }
        // For simplicity, return first expression
        return (ExpressionNode) visit(ctx.comparison_expr(0));
    }

    @Override
    public ExpressionNode visitComparison_expr(HtmlParser.Comparison_exprContext ctx) {
        if (ctx.additive_expr().size() == 1) {
            return (ExpressionNode) visit(ctx.additive_expr(0));
        }
        return (ExpressionNode) visit(ctx.additive_expr(0));
    }

    @Override
    public ExpressionNode visitAdditive_expr(HtmlParser.Additive_exprContext ctx) {
        if (ctx.multiplicative_expr().size() == 1) {
            return (ExpressionNode) visit(ctx.multiplicative_expr(0));
        }
        return (ExpressionNode) visit(ctx.multiplicative_expr(0));
    }

    @Override
    public ExpressionNode visitMultiplicative_expr(HtmlParser.Multiplicative_exprContext ctx) {
        if (ctx.primary_expr().size() == 1) {
            return (ExpressionNode) visit(ctx.primary_expr(0));
        }
        return (ExpressionNode) visit(ctx.primary_expr(0));
    }

    @Override
    public ExpressionNode visitPrimary_expr(HtmlParser.Primary_exprContext ctx) {
        if (ctx.literal() != null) {
            return (ExpressionNode) visit(ctx.literal());
        } else if (ctx.NAME() != null) {
            Token token = ctx.NAME().getSymbol();
            return new VariableNode(token.getLine(), token.getCharPositionInLine(),
                    ctx.NAME().getText());
        } else if (ctx.DNAME() != null) {
            Token token = ctx.DNAME().getSymbol();
            return new VariableNode(token.getLine(), token.getCharPositionInLine(),
                    ctx.DNAME().getText());
        } else if (ctx.func_call() != null) {
            return (ExpressionNode) visit(ctx.func_call());
        } else if (ctx.list_expr() != null) {
            return (ExpressionNode) visit(ctx.list_expr());
        } else if (ctx.dict_expr() != null) {
            return (ExpressionNode) visit(ctx.dict_expr());
        } else if (ctx.expression() != null) {
            return (ExpressionNode) visit(ctx.expression());
        }
        return null;
    }

    @Override
    public LiteralNode visitLiteral(HtmlParser.LiteralContext ctx) {
        Token token = ctx.getStart();
        Object value = null;
        String type = null;

        if (ctx.INTEGER() != null) {
            value = Integer.parseInt(ctx.INTEGER().getText());
            type = "int";
        } else if (ctx.FLOAT() != null) {
            value = Double.parseDouble(ctx.FLOAT().getText());
            type = "float";
        } else if (ctx.STRING() != null) {
            value = ctx.STRING().getText();
            type = "string";
        } else if (ctx.TRUE() != null) {
            value = true;
            type = "bool";
        } else if (ctx.FALSE() != null) {
            value = false;
            type = "bool";
        } else if (ctx.NONE() != null) {
            value = null;
            type = "none";
        }

        return new LiteralNode(token.getLine(), token.getCharPositionInLine(), value, type);
    }

    @Override
    public FunctionCallNode visitFunc_call(HtmlParser.Func_callContext ctx) {
        Token token = ctx.getStart();
        String functionName = ctx.NAME() != null ? ctx.NAME().getText() : "";

        List<ExpressionNode> arguments = new ArrayList<>();
        List<KeywordArgumentNode> keywordArguments = new ArrayList<>();

        if (ctx.arg() != null) {
            for (HtmlParser.ArgContext argCtx : ctx.arg()) {
                ExpressionNode arg = (ExpressionNode) visit(argCtx);
                if (arg != null) {
                    arguments.add(arg);
                }
            }
        }

        return new FunctionCallNode(token.getLine(), token.getCharPositionInLine(),
                functionName, arguments, keywordArguments);
    }

    @Override
    public ExpressionNode visitArg(HtmlParser.ArgContext ctx) {
        return ctx.expression() != null ? (ExpressionNode) visit(ctx.expression()) : null;
    }

    @Override
    public ListNode visitList_expr(HtmlParser.List_exprContext ctx) {
        Token token = ctx.getStart();
        List<ExpressionNode> elements = new ArrayList<>();

        if (ctx.expression() != null) {
            for (HtmlParser.ExpressionContext exprCtx : ctx.expression()) {
                ExpressionNode expr = (ExpressionNode) visit(exprCtx);
                if (expr != null) {
                    elements.add(expr);
                }
            }
        }

        return new ListNode(token.getLine(), token.getCharPositionInLine(), elements);
    }

    @Override
    public DictNode visitDict_expr(HtmlParser.Dict_exprContext ctx) {
        Token token = ctx.getStart();
        List<DictItemNode> items = new ArrayList<>();

        if (ctx.dict_item() != null) {
            for (HtmlParser.Dict_itemContext itemCtx : ctx.dict_item()) {
                DictItemNode item = (DictItemNode) visit(itemCtx);
                if (item != null) {
                    items.add(item);
                }
            }
        }

        return new DictNode(token.getLine(), token.getCharPositionInLine(), items);
    }

    @Override
    public DictItemNode visitDict_item(HtmlParser.Dict_itemContext ctx) {
        Token token = ctx.getStart();
        ExpressionNode key = null;
        ExpressionNode value = null;

        if (ctx.STRING() != null) {
            key = new LiteralNode(token.getLine(), token.getCharPositionInLine(),
                    ctx.STRING().getText(), "string");
        } else if (ctx.NAME() != null) {
            key = new VariableNode(token.getLine(), token.getCharPositionInLine(),
                    ctx.NAME().getText());
        }

        if (ctx.expression() != null) {
            value = (ExpressionNode) visit(ctx.expression());
        }

        return new DictItemNode(token.getLine(), token.getCharPositionInLine(), key, value);
    }

    @Override
    public ReturnStatementNode visitReturn_stmt(HtmlParser.Return_stmtContext ctx) {
        Token token = ctx.getStart();
        ExpressionNode value = ctx.expression() != null ? (ExpressionNode) visit(ctx.expression()) : null;

        return new ReturnStatementNode(token.getLine(), token.getCharPositionInLine(), value);
    }

    @Override
    public ExpressionStatementNode visitExpr_stmt(HtmlParser.Expr_stmtContext ctx) {
        Token token = ctx.getStart();
        ExpressionNode expression = ctx.expression() != null ? (ExpressionNode) visit(ctx.expression()) : null;

        return new ExpressionStatementNode(token.getLine(), token.getCharPositionInLine(), expression);
    }
}