// Generated from src/ANT/CssParser.g4 by ANTLR 4.13.1
package ANT;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CssParser}.
 */
public interface CssParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CssParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void enterStylesheet(CssParser.StylesheetContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#stylesheet}.
	 * @param ctx the parse tree
	 */
	void exitStylesheet(CssParser.StylesheetContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#charsetRule}.
	 * @param ctx the parse tree
	 */
	void enterCharsetRule(CssParser.CharsetRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#charsetRule}.
	 * @param ctx the parse tree
	 */
	void exitCharsetRule(CssParser.CharsetRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#importRule}.
	 * @param ctx the parse tree
	 */
	void enterImportRule(CssParser.ImportRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#importRule}.
	 * @param ctx the parse tree
	 */
	void exitImportRule(CssParser.ImportRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#mediaQueryRule}.
	 * @param ctx the parse tree
	 */
	void enterMediaQueryRule(CssParser.MediaQueryRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#mediaQueryRule}.
	 * @param ctx the parse tree
	 */
	void exitMediaQueryRule(CssParser.MediaQueryRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#mediaQueryList}.
	 * @param ctx the parse tree
	 */
	void enterMediaQueryList(CssParser.MediaQueryListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#mediaQueryList}.
	 * @param ctx the parse tree
	 */
	void exitMediaQueryList(CssParser.MediaQueryListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#mediaQuery}.
	 * @param ctx the parse tree
	 */
	void enterMediaQuery(CssParser.MediaQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#mediaQuery}.
	 * @param ctx the parse tree
	 */
	void exitMediaQuery(CssParser.MediaQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#mediaType}.
	 * @param ctx the parse tree
	 */
	void enterMediaType(CssParser.MediaTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#mediaType}.
	 * @param ctx the parse tree
	 */
	void exitMediaType(CssParser.MediaTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#mediaExpression}.
	 * @param ctx the parse tree
	 */
	void enterMediaExpression(CssParser.MediaExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#mediaExpression}.
	 * @param ctx the parse tree
	 */
	void exitMediaExpression(CssParser.MediaExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#mediaFeature}.
	 * @param ctx the parse tree
	 */
	void enterMediaFeature(CssParser.MediaFeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#mediaFeature}.
	 * @param ctx the parse tree
	 */
	void exitMediaFeature(CssParser.MediaFeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#keyframesRule}.
	 * @param ctx the parse tree
	 */
	void enterKeyframesRule(CssParser.KeyframesRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#keyframesRule}.
	 * @param ctx the parse tree
	 */
	void exitKeyframesRule(CssParser.KeyframesRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#keyframeBlock}.
	 * @param ctx the parse tree
	 */
	void enterKeyframeBlock(CssParser.KeyframeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#keyframeBlock}.
	 * @param ctx the parse tree
	 */
	void exitKeyframeBlock(CssParser.KeyframeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#keyframeSelector}.
	 * @param ctx the parse tree
	 */
	void enterKeyframeSelector(CssParser.KeyframeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#keyframeSelector}.
	 * @param ctx the parse tree
	 */
	void exitKeyframeSelector(CssParser.KeyframeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#fontFaceRule}.
	 * @param ctx the parse tree
	 */
	void enterFontFaceRule(CssParser.FontFaceRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#fontFaceRule}.
	 * @param ctx the parse tree
	 */
	void exitFontFaceRule(CssParser.FontFaceRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#supportsRule}.
	 * @param ctx the parse tree
	 */
	void enterSupportsRule(CssParser.SupportsRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#supportsRule}.
	 * @param ctx the parse tree
	 */
	void exitSupportsRule(CssParser.SupportsRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#supportsCondition}.
	 * @param ctx the parse tree
	 */
	void enterSupportsCondition(CssParser.SupportsConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#supportsCondition}.
	 * @param ctx the parse tree
	 */
	void exitSupportsCondition(CssParser.SupportsConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#supportsInParens}.
	 * @param ctx the parse tree
	 */
	void enterSupportsInParens(CssParser.SupportsInParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#supportsInParens}.
	 * @param ctx the parse tree
	 */
	void exitSupportsInParens(CssParser.SupportsInParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#atRule}.
	 * @param ctx the parse tree
	 */
	void enterAtRule(CssParser.AtRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#atRule}.
	 * @param ctx the parse tree
	 */
	void exitAtRule(CssParser.AtRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CssParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CssParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void enterCssRule(CssParser.CssRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#cssRule}.
	 * @param ctx the parse tree
	 */
	void exitCssRule(CssParser.CssRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void enterSelectorGroup(CssParser.SelectorGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#selectorGroup}.
	 * @param ctx the parse tree
	 */
	void exitSelectorGroup(CssParser.SelectorGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#selector}.
	 * @param ctx the parse tree
	 */
	void enterSelector(CssParser.SelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#selector}.
	 * @param ctx the parse tree
	 */
	void exitSelector(CssParser.SelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void enterCombinator(CssParser.CombinatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#combinator}.
	 * @param ctx the parse tree
	 */
	void exitCombinator(CssParser.CombinatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelector(CssParser.SimpleSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#simpleSelector}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelector(CssParser.SimpleSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#elementName}.
	 * @param ctx the parse tree
	 */
	void enterElementName(CssParser.ElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#elementName}.
	 * @param ctx the parse tree
	 */
	void exitElementName(CssParser.ElementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#idSelector}.
	 * @param ctx the parse tree
	 */
	void enterIdSelector(CssParser.IdSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#idSelector}.
	 * @param ctx the parse tree
	 */
	void exitIdSelector(CssParser.IdSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#classSelector}.
	 * @param ctx the parse tree
	 */
	void enterClassSelector(CssParser.ClassSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#classSelector}.
	 * @param ctx the parse tree
	 */
	void exitClassSelector(CssParser.ClassSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#attributeSelector}.
	 * @param ctx the parse tree
	 */
	void enterAttributeSelector(CssParser.AttributeSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#attributeSelector}.
	 * @param ctx the parse tree
	 */
	void exitAttributeSelector(CssParser.AttributeSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(CssParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(CssParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#attributeMatcher}.
	 * @param ctx the parse tree
	 */
	void enterAttributeMatcher(CssParser.AttributeMatcherContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#attributeMatcher}.
	 * @param ctx the parse tree
	 */
	void exitAttributeMatcher(CssParser.AttributeMatcherContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void enterAttributeValue(CssParser.AttributeValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#attributeValue}.
	 * @param ctx the parse tree
	 */
	void exitAttributeValue(CssParser.AttributeValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#pseudoSelector}.
	 * @param ctx the parse tree
	 */
	void enterPseudoSelector(CssParser.PseudoSelectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#pseudoSelector}.
	 * @param ctx the parse tree
	 */
	void exitPseudoSelector(CssParser.PseudoSelectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CssParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CssParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(CssParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(CssParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#important}.
	 * @param ctx the parse tree
	 */
	void enterImportant(CssParser.ImportantContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#important}.
	 * @param ctx the parse tree
	 */
	void exitImportant(CssParser.ImportantContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(CssParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(CssParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CssParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CssParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CssParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CssParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void enterLiteralValue(CssParser.LiteralValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#literalValue}.
	 * @param ctx the parse tree
	 */
	void exitLiteralValue(CssParser.LiteralValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#unit}.
	 * @param ctx the parse tree
	 */
	void enterUnit(CssParser.UnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#unit}.
	 * @param ctx the parse tree
	 */
	void exitUnit(CssParser.UnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#keywordValue}.
	 * @param ctx the parse tree
	 */
	void enterKeywordValue(CssParser.KeywordValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#keywordValue}.
	 * @param ctx the parse tree
	 */
	void exitKeywordValue(CssParser.KeywordValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#color_name}.
	 * @param ctx the parse tree
	 */
	void enterColor_name(CssParser.Color_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#color_name}.
	 * @param ctx the parse tree
	 */
	void exitColor_name(CssParser.Color_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(CssParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(CssParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#functionValue}.
	 * @param ctx the parse tree
	 */
	void enterFunctionValue(CssParser.FunctionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#functionValue}.
	 * @param ctx the parse tree
	 */
	void exitFunctionValue(CssParser.FunctionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#funcContent}.
	 * @param ctx the parse tree
	 */
	void enterFuncContent(CssParser.FuncContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#funcContent}.
	 * @param ctx the parse tree
	 */
	void exitFuncContent(CssParser.FuncContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#calcFunction}.
	 * @param ctx the parse tree
	 */
	void enterCalcFunction(CssParser.CalcFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#calcFunction}.
	 * @param ctx the parse tree
	 */
	void exitCalcFunction(CssParser.CalcFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CssParser#varFunction}.
	 * @param ctx the parse tree
	 */
	void enterVarFunction(CssParser.VarFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CssParser#varFunction}.
	 * @param ctx the parse tree
	 */
	void exitVarFunction(CssParser.VarFunctionContext ctx);
}