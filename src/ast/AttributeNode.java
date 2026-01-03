package ast;

// Attribute
public class AttributeNode extends ASTNode {
    private final String name;
    private final String value;

    public AttributeNode(int line, int column, String name, String value) {
        super(line, column);
        this.name = name;
        this.value = value;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitAttributeNode(this);
    }

    public String getName() {
        return name;
    }

    public String getValue() {
        return value;
    }
}
