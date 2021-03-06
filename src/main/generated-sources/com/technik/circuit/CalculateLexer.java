// Generated from com/technik/circuit/Calculate.g4 by ANTLR 4.1
package com.technik.circuit;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalculateLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COS=1, SIN=2, TAN=3, ACOS=4, ASIN=5, ATAN=6, LN=7, LOG=8, SQRT=9, LPAREN=10, 
		RPAREN=11, PLUS=12, MINUS=13, TIMES=14, DIV=15, GT=16, LT=17, EQ=18, COMMA=19, 
		POINT=20, POW=21, PI=22, EULER=23, I=24, VARIABLE=25, SCIENTIFIC_NUMBER=26, 
		WS=27;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'cos'", "'sin'", "'tan'", "'acos'", "'asin'", "'atan'", "'ln'", "'log'", 
		"'sqrt'", "'('", "')'", "'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'='", 
		"','", "'.'", "'^'", "'pi'", "EULER", "'i'", "VARIABLE", "SCIENTIFIC_NUMBER", 
		"WS"
	};
	public static final String[] ruleNames = {
		"COS", "SIN", "TAN", "ACOS", "ASIN", "ATAN", "LN", "LOG", "SQRT", "LPAREN", 
		"RPAREN", "PLUS", "MINUS", "TIMES", "DIV", "GT", "LT", "EQ", "COMMA", 
		"POINT", "POW", "PI", "EULER", "I", "VARIABLE", "VALID_ID_START", "VALID_ID_CHAR", 
		"SCIENTIFIC_NUMBER", "NUMBER", "E1", "E2", "SIGN", "WS"
	};


	public CalculateLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Calculate.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 32: WS_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2\35\u00bf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3"+
		"\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\7\32\u008e\n\32"+
		"\f\32\16\32\u0091\13\32\3\33\5\33\u0094\n\33\3\34\3\34\5\34\u0098\n\34"+
		"\3\35\3\35\3\35\5\35\u009d\n\35\3\35\5\35\u00a0\n\35\3\35\3\35\5\35\u00a4"+
		"\n\35\3\36\6\36\u00a7\n\36\r\36\16\36\u00a8\3\36\3\36\6\36\u00ad\n\36"+
		"\r\36\16\36\u00ae\5\36\u00b1\n\36\3\37\3\37\3 \3 \3!\3!\3\"\6\"\u00ba"+
		"\n\"\r\"\16\"\u00bb\3\"\3\"\2#\3\3\1\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17"+
		"\t\1\21\n\1\23\13\1\25\f\1\27\r\1\31\16\1\33\17\1\35\20\1\37\21\1!\22"+
		"\1#\23\1%\24\1\'\25\1)\26\1+\27\1-\30\1/\31\1\61\32\1\63\33\1\65\2\1\67"+
		"\2\19\34\1;\2\1=\2\1?\2\1A\2\1C\35\2\3\2\5\5\2C\\aac|\4\2--//\5\2\13\f"+
		"\17\17\"\"\u00c1\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\29\3\2\2\2\2C\3\2\2\2\3E\3"+
		"\2\2\2\5I\3\2\2\2\7M\3\2\2\2\tQ\3\2\2\2\13V\3\2\2\2\r[\3\2\2\2\17`\3\2"+
		"\2\2\21c\3\2\2\2\23g\3\2\2\2\25l\3\2\2\2\27n\3\2\2\2\31p\3\2\2\2\33r\3"+
		"\2\2\2\35t\3\2\2\2\37v\3\2\2\2!x\3\2\2\2#z\3\2\2\2%|\3\2\2\2\'~\3\2\2"+
		"\2)\u0080\3\2\2\2+\u0082\3\2\2\2-\u0084\3\2\2\2/\u0087\3\2\2\2\61\u0089"+
		"\3\2\2\2\63\u008b\3\2\2\2\65\u0093\3\2\2\2\67\u0097\3\2\2\29\u0099\3\2"+
		"\2\2;\u00a6\3\2\2\2=\u00b2\3\2\2\2?\u00b4\3\2\2\2A\u00b6\3\2\2\2C\u00b9"+
		"\3\2\2\2EF\7e\2\2FG\7q\2\2GH\7u\2\2H\4\3\2\2\2IJ\7u\2\2JK\7k\2\2KL\7p"+
		"\2\2L\6\3\2\2\2MN\7v\2\2NO\7c\2\2OP\7p\2\2P\b\3\2\2\2QR\7c\2\2RS\7e\2"+
		"\2ST\7q\2\2TU\7u\2\2U\n\3\2\2\2VW\7c\2\2WX\7u\2\2XY\7k\2\2YZ\7p\2\2Z\f"+
		"\3\2\2\2[\\\7c\2\2\\]\7v\2\2]^\7c\2\2^_\7p\2\2_\16\3\2\2\2`a\7n\2\2ab"+
		"\7p\2\2b\20\3\2\2\2cd\7n\2\2de\7q\2\2ef\7i\2\2f\22\3\2\2\2gh\7u\2\2hi"+
		"\7s\2\2ij\7t\2\2jk\7v\2\2k\24\3\2\2\2lm\7*\2\2m\26\3\2\2\2no\7+\2\2o\30"+
		"\3\2\2\2pq\7-\2\2q\32\3\2\2\2rs\7/\2\2s\34\3\2\2\2tu\7,\2\2u\36\3\2\2"+
		"\2vw\7\61\2\2w \3\2\2\2xy\7@\2\2y\"\3\2\2\2z{\7>\2\2{$\3\2\2\2|}\7?\2"+
		"\2}&\3\2\2\2~\177\7.\2\2\177(\3\2\2\2\u0080\u0081\7\60\2\2\u0081*\3\2"+
		"\2\2\u0082\u0083\7`\2\2\u0083,\3\2\2\2\u0084\u0085\7r\2\2\u0085\u0086"+
		"\7k\2\2\u0086.\3\2\2\2\u0087\u0088\5? \2\u0088\60\3\2\2\2\u0089\u008a"+
		"\7k\2\2\u008a\62\3\2\2\2\u008b\u008f\5\65\33\2\u008c\u008e\5\67\34\2\u008d"+
		"\u008c\3\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2"+
		"\2\2\u0090\64\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\t\2\2\2\u0093\u0092"+
		"\3\2\2\2\u0094\66\3\2\2\2\u0095\u0098\5\65\33\2\u0096\u0098\4\62;\2\u0097"+
		"\u0095\3\2\2\2\u0097\u0096\3\2\2\2\u00988\3\2\2\2\u0099\u00a3\5;\36\2"+
		"\u009a\u009d\5=\37\2\u009b\u009d\5? \2\u009c\u009a\3\2\2\2\u009c\u009b"+
		"\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u00a0\5A!\2\u009f\u009e\3\2\2\2\u009f"+
		"\u00a0\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a2\5;\36\2\u00a2\u00a4\3\2"+
		"\2\2\u00a3\u009c\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4:\3\2\2\2\u00a5\u00a7"+
		"\4\62;\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8"+
		"\u00a9\3\2\2\2\u00a9\u00b0\3\2\2\2\u00aa\u00ac\7\60\2\2\u00ab\u00ad\4"+
		"\62;\2\u00ac\u00ab\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae\u00ac\3\2\2\2\u00ae"+
		"\u00af\3\2\2\2\u00af\u00b1\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1<\3\2\2\2\u00b2\u00b3\7G\2\2\u00b3>\3\2\2\2\u00b4\u00b5\7g\2"+
		"\2\u00b5@\3\2\2\2\u00b6\u00b7\t\3\2\2\u00b7B\3\2\2\2\u00b8\u00ba\t\4\2"+
		"\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\b\"\2\2\u00beD\3\2\2\2\r\2\u008f"+
		"\u0093\u0097\u009c\u009f\u00a3\u00a8\u00ae\u00b0\u00bb";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}