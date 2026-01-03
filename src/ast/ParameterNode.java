package ast;

// Parameter
public class ParameterNode extends ASTNode {
    private final String name;
    private final ExpressionNode defaultValue;

    public ParameterNode(int line, int column, String name, ExpressionNode defaultValue) {
        super(line, column);
        this.name = name;
        this.defaultValue = defaultValue;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitParameterNode(this);
    }

    public String getName() {
        return name;
    }

    public ExpressionNode getDefaultValue() {
        return defaultValue;
    }
}
