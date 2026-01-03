package ast;

public interface ASTVisitor<T> {
    // Document
    T visitDocumentNode(DocumentNode node);

    // HTML Elements
    T visitHtmlElementNode(HtmlElementNode node);

    T visitTextNode(TextNode node);

    T visitAttributeNode(AttributeNode node);

    // Jinja2 Elements
    T visitJinjaExpressionNode(JinjaExpressionNode node);

    T visitJinjaFilterNode(JinjaFilterNode node);

    T visitJinjaIfBlockNode(JinjaIfBlockNode node);

    T visitJinjaElifBlockNode(JinjaElifBlockNode node);

    T visitJinjaForBlockNode(JinjaForBlockNode node);

    T visitJinjaSetBlockNode(JinjaSetBlockNode node);

    // Python Elements
    T visitPythonProgramNode(PythonProgramNode node);

    T visitImportStatementNode(ImportStatementNode node);

    T visitImportAliasNode(ImportAliasNode node);

    T visitAssignmentNode(AssignmentNode node);

    T visitFunctionDefNode(FunctionDefNode node);

    T visitParameterNode(ParameterNode node);

    T visitDecoratorNode(DecoratorNode node);

    T visitIfStatementNode(IfStatementNode node);

    T visitElifNode(ElifNode node);

    T visitReturnStatementNode(ReturnStatementNode node);

    T visitExpressionStatementNode(ExpressionStatementNode node);

    T visitLiteralNode(LiteralNode node);

    T visitVariableNode(VariableNode node);

    T visitBinaryOpNode(BinaryOpNode node);

    T visitFunctionCallNode(FunctionCallNode node);

    T visitKeywordArgumentNode(KeywordArgumentNode node);

    T visitListNode(ListNode node);

    T visitDictNode(DictNode node);

    T visitDictItemNode(DictItemNode node);

    // CSS Elements
    T visitCssRule(CssRuleNode node);

    T visitCssDeclaration(CssDeclarationNode node);

    T visitStyleElement(StyleElementNode node);
}