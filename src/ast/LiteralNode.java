package ast;

// Literal Expressions
public class LiteralNode extends ExpressionNode {
    private final Object value;
    private final String type; // "int", "float", "string", "bool", "none"

    public LiteralNode(int line, int column, Object value, String type) {
        super(line, column);
        this.value = value;
        this.type = type;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitLiteralNode(this);
    }

    public Object getValue() {
        return value;
    }

    public String getType() {
        return type;
    }
}
