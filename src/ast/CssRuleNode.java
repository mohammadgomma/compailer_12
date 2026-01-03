package ast;

import java.util.List;

public class CssRuleNode extends CssNode {
    private final List<String> selectors;
    private final List<CssDeclarationNode> declarations;

    public CssRuleNode(int line, int column, List<String> selectors, List<CssDeclarationNode> declarations) {
        super(line, column);
        this.selectors = selectors;
        this.declarations = declarations;
    }

    public List<String> getSelectors() {
        return selectors;
    }

    public List<CssDeclarationNode> getDeclarations() {
        return declarations;
    }

    @Override
    public <R> R accept(ASTVisitor<R> visitor) {
        return visitor.visitCssRule(this);
    }
}
