package ast;

import java.util.List;

// HTML Element
public class HtmlElementNode extends ElementNode {
    public List<AttributeNode> attributes;
    public List<ElementNode> children;
    private final String tagName;
    private final boolean selfClosing;
    private final boolean isDoctype;

    public HtmlElementNode(int line, int column, String tagName,
                           List<AttributeNode> attributes, List<ElementNode> children,
                           boolean selfClosing, boolean isDoctype) {
        super(line, column);
        this.tagName = tagName;
        this.attributes = attributes;
        this.children = children;
        this.selfClosing = selfClosing;
        this.isDoctype = isDoctype;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitHtmlElementNode(this);
    }

    // Getters
    public String getTagName() {
        return tagName;
    }

    public List<AttributeNode> getAttributes() {
        return attributes;
    }

    public List<ElementNode> getChildren() {
        return children;
    }

    public boolean isSelfClosing() {
        return selfClosing;
    }

    public boolean isDoctype() {
        return isDoctype;
    }
}
