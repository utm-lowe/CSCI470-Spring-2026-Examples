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
		T__0=1, T__1=2, Print=3, Dot=4, Number=5, Identifier=6, String=7, Letter=8, 
		LetterOrDigit=9, WS=10;
	public static final int
		RULE_program = 0, RULE_assign = 1, RULE_exp = 2, RULE_print = 3, RULE_varexp = 4, 
		RULE_strexp = 5, RULE_numexp = 6;
	public static final String[] ruleNames = {
		"program", "assign", "exp", "print", "varexp", "strexp", "numexp"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'+'", "'print'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, "Print", "Dot", "Number", "Identifier", "String", "Letter", 
		"LetterOrDigit", "WS"
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
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
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
			setState(23);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14);
				((ProgramContext)_localctx).a = assign();
				 ((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).a.ast);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(17);
				((ProgramContext)_localctx).e = exp(0);
				 ((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).e.ast); 
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(20);
				((ProgramContext)_localctx).p = print();
				 ((ProgramContext)_localctx).ast =  new Program(((ProgramContext)_localctx).p.ast);
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
			setState(25);
			((AssignContext)_localctx).l = varexp();
			setState(26);
			match(T__0);
			setState(27);
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
			setState(40);
			switch (_input.LA(1)) {
			case Number:
				{
				setState(31);
				((ExpContext)_localctx).n = numexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).n.ast; 
				}
				break;
			case Identifier:
				{
				setState(34);
				((ExpContext)_localctx).v = varexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).v.ast; 
				}
				break;
			case String:
				{
				setState(37);
				((ExpContext)_localctx).s = strexp();
				 ((ExpContext)_localctx).ast =  ((ExpContext)_localctx).s.ast; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(49);
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
					setState(42);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(43);
					match(T__1);
					setState(44);
					((ExpContext)_localctx).r = exp(5);
					 ((ExpContext)_localctx).ast =  new AddExp(((ExpContext)_localctx).l.ast, ((ExpContext)_localctx).r.ast); 
					}
					} 
				}
				setState(51);
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
			setState(52);
			match(Print);
			setState(53);
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
		enterRule(_localctx, 8, RULE_varexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
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
		enterRule(_localctx, 10, RULE_strexp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
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
		enterRule(_localctx, 12, RULE_numexp);
		try {
			setState(68);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				((NumexpContext)_localctx).n0 = match(Number);
				 ((NumexpContext)_localctx).ast =  new NumExp(Integer.parseInt((((NumexpContext)_localctx).n0!=null?((NumexpContext)_localctx).n0.getText():null))); 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				((NumexpContext)_localctx).n0 = match(Number);
				setState(65);
				match(Dot);
				setState(66);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\fI\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2\32\n\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\4+\n\4\3\4\3\4\3\4\3\4\3\4\7\4\62\n\4\f\4\16\4\65\13\4\3"+
		"\5\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\bG\n"+
		"\b\3\b\2\3\6\t\2\4\6\b\n\f\16\2\2G\2\31\3\2\2\2\4\33\3\2\2\2\6*\3\2\2"+
		"\2\b\66\3\2\2\2\n:\3\2\2\2\f=\3\2\2\2\16F\3\2\2\2\20\21\5\4\3\2\21\22"+
		"\b\2\1\2\22\32\3\2\2\2\23\24\5\6\4\2\24\25\b\2\1\2\25\32\3\2\2\2\26\27"+
		"\5\b\5\2\27\30\b\2\1\2\30\32\3\2\2\2\31\20\3\2\2\2\31\23\3\2\2\2\31\26"+
		"\3\2\2\2\32\3\3\2\2\2\33\34\5\n\6\2\34\35\7\3\2\2\35\36\5\6\4\2\36\37"+
		"\b\3\1\2\37\5\3\2\2\2 !\b\4\1\2!\"\5\16\b\2\"#\b\4\1\2#+\3\2\2\2$%\5\n"+
		"\6\2%&\b\4\1\2&+\3\2\2\2\'(\5\f\7\2()\b\4\1\2)+\3\2\2\2* \3\2\2\2*$\3"+
		"\2\2\2*\'\3\2\2\2+\63\3\2\2\2,-\f\6\2\2-.\7\4\2\2./\5\6\4\7/\60\b\4\1"+
		"\2\60\62\3\2\2\2\61,\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2"+
		"\64\7\3\2\2\2\65\63\3\2\2\2\66\67\7\5\2\2\678\5\6\4\289\b\5\1\29\t\3\2"+
		"\2\2:;\7\b\2\2;<\b\6\1\2<\13\3\2\2\2=>\7\t\2\2>?\b\7\1\2?\r\3\2\2\2@A"+
		"\7\7\2\2AG\b\b\1\2BC\7\7\2\2CD\7\6\2\2DE\7\7\2\2EG\b\b\1\2F@\3\2\2\2F"+
		"B\3\2\2\2G\17\3\2\2\2\6\31*\63F";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}