package ast;

import java.util.List;

// Decorator
public class DecoratorNode extends ASTNode {
    public List<ExpressionNode> arguments;
    private final String name;

    public DecoratorNode(int line, int column, String name, List<ExpressionNode> arguments) {
        super(line, column);
        this.name = name;
        this.arguments = arguments;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitDecoratorNode(this);
    }

    public String getName() {
        return name;
    }

    public List<ExpressionNode> getArguments() {
        return arguments;
    }
}
