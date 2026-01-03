package parseTree;

import ANT.CssParser;
import ANT.CssParserBaseVisitor;
import ast.*;
import org.antlr.v4.runtime.Token;

import java.util.ArrayList;
import java.util.List;

public class CssASTBuilder extends CssParserBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitStylesheet(CssParser.StylesheetContext ctx) {
        List<CssRuleNode> rules = new ArrayList<>();
        if (ctx.cssRule() != null) {
            for (CssParser.CssRuleContext ruleCtx : ctx.cssRule()) {
                rules.add((CssRuleNode) visit(ruleCtx));
            }
        }
        // ignoring atRules for now as they are not in the basic requirement
        return null; // This visit method is used by internal parsing
    }

    public List<CssRuleNode> buildRules(CssParser.StylesheetContext ctx) {
        List<CssRuleNode> rules = new ArrayList<>();
        if (ctx.cssRule() != null) {
            for (CssParser.CssRuleContext ruleCtx : ctx.cssRule()) {
                rules.add((CssRuleNode) visit(ruleCtx));
            }
        }
        return rules;
    }

    @Override
    public CssRuleNode visitCssRule(CssParser.CssRuleContext ctx) {
        Token token = ctx.getStart();
        List<String> selectors = new ArrayList<>();
        if (ctx.selectorGroup() != null) {
            selectors.add(ctx.selectorGroup().getText());
        }

        List<CssDeclarationNode> declarations = new ArrayList<>();
        if (ctx.block() != null) {
            for (CssParser.DeclarationContext declCtx : ctx.block().declaration()) {
                declarations.add((CssDeclarationNode) visit(declCtx));
            }
        }

        return new CssRuleNode(token.getLine(), token.getCharPositionInLine(), selectors, declarations);
    }

    @Override
    public CssDeclarationNode visitDeclaration(CssParser.DeclarationContext ctx) {
        Token token = ctx.getStart();
        String property = ctx.property() != null ? ctx.property().getText() : "";
        String value = ctx.value() != null ? ctx.value().getText() : "";

        return new CssDeclarationNode(token.getLine(), token.getCharPositionInLine(), property, value);
    }
}
