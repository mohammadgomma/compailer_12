package ast;

import java.util.List;

// If Statement
public class IfStatementNode extends StatementNode {
    public List<StatementNode> thenBody;
    public List<ElifNode> elifBlocks;
    public List<StatementNode> elseBody;
    private final ExpressionNode condition;

    public IfStatementNode(int line, int column, ExpressionNode condition,
                           List<StatementNode> thenBody,
                           List<ElifNode> elifBlocks,
                           List<StatementNode> elseBody) {
        super(line, column);
        this.condition = condition;
        this.thenBody = thenBody;
        this.elifBlocks = elifBlocks;
        this.elseBody = elseBody;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitIfStatementNode(this);
    }

    // Getters
    public ExpressionNode getCondition() {
        return condition;
    }

    public List<StatementNode> getThenBody() {
        return thenBody;
    }

    public List<ElifNode> getElifBlocks() {
        return elifBlocks;
    }

    public List<StatementNode> getElseBody() {
        return elseBody;
    }
}
