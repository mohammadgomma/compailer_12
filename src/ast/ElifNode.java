package ast;

import java.util.List;

// Elif Block
public class ElifNode extends ASTNode {
    public List<StatementNode> body;
    private final ExpressionNode condition;

    public ElifNode(int line, int column, ExpressionNode condition, List<StatementNode> body) {
        super(line, column);
        this.condition = condition;
        this.body = body;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitElifNode(this);
    }

    public ExpressionNode getCondition() {
        return condition;
    }

    public List<StatementNode> getBody() {
        return body;
    }
}
