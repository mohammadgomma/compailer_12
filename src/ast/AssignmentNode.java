package ast;

// Assignment Statement
public class AssignmentNode extends StatementNode {
    private final String variable;
    private final ExpressionNode value;

    public AssignmentNode(int line, int column, String variable, ExpressionNode value) {
        super(line, column);
        this.variable = variable;
        this.value = value;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitAssignmentNode(this);
    }

    public String getVariable() {
        return variable;
    }

    public ExpressionNode getValue() {
        return value;
    }
}
