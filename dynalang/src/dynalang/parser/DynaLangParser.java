// Generated from DynaLang.g by ANTLR 4.5
package dynalang.parser; import static dynalang.AST.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DynaLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, Print=3, Open=4, Dot=5, Number=6, Identifier=7, String=8, 
		Letter=9, LetterOrDigit=10, WS=11;
	public static final int
		RULE_program = 0, RULE_assign = 1, RULE_exp = 2, RULE_print = 3, RULE_open = 4, 
		RULE_varexp = 5, RULE_strexp = 6, RULE_numexp = 7;
	public static final String[] ruleNames = {
		"program", "assign", "exp", "print", "open", "varexp", "strexp", "numexp"
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

	@Override
	public String getGrammarFileName() { return "DynaLang.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DynaLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public Program ast;
		public AssignContext a;
		public ExpContext e;
		public PrintContext p;
		public OpenContext o;
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public OpenContext open() {
			return getRuleContext(OpenContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(28);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(16);
				((ProgramContext)_localctx).a = assign();
				 ((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).a.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				((ProgramContext)_localctx).e = exp(0);
				 ((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).e.ast); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				((ProgramContext)_localctx).p = print();
				 ((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).p.ast);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(25);
				((ProgramContext)_localctx).o = open();
				 ((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).o.ast);
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

	public static class AssignContext extends ParserRuleContext {
		public AssignExp ast;
		public VarexpContext l;
		public ExpContext r;
		public VarexpContext varexp() {
			return getRuleContext(VarexpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			((AssignContext)_localctx).l = varexp();
			setState(31);
			match(T__0);
			setState(32);
			((AssignContext)_localctx).r = exp(0);
			 ((AssignContext)_localctx).ast =  new AssignExp(((AssignContext)_localctx).l.ast, ((AssignContext)_localctx).r.ast); 
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

	public static class ExpContext extends ParserRuleContext {
		public Exp ast;
		public ExpContext l;
		public NumexpContext n;
		public VarexpContext v;
		public StrexpContext s;
		public ExpContext r;
		public NumexpContext numexp() {
			return getRuleContext(NumexpContext.class,0);
		}
		public VarexpContext varexp() {
			return getRuleContext(VarexpContext.class,0);
		}
		public StrexpContext strexp() {
			return getRuleContext(StrexpContext.class,0);
		}
		public List<ExpContext> exp() {
			return getRuleContexts(ExpContext.class);
		}
		public ExpContext exp(int i) {
			return getRuleContext(ExpContext.class,i);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
	}

	public final ExpContext exp() throws RecognitionException {
		return exp(0);
	}

	private ExpContext exp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpContext _localctx = new ExpContext(_ctx, _parentState);
		ExpContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_exp, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			switch (_input.LA(1)) {
			case Number:
				{
				setState(36);
				((ExpContext)_localctx).n = numexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).n.ast; 
				}
				break;
			case Identifier:
				{
				setState(39);
				((ExpContext)_localctx).v = varexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).v.ast; 
				}
				break;
			case String:
				{
				setState(42);
				((ExpContext)_localctx).s = strexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).s.ast; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(54);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ExpContext(_parentctx, _parentState);
					_localctx.l = _prevctx;
					_localctx.l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_exp);
					setState(47);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(48);
					match(T__1);
					setState(49);
					((ExpContext)_localctx).r = exp(5);
					 ((ExpContext)_localctx).ast =  new AddExp(((ExpContext)_localctx).l.ast, ((ExpContext)_localctx).r.ast); 
					}
					} 
				}
				setState(56);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public PrintExp ast;
		public ExpContext e;
		public TerminalNode Print() { return getToken(DynaLangParser.Print, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(Print);
			setState(58);
			((PrintContext)_localctx).e = exp(0);
			((PrintContext)_localctx).ast =  new PrintExp(((PrintContext)_localctx).e.ast); 
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

	public static class OpenContext extends ParserRuleContext {
		public OpenExp ast;
		public VarexpContext l;
		public ExpContext r;
		public TerminalNode Open() { return getToken(DynaLangParser.Open, 0); }
		public VarexpContext varexp() {
			return getRuleContext(VarexpContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public OpenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_open; }
	}

	public final OpenContext open() throws RecognitionException {
		OpenContext _localctx = new OpenContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_open);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			match(Open);
			setState(62);
			((OpenContext)_localctx).l = varexp();
			setState(63);
			((OpenContext)_localctx).r = exp(0);
			((OpenContext)_localctx).ast =  new OpenExp(((OpenContext)_localctx).l.ast, ((OpenContext)_localctx).r.ast);
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

	public static class VarexpContext extends ParserRuleContext {
		public VarExp ast;
		public Token v;
		public TerminalNode Identifier() { return getToken(DynaLangParser.Identifier, 0); }
		public VarexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varexp; }
	}

	public final VarexpContext varexp() throws RecognitionException {
		VarexpContext _localctx = new VarexpContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			((VarexpContext)_localctx).v = match(Identifier);
			((VarexpContext)_localctx).ast =  new VarExp((((VarexpContext)_localctx).v!=null?((VarexpContext)_localctx).v.getText():null));
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

	public static class StrexpContext extends ParserRuleContext {
		public StringExp ast;
		public Token s;
		public TerminalNode String() { return getToken(DynaLangParser.String, 0); }
		public StrexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strexp; }
	}

	public final StrexpContext strexp() throws RecognitionException {
		StrexpContext _localctx = new StrexpContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_strexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			((StrexpContext)_localctx).s = match(String);
			((StrexpContext)_localctx).ast =  new StringExp((((StrexpContext)_localctx).s!=null?((StrexpContext)_localctx).s.getText():null));
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

	public static class NumexpContext extends ParserRuleContext {
		public Exp ast;
		public Token n0;
		public Token n1;
		public List<TerminalNode> Number() { return getTokens(DynaLangParser.Number); }
		public TerminalNode Number(int i) {
			return getToken(DynaLangParser.Number, i);
		}
		public TerminalNode Dot() { return getToken(DynaLangParser.Dot, 0); }
		public NumexpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexp; }
	}

	public final NumexpContext numexp() throws RecognitionException {
		NumexpContext _localctx = new NumexpContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numexp);
		try {
			setState(78);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(75);
				match(Dot);
				setState(76);
				((NumexpContext)_localctx).n1 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Double.parseDouble((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null)+"."+(((NumexpContext)_localctx).n1!=null?((NumexpContext)_localctx).n1.getText():null))); 
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return exp_sempred((ExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean exp_sempred(ExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\rS\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2\37\n\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\4\3\4\3\4\3\4\3\4\7\4\67\n"+
		"\4\f\4\16\4:\13\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\5\tQ\n\t\3\t\2\3\6\n\2\4\6\b\n\f\16\20"+
		"\2\2Q\2\36\3\2\2\2\4 \3\2\2\2\6/\3\2\2\2\b;\3\2\2\2\n?\3\2\2\2\fD\3\2"+
		"\2\2\16G\3\2\2\2\20P\3\2\2\2\22\23\5\4\3\2\23\24\b\2\1\2\24\37\3\2\2\2"+
		"\25\26\5\6\4\2\26\27\b\2\1\2\27\37\3\2\2\2\30\31\5\b\5\2\31\32\b\2\1\2"+
		"\32\37\3\2\2\2\33\34\5\n\6\2\34\35\b\2\1\2\35\37\3\2\2\2\36\22\3\2\2\2"+
		"\36\25\3\2\2\2\36\30\3\2\2\2\36\33\3\2\2\2\37\3\3\2\2\2 !\5\f\7\2!\"\7"+
		"\3\2\2\"#\5\6\4\2#$\b\3\1\2$\5\3\2\2\2%&\b\4\1\2&\'\5\20\t\2\'(\b\4\1"+
		"\2(\60\3\2\2\2)*\5\f\7\2*+\b\4\1\2+\60\3\2\2\2,-\5\16\b\2-.\b\4\1\2.\60"+
		"\3\2\2\2/%\3\2\2\2/)\3\2\2\2/,\3\2\2\2\608\3\2\2\2\61\62\f\6\2\2\62\63"+
		"\7\4\2\2\63\64\5\6\4\7\64\65\b\4\1\2\65\67\3\2\2\2\66\61\3\2\2\2\67:\3"+
		"\2\2\28\66\3\2\2\289\3\2\2\29\7\3\2\2\2:8\3\2\2\2;<\7\5\2\2<=\5\6\4\2"+
		"=>\b\5\1\2>\t\3\2\2\2?@\7\6\2\2@A\5\f\7\2AB\5\6\4\2BC\b\6\1\2C\13\3\2"+
		"\2\2DE\7\t\2\2EF\b\7\1\2F\r\3\2\2\2GH\7\n\2\2HI\b\b\1\2I\17\3\2\2\2JK"+
		"\7\b\2\2KQ\b\t\1\2LM\7\b\2\2MN\7\7\2\2NO\7\b\2\2OQ\b\t\1\2PJ\3\2\2\2P"+
		"L\3\2\2\2Q\21\3\2\2\2\6\36/8P";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}