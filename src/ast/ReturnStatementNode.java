package ast;

// Return Statement
public class ReturnStatementNode extends StatementNode {
    private final ExpressionNode value;

    public ReturnStatementNode(int line, int column, ExpressionNode value) {
        super(line, column);
        this.value = value;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitReturnStatementNode(this);
    }

    public ExpressionNode getValue() {
        return value;
    }
}
