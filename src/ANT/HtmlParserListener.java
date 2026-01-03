// Generated from src/ANT/HtmlParser.g4 by ANTLR 4.13.1
package ANT;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HtmlParser}.
 */
public interface HtmlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HtmlParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(HtmlParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(HtmlParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#pythonFullContent}.
	 * @param ctx the parse tree
	 */
	void enterPythonFullContent(HtmlParser.PythonFullContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#pythonFullContent}.
	 * @param ctx the parse tree
	 */
	void exitPythonFullContent(HtmlParser.PythonFullContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HtmlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HtmlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void enterImport_stmt(HtmlParser.Import_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#import_stmt}.
	 * @param ctx the parse tree
	 */
	void exitImport_stmt(HtmlParser.Import_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#imported_names}.
	 * @param ctx the parse tree
	 */
	void enterImported_names(HtmlParser.Imported_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#imported_names}.
	 * @param ctx the parse tree
	 */
	void exitImported_names(HtmlParser.Imported_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#imported_name}.
	 * @param ctx the parse tree
	 */
	void enterImported_name(HtmlParser.Imported_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#imported_name}.
	 * @param ctx the parse tree
	 */
	void exitImported_name(HtmlParser.Imported_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#import_list}.
	 * @param ctx the parse tree
	 */
	void enterImport_list(HtmlParser.Import_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#import_list}.
	 * @param ctx the parse tree
	 */
	void exitImport_list(HtmlParser.Import_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#module_name}.
	 * @param ctx the parse tree
	 */
	void enterModule_name(HtmlParser.Module_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#module_name}.
	 * @param ctx the parse tree
	 */
	void exitModule_name(HtmlParser.Module_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(HtmlParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(HtmlParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExpr_stmt(HtmlParser.Expr_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#expr_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExpr_stmt(HtmlParser.Expr_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(HtmlParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(HtmlParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#func_def}.
	 * @param ctx the parse tree
	 */
	void enterFunc_def(HtmlParser.Func_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#func_def}.
	 * @param ctx the parse tree
	 */
	void exitFunc_def(HtmlParser.Func_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#decorators}.
	 * @param ctx the parse tree
	 */
	void enterDecorators(HtmlParser.DecoratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#decorators}.
	 * @param ctx the parse tree
	 */
	void exitDecorators(HtmlParser.DecoratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#decorator}.
	 * @param ctx the parse tree
	 */
	void enterDecorator(HtmlParser.DecoratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#decorator}.
	 * @param ctx the parse tree
	 */
	void exitDecorator(HtmlParser.DecoratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#decorator_name}.
	 * @param ctx the parse tree
	 */
	void enterDecorator_name(HtmlParser.Decorator_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#decorator_name}.
	 * @param ctx the parse tree
	 */
	void exitDecorator_name(HtmlParser.Decorator_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#decorator_args}.
	 * @param ctx the parse tree
	 */
	void enterDecorator_args(HtmlParser.Decorator_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#decorator_args}.
	 * @param ctx the parse tree
	 */
	void exitDecorator_args(HtmlParser.Decorator_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#params}.
	 * @param ctx the parse tree
	 */
	void enterParams(HtmlParser.ParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#params}.
	 * @param ctx the parse tree
	 */
	void exitParams(HtmlParser.ParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(HtmlParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(HtmlParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#suite}.
	 * @param ctx the parse tree
	 */
	void enterSuite(HtmlParser.SuiteContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#suite}.
	 * @param ctx the parse tree
	 */
	void exitSuite(HtmlParser.SuiteContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSimple_stmt(HtmlParser.Simple_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#simple_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSimple_stmt(HtmlParser.Simple_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSmall_stmt(HtmlParser.Small_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#small_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSmall_stmt(HtmlParser.Small_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(HtmlParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(HtmlParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(HtmlParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(HtmlParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(HtmlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(HtmlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogical_expr(HtmlParser.Logical_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#logical_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogical_expr(HtmlParser.Logical_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void enterComparison_expr(HtmlParser.Comparison_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#comparison_expr}.
	 * @param ctx the parse tree
	 */
	void exitComparison_expr(HtmlParser.Comparison_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#additive_expr}.
	 * @param ctx the parse tree
	 */
	void enterAdditive_expr(HtmlParser.Additive_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#additive_expr}.
	 * @param ctx the parse tree
	 */
	void exitAdditive_expr(HtmlParser.Additive_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#multiplicative_expr}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicative_expr(HtmlParser.Multiplicative_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#multiplicative_expr}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicative_expr(HtmlParser.Multiplicative_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrimary_expr(HtmlParser.Primary_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#primary_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrimary_expr(HtmlParser.Primary_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(HtmlParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(HtmlParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#list_expr}.
	 * @param ctx the parse tree
	 */
	void enterList_expr(HtmlParser.List_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#list_expr}.
	 * @param ctx the parse tree
	 */
	void exitList_expr(HtmlParser.List_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#dict_expr}.
	 * @param ctx the parse tree
	 */
	void enterDict_expr(HtmlParser.Dict_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#dict_expr}.
	 * @param ctx the parse tree
	 */
	void exitDict_expr(HtmlParser.Dict_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#dict_item}.
	 * @param ctx the parse tree
	 */
	void enterDict_item(HtmlParser.Dict_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#dict_item}.
	 * @param ctx the parse tree
	 */
	void exitDict_item(HtmlParser.Dict_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#func_call}.
	 * @param ctx the parse tree
	 */
	void enterFunc_call(HtmlParser.Func_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#func_call}.
	 * @param ctx the parse tree
	 */
	void exitFunc_call(HtmlParser.Func_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(HtmlParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(HtmlParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HtmlParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HtmlParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(HtmlParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(HtmlParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doctypeElement}
	 * labeled alternative in {@link HtmlParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterDoctypeElement(HtmlParser.DoctypeElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doctypeElement}
	 * labeled alternative in {@link HtmlParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitDoctypeElement(HtmlParser.DoctypeElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pairedElement}
	 * labeled alternative in {@link HtmlParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterPairedElement(HtmlParser.PairedElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pairedElement}
	 * labeled alternative in {@link HtmlParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitPairedElement(HtmlParser.PairedElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selfClosingElement}
	 * labeled alternative in {@link HtmlParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void enterSelfClosingElement(HtmlParser.SelfClosingElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selfClosingElement}
	 * labeled alternative in {@link HtmlParser#htmlElement}.
	 * @param ctx the parse tree
	 */
	void exitSelfClosingElement(HtmlParser.SelfClosingElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#htmlParts}.
	 * @param ctx the parse tree
	 */
	void enterHtmlParts(HtmlParser.HtmlPartsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#htmlParts}.
	 * @param ctx the parse tree
	 */
	void exitHtmlParts(HtmlParser.HtmlPartsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#htmlTagName}.
	 * @param ctx the parse tree
	 */
	void enterHtmlTagName(HtmlParser.HtmlTagNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#htmlTagName}.
	 * @param ctx the parse tree
	 */
	void exitHtmlTagName(HtmlParser.HtmlTagNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void enterHtmlAttribute(HtmlParser.HtmlAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#htmlAttribute}.
	 * @param ctx the parse tree
	 */
	void exitHtmlAttribute(HtmlParser.HtmlAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void enterHtmlContent(HtmlParser.HtmlContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#htmlContent}.
	 * @param ctx the parse tree
	 */
	void exitHtmlContent(HtmlParser.HtmlContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void enterCloseTag(HtmlParser.CloseTagContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#closeTag}.
	 * @param ctx the parse tree
	 */
	void exitCloseTag(HtmlParser.CloseTagContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void enterStyleElement(HtmlParser.StyleElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#styleElement}.
	 * @param ctx the parse tree
	 */
	void exitStyleElement(HtmlParser.StyleElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#styleAttribute}.
	 * @param ctx the parse tree
	 */
	void enterStyleAttribute(HtmlParser.StyleAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#styleAttribute}.
	 * @param ctx the parse tree
	 */
	void exitStyleAttribute(HtmlParser.StyleAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#cssContent}.
	 * @param ctx the parse tree
	 */
	void enterCssContent(HtmlParser.CssContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#cssContent}.
	 * @param ctx the parse tree
	 */
	void exitCssContent(HtmlParser.CssContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExpression(HtmlParser.JinjaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#jinjaExpression}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExpression(HtmlParser.JinjaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#jinjaExprContent}.
	 * @param ctx the parse tree
	 */
	void enterJinjaExprContent(HtmlParser.JinjaExprContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#jinjaExprContent}.
	 * @param ctx the parse tree
	 */
	void exitJinjaExprContent(HtmlParser.JinjaExprContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#jinjaFilter}.
	 * @param ctx the parse tree
	 */
	void enterJinjaFilter(HtmlParser.JinjaFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#jinjaFilter}.
	 * @param ctx the parse tree
	 */
	void exitJinjaFilter(HtmlParser.JinjaFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#filterArg}.
	 * @param ctx the parse tree
	 */
	void enterFilterArg(HtmlParser.FilterArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#filterArg}.
	 * @param ctx the parse tree
	 */
	void exitFilterArg(HtmlParser.FilterArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlock(HtmlParser.JinjaBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#jinjaBlock}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlock(HtmlParser.JinjaBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(HtmlParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(HtmlParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(HtmlParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(HtmlParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#setBlock}.
	 * @param ctx the parse tree
	 */
	void enterSetBlock(HtmlParser.SetBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#setBlock}.
	 * @param ctx the parse tree
	 */
	void exitSetBlock(HtmlParser.SetBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#jinjaBlockExpr}.
	 * @param ctx the parse tree
	 */
	void enterJinjaBlockExpr(HtmlParser.JinjaBlockExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#jinjaBlockExpr}.
	 * @param ctx the parse tree
	 */
	void exitJinjaBlockExpr(HtmlParser.JinjaBlockExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#pythonCode}.
	 * @param ctx the parse tree
	 */
	void enterPythonCode(HtmlParser.PythonCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#pythonCode}.
	 * @param ctx the parse tree
	 */
	void exitPythonCode(HtmlParser.PythonCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#pythonStatement}.
	 * @param ctx the parse tree
	 */
	void enterPythonStatement(HtmlParser.PythonStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#pythonStatement}.
	 * @param ctx the parse tree
	 */
	void exitPythonStatement(HtmlParser.PythonStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#pythonParams}.
	 * @param ctx the parse tree
	 */
	void enterPythonParams(HtmlParser.PythonParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#pythonParams}.
	 * @param ctx the parse tree
	 */
	void exitPythonParams(HtmlParser.PythonParamsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 */
	void enterIndexExpr(HtmlParser.IndexExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 */
	void exitIndexExpr(HtmlParser.IndexExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpr(HtmlParser.UnaryExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpr(HtmlParser.UnaryExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 */
	void enterAddSubExpr(HtmlParser.AddSubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSubExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 */
	void exitAddSubExpr(HtmlParser.AddSubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 */
	void enterAtomExpr(HtmlParser.AtomExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 */
	void exitAtomExpr(HtmlParser.AtomExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(HtmlParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(HtmlParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulDivModExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivModExpr(HtmlParser.MulDivModExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulDivModExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivModExpr(HtmlParser.MulDivModExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code attributeExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 */
	void enterAttributeExpr(HtmlParser.AttributeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code attributeExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 */
	void exitAttributeExpr(HtmlParser.AttributeExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 */
	void enterCallExpr(HtmlParser.CallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code callExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 */
	void exitCallExpr(HtmlParser.CallExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(HtmlParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(HtmlParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(HtmlParser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compareExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(HtmlParser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(HtmlParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link HtmlParser#pythonExpr}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(HtmlParser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 */
	void enterIdAtom(HtmlParser.IdAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 */
	void exitIdAtom(HtmlParser.IdAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 */
	void enterNumberAtom(HtmlParser.NumberAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 */
	void exitNumberAtom(HtmlParser.NumberAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 */
	void enterStringAtom(HtmlParser.StringAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 */
	void exitStringAtom(HtmlParser.StringAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 */
	void enterTrueAtom(HtmlParser.TrueAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 */
	void exitTrueAtom(HtmlParser.TrueAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 */
	void enterFalseAtom(HtmlParser.FalseAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 */
	void exitFalseAtom(HtmlParser.FalseAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code noneAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 */
	void enterNoneAtom(HtmlParser.NoneAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code noneAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 */
	void exitNoneAtom(HtmlParser.NoneAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 */
	void enterListAtom(HtmlParser.ListAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 */
	void exitListAtom(HtmlParser.ListAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dictAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 */
	void enterDictAtom(HtmlParser.DictAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dictAtom}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 */
	void exitDictAtom(HtmlParser.DictAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(HtmlParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link HtmlParser#pythonAtom}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(HtmlParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#pythonList}.
	 * @param ctx the parse tree
	 */
	void enterPythonList(HtmlParser.PythonListContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#pythonList}.
	 * @param ctx the parse tree
	 */
	void exitPythonList(HtmlParser.PythonListContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#pythonDict}.
	 * @param ctx the parse tree
	 */
	void enterPythonDict(HtmlParser.PythonDictContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#pythonDict}.
	 * @param ctx the parse tree
	 */
	void exitPythonDict(HtmlParser.PythonDictContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#pythonDictItem}.
	 * @param ctx the parse tree
	 */
	void enterPythonDictItem(HtmlParser.PythonDictItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#pythonDictItem}.
	 * @param ctx the parse tree
	 */
	void exitPythonDictItem(HtmlParser.PythonDictItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#pythonUnaryOp}.
	 * @param ctx the parse tree
	 */
	void enterPythonUnaryOp(HtmlParser.PythonUnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#pythonUnaryOp}.
	 * @param ctx the parse tree
	 */
	void exitPythonUnaryOp(HtmlParser.PythonUnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#pythonMulDivModOp}.
	 * @param ctx the parse tree
	 */
	void enterPythonMulDivModOp(HtmlParser.PythonMulDivModOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#pythonMulDivModOp}.
	 * @param ctx the parse tree
	 */
	void exitPythonMulDivModOp(HtmlParser.PythonMulDivModOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#pythonAddSubOp}.
	 * @param ctx the parse tree
	 */
	void enterPythonAddSubOp(HtmlParser.PythonAddSubOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#pythonAddSubOp}.
	 * @param ctx the parse tree
	 */
	void exitPythonAddSubOp(HtmlParser.PythonAddSubOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#pythonCompareOp}.
	 * @param ctx the parse tree
	 */
	void enterPythonCompareOp(HtmlParser.PythonCompareOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#pythonCompareOp}.
	 * @param ctx the parse tree
	 */
	void exitPythonCompareOp(HtmlParser.PythonCompareOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#pythonArgs}.
	 * @param ctx the parse tree
	 */
	void enterPythonArgs(HtmlParser.PythonArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#pythonArgs}.
	 * @param ctx the parse tree
	 */
	void exitPythonArgs(HtmlParser.PythonArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#flask_app_decl}.
	 * @param ctx the parse tree
	 */
	void enterFlask_app_decl(HtmlParser.Flask_app_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#flask_app_decl}.
	 * @param ctx the parse tree
	 */
	void exitFlask_app_decl(HtmlParser.Flask_app_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link HtmlParser#flask_route}.
	 * @param ctx the parse tree
	 */
	void enterFlask_route(HtmlParser.Flask_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HtmlParser#flask_route}.
	 * @param ctx the parse tree
	 */
	void exitFlask_route(HtmlParser.Flask_routeContext ctx);
}