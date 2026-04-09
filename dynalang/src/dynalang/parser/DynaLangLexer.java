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
		T__0=1, T__1=2, Print=3, Open=4, Dot=5, Number=6, Identifier=7, String=8, 
		Letter=9, LetterOrDigit=10, WS=11;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "Print", "Open", "Dot", "Number", "Identifier", "String", 
		"Letter", "LetterOrDigit", "DIGIT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'+'", "'print'", "'open'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "Print", "Open", "Dot", "Number", "Identifier", "String", 
		"Letter", "LetterOrDigit", "WS"
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
		case 8:
			return Letter_sempred((RuleContext)_localctx, predIndex);
		case 9:
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\rZ\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\7\6\7.\n\7\r\7\16\7/\3\b\3\b\7\b\64\n\b\f\b\16\b"+
		"\67\13\b\3\t\3\t\7\t;\n\t\f\t\16\t>\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\5\nH\n\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13P\n\13\3\f\3\f\3\r\6\rU"+
		"\n\r\r\r\16\rV\3\r\3\r\2\2\16\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\2\31\r\3\2\t\3\2$$\6\2&&C\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802"+
		"\udc01\3\2\udc02\ue001\7\2&&\62;C\\aac|\5\2\13\f\16\17\"\"`\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\31\3\2\2\2\3\33\3\2\2"+
		"\2\5\35\3\2\2\2\7\37\3\2\2\2\t%\3\2\2\2\13*\3\2\2\2\r-\3\2\2\2\17\61\3"+
		"\2\2\2\218\3\2\2\2\23G\3\2\2\2\25O\3\2\2\2\27Q\3\2\2\2\31T\3\2\2\2\33"+
		"\34\7?\2\2\34\4\3\2\2\2\35\36\7-\2\2\36\6\3\2\2\2\37 \7r\2\2 !\7t\2\2"+
		"!\"\7k\2\2\"#\7p\2\2#$\7v\2\2$\b\3\2\2\2%&\7q\2\2&\'\7r\2\2\'(\7g\2\2"+
		"()\7p\2\2)\n\3\2\2\2*+\7\60\2\2+\f\3\2\2\2,.\5\27\f\2-,\3\2\2\2./\3\2"+
		"\2\2/-\3\2\2\2/\60\3\2\2\2\60\16\3\2\2\2\61\65\5\23\n\2\62\64\5\25\13"+
		"\2\63\62\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\20\3\2\2"+
		"\2\67\65\3\2\2\28<\7$\2\29;\n\2\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3"+
		"\2\2\2=?\3\2\2\2><\3\2\2\2?@\7$\2\2@\22\3\2\2\2AH\t\3\2\2BC\n\4\2\2CH"+
		"\6\n\2\2DE\t\5\2\2EF\t\6\2\2FH\6\n\3\2GA\3\2\2\2GB\3\2\2\2GD\3\2\2\2H"+
		"\24\3\2\2\2IP\t\7\2\2JK\n\4\2\2KP\6\13\4\2LM\t\5\2\2MN\t\6\2\2NP\6\13"+
		"\5\2OI\3\2\2\2OJ\3\2\2\2OL\3\2\2\2P\26\3\2\2\2QR\4\62;\2R\30\3\2\2\2S"+
		"U\t\b\2\2TS\3\2\2\2UV\3\2\2\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\b\r\2\2"+
		"Y\32\3\2\2\2\t\2/\65<GOV\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}