package ast;

// Variable
public class VariableNode extends ExpressionNode {
    private final String name;

    public VariableNode(int line, int column, String name) {
        super(line, column);
        this.name = name;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitVariableNode(this);
    }

    public String getName() {
        return name;
    }
}
