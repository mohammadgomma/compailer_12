package ast;

import java.util.List;

// Function Definition
public class FunctionDefNode extends StatementNode {
    public List<ParameterNode> parameters;
    public List<StatementNode> body;
    public List<DecoratorNode> decorators;
    private final String name;

    public FunctionDefNode(int line, int column, String name,
                           List<ParameterNode> parameters,
                           List<StatementNode> body,
                           List<DecoratorNode> decorators) {
        super(line, column);
        this.name = name;
        this.parameters = parameters;
        this.body = body;
        this.decorators = decorators;
    }

    @Override
    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visitFunctionDefNode(this);
    }

    // Getters
    public String getName() {
        return name;
    }

    public List<ParameterNode> getParameters() {
        return parameters;
    }

    public List<StatementNode> getBody() {
        return body;
    }

    public List<DecoratorNode> getDecorators() {
        return decorators;
    }
}
