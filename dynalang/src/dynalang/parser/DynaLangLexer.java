// Generated from DynaLang.g by ANTLR 4.5
package dynalang.parser; import static dynalang.AST.*;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DynaLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, Dot=2, Number=3, Identifier=4, Letter=5, LetterOrDigit=6, AT=7, 
		ELLIPSIS=8, WS=9, Comment=10, Line_Comment=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "Dot", "Number", "Identifier", "Letter", "LetterOrDigit", "DIGIT", 
		"AT", "ELLIPSIS", "WS", "Comment", "Line_Comment"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'+'", "'.'", null, null, null, null, "'@'", "'...'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "Dot", "Number", "Identifier", "Letter", "LetterOrDigit", 
		"AT", "ELLIPSIS", "WS", "Comment", "Line_Comment"
	};
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


	public DynaLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DynaLang.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 5:
			return LetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean Letter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return Character.isJavaIdentifierStart(_input.LA(-1));
		case 1:
			return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean LetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return Character.isJavaIdentifierPart(_input.LA(-1));
		case 3:
			return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\rc\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\6\4!\n\4\r\4\16\4\"\3\5\3\5\7"+
		"\5\'\n\5\f\5\16\5*\13\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6\62\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7:\n\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\13\6\13E\n\13"+
		"\r\13\16\13F\3\13\3\13\3\f\3\f\3\f\3\f\7\fO\n\f\f\f\16\fR\13\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\r]\n\r\f\r\16\r`\13\r\3\r\3\r\3P\2\16\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\2\21\t\23\n\25\13\27\f\31\r\3\2\t\6\2&&C\\"+
		"aac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62"+
		";C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17j\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2\2\5\35\3\2\2\2\7"+
		" \3\2\2\2\t$\3\2\2\2\13\61\3\2\2\2\r9\3\2\2\2\17;\3\2\2\2\21=\3\2\2\2"+
		"\23?\3\2\2\2\25D\3\2\2\2\27J\3\2\2\2\31X\3\2\2\2\33\34\7-\2\2\34\4\3\2"+
		"\2\2\35\36\7\60\2\2\36\6\3\2\2\2\37!\5\17\b\2 \37\3\2\2\2!\"\3\2\2\2\""+
		" \3\2\2\2\"#\3\2\2\2#\b\3\2\2\2$(\5\13\6\2%\'\5\r\7\2&%\3\2\2\2\'*\3\2"+
		"\2\2(&\3\2\2\2()\3\2\2\2)\n\3\2\2\2*(\3\2\2\2+\62\t\2\2\2,-\n\3\2\2-\62"+
		"\6\6\2\2./\t\4\2\2/\60\t\5\2\2\60\62\6\6\3\2\61+\3\2\2\2\61,\3\2\2\2\61"+
		".\3\2\2\2\62\f\3\2\2\2\63:\t\6\2\2\64\65\n\3\2\2\65:\6\7\4\2\66\67\t\4"+
		"\2\2\678\t\5\2\28:\6\7\5\29\63\3\2\2\29\64\3\2\2\29\66\3\2\2\2:\16\3\2"+
		"\2\2;<\4\62;\2<\20\3\2\2\2=>\7B\2\2>\22\3\2\2\2?@\7\60\2\2@A\7\60\2\2"+
		"AB\7\60\2\2B\24\3\2\2\2CE\t\7\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2"+
		"\2\2GH\3\2\2\2HI\b\13\2\2I\26\3\2\2\2JK\7\61\2\2KL\7,\2\2LP\3\2\2\2MO"+
		"\13\2\2\2NM\3\2\2\2OR\3\2\2\2PQ\3\2\2\2PN\3\2\2\2QS\3\2\2\2RP\3\2\2\2"+
		"ST\7,\2\2TU\7\61\2\2UV\3\2\2\2VW\b\f\2\2W\30\3\2\2\2XY\7\61\2\2YZ\7\61"+
		"\2\2Z^\3\2\2\2[]\n\b\2\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3"+
		"\2\2\2`^\3\2\2\2ab\b\r\2\2b\32\3\2\2\2\n\2\"(\619FP^\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}