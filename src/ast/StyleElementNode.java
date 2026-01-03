package ast;

import java.util.List;

public class StyleElementNode extends ElementNode {
    private final List<AttributeNode> attributes;
    private final List<CssRuleNode> cssRules;

    public StyleElementNode(int line, int column, List<AttributeNode> attributes, List<CssRuleNode> cssRules) {
        super(line, column);
        this.attributes = attributes;
        this.cssRules = cssRules;
    }

    public List<AttributeNode> getAttributes() {
        return attributes;
    }

    public List<CssRuleNode> getCssRules() {
        return cssRules;
    }

    @Override
    public <R> R accept(ASTVisitor<R> visitor) {
        return visitor.visitStyleElement(this);
    }
}
