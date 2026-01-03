package visitor;

import ast.*;
import symboltable.SymbolTable;

public class SymbolTableVisitor implements ASTVisitor<Void> {
    private final SymbolTable symbolTable;

    public SymbolTableVisitor(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    @Override
    public Void visitDocumentNode(DocumentNode node) {
        if (node.getPythonProgram() != null) {
            node.getPythonProgram().accept(this);
        }
        for (ElementNode element : node.getElements()) {
            element.accept(this);
        }
        return null;
    }

    @Override
    public Void visitHtmlElementNode(HtmlElementNode node) {
        for (AttributeNode attr : node.getAttributes()) {
            attr.accept(this);
        }
        for (ElementNode child : node.getChildren()) {
            child.accept(this);
        }
        return null;
    }

    @Override
    public Void visitTextNode(TextNode node) {
        return null;
    }

    @Override
    public Void visitAttributeNode(AttributeNode node) {
        return null;
    }

    @Override
    public Void visitJinjaExpressionNode(JinjaExpressionNode node) {
        return null;
    }

    @Override
    public Void visitJinjaFilterNode(JinjaFilterNode node) {
        return null;
    }

    @Override
    public Void visitJinjaIfBlockNode(JinjaIfBlockNode node) {
        for (ElementNode element : node.getThenBody()) {
            element.accept(this);
        }
        for (JinjaElifBlockNode elif : node.getElifBlocks()) {
            elif.accept(this);
        }
        if (node.getElseBody() != null) {
            for (ElementNode element : node.getElseBody()) {
                element.accept(this);
            }
        }
        return null;
    }

    @Override
    public Void visitJinjaElifBlockNode(JinjaElifBlockNode node) {
        for (ElementNode element : node.getBody()) {
            element.accept(this);
        }
        return null;
    }

    @Override
    public Void visitJinjaForBlockNode(JinjaForBlockNode node) {
        for (ElementNode element : node.getBody()) {
            element.accept(this);
        }
        return null;
    }

    @Override
    public Void visitJinjaSetBlockNode(JinjaSetBlockNode node) {
        return null;
    }

    @Override
    public Void visitPythonProgramNode(PythonProgramNode node) {
        for (StatementNode stmt : node.getStatements()) {
            stmt.accept(this);
        }
        return null;
    }

    @Override
    public Void visitImportStatementNode(ImportStatementNode node) {
        for (ImportAliasNode importAlias : node.getImports()) {
            String name = importAlias.getAlias() != null ? importAlias.getAlias() : importAlias.getName();
            symbolTable.define(name, "imported", "module", importAlias.getLine(), importAlias.getColumn());
        }
        return null;
    }

    @Override
    public Void visitImportAliasNode(ImportAliasNode node) {
        return null;
    }

    @Override
    public Void visitAssignmentNode(AssignmentNode node) {
        String dataType = inferType(node.getValue());
        symbolTable.define(node.getVariable(), "variable", dataType, node.getLine(), node.getColumn());
        if (node.getValue() != null) {
            node.getValue().accept(this);
        }
        return null;
    }

    @Override
    public Void visitFunctionDefNode(FunctionDefNode node) {
        // Define function in current scope
        symbolTable.define(node.getName(), "function", "function", node.getLine(), node.getColumn());

        // Enter function scope
        symbolTable.enterScope(node.getName(), "function");

        // Add parameters to function scope
        for (ParameterNode param : node.getParameters()) {
            param.accept(this);
        }

        // Process function body
        for (StatementNode stmt : node.getBody()) {
            stmt.accept(this);
        }

        // Exit function scope
        symbolTable.exitScope();

        return null;
    }

    @Override
    public Void visitParameterNode(ParameterNode node) {
        String dataType = node.getDefaultValue() != null ? inferType(node.getDefaultValue()) : "unknown";
        symbolTable.define(node.getName(), "parameter", dataType, node.getLine(), node.getColumn());
        return null;
    }

    @Override
    public Void visitDecoratorNode(DecoratorNode node) {
        return null;
    }

    @Override
    public Void visitIfStatementNode(IfStatementNode node) {
        for (StatementNode stmt : node.getThenBody()) {
            stmt.accept(this);
        }
        for (ElifNode elif : node.getElifBlocks()) {
            elif.accept(this);
        }
        if (node.getElseBody() != null) {
            for (StatementNode stmt : node.getElseBody()) {
                stmt.accept(this);
            }
        }
        return null;
    }

    @Override
    public Void visitElifNode(ElifNode node) {
        for (StatementNode stmt : node.getBody()) {
            stmt.accept(this);
        }
        return null;
    }

    @Override
    public Void visitReturnStatementNode(ReturnStatementNode node) {
        if (node.getValue() != null) {
            node.getValue().accept(this);
        }
        return null;
    }

    @Override
    public Void visitExpressionStatementNode(ExpressionStatementNode node) {
        if (node.getExpression() != null) {
            node.getExpression().accept(this);
        }
        return null;
    }

    @Override
    public Void visitLiteralNode(LiteralNode node) {
        return null;
    }

    @Override
    public Void visitVariableNode(VariableNode node) {
        return null;
    }

    @Override
    public Void visitBinaryOpNode(BinaryOpNode node) {
        if (node.getLeft() != null) {
            node.getLeft().accept(this);
        }
        if (node.getRight() != null) {
            node.getRight().accept(this);
        }
        return null;
    }

    @Override
    public Void visitFunctionCallNode(FunctionCallNode node) {
        for (ExpressionNode arg : node.getArguments()) {
            arg.accept(this);
        }
        for (KeywordArgumentNode kwarg : node.getKeywordArguments()) {
            kwarg.accept(this);
        }
        return null;
    }

    @Override
    public Void visitKeywordArgumentNode(KeywordArgumentNode node) {
        if (node.getValue() != null) {
            node.getValue().accept(this);
        }
        return null;
    }

    @Override
    public Void visitListNode(ListNode node) {
        for (ExpressionNode element : node.getElements()) {
            element.accept(this);
        }
        return null;
    }

    @Override
    public Void visitDictNode(DictNode node) {
        for (DictItemNode item : node.getItems()) {
            item.accept(this);
        }
        return null;
    }

    @Override
    public Void visitDictItemNode(DictItemNode node) {
        if (node.getKey() != null) {
            node.getKey().accept(this);
        }
        if (node.getValue() != null) {
            node.getValue().accept(this);
        }
        return null;
    }

    @Override
    public Void visitCssRule(CssRuleNode node) {
        for (CssDeclarationNode decl : node.getDeclarations()) {
            decl.accept(this);
        }
        return null;
    }

    @Override
    public Void visitCssDeclaration(CssDeclarationNode node) {
        return null;
    }

    @Override
    public Void visitStyleElement(StyleElementNode node) {
        for (CssRuleNode rule : node.getCssRules()) {
            rule.accept(this);
        }
        return null;
    }

    private String inferType(ExpressionNode expr) {
        if (expr instanceof LiteralNode) {
            return ((LiteralNode) expr).getType();
        } else if (expr instanceof ListNode) {
            return "list";
        } else if (expr instanceof DictNode) {
            return "dict";
        } else if (expr instanceof FunctionCallNode) {
            return "return_value";
        }
        return "unknown";
    }
}
