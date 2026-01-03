package ast;

import java.util.List;

// Jinja If Block
public class JinjaIfBlockNode extends ElementNode {
    public List<ElementNode> thenBody;
    public List<JinjaElifBlockNode> elifBlocks;
    public List<ElementNode> elseBody;
    private final String condition;

    public JinjaIfBlockNode(int line, int column, String condition,
                            List<ElementNode> thenBody,
                            List<JinjaElifBlockNode> elifBlocks,
                            List<ElementNode> elseBody) {
        super(line, column);
        this.condition = condition;
        this.thenBody = thenBody;
        this.elifBlocks = elifBlocks;
        this.elseBody = elseBody;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitJinjaIfBlockNode(this);
    }

    // Getters
    public String getCondition() {
        return condition;
    }

    public List<ElementNode> getThenBody() {
        return thenBody;
    }

    public List<JinjaElifBlockNode> getElifBlocks() {
        return elifBlocks;
    }

    public List<ElementNode> getElseBody() {
        return elseBody;
    }
}
