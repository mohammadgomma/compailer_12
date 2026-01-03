package ast;

import java.util.List;

public class DocumentNode extends ASTNode {
    public List<ElementNode> elements;
    public PythonProgramNode pythonProgram;

    public DocumentNode(int line, int column, List<ElementNode> elements, PythonProgramNode pythonProgram) {
        super(line, column);
        this.elements = elements;
        this.pythonProgram = pythonProgram;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitDocumentNode(this);
    }

    public List<ElementNode> getElements() {
        return elements;
    }

    public PythonProgramNode getPythonProgram() {
        return pythonProgram;
    }
}