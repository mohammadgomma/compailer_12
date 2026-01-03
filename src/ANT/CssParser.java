// Generated from src/ANT/CssParser.g4 by ANTLR 4.13.1
package ANT;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class CssParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LBRACE=1, RBRACE=2, SEMICOLON=3, COLON=4, COMMA=5, LPAREN=6, RPAREN=7, 
		LBRACK=8, RBRACK=9, STAR=10, DOT=11, HASH=12, AT=13, PERCENT=14, SLASH=15, 
		PLUS=16, MINUS=17, GT=18, LT=19, TILDE=20, DOLLAR=21, PIPE=22, EQ=23, 
		EXCLAMATION=24, PX=25, EM=26, REM=27, VH=28, VW=29, VMAX=30, VMIN=31, 
		PERCENTAGE=32, DEG=33, GRAD=34, RAD=35, TURN=36, MS=37, S=38, CM=39, MM=40, 
		IN=41, PT=42, PC=43, CH=44, EX=45, FR=46, IMPORTANT=47, AUTO=48, NONE=49, 
		INITIAL=50, INHERIT=51, REVERT=52, UNSET=53, TRANSPARENT=54, CURRENTCOLOR=55, 
		FLEX=56, GRID=57, BLOCK=58, INLINE=59, INLINE_BLOCK=60, INLINE_FLEX=61, 
		INLINE_GRID=62, TABLE=63, RELATIVE=64, ABSOLUTE=65, FIXED=66, STATIC=67, 
		STICKY=68, CENTER=69, LEFT=70, RIGHT=71, TOP=72, BOTTOM=73, START=74, 
		END=75, JUSTIFY=76, LTR=77, RTL=78, TRUE=79, FALSE=80, FROM=81, TO=82, 
		MAX_CONTENT=83, MIN_CONTENT=84, FIT_CONTENT=85, AT_MEDIA=86, AT_IMPORT=87, 
		AT_KEYFRAMES=88, AT_FONT_FACE=89, AT_PAGE=90, AT_SUPPORTS=91, AT_CHARSET=92, 
		ONLY=93, NOT=94, AND=95, OR=96, WHITE=97, BLACK=98, RED=99, GREEN=100, 
		BLUE=101, YELLOW=102, PURPLE=103, ORANGE=104, GRAY=105, GREY=106, IDENTIFIER=107, 
		CUSTOM_PROPERTY=108, NUMBER=109, INTEGER=110, HEX_COLOR=111, STRING=112, 
		FUNCTION=113, CALC=114, VAR=115, URL=116, COMMENT=117, LINE_COMMENT=118, 
		WS=119, FUNC_CONTENT=120, FUNC_TO=121, FUNC_FROM=122, FUNC_WS=123, URL_RPAREN=124, 
		URL_CONTENT=125, FUNC_CENTER=126, FUNC_LEFT=127, FUNC_RIGHT=128, FUNC_TOP=129, 
		FUNC_BOTTOM=130;
	public static final int
		RULE_stylesheet = 0, RULE_charsetRule = 1, RULE_importRule = 2, RULE_mediaQueryRule = 3, 
		RULE_mediaQueryList = 4, RULE_mediaQuery = 5, RULE_mediaType = 6, RULE_mediaExpression = 7, 
		RULE_mediaFeature = 8, RULE_keyframesRule = 9, RULE_keyframeBlock = 10, 
		RULE_keyframeSelector = 11, RULE_fontFaceRule = 12, RULE_supportsRule = 13, 
		RULE_supportsCondition = 14, RULE_supportsInParens = 15, RULE_atRule = 16, 
		RULE_block = 17, RULE_cssRule = 18, RULE_selectorGroup = 19, RULE_selector = 20, 
		RULE_combinator = 21, RULE_simpleSelector = 22, RULE_elementName = 23, 
		RULE_idSelector = 24, RULE_classSelector = 25, RULE_attributeSelector = 26, 
		RULE_attributeName = 27, RULE_attributeMatcher = 28, RULE_attributeValue = 29, 
		RULE_pseudoSelector = 30, RULE_declaration = 31, RULE_property = 32, RULE_important = 33, 
		RULE_value = 34, RULE_expr = 35, RULE_term = 36, RULE_literalValue = 37, 
		RULE_unit = 38, RULE_keywordValue = 39, RULE_color_name = 40, RULE_operator = 41, 
		RULE_functionValue = 42, RULE_funcContent = 43, RULE_calcFunction = 44, 
		RULE_varFunction = 45;
	private static String[] makeRuleNames() {
		return new String[] {
			"stylesheet", "charsetRule", "importRule", "mediaQueryRule", "mediaQueryList", 
			"mediaQuery", "mediaType", "mediaExpression", "mediaFeature", "keyframesRule", 
			"keyframeBlock", "keyframeSelector", "fontFaceRule", "supportsRule", 
			"supportsCondition", "supportsInParens", "atRule", "block", "cssRule", 
			"selectorGroup", "selector", "combinator", "simpleSelector", "elementName", 
			"idSelector", "classSelector", "attributeSelector", "attributeName", 
			"attributeMatcher", "attributeValue", "pseudoSelector", "declaration", 
			"property", "important", "value", "expr", "term", "literalValue", "unit", 
			"keywordValue", "color_name", "operator", "functionValue", "funcContent", 
			"calcFunction", "varFunction"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "'['", "']'", null, null, 
			"'#'", "'@'", null, null, null, null, "'>'", "'<'", "'~'", "'$'", "'|'", 
			"'='", "'!'", null, null, null, null, null, "'vmax'", "'vmin'", null, 
			null, "'grad'", "'rad'", "'turn'", null, null, "'cm'", "'mm'", "'in'", 
			"'pt'", "'pc'", "'ch'", "'ex'", null, "'!important'", "'auto'", "'none'", 
			"'initial'", "'inherit'", "'revert'", "'unset'", "'transparent'", "'currentColor'", 
			"'flex '", "'grid '", "'block '", "'inline '", "'inline-block '", "'inline-flex '", 
			"'inline-grid '", "'table '", "'relative '", "'absolute '", "'fixed '", 
			"'static '", "'sticky '", "'center '", "'left '", "'right '", "'top '", 
			"'bottom '", "'start '", "'end '", "'justify '", "'ltr '", "'rtl '", 
			"'true '", "'false '", null, null, "'max-content'", "'min-content'", 
			"'fit-content'", "'@media'", "'@import'", "'@keyframes'", "'@font-face'", 
			"'@page'", "'@supports'", "'@charset'", "'only'", "'not'", "'and'", "'or'", 
			"'white'", "'black'", "'red'", "'green'", "'blue'", "'yellow'", "'purple'", 
			"'orange'", "'gray'", "'grey'", null, null, null, null, null, null, null, 
			"'calc('", "'var('", "'url('", null, null, null, null, null, null, null, 
			null, null, "'center'", "'left'", "'right'", "'top'", "'bottom'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "LBRACE", "RBRACE", "SEMICOLON", "COLON", "COMMA", "LPAREN", "RPAREN", 
			"LBRACK", "RBRACK", "STAR", "DOT", "HASH", "AT", "PERCENT", "SLASH", 
			"PLUS", "MINUS", "GT", "LT", "TILDE", "DOLLAR", "PIPE", "EQ", "EXCLAMATION", 
			"PX", "EM", "REM", "VH", "VW", "VMAX", "VMIN", "PERCENTAGE", "DEG", "GRAD", 
			"RAD", "TURN", "MS", "S", "CM", "MM", "IN", "PT", "PC", "CH", "EX", "FR", 
			"IMPORTANT", "AUTO", "NONE", "INITIAL", "INHERIT", "REVERT", "UNSET", 
			"TRANSPARENT", "CURRENTCOLOR", "FLEX", "GRID", "BLOCK", "INLINE", "INLINE_BLOCK", 
			"INLINE_FLEX", "INLINE_GRID", "TABLE", "RELATIVE", "ABSOLUTE", "FIXED", 
			"STATIC", "STICKY", "CENTER", "LEFT", "RIGHT", "TOP", "BOTTOM", "START", 
			"END", "JUSTIFY", "LTR", "RTL", "TRUE", "FALSE", "FROM", "TO", "MAX_CONTENT", 
			"MIN_CONTENT", "FIT_CONTENT", "AT_MEDIA", "AT_IMPORT", "AT_KEYFRAMES", 
			"AT_FONT_FACE", "AT_PAGE", "AT_SUPPORTS", "AT_CHARSET", "ONLY", "NOT", 
			"AND", "OR", "WHITE", "BLACK", "RED", "GREEN", "BLUE", "YELLOW", "PURPLE", 
			"ORANGE", "GRAY", "GREY", "IDENTIFIER", "CUSTOM_PROPERTY", "NUMBER", 
			"INTEGER", "HEX_COLOR", "STRING", "FUNCTION", "CALC", "VAR", "URL", "COMMENT", 
			"LINE_COMMENT", "WS", "FUNC_CONTENT", "FUNC_TO", "FUNC_FROM", "FUNC_WS", 
			"URL_RPAREN", "URL_CONTENT", "FUNC_CENTER", "FUNC_LEFT", "FUNC_RIGHT", 
			"FUNC_TOP", "FUNC_BOTTOM"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "CssParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CssParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StylesheetContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CssParser.EOF, 0); }
		public CharsetRuleContext charsetRule() {
			return getRuleContext(CharsetRuleContext.class,0);
		}
		public List<ImportRuleContext> importRule() {
			return getRuleContexts(ImportRuleContext.class);
		}
		public ImportRuleContext importRule(int i) {
			return getRuleContext(ImportRuleContext.class,i);
		}
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public List<AtRuleContext> atRule() {
			return getRuleContexts(AtRuleContext.class);
		}
		public AtRuleContext atRule(int i) {
			return getRuleContext(AtRuleContext.class,i);
		}
		public StylesheetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stylesheet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterStylesheet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitStylesheet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitStylesheet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StylesheetContext stylesheet() throws RecognitionException {
		StylesheetContext _localctx = new StylesheetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_stylesheet);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				{
				setState(92);
				charsetRule();
				}
				break;
			}
			setState(98);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(95);
					importRule();
					}
					} 
				}
				setState(100);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1383730L) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & 8592031855L) != 0)) {
				{
				setState(103);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
				case COLON:
				case COMMA:
				case LBRACK:
				case STAR:
				case DOT:
				case HASH:
				case PLUS:
				case GT:
				case TILDE:
				case IDENTIFIER:
				case WS:
					{
					setState(101);
					cssRule();
					}
					break;
				case AT_MEDIA:
				case AT_IMPORT:
				case AT_KEYFRAMES:
				case AT_FONT_FACE:
				case AT_SUPPORTS:
				case AT_CHARSET:
					{
					setState(102);
					atRule();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(108);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharsetRuleContext extends ParserRuleContext {
		public TerminalNode AT_CHARSET() { return getToken(CssParser.AT_CHARSET, 0); }
		public TerminalNode STRING() { return getToken(CssParser.STRING, 0); }
		public TerminalNode SEMICOLON() { return getToken(CssParser.SEMICOLON, 0); }
		public CharsetRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charsetRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCharsetRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCharsetRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCharsetRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharsetRuleContext charsetRule() throws RecognitionException {
		CharsetRuleContext _localctx = new CharsetRuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_charsetRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(AT_CHARSET);
			setState(111);
			match(STRING);
			setState(112);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportRuleContext extends ParserRuleContext {
		public TerminalNode AT_IMPORT() { return getToken(CssParser.AT_IMPORT, 0); }
		public TerminalNode SEMICOLON() { return getToken(CssParser.SEMICOLON, 0); }
		public TerminalNode STRING() { return getToken(CssParser.STRING, 0); }
		public TerminalNode URL() { return getToken(CssParser.URL, 0); }
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public ImportRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterImportRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitImportRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitImportRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportRuleContext importRule() throws RecognitionException {
		ImportRuleContext _localctx = new ImportRuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_importRule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(AT_IMPORT);
			setState(115);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==URL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAREN || ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & 16387L) != 0)) {
				{
				setState(116);
				mediaQueryList();
				}
			}

			setState(119);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MediaQueryRuleContext extends ParserRuleContext {
		public TerminalNode AT_MEDIA() { return getToken(CssParser.AT_MEDIA, 0); }
		public MediaQueryListContext mediaQueryList() {
			return getRuleContext(MediaQueryListContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public MediaQueryRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQueryRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterMediaQueryRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitMediaQueryRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitMediaQueryRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaQueryRuleContext mediaQueryRule() throws RecognitionException {
		MediaQueryRuleContext _localctx = new MediaQueryRuleContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_mediaQueryRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(AT_MEDIA);
			setState(122);
			mediaQueryList();
			setState(123);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MediaQueryListContext extends ParserRuleContext {
		public List<MediaQueryContext> mediaQuery() {
			return getRuleContexts(MediaQueryContext.class);
		}
		public MediaQueryContext mediaQuery(int i) {
			return getRuleContext(MediaQueryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CssParser.COMMA, i);
		}
		public MediaQueryListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQueryList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterMediaQueryList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitMediaQueryList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitMediaQueryList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaQueryListContext mediaQueryList() throws RecognitionException {
		MediaQueryListContext _localctx = new MediaQueryListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_mediaQueryList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			mediaQuery();
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(126);
				match(COMMA);
				setState(127);
				mediaQuery();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MediaQueryContext extends ParserRuleContext {
		public MediaTypeContext mediaType() {
			return getRuleContext(MediaTypeContext.class,0);
		}
		public List<TerminalNode> AND() { return getTokens(CssParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CssParser.AND, i);
		}
		public List<MediaExpressionContext> mediaExpression() {
			return getRuleContexts(MediaExpressionContext.class);
		}
		public MediaExpressionContext mediaExpression(int i) {
			return getRuleContext(MediaExpressionContext.class,i);
		}
		public TerminalNode ONLY() { return getToken(CssParser.ONLY, 0); }
		public TerminalNode NOT() { return getToken(CssParser.NOT, 0); }
		public MediaQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterMediaQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitMediaQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitMediaQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaQueryContext mediaQuery() throws RecognitionException {
		MediaQueryContext _localctx = new MediaQueryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mediaQuery);
		int _la;
		try {
			setState(152);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ONLY:
			case NOT:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ONLY || _la==NOT) {
					{
					setState(133);
					_la = _input.LA(1);
					if ( !(_la==ONLY || _la==NOT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(136);
				mediaType();
				setState(141);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(137);
					match(AND);
					setState(138);
					mediaExpression();
					}
					}
					setState(143);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 2);
				{
				setState(144);
				mediaExpression();
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AND) {
					{
					{
					setState(145);
					match(AND);
					setState(146);
					mediaExpression();
					}
					}
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MediaTypeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CssParser.IDENTIFIER, 0); }
		public MediaTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterMediaType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitMediaType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitMediaType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaTypeContext mediaType() throws RecognitionException {
		MediaTypeContext _localctx = new MediaTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mediaType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MediaExpressionContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CssParser.LPAREN, 0); }
		public MediaFeatureContext mediaFeature() {
			return getRuleContext(MediaFeatureContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CssParser.RPAREN, 0); }
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public MediaExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterMediaExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitMediaExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitMediaExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaExpressionContext mediaExpression() throws RecognitionException {
		MediaExpressionContext _localctx = new MediaExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mediaExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(LPAREN);
			setState(157);
			mediaFeature();
			setState(160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(158);
				match(COLON);
				setState(159);
				expr();
				}
			}

			setState(162);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MediaFeatureContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CssParser.IDENTIFIER, 0); }
		public MediaFeatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mediaFeature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterMediaFeature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitMediaFeature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitMediaFeature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MediaFeatureContext mediaFeature() throws RecognitionException {
		MediaFeatureContext _localctx = new MediaFeatureContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mediaFeature);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyframesRuleContext extends ParserRuleContext {
		public TerminalNode AT_KEYFRAMES() { return getToken(CssParser.AT_KEYFRAMES, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CssParser.IDENTIFIER, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public KeyframesRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframesRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterKeyframesRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitKeyframesRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitKeyframesRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyframesRuleContext keyframesRule() throws RecognitionException {
		KeyframesRuleContext _localctx = new KeyframesRuleContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_keyframesRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(AT_KEYFRAMES);
			setState(167);
			match(IDENTIFIER);
			setState(168);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyframeBlockContext extends ParserRuleContext {
		public KeyframeSelectorContext keyframeSelector() {
			return getRuleContext(KeyframeSelectorContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public KeyframeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterKeyframeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitKeyframeBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitKeyframeBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyframeBlockContext keyframeBlock() throws RecognitionException {
		KeyframeBlockContext _localctx = new KeyframeBlockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_keyframeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			keyframeSelector();
			setState(171);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyframeSelectorContext extends ParserRuleContext {
		public TerminalNode PERCENTAGE() { return getToken(CssParser.PERCENTAGE, 0); }
		public TerminalNode FROM() { return getToken(CssParser.FROM, 0); }
		public TerminalNode TO() { return getToken(CssParser.TO, 0); }
		public KeyframeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyframeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterKeyframeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitKeyframeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitKeyframeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyframeSelectorContext keyframeSelector() throws RecognitionException {
		KeyframeSelectorContext _localctx = new KeyframeSelectorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_keyframeSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_la = _input.LA(1);
			if ( !(((((_la - 32)) & ~0x3f) == 0 && ((1L << (_la - 32)) & 1688849860263937L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FontFaceRuleContext extends ParserRuleContext {
		public TerminalNode AT_FONT_FACE() { return getToken(CssParser.AT_FONT_FACE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FontFaceRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fontFaceRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterFontFaceRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitFontFaceRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFontFaceRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FontFaceRuleContext fontFaceRule() throws RecognitionException {
		FontFaceRuleContext _localctx = new FontFaceRuleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_fontFaceRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(AT_FONT_FACE);
			setState(176);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SupportsRuleContext extends ParserRuleContext {
		public TerminalNode AT_SUPPORTS() { return getToken(CssParser.AT_SUPPORTS, 0); }
		public SupportsConditionContext supportsCondition() {
			return getRuleContext(SupportsConditionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public SupportsRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterSupportsRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitSupportsRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitSupportsRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsRuleContext supportsRule() throws RecognitionException {
		SupportsRuleContext _localctx = new SupportsRuleContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_supportsRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(AT_SUPPORTS);
			setState(179);
			supportsCondition();
			setState(180);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SupportsConditionContext extends ParserRuleContext {
		public List<SupportsInParensContext> supportsInParens() {
			return getRuleContexts(SupportsInParensContext.class);
		}
		public SupportsInParensContext supportsInParens(int i) {
			return getRuleContext(SupportsInParensContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CssParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CssParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(CssParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CssParser.OR, i);
		}
		public SupportsConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterSupportsCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitSupportsCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitSupportsCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsConditionContext supportsCondition() throws RecognitionException {
		SupportsConditionContext _localctx = new SupportsConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_supportsCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			supportsInParens();
			setState(187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(183);
				match(AND);
				setState(184);
				supportsInParens();
				}
				}
				setState(189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(190);
				match(OR);
				setState(191);
				supportsInParens();
				}
				}
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SupportsInParensContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(CssParser.LPAREN, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CssParser.RPAREN, 0); }
		public TerminalNode NOT() { return getToken(CssParser.NOT, 0); }
		public SupportsInParensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_supportsInParens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterSupportsInParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitSupportsInParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitSupportsInParens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SupportsInParensContext supportsInParens() throws RecognitionException {
		SupportsInParensContext _localctx = new SupportsInParensContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_supportsInParens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(197);
				match(NOT);
				}
			}

			setState(200);
			match(LPAREN);
			setState(201);
			declaration();
			setState(202);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AtRuleContext extends ParserRuleContext {
		public CharsetRuleContext charsetRule() {
			return getRuleContext(CharsetRuleContext.class,0);
		}
		public ImportRuleContext importRule() {
			return getRuleContext(ImportRuleContext.class,0);
		}
		public MediaQueryRuleContext mediaQueryRule() {
			return getRuleContext(MediaQueryRuleContext.class,0);
		}
		public KeyframesRuleContext keyframesRule() {
			return getRuleContext(KeyframesRuleContext.class,0);
		}
		public FontFaceRuleContext fontFaceRule() {
			return getRuleContext(FontFaceRuleContext.class,0);
		}
		public SupportsRuleContext supportsRule() {
			return getRuleContext(SupportsRuleContext.class,0);
		}
		public AtRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAtRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAtRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAtRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtRuleContext atRule() throws RecognitionException {
		AtRuleContext _localctx = new AtRuleContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_atRule);
		try {
			setState(210);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT_CHARSET:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				charsetRule();
				}
				break;
			case AT_IMPORT:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				importRule();
				}
				break;
			case AT_MEDIA:
				enterOuterAlt(_localctx, 3);
				{
				setState(206);
				mediaQueryRule();
				}
				break;
			case AT_KEYFRAMES:
				enterOuterAlt(_localctx, 4);
				{
				setState(207);
				keyframesRule();
				}
				break;
			case AT_FONT_FACE:
				enterOuterAlt(_localctx, 5);
				{
				setState(208);
				fontFaceRule();
				}
				break;
			case AT_SUPPORTS:
				enterOuterAlt(_localctx, 6);
				{
				setState(209);
				supportsRule();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(CssParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(CssParser.RBRACE, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<CssRuleContext> cssRule() {
			return getRuleContexts(CssRuleContext.class);
		}
		public CssRuleContext cssRule(int i) {
			return getRuleContext(CssRuleContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(LBRACE);
			setState(217);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1383730L) != 0) || ((((_la - 107)) & ~0x3f) == 0 && ((1L << (_la - 107)) & 4099L) != 0)) {
				{
				setState(215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(213);
					declaration();
					}
					break;
				case 2:
					{
					setState(214);
					cssRule();
					}
					break;
				}
				}
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(220);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CssRuleContext extends ParserRuleContext {
		public SelectorGroupContext selectorGroup() {
			return getRuleContext(SelectorGroupContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public CssRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cssRule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCssRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCssRule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCssRule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CssRuleContext cssRule() throws RecognitionException {
		CssRuleContext _localctx = new CssRuleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cssRule);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			selectorGroup();
			setState(223);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorGroupContext extends ParserRuleContext {
		public List<SelectorContext> selector() {
			return getRuleContexts(SelectorContext.class);
		}
		public SelectorContext selector(int i) {
			return getRuleContext(SelectorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CssParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CssParser.COMMA, i);
		}
		public SelectorGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterSelectorGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitSelectorGroup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitSelectorGroup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorGroupContext selectorGroup() throws RecognitionException {
		SelectorGroupContext _localctx = new SelectorGroupContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_selectorGroup);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			selector();
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(226);
				match(COMMA);
				setState(227);
				selector();
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public List<SimpleSelectorContext> simpleSelector() {
			return getRuleContexts(SimpleSelectorContext.class);
		}
		public SimpleSelectorContext simpleSelector(int i) {
			return getRuleContext(SimpleSelectorContext.class,i);
		}
		public List<CombinatorContext> combinator() {
			return getRuleContexts(CombinatorContext.class);
		}
		public CombinatorContext combinator(int i) {
			return getRuleContext(CombinatorContext.class,i);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			simpleSelector();
			setState(239);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1376256L) != 0) || _la==WS) {
				{
				{
				setState(234);
				combinator();
				setState(235);
				simpleSelector();
				}
				}
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CombinatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CssParser.PLUS, 0); }
		public TerminalNode GT() { return getToken(CssParser.GT, 0); }
		public TerminalNode TILDE() { return getToken(CssParser.TILDE, 0); }
		public TerminalNode WS() { return getToken(CssParser.WS, 0); }
		public CombinatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combinator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCombinator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCombinator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCombinator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombinatorContext combinator() throws RecognitionException {
		CombinatorContext _localctx = new CombinatorContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_combinator);
		int _la;
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case GT:
			case TILDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1376256L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case WS:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				match(WS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectorContext extends ParserRuleContext {
		public List<ElementNameContext> elementName() {
			return getRuleContexts(ElementNameContext.class);
		}
		public ElementNameContext elementName(int i) {
			return getRuleContext(ElementNameContext.class,i);
		}
		public List<IdSelectorContext> idSelector() {
			return getRuleContexts(IdSelectorContext.class);
		}
		public IdSelectorContext idSelector(int i) {
			return getRuleContext(IdSelectorContext.class,i);
		}
		public List<ClassSelectorContext> classSelector() {
			return getRuleContexts(ClassSelectorContext.class);
		}
		public ClassSelectorContext classSelector(int i) {
			return getRuleContext(ClassSelectorContext.class,i);
		}
		public List<AttributeSelectorContext> attributeSelector() {
			return getRuleContexts(AttributeSelectorContext.class);
		}
		public AttributeSelectorContext attributeSelector(int i) {
			return getRuleContext(AttributeSelectorContext.class,i);
		}
		public List<PseudoSelectorContext> pseudoSelector() {
			return getRuleContexts(PseudoSelectorContext.class);
		}
		public PseudoSelectorContext pseudoSelector(int i) {
			return getRuleContext(PseudoSelectorContext.class,i);
		}
		public SimpleSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterSimpleSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitSimpleSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitSimpleSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleSelectorContext simpleSelector() throws RecognitionException {
		SimpleSelectorContext _localctx = new SimpleSelectorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_simpleSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(246);
				elementName();
				}
				break;
			}
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7440L) != 0) || _la==IDENTIFIER) {
				{
				setState(254);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HASH:
					{
					setState(249);
					idSelector();
					}
					break;
				case DOT:
					{
					setState(250);
					classSelector();
					}
					break;
				case LBRACK:
					{
					setState(251);
					attributeSelector();
					}
					break;
				case COLON:
					{
					setState(252);
					pseudoSelector();
					}
					break;
				case STAR:
				case IDENTIFIER:
					{
					setState(253);
					elementName();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CssParser.IDENTIFIER, 0); }
		public TerminalNode STAR() { return getToken(CssParser.STAR, 0); }
		public ElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitElementName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitElementName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementNameContext elementName() throws RecognitionException {
		ElementNameContext _localctx = new ElementNameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_elementName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !(_la==STAR || _la==IDENTIFIER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdSelectorContext extends ParserRuleContext {
		public TerminalNode HASH() { return getToken(CssParser.HASH, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CssParser.IDENTIFIER, 0); }
		public IdSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterIdSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitIdSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitIdSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdSelectorContext idSelector() throws RecognitionException {
		IdSelectorContext _localctx = new IdSelectorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_idSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			match(HASH);
			setState(262);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassSelectorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(CssParser.DOT, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CssParser.IDENTIFIER, 0); }
		public ClassSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterClassSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitClassSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitClassSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassSelectorContext classSelector() throws RecognitionException {
		ClassSelectorContext _localctx = new ClassSelectorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_classSelector);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(DOT);
			setState(265);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeSelectorContext extends ParserRuleContext {
		public TerminalNode LBRACK() { return getToken(CssParser.LBRACK, 0); }
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(CssParser.RBRACK, 0); }
		public AttributeMatcherContext attributeMatcher() {
			return getRuleContext(AttributeMatcherContext.class,0);
		}
		public AttributeValueContext attributeValue() {
			return getRuleContext(AttributeValueContext.class,0);
		}
		public AttributeSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAttributeSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAttributeSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAttributeSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeSelectorContext attributeSelector() throws RecognitionException {
		AttributeSelectorContext _localctx = new AttributeSelectorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_attributeSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(LBRACK);
			setState(268);
			attributeName();
			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 13632512L) != 0) || _la==IDENTIFIER || _la==STRING) {
				{
				setState(269);
				attributeMatcher();
				setState(270);
				attributeValue();
				}
			}

			setState(274);
			match(RBRACK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CssParser.IDENTIFIER, 0); }
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeMatcherContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(CssParser.EQ, 0); }
		public TerminalNode STAR() { return getToken(CssParser.STAR, 0); }
		public TerminalNode TILDE() { return getToken(CssParser.TILDE, 0); }
		public TerminalNode PIPE() { return getToken(CssParser.PIPE, 0); }
		public AttributeMatcherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeMatcher; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAttributeMatcher(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAttributeMatcher(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAttributeMatcher(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeMatcherContext attributeMatcher() throws RecognitionException {
		AttributeMatcherContext _localctx = new AttributeMatcherContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_attributeMatcher);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQ:
				{
				setState(278);
				match(EQ);
				}
				break;
			case STAR:
				{
				setState(279);
				match(STAR);
				setState(280);
				match(EQ);
				}
				break;
			case TILDE:
				{
				setState(281);
				match(TILDE);
				setState(282);
				match(EQ);
				}
				break;
			case PIPE:
				{
				setState(283);
				match(PIPE);
				setState(284);
				match(EQ);
				}
				break;
			case IDENTIFIER:
			case STRING:
				break;
			default:
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CssParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(CssParser.IDENTIFIER, 0); }
		public AttributeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterAttributeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitAttributeValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitAttributeValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeValueContext attributeValue() throws RecognitionException {
		AttributeValueContext _localctx = new AttributeValueContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_attributeValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PseudoSelectorContext extends ParserRuleContext {
		public List<TerminalNode> COLON() { return getTokens(CssParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CssParser.COLON, i);
		}
		public TerminalNode IDENTIFIER() { return getToken(CssParser.IDENTIFIER, 0); }
		public PseudoSelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pseudoSelector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterPseudoSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitPseudoSelector(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitPseudoSelector(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PseudoSelectorContext pseudoSelector() throws RecognitionException {
		PseudoSelectorContext _localctx = new PseudoSelectorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_pseudoSelector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(COLON);
			setState(291);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(290);
				match(COLON);
				}
			}

			setState(293);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public PropertyContext property() {
			return getRuleContext(PropertyContext.class,0);
		}
		public TerminalNode COLON() { return getToken(CssParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CssParser.SEMICOLON, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			property();
			setState(296);
			match(COLON);
			setState(297);
			value();
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEMICOLON) {
				{
				setState(298);
				match(SEMICOLON);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(CssParser.IDENTIFIER, 0); }
		public TerminalNode CUSTOM_PROPERTY() { return getToken(CssParser.CUSTOM_PROPERTY, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==CUSTOM_PROPERTY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImportantContext extends ParserRuleContext {
		public TerminalNode IMPORTANT() { return getToken(CssParser.IMPORTANT, 0); }
		public ImportantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_important; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterImportant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitImportant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitImportant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportantContext important() throws RecognitionException {
		ImportantContext _localctx = new ImportantContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_important);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(IMPORTANT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ImportantContext important() {
			return getRuleContext(ImportantContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			expr();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IMPORTANT) {
				{
				setState(306);
				important();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> WS() { return getTokens(CssParser.WS); }
		public TerminalNode WS(int i) {
			return getToken(CssParser.WS, i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expr);
		try {
			int _alt;
			setState(331);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				term();
				setState(313);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(310);
						match(WS);
						}
						} 
					}
					setState(315);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(319);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(316);
						term();
						}
						} 
					}
					setState(321);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				term();
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(323);
						operator();
						setState(324);
						term();
						}
						} 
					}
					setState(330);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public FunctionValueContext functionValue() {
			return getRuleContext(FunctionValueContext.class,0);
		}
		public LiteralValueContext literalValue() {
			return getRuleContext(LiteralValueContext.class,0);
		}
		public TerminalNode URL() { return getToken(CssParser.URL, 0); }
		public CalcFunctionContext calcFunction() {
			return getRuleContext(CalcFunctionContext.class,0);
		}
		public VarFunctionContext varFunction() {
			return getRuleContext(VarFunctionContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(CssParser.IDENTIFIER, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_term);
		try {
			setState(339);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FUNCTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(333);
				functionValue();
				}
				break;
			case COMMA:
			case STAR:
			case PERCENT:
			case SLASH:
			case PLUS:
			case MINUS:
			case AUTO:
			case NONE:
			case INITIAL:
			case INHERIT:
			case REVERT:
			case UNSET:
			case TRANSPARENT:
			case CURRENTCOLOR:
			case FLEX:
			case GRID:
			case BLOCK:
			case INLINE:
			case INLINE_BLOCK:
			case INLINE_FLEX:
			case INLINE_GRID:
			case TABLE:
			case RELATIVE:
			case ABSOLUTE:
			case FIXED:
			case STATIC:
			case STICKY:
			case CENTER:
			case LEFT:
			case RIGHT:
			case TOP:
			case BOTTOM:
			case START:
			case END:
			case JUSTIFY:
			case LTR:
			case RTL:
			case TRUE:
			case FALSE:
			case MAX_CONTENT:
			case MIN_CONTENT:
			case FIT_CONTENT:
			case WHITE:
			case BLACK:
			case RED:
			case GREEN:
			case BLUE:
			case YELLOW:
			case PURPLE:
			case ORANGE:
			case GRAY:
			case GREY:
			case NUMBER:
			case INTEGER:
			case HEX_COLOR:
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(334);
				literalValue();
				}
				break;
			case URL:
				enterOuterAlt(_localctx, 3);
				{
				setState(335);
				match(URL);
				}
				break;
			case CALC:
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
				calcFunction();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 5);
				{
				setState(337);
				varFunction();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 6);
				{
				setState(338);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralValueContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(CssParser.NUMBER, 0); }
		public UnitContext unit() {
			return getRuleContext(UnitContext.class,0);
		}
		public TerminalNode INTEGER() { return getToken(CssParser.INTEGER, 0); }
		public TerminalNode STRING() { return getToken(CssParser.STRING, 0); }
		public TerminalNode HEX_COLOR() { return getToken(CssParser.HEX_COLOR, 0); }
		public Color_nameContext color_name() {
			return getRuleContext(Color_nameContext.class,0);
		}
		public KeywordValueContext keywordValue() {
			return getRuleContext(KeywordValueContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public LiteralValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterLiteralValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitLiteralValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitLiteralValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralValueContext literalValue() throws RecognitionException {
		LiteralValueContext _localctx = new LiteralValueContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_literalValue);
		int _la;
		try {
			setState(354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				match(NUMBER);
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140737454800896L) != 0)) {
					{
					setState(342);
					unit();
					}
				}

				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 2);
				{
				setState(345);
				match(INTEGER);
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140737454800896L) != 0)) {
					{
					setState(346);
					unit();
					}
				}

				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(349);
				match(STRING);
				}
				break;
			case HEX_COLOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(350);
				match(HEX_COLOR);
				}
				break;
			case WHITE:
			case BLACK:
			case RED:
			case GREEN:
			case BLUE:
			case YELLOW:
			case PURPLE:
			case ORANGE:
			case GRAY:
			case GREY:
				enterOuterAlt(_localctx, 5);
				{
				setState(351);
				color_name();
				}
				break;
			case AUTO:
			case NONE:
			case INITIAL:
			case INHERIT:
			case REVERT:
			case UNSET:
			case TRANSPARENT:
			case CURRENTCOLOR:
			case FLEX:
			case GRID:
			case BLOCK:
			case INLINE:
			case INLINE_BLOCK:
			case INLINE_FLEX:
			case INLINE_GRID:
			case TABLE:
			case RELATIVE:
			case ABSOLUTE:
			case FIXED:
			case STATIC:
			case STICKY:
			case CENTER:
			case LEFT:
			case RIGHT:
			case TOP:
			case BOTTOM:
			case START:
			case END:
			case JUSTIFY:
			case LTR:
			case RTL:
			case TRUE:
			case FALSE:
			case MAX_CONTENT:
			case MIN_CONTENT:
			case FIT_CONTENT:
				enterOuterAlt(_localctx, 6);
				{
				setState(352);
				keywordValue();
				}
				break;
			case COMMA:
			case STAR:
			case PERCENT:
			case SLASH:
			case PLUS:
			case MINUS:
				enterOuterAlt(_localctx, 7);
				{
				setState(353);
				operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnitContext extends ParserRuleContext {
		public TerminalNode PX() { return getToken(CssParser.PX, 0); }
		public TerminalNode EM() { return getToken(CssParser.EM, 0); }
		public TerminalNode REM() { return getToken(CssParser.REM, 0); }
		public TerminalNode VH() { return getToken(CssParser.VH, 0); }
		public TerminalNode VW() { return getToken(CssParser.VW, 0); }
		public TerminalNode VMIN() { return getToken(CssParser.VMIN, 0); }
		public TerminalNode VMAX() { return getToken(CssParser.VMAX, 0); }
		public TerminalNode PERCENTAGE() { return getToken(CssParser.PERCENTAGE, 0); }
		public TerminalNode DEG() { return getToken(CssParser.DEG, 0); }
		public TerminalNode GRAD() { return getToken(CssParser.GRAD, 0); }
		public TerminalNode RAD() { return getToken(CssParser.RAD, 0); }
		public TerminalNode TURN() { return getToken(CssParser.TURN, 0); }
		public TerminalNode MS() { return getToken(CssParser.MS, 0); }
		public TerminalNode S() { return getToken(CssParser.S, 0); }
		public TerminalNode CM() { return getToken(CssParser.CM, 0); }
		public TerminalNode MM() { return getToken(CssParser.MM, 0); }
		public TerminalNode IN() { return getToken(CssParser.IN, 0); }
		public TerminalNode PT() { return getToken(CssParser.PT, 0); }
		public TerminalNode PC() { return getToken(CssParser.PC, 0); }
		public TerminalNode CH() { return getToken(CssParser.CH, 0); }
		public TerminalNode EX() { return getToken(CssParser.EX, 0); }
		public TerminalNode FR() { return getToken(CssParser.FR, 0); }
		public UnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitContext unit() throws RecognitionException {
		UnitContext _localctx = new UnitContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_unit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 140737454800896L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeywordValueContext extends ParserRuleContext {
		public TerminalNode AUTO() { return getToken(CssParser.AUTO, 0); }
		public TerminalNode NONE() { return getToken(CssParser.NONE, 0); }
		public TerminalNode INITIAL() { return getToken(CssParser.INITIAL, 0); }
		public TerminalNode INHERIT() { return getToken(CssParser.INHERIT, 0); }
		public TerminalNode REVERT() { return getToken(CssParser.REVERT, 0); }
		public TerminalNode UNSET() { return getToken(CssParser.UNSET, 0); }
		public TerminalNode TRANSPARENT() { return getToken(CssParser.TRANSPARENT, 0); }
		public TerminalNode CURRENTCOLOR() { return getToken(CssParser.CURRENTCOLOR, 0); }
		public TerminalNode FLEX() { return getToken(CssParser.FLEX, 0); }
		public TerminalNode GRID() { return getToken(CssParser.GRID, 0); }
		public TerminalNode BLOCK() { return getToken(CssParser.BLOCK, 0); }
		public TerminalNode INLINE() { return getToken(CssParser.INLINE, 0); }
		public TerminalNode INLINE_BLOCK() { return getToken(CssParser.INLINE_BLOCK, 0); }
		public TerminalNode INLINE_FLEX() { return getToken(CssParser.INLINE_FLEX, 0); }
		public TerminalNode INLINE_GRID() { return getToken(CssParser.INLINE_GRID, 0); }
		public TerminalNode TABLE() { return getToken(CssParser.TABLE, 0); }
		public TerminalNode RELATIVE() { return getToken(CssParser.RELATIVE, 0); }
		public TerminalNode ABSOLUTE() { return getToken(CssParser.ABSOLUTE, 0); }
		public TerminalNode FIXED() { return getToken(CssParser.FIXED, 0); }
		public TerminalNode STATIC() { return getToken(CssParser.STATIC, 0); }
		public TerminalNode STICKY() { return getToken(CssParser.STICKY, 0); }
		public TerminalNode CENTER() { return getToken(CssParser.CENTER, 0); }
		public TerminalNode LEFT() { return getToken(CssParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(CssParser.RIGHT, 0); }
		public TerminalNode TOP() { return getToken(CssParser.TOP, 0); }
		public TerminalNode BOTTOM() { return getToken(CssParser.BOTTOM, 0); }
		public TerminalNode START() { return getToken(CssParser.START, 0); }
		public TerminalNode END() { return getToken(CssParser.END, 0); }
		public TerminalNode JUSTIFY() { return getToken(CssParser.JUSTIFY, 0); }
		public TerminalNode LTR() { return getToken(CssParser.LTR, 0); }
		public TerminalNode RTL() { return getToken(CssParser.RTL, 0); }
		public TerminalNode TRUE() { return getToken(CssParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(CssParser.FALSE, 0); }
		public TerminalNode MAX_CONTENT() { return getToken(CssParser.MAX_CONTENT, 0); }
		public TerminalNode MIN_CONTENT() { return getToken(CssParser.MIN_CONTENT, 0); }
		public TerminalNode FIT_CONTENT() { return getToken(CssParser.FIT_CONTENT, 0); }
		public KeywordValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keywordValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterKeywordValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitKeywordValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitKeywordValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordValueContext keywordValue() throws RecognitionException {
		KeywordValueContext _localctx = new KeywordValueContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_keywordValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_la = _input.LA(1);
			if ( !(((((_la - 48)) & ~0x3f) == 0 && ((1L << (_la - 48)) & 249108103167L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Color_nameContext extends ParserRuleContext {
		public TerminalNode WHITE() { return getToken(CssParser.WHITE, 0); }
		public TerminalNode BLACK() { return getToken(CssParser.BLACK, 0); }
		public TerminalNode RED() { return getToken(CssParser.RED, 0); }
		public TerminalNode GREEN() { return getToken(CssParser.GREEN, 0); }
		public TerminalNode BLUE() { return getToken(CssParser.BLUE, 0); }
		public TerminalNode YELLOW() { return getToken(CssParser.YELLOW, 0); }
		public TerminalNode PURPLE() { return getToken(CssParser.PURPLE, 0); }
		public TerminalNode ORANGE() { return getToken(CssParser.ORANGE, 0); }
		public TerminalNode GRAY() { return getToken(CssParser.GRAY, 0); }
		public TerminalNode GREY() { return getToken(CssParser.GREY, 0); }
		public Color_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterColor_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitColor_name(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitColor_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Color_nameContext color_name() throws RecognitionException {
		Color_nameContext _localctx = new Color_nameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_color_name);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_la = _input.LA(1);
			if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & 1023L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(CssParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CssParser.MINUS, 0); }
		public TerminalNode STAR() { return getToken(CssParser.STAR, 0); }
		public TerminalNode SLASH() { return getToken(CssParser.SLASH, 0); }
		public TerminalNode COMMA() { return getToken(CssParser.COMMA, 0); }
		public TerminalNode PERCENT() { return getToken(CssParser.PERCENT, 0); }
		public TerminalNode WS() { return getToken(CssParser.WS, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 246816L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(364);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(363);
				match(WS);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionValueContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(CssParser.FUNCTION, 0); }
		public FuncContentContext funcContent() {
			return getRuleContext(FuncContentContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(CssParser.SEMICOLON, 0); }
		public FunctionValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterFunctionValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitFunctionValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFunctionValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionValueContext functionValue() throws RecognitionException {
		FunctionValueContext _localctx = new FunctionValueContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_functionValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(FUNCTION);
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNC_CONTENT) {
				{
				setState(367);
				funcContent();
				}
			}

			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(370);
				match(SEMICOLON);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncContentContext extends ParserRuleContext {
		public TerminalNode FUNC_CONTENT() { return getToken(CssParser.FUNC_CONTENT, 0); }
		public FuncContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcContent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterFuncContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitFuncContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitFuncContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncContentContext funcContent() throws RecognitionException {
		FuncContentContext _localctx = new FuncContentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_funcContent);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(FUNC_CONTENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CalcFunctionContext extends ParserRuleContext {
		public TerminalNode CALC() { return getToken(CssParser.CALC, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CssParser.RPAREN, 0); }
		public CalcFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_calcFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterCalcFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitCalcFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitCalcFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CalcFunctionContext calcFunction() throws RecognitionException {
		CalcFunctionContext _localctx = new CalcFunctionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_calcFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
			match(CALC);
			setState(376);
			expr();
			setState(377);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarFunctionContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(CssParser.VAR, 0); }
		public TerminalNode CUSTOM_PROPERTY() { return getToken(CssParser.CUSTOM_PROPERTY, 0); }
		public TerminalNode RPAREN() { return getToken(CssParser.RPAREN, 0); }
		public TerminalNode COMMA() { return getToken(CssParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).enterVarFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CssParserListener ) ((CssParserListener)listener).exitVarFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CssParserVisitor ) return ((CssParserVisitor<? extends T>)visitor).visitVarFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarFunctionContext varFunction() throws RecognitionException {
		VarFunctionContext _localctx = new VarFunctionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_varFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(VAR);
			setState(380);
			match(CUSTOM_PROPERTY);
			setState(383);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(381);
				match(COMMA);
				setState(382);
				expr();
				}
			}

			setState(385);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0082\u0184\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0001\u0000\u0003\u0000^\b\u0000\u0001\u0000\u0005\u0000"+
		"a\b\u0000\n\u0000\f\u0000d\t\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"h\b\u0000\n\u0000\f\u0000k\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002v\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u0081\b\u0004\n\u0004\f\u0004\u0084\t\u0004\u0001\u0005\u0003\u0005\u0087"+
		"\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u008c\b\u0005"+
		"\n\u0005\f\u0005\u008f\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005"+
		"\u0005\u0094\b\u0005\n\u0005\f\u0005\u0097\t\u0005\u0003\u0005\u0099\b"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0003\u0007\u00a1\b\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00ba\b\u000e\n\u000e\f\u000e"+
		"\u00bd\t\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u00c1\b\u000e\n\u000e"+
		"\f\u000e\u00c4\t\u000e\u0001\u000f\u0003\u000f\u00c7\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00d3\b\u0010\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0005\u0011\u00d8\b\u0011\n\u0011\f\u0011\u00db"+
		"\t\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00e5\b\u0013\n\u0013\f\u0013"+
		"\u00e8\t\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u00ee\b\u0014\n\u0014\f\u0014\u00f1\t\u0014\u0001\u0015\u0001\u0015\u0003"+
		"\u0015\u00f5\b\u0015\u0001\u0016\u0003\u0016\u00f8\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u00ff\b\u0016"+
		"\n\u0016\f\u0016\u0102\t\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0111\b\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u011e"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0003\u001e\u0124"+
		"\b\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0003\u001f\u012c\b\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001"+
		"\"\u0003\"\u0134\b\"\u0001#\u0001#\u0005#\u0138\b#\n#\f#\u013b\t#\u0001"+
		"#\u0005#\u013e\b#\n#\f#\u0141\t#\u0001#\u0001#\u0001#\u0001#\u0005#\u0147"+
		"\b#\n#\f#\u014a\t#\u0003#\u014c\b#\u0001$\u0001$\u0001$\u0001$\u0001$"+
		"\u0001$\u0003$\u0154\b$\u0001%\u0001%\u0003%\u0158\b%\u0001%\u0001%\u0003"+
		"%\u015c\b%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u0163\b%\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0003)\u016d\b)\u0001*\u0001"+
		"*\u0003*\u0171\b*\u0001*\u0003*\u0174\b*\u0001+\u0001+\u0001,\u0001,\u0001"+
		",\u0001,\u0001-\u0001-\u0001-\u0001-\u0003-\u0180\b-\u0001-\u0001-\u0001"+
		"-\u0000\u0000.\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\u0000\u000b\u0002"+
		"\u0000pptt\u0001\u0000]^\u0002\u0000  QR\u0003\u0000\u0010\u0010\u0012"+
		"\u0012\u0014\u0014\u0002\u0000\n\nkk\u0002\u0000kkpp\u0001\u0000kl\u0001"+
		"\u0000\u0019.\u0002\u00000PSU\u0001\u0000aj\u0003\u0000\u0005\u0005\n"+
		"\n\u000e\u0011\u0190\u0000]\u0001\u0000\u0000\u0000\u0002n\u0001\u0000"+
		"\u0000\u0000\u0004r\u0001\u0000\u0000\u0000\u0006y\u0001\u0000\u0000\u0000"+
		"\b}\u0001\u0000\u0000\u0000\n\u0098\u0001\u0000\u0000\u0000\f\u009a\u0001"+
		"\u0000\u0000\u0000\u000e\u009c\u0001\u0000\u0000\u0000\u0010\u00a4\u0001"+
		"\u0000\u0000\u0000\u0012\u00a6\u0001\u0000\u0000\u0000\u0014\u00aa\u0001"+
		"\u0000\u0000\u0000\u0016\u00ad\u0001\u0000\u0000\u0000\u0018\u00af\u0001"+
		"\u0000\u0000\u0000\u001a\u00b2\u0001\u0000\u0000\u0000\u001c\u00b6\u0001"+
		"\u0000\u0000\u0000\u001e\u00c6\u0001\u0000\u0000\u0000 \u00d2\u0001\u0000"+
		"\u0000\u0000\"\u00d4\u0001\u0000\u0000\u0000$\u00de\u0001\u0000\u0000"+
		"\u0000&\u00e1\u0001\u0000\u0000\u0000(\u00e9\u0001\u0000\u0000\u0000*"+
		"\u00f4\u0001\u0000\u0000\u0000,\u00f7\u0001\u0000\u0000\u0000.\u0103\u0001"+
		"\u0000\u0000\u00000\u0105\u0001\u0000\u0000\u00002\u0108\u0001\u0000\u0000"+
		"\u00004\u010b\u0001\u0000\u0000\u00006\u0114\u0001\u0000\u0000\u00008"+
		"\u011d\u0001\u0000\u0000\u0000:\u011f\u0001\u0000\u0000\u0000<\u0121\u0001"+
		"\u0000\u0000\u0000>\u0127\u0001\u0000\u0000\u0000@\u012d\u0001\u0000\u0000"+
		"\u0000B\u012f\u0001\u0000\u0000\u0000D\u0131\u0001\u0000\u0000\u0000F"+
		"\u014b\u0001\u0000\u0000\u0000H\u0153\u0001\u0000\u0000\u0000J\u0162\u0001"+
		"\u0000\u0000\u0000L\u0164\u0001\u0000\u0000\u0000N\u0166\u0001\u0000\u0000"+
		"\u0000P\u0168\u0001\u0000\u0000\u0000R\u016a\u0001\u0000\u0000\u0000T"+
		"\u016e\u0001\u0000\u0000\u0000V\u0175\u0001\u0000\u0000\u0000X\u0177\u0001"+
		"\u0000\u0000\u0000Z\u017b\u0001\u0000\u0000\u0000\\^\u0003\u0002\u0001"+
		"\u0000]\\\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000^b\u0001\u0000"+
		"\u0000\u0000_a\u0003\u0004\u0002\u0000`_\u0001\u0000\u0000\u0000ad\u0001"+
		"\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"ci\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000eh\u0003$\u0012\u0000"+
		"fh\u0003 \u0010\u0000ge\u0001\u0000\u0000\u0000gf\u0001\u0000\u0000\u0000"+
		"hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000\u0000"+
		"\u0000jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0005\u0000"+
		"\u0000\u0001m\u0001\u0001\u0000\u0000\u0000no\u0005\\\u0000\u0000op\u0005"+
		"p\u0000\u0000pq\u0005\u0003\u0000\u0000q\u0003\u0001\u0000\u0000\u0000"+
		"rs\u0005W\u0000\u0000su\u0007\u0000\u0000\u0000tv\u0003\b\u0004\u0000"+
		"ut\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000"+
		"\u0000wx\u0005\u0003\u0000\u0000x\u0005\u0001\u0000\u0000\u0000yz\u0005"+
		"V\u0000\u0000z{\u0003\b\u0004\u0000{|\u0003\"\u0011\u0000|\u0007\u0001"+
		"\u0000\u0000\u0000}\u0082\u0003\n\u0005\u0000~\u007f\u0005\u0005\u0000"+
		"\u0000\u007f\u0081\u0003\n\u0005\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0081\u0084\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\t\u0001\u0000\u0000\u0000\u0084"+
		"\u0082\u0001\u0000\u0000\u0000\u0085\u0087\u0007\u0001\u0000\u0000\u0086"+
		"\u0085\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\u0088\u0001\u0000\u0000\u0000\u0088\u008d\u0003\f\u0006\u0000\u0089\u008a"+
		"\u0005_\u0000\u0000\u008a\u008c\u0003\u000e\u0007\u0000\u008b\u0089\u0001"+
		"\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b\u0001"+
		"\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0099\u0001"+
		"\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0095\u0003"+
		"\u000e\u0007\u0000\u0091\u0092\u0005_\u0000\u0000\u0092\u0094\u0003\u000e"+
		"\u0007\u0000\u0093\u0091\u0001\u0000\u0000\u0000\u0094\u0097\u0001\u0000"+
		"\u0000\u0000\u0095\u0093\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000"+
		"\u0000\u0000\u0096\u0099\u0001\u0000\u0000\u0000\u0097\u0095\u0001\u0000"+
		"\u0000\u0000\u0098\u0086\u0001\u0000\u0000\u0000\u0098\u0090\u0001\u0000"+
		"\u0000\u0000\u0099\u000b\u0001\u0000\u0000\u0000\u009a\u009b\u0005k\u0000"+
		"\u0000\u009b\r\u0001\u0000\u0000\u0000\u009c\u009d\u0005\u0006\u0000\u0000"+
		"\u009d\u00a0\u0003\u0010\b\u0000\u009e\u009f\u0005\u0004\u0000\u0000\u009f"+
		"\u00a1\u0003F#\u0000\u00a0\u009e\u0001\u0000\u0000\u0000\u00a0\u00a1\u0001"+
		"\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0005"+
		"\u0007\u0000\u0000\u00a3\u000f\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005"+
		"k\u0000\u0000\u00a5\u0011\u0001\u0000\u0000\u0000\u00a6\u00a7\u0005X\u0000"+
		"\u0000\u00a7\u00a8\u0005k\u0000\u0000\u00a8\u00a9\u0003\"\u0011\u0000"+
		"\u00a9\u0013\u0001\u0000\u0000\u0000\u00aa\u00ab\u0003\u0016\u000b\u0000"+
		"\u00ab\u00ac\u0003\"\u0011\u0000\u00ac\u0015\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0007\u0002\u0000\u0000\u00ae\u0017\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0005Y\u0000\u0000\u00b0\u00b1\u0003\"\u0011\u0000\u00b1\u0019"+
		"\u0001\u0000\u0000\u0000\u00b2\u00b3\u0005[\u0000\u0000\u00b3\u00b4\u0003"+
		"\u001c\u000e\u0000\u00b4\u00b5\u0003\"\u0011\u0000\u00b5\u001b\u0001\u0000"+
		"\u0000\u0000\u00b6\u00bb\u0003\u001e\u000f\u0000\u00b7\u00b8\u0005_\u0000"+
		"\u0000\u00b8\u00ba\u0003\u001e\u000f\u0000\u00b9\u00b7\u0001\u0000\u0000"+
		"\u0000\u00ba\u00bd\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00c2\u0001\u0000\u0000"+
		"\u0000\u00bd\u00bb\u0001\u0000\u0000\u0000\u00be\u00bf\u0005`\u0000\u0000"+
		"\u00bf\u00c1\u0003\u001e\u000f\u0000\u00c0\u00be\u0001\u0000\u0000\u0000"+
		"\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000"+
		"\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u001d\u0001\u0000\u0000\u0000"+
		"\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c7\u0005^\u0000\u0000\u00c6"+
		"\u00c5\u0001\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c8\u00c9\u0005\u0006\u0000\u0000\u00c9"+
		"\u00ca\u0003>\u001f\u0000\u00ca\u00cb\u0005\u0007\u0000\u0000\u00cb\u001f"+
		"\u0001\u0000\u0000\u0000\u00cc\u00d3\u0003\u0002\u0001\u0000\u00cd\u00d3"+
		"\u0003\u0004\u0002\u0000\u00ce\u00d3\u0003\u0006\u0003\u0000\u00cf\u00d3"+
		"\u0003\u0012\t\u0000\u00d0\u00d3\u0003\u0018\f\u0000\u00d1\u00d3\u0003"+
		"\u001a\r\u0000\u00d2\u00cc\u0001\u0000\u0000\u0000\u00d2\u00cd\u0001\u0000"+
		"\u0000\u0000\u00d2\u00ce\u0001\u0000\u0000\u0000\u00d2\u00cf\u0001\u0000"+
		"\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000\u0000\u00d2\u00d1\u0001\u0000"+
		"\u0000\u0000\u00d3!\u0001\u0000\u0000\u0000\u00d4\u00d9\u0005\u0001\u0000"+
		"\u0000\u00d5\u00d8\u0003>\u001f\u0000\u00d6\u00d8\u0003$\u0012\u0000\u00d7"+
		"\u00d5\u0001\u0000\u0000\u0000\u00d7\u00d6\u0001\u0000\u0000\u0000\u00d8"+
		"\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00d9"+
		"\u00da\u0001\u0000\u0000\u0000\u00da\u00dc\u0001\u0000\u0000\u0000\u00db"+
		"\u00d9\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u0002\u0000\u0000\u00dd"+
		"#\u0001\u0000\u0000\u0000\u00de\u00df\u0003&\u0013\u0000\u00df\u00e0\u0003"+
		"\"\u0011\u0000\u00e0%\u0001\u0000\u0000\u0000\u00e1\u00e6\u0003(\u0014"+
		"\u0000\u00e2\u00e3\u0005\u0005\u0000\u0000\u00e3\u00e5\u0003(\u0014\u0000"+
		"\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e5\u00e8\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e4\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e7\'\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000\u0000\u00e9"+
		"\u00ef\u0003,\u0016\u0000\u00ea\u00eb\u0003*\u0015\u0000\u00eb\u00ec\u0003"+
		",\u0016\u0000\u00ec\u00ee\u0001\u0000\u0000\u0000\u00ed\u00ea\u0001\u0000"+
		"\u0000\u0000\u00ee\u00f1\u0001\u0000\u0000\u0000\u00ef\u00ed\u0001\u0000"+
		"\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000\u00f0)\u0001\u0000\u0000"+
		"\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000\u00f2\u00f5\u0007\u0003\u0000"+
		"\u0000\u00f3\u00f5\u0005w\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5+\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f8\u0003.\u0017\u0000\u00f7\u00f6\u0001\u0000\u0000\u0000\u00f7\u00f8"+
		"\u0001\u0000\u0000\u0000\u00f8\u0100\u0001\u0000\u0000\u0000\u00f9\u00ff"+
		"\u00030\u0018\u0000\u00fa\u00ff\u00032\u0019\u0000\u00fb\u00ff\u00034"+
		"\u001a\u0000\u00fc\u00ff\u0003<\u001e\u0000\u00fd\u00ff\u0003.\u0017\u0000"+
		"\u00fe\u00f9\u0001\u0000\u0000\u0000\u00fe\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fe\u00fb\u0001\u0000\u0000\u0000\u00fe\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff\u0102\u0001\u0000\u0000\u0000"+
		"\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101\u0001\u0000\u0000\u0000"+
		"\u0101-\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000\u0000\u0000\u0103"+
		"\u0104\u0007\u0004\u0000\u0000\u0104/\u0001\u0000\u0000\u0000\u0105\u0106"+
		"\u0005\f\u0000\u0000\u0106\u0107\u0005k\u0000\u0000\u01071\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0005\u000b\u0000\u0000\u0109\u010a\u0005k\u0000"+
		"\u0000\u010a3\u0001\u0000\u0000\u0000\u010b\u010c\u0005\b\u0000\u0000"+
		"\u010c\u0110\u00036\u001b\u0000\u010d\u010e\u00038\u001c\u0000\u010e\u010f"+
		"\u0003:\u001d\u0000\u010f\u0111\u0001\u0000\u0000\u0000\u0110\u010d\u0001"+
		"\u0000\u0000\u0000\u0110\u0111\u0001\u0000\u0000\u0000\u0111\u0112\u0001"+
		"\u0000\u0000\u0000\u0112\u0113\u0005\t\u0000\u0000\u01135\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0005k\u0000\u0000\u01157\u0001\u0000\u0000\u0000"+
		"\u0116\u011e\u0005\u0017\u0000\u0000\u0117\u0118\u0005\n\u0000\u0000\u0118"+
		"\u011e\u0005\u0017\u0000\u0000\u0119\u011a\u0005\u0014\u0000\u0000\u011a"+
		"\u011e\u0005\u0017\u0000\u0000\u011b\u011c\u0005\u0016\u0000\u0000\u011c"+
		"\u011e\u0005\u0017\u0000\u0000\u011d\u0116\u0001\u0000\u0000\u0000\u011d"+
		"\u0117\u0001\u0000\u0000\u0000\u011d\u0119\u0001\u0000\u0000\u0000\u011d"+
		"\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e"+
		"9\u0001\u0000\u0000\u0000\u011f\u0120\u0007\u0005\u0000\u0000\u0120;\u0001"+
		"\u0000\u0000\u0000\u0121\u0123\u0005\u0004\u0000\u0000\u0122\u0124\u0005"+
		"\u0004\u0000\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0123\u0124\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0126\u0005"+
		"k\u0000\u0000\u0126=\u0001\u0000\u0000\u0000\u0127\u0128\u0003@ \u0000"+
		"\u0128\u0129\u0005\u0004\u0000\u0000\u0129\u012b\u0003D\"\u0000\u012a"+
		"\u012c\u0005\u0003\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012b"+
		"\u012c\u0001\u0000\u0000\u0000\u012c?\u0001\u0000\u0000\u0000\u012d\u012e"+
		"\u0007\u0006\u0000\u0000\u012eA\u0001\u0000\u0000\u0000\u012f\u0130\u0005"+
		"/\u0000\u0000\u0130C\u0001\u0000\u0000\u0000\u0131\u0133\u0003F#\u0000"+
		"\u0132\u0134\u0003B!\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0133\u0134"+
		"\u0001\u0000\u0000\u0000\u0134E\u0001\u0000\u0000\u0000\u0135\u0139\u0003"+
		"H$\u0000\u0136\u0138\u0005w\u0000\u0000\u0137\u0136\u0001\u0000\u0000"+
		"\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u0001\u0000\u0000\u0000\u013a\u013f\u0001\u0000\u0000"+
		"\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013c\u013e\u0003H$\u0000\u013d"+
		"\u013c\u0001\u0000\u0000\u0000\u013e\u0141\u0001\u0000\u0000\u0000\u013f"+
		"\u013d\u0001\u0000\u0000\u0000\u013f\u0140\u0001\u0000\u0000\u0000\u0140"+
		"\u014c\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0142"+
		"\u0148\u0003H$\u0000\u0143\u0144\u0003R)\u0000\u0144\u0145\u0003H$\u0000"+
		"\u0145\u0147\u0001\u0000\u0000\u0000\u0146\u0143\u0001\u0000\u0000\u0000"+
		"\u0147\u014a\u0001\u0000\u0000\u0000\u0148\u0146\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014c\u0001\u0000\u0000\u0000"+
		"\u014a\u0148\u0001\u0000\u0000\u0000\u014b\u0135\u0001\u0000\u0000\u0000"+
		"\u014b\u0142\u0001\u0000\u0000\u0000\u014cG\u0001\u0000\u0000\u0000\u014d"+
		"\u0154\u0003T*\u0000\u014e\u0154\u0003J%\u0000\u014f\u0154\u0005t\u0000"+
		"\u0000\u0150\u0154\u0003X,\u0000\u0151\u0154\u0003Z-\u0000\u0152\u0154"+
		"\u0005k\u0000\u0000\u0153\u014d\u0001\u0000\u0000\u0000\u0153\u014e\u0001"+
		"\u0000\u0000\u0000\u0153\u014f\u0001\u0000\u0000\u0000\u0153\u0150\u0001"+
		"\u0000\u0000\u0000\u0153\u0151\u0001\u0000\u0000\u0000\u0153\u0152\u0001"+
		"\u0000\u0000\u0000\u0154I\u0001\u0000\u0000\u0000\u0155\u0157\u0005m\u0000"+
		"\u0000\u0156\u0158\u0003L&\u0000\u0157\u0156\u0001\u0000\u0000\u0000\u0157"+
		"\u0158\u0001\u0000\u0000\u0000\u0158\u0163\u0001\u0000\u0000\u0000\u0159"+
		"\u015b\u0005n\u0000\u0000\u015a\u015c\u0003L&\u0000\u015b\u015a\u0001"+
		"\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u0163\u0001"+
		"\u0000\u0000\u0000\u015d\u0163\u0005p\u0000\u0000\u015e\u0163\u0005o\u0000"+
		"\u0000\u015f\u0163\u0003P(\u0000\u0160\u0163\u0003N\'\u0000\u0161\u0163"+
		"\u0003R)\u0000\u0162\u0155\u0001\u0000\u0000\u0000\u0162\u0159\u0001\u0000"+
		"\u0000\u0000\u0162\u015d\u0001\u0000\u0000\u0000\u0162\u015e\u0001\u0000"+
		"\u0000\u0000\u0162\u015f\u0001\u0000\u0000\u0000\u0162\u0160\u0001\u0000"+
		"\u0000\u0000\u0162\u0161\u0001\u0000\u0000\u0000\u0163K\u0001\u0000\u0000"+
		"\u0000\u0164\u0165\u0007\u0007\u0000\u0000\u0165M\u0001\u0000\u0000\u0000"+
		"\u0166\u0167\u0007\b\u0000\u0000\u0167O\u0001\u0000\u0000\u0000\u0168"+
		"\u0169\u0007\t\u0000\u0000\u0169Q\u0001\u0000\u0000\u0000\u016a\u016c"+
		"\u0007\n\u0000\u0000\u016b\u016d\u0005w\u0000\u0000\u016c\u016b\u0001"+
		"\u0000\u0000\u0000\u016c\u016d\u0001\u0000\u0000\u0000\u016dS\u0001\u0000"+
		"\u0000\u0000\u016e\u0170\u0005q\u0000\u0000\u016f\u0171\u0003V+\u0000"+
		"\u0170\u016f\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000"+
		"\u0171\u0173\u0001\u0000\u0000\u0000\u0172\u0174\u0005\u0003\u0000\u0000"+
		"\u0173\u0172\u0001\u0000\u0000\u0000\u0173\u0174\u0001\u0000\u0000\u0000"+
		"\u0174U\u0001\u0000\u0000\u0000\u0175\u0176\u0005x\u0000\u0000\u0176W"+
		"\u0001\u0000\u0000\u0000\u0177\u0178\u0005r\u0000\u0000\u0178\u0179\u0003"+
		"F#\u0000\u0179\u017a\u0005\u0007\u0000\u0000\u017aY\u0001\u0000\u0000"+
		"\u0000\u017b\u017c\u0005s\u0000\u0000\u017c\u017f\u0005l\u0000\u0000\u017d"+
		"\u017e\u0005\u0005\u0000\u0000\u017e\u0180\u0003F#\u0000\u017f\u017d\u0001"+
		"\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0181\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0005\u0007\u0000\u0000\u0182[\u0001\u0000"+
		"\u0000\u0000(]bgiu\u0082\u0086\u008d\u0095\u0098\u00a0\u00bb\u00c2\u00c6"+
		"\u00d2\u00d7\u00d9\u00e6\u00ef\u00f4\u00f7\u00fe\u0100\u0110\u011d\u0123"+
		"\u012b\u0133\u0139\u013f\u0148\u014b\u0153\u0157\u015b\u0162\u016c\u0170"+
		"\u0173\u017f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}