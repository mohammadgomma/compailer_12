package ast;

// Text Element
public class TextNode extends ElementNode {
    private final String content;

    public TextNode(int line, int column, String content) {
        super(line, column);
        this.content = content;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitTextNode(this);
    }

    public String getContent() {
        return content;
    }
}
