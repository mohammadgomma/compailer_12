// Generated from src/ANT/HtmlParser.g4 by ANTLR 4.13.1
package ANT;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HtmlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HtmlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HtmlParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(HtmlParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#pythonFullContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonFullContent(HtmlParser.PythonFullContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(HtmlParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#import_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_stmt(HtmlParser.Import_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#imported_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImported_names(HtmlParser.Imported_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#imported_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImported_name(HtmlParser.Imported_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#import_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImport_list(HtmlParser.Import_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#module_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModule_name(HtmlParser.Module_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(HtmlParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#expr_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr_stmt(HtmlParser.Expr_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(HtmlParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#func_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_def(HtmlParser.Func_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#decorators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorators(HtmlParser.DecoratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#decorator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator(HtmlParser.DecoratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#decorator_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator_name(HtmlParser.Decorator_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#decorator_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecorator_args(HtmlParser.Decorator_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParams(HtmlParser.ParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(HtmlParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#suite}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSuite(HtmlParser.SuiteContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#simple_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_stmt(HtmlParser.Simple_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#small_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmall_stmt(HtmlParser.Small_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(HtmlParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(HtmlParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(HtmlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#logical_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_expr(HtmlParser.Logical_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#comparison_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_expr(HtmlParser.Comparison_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#additive_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_expr(HtmlParser.Additive_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#multiplicative_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_expr(HtmlParser.Multiplicative_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#primary_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary_expr(HtmlParser.Primary_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(HtmlParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#list_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_expr(HtmlParser.List_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#dict_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict_expr(HtmlParser.Dict_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#dict_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDict_item(HtmlParser.Dict_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#func_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_call(HtmlParser.Func_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(HtmlParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HtmlParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElement(HtmlParser.ElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doctypeElement}
	 * labeled alternative in {@link HtmlParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoctypeElement(HtmlParser.DoctypeElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pairedElement}
	 * labeled alternative in {@link HtmlParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPairedElement(HtmlParser.PairedElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selfClosingElement}
	 * labeled alternative in {@link HtmlParser#htmlElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelfClosingElement(HtmlParser.SelfClosingElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#htmlParts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlParts(HtmlParser.HtmlPartsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#htmlTagName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlTagName(HtmlParser.HtmlTagNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#htmlAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlAttribute(HtmlParser.HtmlAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#htmlContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHtmlContent(HtmlParser.HtmlContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#closeTag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseTag(HtmlParser.CloseTagContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#styleElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleElement(HtmlParser.StyleElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#styleAttribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStyleAttribute(HtmlParser.StyleAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#cssContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCssContent(HtmlParser.CssContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#jinjaExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExpression(HtmlParser.JinjaExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#jinjaExprContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaExprContent(HtmlParser.JinjaExprContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#jinjaFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaFilter(HtmlParser.JinjaFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#filterArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterArg(HtmlParser.FilterArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#jinjaBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlock(HtmlParser.JinjaBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(HtmlParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(HtmlParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#setBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetBlock(HtmlParser.SetBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#jinjaBlockExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJinjaBlockExpr(HtmlParser.JinjaBlockExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#pythonCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonCode(HtmlParser.PythonCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#pythonStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonStatement(HtmlParser.PythonStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#pythonParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonParams(HtmlParser.PythonParamsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexExpr(HtmlParser.IndexExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpr(HtmlParser.UnaryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSubExpr(HtmlParser.AddSubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomExpr(HtmlParser.AtomExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(HtmlParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulDivModExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivModExpr(HtmlParser.MulDivModExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code attributeExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeExpr(HtmlParser.AttributeExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(HtmlParser.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(HtmlParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareExpr(HtmlParser.CompareExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(HtmlParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdAtom(HtmlParser.IdAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberAtom(HtmlParser.NumberAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAtom(HtmlParser.StringAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueAtom(HtmlParser.TrueAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseAtom(HtmlParser.FalseAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code noneAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoneAtom(HtmlParser.NoneAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAtom(HtmlParser.ListAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dictAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictAtom(HtmlParser.DictAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(HtmlParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#pythonList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonList(HtmlParser.PythonListContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#pythonDict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonDict(HtmlParser.PythonDictContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#pythonDictItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonDictItem(HtmlParser.PythonDictItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#pythonUnaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonUnaryOp(HtmlParser.PythonUnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#pythonMulDivModOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonMulDivModOp(HtmlParser.PythonMulDivModOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#pythonAddSubOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonAddSubOp(HtmlParser.PythonAddSubOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#pythonCompareOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonCompareOp(HtmlParser.PythonCompareOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#pythonArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPythonArgs(HtmlParser.PythonArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#flask_app_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlask_app_decl(HtmlParser.Flask_app_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link HtmlParser#flask_route}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlask_route(HtmlParser.Flask_routeContext ctx);
}