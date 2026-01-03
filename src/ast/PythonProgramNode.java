package ast;

import java.util.List;

// Python Program
public class PythonProgramNode extends ASTNode {
    public List<StatementNode> statements;

    public PythonProgramNode(int line, int column, List<StatementNode> statements) {
        super(line, column);
        this.statements = statements;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitPythonProgramNode(this);
    }

    public List<StatementNode> getStatements() {
        return statements;
    }
}

