package ast;

// Python Statement
public abstract class StatementNode extends ASTNode {
    public StatementNode(int line, int column) {
        super(line, column);
    }
}
