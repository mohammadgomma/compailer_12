package ast;

// Expression Statement
public class ExpressionStatementNode extends StatementNode {
    private final ExpressionNode expression;

    public ExpressionStatementNode(int line, int column, ExpressionNode expression) {
        super(line, column);
        this.expression = expression;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitExpressionStatementNode(this);
    }

    public ExpressionNode getExpression() {
        return expression;
    }
}
