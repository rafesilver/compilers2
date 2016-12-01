// Generated from LAlguma.g4 by ANTLR 4.5.3
package t1_cc2;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LAlgumaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		IDENT=60, CADEIA=61, NUM_INT=62, NUM_REAL=63, COMENTARIO=64, COMENTARIO_ERRADO=65, 
		ESPACOS=66, RESTO=67;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3, 
		RULE_variavel = 4, RULE_mais_var = 5, RULE_identificador = 6, RULE_ponteiros_opcionais = 7, 
		RULE_outros_ident = 8, RULE_dimensao = 9, RULE_tipo = 10, RULE_mais_ident = 11, 
		RULE_mais_variaveis = 12, RULE_tipo_basico = 13, RULE_tipo_basico_ident = 14, 
		RULE_tipo_estendido = 15, RULE_valor_constante = 16, RULE_registro = 17, 
		RULE_declaracao_global = 18, RULE_parametros_opcional = 19, RULE_parametro = 20, 
		RULE_var_opcional = 21, RULE_mais_parametros = 22, RULE_declaracoes_locais = 23, 
		RULE_corpo = 24, RULE_comandos = 25, RULE_cmd = 26, RULE_mais_expressao = 27, 
		RULE_senao_opcional = 28, RULE_chamada_atribuicao = 29, RULE_argumentos_opcional = 30, 
		RULE_selecao = 31, RULE_mais_selecao = 32, RULE_constantes = 33, RULE_mais_constantes = 34, 
		RULE_numero_intervalo = 35, RULE_intervalo_opcional = 36, RULE_op_unario = 37, 
		RULE_exp_aritmetica = 38, RULE_op_multiplicacao = 39, RULE_op_adicao = 40, 
		RULE_termo = 41, RULE_outros_termos = 42, RULE_outros_termos2 = 43, RULE_fator = 44, 
		RULE_outros_fatores = 45, RULE_parcela = 46, RULE_parcela_unario = 47, 
		RULE_parcela_nao_unario = 48, RULE_outras_parcelas = 49, RULE_chamada_partes = 50, 
		RULE_exp_relacional = 51, RULE_op_opcional = 52, RULE_op_relacional = 53, 
		RULE_expressao = 54, RULE_op_nao = 55, RULE_termo_logico = 56, RULE_outros_termos_logicos = 57, 
		RULE_outros_fatores_logicos = 58, RULE_fator_logico = 59, RULE_parcela_logica = 60;
	public static final String[] ruleNames = {
		"programa", "declaracoes", "decl_local_global", "declaracao_local", "variavel", 
		"mais_var", "identificador", "ponteiros_opcionais", "outros_ident", "dimensao", 
		"tipo", "mais_ident", "mais_variaveis", "tipo_basico", "tipo_basico_ident", 
		"tipo_estendido", "valor_constante", "registro", "declaracao_global", 
		"parametros_opcional", "parametro", "var_opcional", "mais_parametros", 
		"declaracoes_locais", "corpo", "comandos", "cmd", "mais_expressao", "senao_opcional", 
		"chamada_atribuicao", "argumentos_opcional", "selecao", "mais_selecao", 
		"constantes", "mais_constantes", "numero_intervalo", "intervalo_opcional", 
		"op_unario", "exp_aritmetica", "op_multiplicacao", "op_adicao", "termo", 
		"outros_termos", "outros_termos2", "fator", "outros_fatores", "parcela", 
		"parcela_unario", "parcela_nao_unario", "outras_parcelas", "chamada_partes", 
		"exp_relacional", "op_opcional", "op_relacional", "expressao", "op_nao", 
		"termo_logico", "outros_termos_logicos", "outros_fatores_logicos", "fator_logico", 
		"parcela_logica"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'algoritmo'", "'fim_algoritmo'", "'declare'", "'constante'", "':'", 
		"'='", "'tipo'", "','", "'^'", "'.'", "'['", "']'", "'literal'", "'inteiro'", 
		"'real'", "'logico'", "'verdadeiro'", "'falso'", "'registro'", "'fim_registro'", 
		"'procedimento'", "'('", "')'", "'fim_procedimento'", "'funcao'", "'fim_funcao'", 
		"'var'", "'leia'", "'escreva'", "'se'", "'entao'", "'fim_se'", "'caso'", 
		"'seja'", "'fim_caso'", "'para'", "'<-'", "'ate'", "'faca'", "'fim_para'", 
		"'enquanto'", "'fim_enquanto'", "'retorne'", "'senao'", "'..'", "'-'", 
		"'*'", "'/'", "'+'", "'&'", "'%'", "'<>'", "'>='", "'<='", "'>'", "'<'", 
		"'nao'", "'ou'", "'e'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"IDENT", "CADEIA", "NUM_INT", "NUM_REAL", "COMENTARIO", "COMENTARIO_ERRADO", 
		"ESPACOS", "RESTO"
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
	public String getGrammarFileName() { return "LAlguma.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    static String grupo = "<407950 & 407895>"; 
	    PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
	    int tester = 0;
	    
	    public void erro(String txt, int line){
	        if(ErrorListener.erroMiguezento(txt, line));
	            throw new ParseCancellationException(txt);
	    }
	    
	    public String compare(String input1, String input2){
	        if(input2 == null || input2 == "")
	            return input1;
	        else
	            if(input1 == input2)
	                return input1;
	            else
	                return "225: tipo incompativel";
	    }
	    
	    public boolean atribuivel(String var, String value){                                          
	        if(var == value)
	            return true;
	        else
	            if(var == "real" && value == "inteiro")
	                return true;
	            else
	                return false;
	    }
	    

	public LAlgumaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{

			                // Escopo Global
			                TabelaDeSimbolos primeiraTabela = new TabelaDeSimbolos("global");
			                pilhaDeTabelas.empilhar(primeiraTabela);
			setState(123);
			declaracoes();
			setState(124);
			match(T__0);

			                // Escopo do Programa
			                TabelaDeSimbolos segundaTabela = new TabelaDeSimbolos("programa");
			                pilhaDeTabelas.empilhar(segundaTabela);
			setState(126);
			corpo();
			setState(127);
			match(T__1);

			                // Fim dos Escopos (Programa e Global)
			                pilhaDeTabelas.desempilhar();
			                pilhaDeTabelas.desempilhar();
			            
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

	public static class DeclaracoesContext extends ParserRuleContext {
		public Decl_local_globalContext decl_local_global() {
			return getRuleContext(Decl_local_globalContext.class,0);
		}
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitDeclaracoes(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6) | (1L << T__20) | (1L << T__24))) != 0)) {
				{
				setState(130);
				decl_local_global();
				setState(131);
				declaracoes();
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

	public static class Decl_local_globalContext extends ParserRuleContext {
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Declaracao_globalContext declaracao_global() {
			return getRuleContext(Declaracao_globalContext.class,0);
		}
		public Decl_local_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_local_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterDecl_local_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitDecl_local_global(this);
		}
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_local_global);
		try {
			setState(137);
			switch (_input.LA(1)) {
			case T__2:
			case T__3:
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				declaracao_local();
				}
				break;
			case T__20:
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				declaracao_global();
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

	public static class Declaracao_localContext extends ParserRuleContext {
		public Token IDENT;
		public Tipo_basicoContext tipo_basico;
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAlgumaParser.IDENT, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitDeclaracao_local(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_local);
		try {
			setState(155);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(T__2);
				setState(140);
				variavel();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(T__3);
				setState(142);
				((Declaracao_localContext)_localctx).IDENT = match(IDENT);
				setState(143);
				match(T__4);
				setState(144);
				((Declaracao_localContext)_localctx).tipo_basico = tipo_basico();
				setState(145);
				match(T__5);
				setState(146);
				valor_constante();

				                    // Adicionar símbolo à pilha (se ainda não estiver na tabela)
				                    if(!pilhaDeTabelas.existeSimbolo((((Declaracao_localContext)_localctx).IDENT!=null?((Declaracao_localContext)_localctx).IDENT.getText():null)))
				                        pilhaDeTabelas.topo().adicionarSimbolo((((Declaracao_localContext)_localctx).IDENT!=null?((Declaracao_localContext)_localctx).IDENT.getText():null), ((Declaracao_localContext)_localctx).tipo_basico.ret);
				                    else
				                        // Se o simbolo já está na tabela, é erro semântico
				                        ErrorListener.erroSemantico(
				                            "Linha " + ((Declaracao_localContext)_localctx).IDENT.getLine() + ": identificador "
				                            + (((Declaracao_localContext)_localctx).IDENT!=null?((Declaracao_localContext)_localctx).IDENT.getText():null) + " ja declarado anteriormente");
				                
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(T__6);
				setState(150);
				((Declaracao_localContext)_localctx).IDENT = match(IDENT);
				setState(151);
				match(T__4);
				setState(152);
				tipo();

				                    // Adicionar símbolo à pilha (se ainda não estiver na tabela)
				                    if(!pilhaDeTabelas.existeSimbolo((((Declaracao_localContext)_localctx).IDENT!=null?((Declaracao_localContext)_localctx).IDENT.getText():null)))
				                        pilhaDeTabelas.topo().adicionarSimbolo((((Declaracao_localContext)_localctx).IDENT!=null?((Declaracao_localContext)_localctx).IDENT.getText():null), "Tipo");
				                    else
				                        // Se o simbolo já está na tabela, é erro semântico
				                        ErrorListener.erroSemantico(
				                            "Linha " + ((Declaracao_localContext)_localctx).IDENT.getLine() + ": identificador "
				                            + (((Declaracao_localContext)_localctx).IDENT!=null?((Declaracao_localContext)_localctx).IDENT.getText():null) + " ja declarado anteriormente");
				                
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

	public static class VariavelContext extends ParserRuleContext {
		public Token IDENT;
		public TipoContext tipo;
		public TerminalNode IDENT() { return getToken(LAlgumaParser.IDENT, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitVariavel(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			((VariavelContext)_localctx).IDENT = match(IDENT);
			setState(158);
			dimensao();
			setState(159);
			mais_var();
			setState(160);
			match(T__4);
			setState(161);
			((VariavelContext)_localctx).tipo = tipo();

			               if(!pilhaDeTabelas.existeSimbolo((((VariavelContext)_localctx).IDENT!=null?((VariavelContext)_localctx).IDENT.getText():null))){                                           
			                    pilhaDeTabelas.topo().adicionarSimbolo((((VariavelContext)_localctx).IDENT!=null?((VariavelContext)_localctx).IDENT.getText():null), ((VariavelContext)_localctx).tipo.ret);
			               }
			               else{
			                   ErrorListener.erroSemantico(
			                            "Linha " + ((VariavelContext)_localctx).IDENT.getLine() + ": identificador "
			                            + (((VariavelContext)_localctx).IDENT!=null?((VariavelContext)_localctx).IDENT.getText():null) + " ja declarado anteriormente");
			                   pilhaDeTabelas.topo().adicionarSimboloSohQueNao((((VariavelContext)_localctx).IDENT!=null?((VariavelContext)_localctx).IDENT.getText():null), ((VariavelContext)_localctx).tipo.ret);  
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

	public static class Mais_varContext extends ParserRuleContext {
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(LAlgumaParser.IDENT, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public Mais_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterMais_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitMais_var(this);
		}
	}

	public final Mais_varContext mais_var() throws RecognitionException {
		Mais_varContext _localctx = new Mais_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mais_var);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(164);
				match(T__7);
				setState(165);
				((Mais_varContext)_localctx).IDENT = match(IDENT);
				setState(166);
				dimensao();

				                if(!pilhaDeTabelas.existeSimbolo((((Mais_varContext)_localctx).IDENT!=null?((Mais_varContext)_localctx).IDENT.getText():null)))
				                    pilhaDeTabelas.topo().adicionarSimbolo((((Mais_varContext)_localctx).IDENT!=null?((Mais_varContext)_localctx).IDENT.getText():null), "223: 'preencher depois'");
				                else
				                   ErrorListener.erroSemantico(
				                            "Linha " + ((Mais_varContext)_localctx).IDENT.getLine() + ": identificador "
				                            + (((Mais_varContext)_localctx).IDENT!=null?((Mais_varContext)_localctx).IDENT.getText():null) + " ja declarado anteriormente");
				               
				setState(168);
				mais_var();
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

	public static class IdentificadorContext extends ParserRuleContext {
		public Token IDENT;
		public Outros_identContext outros_ident;
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAlgumaParser.IDENT, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitIdentificador(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identificador);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			ponteiros_opcionais();
			setState(173);
			((IdentificadorContext)_localctx).IDENT = match(IDENT);
			setState(174);
			dimensao();
			setState(175);
			((IdentificadorContext)_localctx).outros_ident = outros_ident();

			                    if (((IdentificadorContext)_localctx).outros_ident.ret == null)
			                        if(!pilhaDeTabelas.existeSimbolo((((IdentificadorContext)_localctx).IDENT!=null?((IdentificadorContext)_localctx).IDENT.getText():null)))
			                            ErrorListener.erroSemantico(
			                            "Linha " + ((IdentificadorContext)_localctx).IDENT.getLine() + ": identificador "
			                            + (((IdentificadorContext)_localctx).IDENT!=null?((IdentificadorContext)_localctx).IDENT.getText():null) + " nao declarado");
			                    //else
			                  
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

	public static class Ponteiros_opcionaisContext extends ParserRuleContext {
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public Ponteiros_opcionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponteiros_opcionais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterPonteiros_opcionais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitPonteiros_opcionais(this);
		}
	}

	public final Ponteiros_opcionaisContext ponteiros_opcionais() throws RecognitionException {
		Ponteiros_opcionaisContext _localctx = new Ponteiros_opcionaisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ponteiros_opcionais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(178);
				match(T__8);
				setState(179);
				ponteiros_opcionais();
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

	public static class Outros_identContext extends ParserRuleContext {
		public String ret;
		public Token IDENT;
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAlgumaParser.IDENT, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public Outros_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterOutros_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitOutros_ident(this);
		}
	}

	public final Outros_identContext outros_ident() throws RecognitionException {
		Outros_identContext _localctx = new Outros_identContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_outros_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(182);
				match(T__9);
				setState(183);
				ponteiros_opcionais();
				setState(184);
				((Outros_identContext)_localctx).IDENT = match(IDENT);
				setState(185);
				dimensao();
				setState(186);
				outros_ident();
				((Outros_identContext)_localctx).ret =  "."+(((Outros_identContext)_localctx).IDENT!=null?((Outros_identContext)_localctx).IDENT.getText():null);
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

	public static class DimensaoContext extends ParserRuleContext {
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitDimensao(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dimensao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(191);
				match(T__10);
				setState(192);
				exp_aritmetica();
				setState(193);
				match(T__11);
				setState(194);
				dimensao();
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

	public static class TipoContext extends ParserRuleContext {
		public String ret;
		public Tipo_estendidoContext tipo_estendido;
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo);
		try {
			setState(204);
			switch (_input.LA(1)) {
			case T__18:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				registro();
				((TipoContext)_localctx).ret =  "registro";
				}
				break;
			case T__8:
			case T__12:
			case T__13:
			case T__14:
			case T__15:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				((TipoContext)_localctx).tipo_estendido = tipo_estendido();
				((TipoContext)_localctx).ret =  ((TipoContext)_localctx).tipo_estendido.ret;
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

	public static class Mais_identContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public Mais_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterMais_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitMais_ident(this);
		}
	}

	public final Mais_identContext mais_ident() throws RecognitionException {
		Mais_identContext _localctx = new Mais_identContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mais_ident);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(206);
				match(T__7);
				setState(207);
				identificador();
				setState(208);
				mais_ident();
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

	public static class Mais_variaveisContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
		public Mais_variaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterMais_variaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitMais_variaveis(this);
		}
	}

	public final Mais_variaveisContext mais_variaveis() throws RecognitionException {
		Mais_variaveisContext _localctx = new Mais_variaveisContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mais_variaveis);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if (_la==IDENT) {
				{
				setState(212);
				variavel();
				setState(213);
				mais_variaveis();
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

	public static class Tipo_basicoContext extends ParserRuleContext {
		public String ret;
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitTipo_basico(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo_basico);
		try {
			setState(225);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(T__12);
				((Tipo_basicoContext)_localctx).ret =  "literal";
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				match(T__13);
				((Tipo_basicoContext)_localctx).ret =  "inteiro";
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(221);
				match(T__14);
				((Tipo_basicoContext)_localctx).ret =  "real";
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(223);
				match(T__15);
				((Tipo_basicoContext)_localctx).ret =  "logico";
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

	public static class Tipo_basico_identContext extends ParserRuleContext {
		public String ret;
		public Tipo_basicoContext tipo_basico;
		public Token IDENT;
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAlgumaParser.IDENT, 0); }
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterTipo_basico_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitTipo_basico_ident(this);
		}
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo_basico_ident);
		try {
			setState(232);
			switch (_input.LA(1)) {
			case T__12:
			case T__13:
			case T__14:
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				((Tipo_basico_identContext)_localctx).tipo_basico = tipo_basico();
				((Tipo_basico_identContext)_localctx).ret =  ((Tipo_basico_identContext)_localctx).tipo_basico.ret;
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				((Tipo_basico_identContext)_localctx).IDENT = match(IDENT);

				                   if(!pilhaDeTabelas.existeSimbolo((((Tipo_basico_identContext)_localctx).IDENT!=null?((Tipo_basico_identContext)_localctx).IDENT.getText():null)))
				                        ErrorListener.erroSemantico(
				                        "Linha " + ((Tipo_basico_identContext)_localctx).IDENT.getLine() + ": tipo "
				                        + (((Tipo_basico_identContext)_localctx).IDENT!=null?((Tipo_basico_identContext)_localctx).IDENT.getText():null) + " nao declarado");
				                   ((Tipo_basico_identContext)_localctx).ret =  (((Tipo_basico_identContext)_localctx).IDENT!=null?((Tipo_basico_identContext)_localctx).IDENT.getText():null);
				                  
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

	public static class Tipo_estendidoContext extends ParserRuleContext {
		public String ret;
		public Tipo_basico_identContext tipo_basico_ident;
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitTipo_estendido(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipo_estendido);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			ponteiros_opcionais();
			setState(235);
			((Tipo_estendidoContext)_localctx).tipo_basico_ident = tipo_basico_ident();
			((Tipo_estendidoContext)_localctx).ret =  ((Tipo_estendidoContext)_localctx).tipo_basico_ident.ret;
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

	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(LAlgumaParser.CADEIA, 0); }
		public TerminalNode NUM_INT() { return getToken(LAlgumaParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LAlgumaParser.NUM_REAL, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitValor_constante(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << CADEIA) | (1L << NUM_INT) | (1L << NUM_REAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class RegistroContext extends ParserRuleContext {
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
		public RegistroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitRegistro(this);
		}
	}

	public final RegistroContext registro() throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_registro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__18);
			pilhaDeTabelas.topo().setRegistro(true);
			setState(242);
			variavel();
			setState(243);
			mais_variaveis();
			setState(244);
			match(T__19);
			pilhaDeTabelas.topo().setRegistro(false);
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

	public static class Declaracao_globalContext extends ParserRuleContext {
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(LAlgumaParser.IDENT, 0); }
		public Parametros_opcionalContext parametros_opcional() {
			return getRuleContext(Parametros_opcionalContext.class,0);
		}
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitDeclaracao_global(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaracao_global);
		try {
			setState(271);
			switch (_input.LA(1)) {
			case T__20:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(T__20);
				setState(248);
				((Declaracao_globalContext)_localctx).IDENT = match(IDENT);
				setState(249);
				match(T__21);
				setState(250);
				parametros_opcional();
				setState(251);
				match(T__22);
				setState(252);
				declaracoes_locais();
				setState(253);
				comandos();
				setState(254);
				match(T__23);

				                 if(!pilhaDeTabelas.existeSimbolo((((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null)))
				                    pilhaDeTabelas.topo().adicionarSimbolo((((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null), "Procedimento");
				                 else
				                    ErrorListener.erroIdentRedeclarado((((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null), ((Declaracao_globalContext)_localctx).IDENT.getLine());
				                    
				                 // Escopo de Procedimento
				                    TabelaDeSimbolos outraTabela = new TabelaDeSimbolos("procedimento");
				                    pilhaDeTabelas.empilhar(outraTabela);   
				                
				pilhaDeTabelas.desempilhar();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(T__24);

				                    // Escopo de Função
				                    TabelaDeSimbolos outraTabela = new TabelaDeSimbolos("função");
				                    pilhaDeTabelas.empilhar(outraTabela);
				setState(260);
				((Declaracao_globalContext)_localctx).IDENT = match(IDENT);
				setState(261);
				match(T__21);
				setState(262);
				parametros_opcional();
				setState(263);
				match(T__22);
				setState(264);
				match(T__4);
				setState(265);
				tipo_estendido();
				setState(266);
				declaracoes_locais();
				setState(267);
				comandos();
				setState(268);
				match(T__25);

				                 // Fim do Escopo
				                 pilhaDeTabelas.desempilhar();
				                 
				                 if(!pilhaDeTabelas.existeSimbolo((((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null)))
				                    pilhaDeTabelas.topo().adicionarSimbolo((((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null), "Funcao");
				                 else
				                        ErrorListener.erroSemantico(
				                            "Linha " + ((Declaracao_globalContext)_localctx).IDENT.getLine() + ": identificador "
				                            + (((Declaracao_globalContext)_localctx).IDENT!=null?((Declaracao_globalContext)_localctx).IDENT.getText():null) + " ja declarado anteriormente");
				                
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

	public static class Parametros_opcionalContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Parametros_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterParametros_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitParametros_opcional(this);
		}
	}

	public final Parametros_opcionalContext parametros_opcional() throws RecognitionException {
		Parametros_opcionalContext _localctx = new Parametros_opcionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametros_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__26) | (1L << IDENT))) != 0)) {
				{
				setState(273);
				parametro();
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

	public static class ParametroContext extends ParserRuleContext {
		public Var_opcionalContext var_opcional() {
			return getRuleContext(Var_opcionalContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public Mais_parametrosContext mais_parametros() {
			return getRuleContext(Mais_parametrosContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			var_opcional();
			setState(277);
			identificador();
			setState(278);
			mais_ident();
			setState(279);
			match(T__4);
			setState(280);
			tipo_estendido();
			setState(281);
			mais_parametros();
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

	public static class Var_opcionalContext extends ParserRuleContext {
		public Var_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterVar_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitVar_opcional(this);
		}
	}

	public final Var_opcionalContext var_opcional() throws RecognitionException {
		Var_opcionalContext _localctx = new Var_opcionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			_la = _input.LA(1);
			if (_la==T__26) {
				{
				setState(283);
				match(T__26);
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

	public static class Mais_parametrosContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Mais_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterMais_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitMais_parametros(this);
		}
	}

	public final Mais_parametrosContext mais_parametros() throws RecognitionException {
		Mais_parametrosContext _localctx = new Mais_parametrosContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mais_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(286);
				match(T__7);
				setState(287);
				parametro();
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

	public static class Declaracoes_locaisContext extends ParserRuleContext {
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public Declaracoes_locaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes_locais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterDeclaracoes_locais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitDeclaracoes_locais(this);
		}
	}

	public final Declaracoes_locaisContext declaracoes_locais() throws RecognitionException {
		Declaracoes_locaisContext _localctx = new Declaracoes_locaisContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declaracoes_locais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__6))) != 0)) {
				{
				setState(290);
				declaracao_local();
				setState(291);
				declaracoes_locais();
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

	public static class CorpoContext extends ParserRuleContext {
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitCorpo(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			declaracoes_locais();
			setState(296);
			comandos();
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

	public static class ComandosContext extends ParserRuleContext {
		public CmdContext cmd() {
			return getRuleContext(CmdContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitComandos(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__21) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__32) | (1L << T__35) | (1L << T__38) | (1L << T__40) | (1L << T__42) | (1L << IDENT))) != 0)) {
				{
				setState(298);
				cmd();
				setState(299);
				comandos();
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

	public static class CmdContext extends ParserRuleContext {
		public Token IDENT;
		public ExpressaoContext expressao;
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Senao_opcionalContext senao_opcional() {
			return getRuleContext(Senao_opcionalContext.class,0);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAlgumaParser.IDENT, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Argumentos_opcionalContext argumentos_opcional() {
			return getRuleContext(Argumentos_opcionalContext.class,0);
		}
		public Chamada_atribuicaoContext chamada_atribuicao() {
			return getRuleContext(Chamada_atribuicaoContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmd);
		try {
			setState(370);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(303);
				match(T__27);
				setState(304);
				match(T__21);
				setState(305);
				identificador();
				setState(306);
				mais_ident();
				setState(307);
				match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(T__28);
				setState(310);
				match(T__21);
				setState(311);
				expressao();
				setState(312);
				mais_expressao();
				setState(313);
				match(T__22);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				match(T__29);
				setState(316);
				expressao();
				setState(317);
				match(T__30);
				setState(318);
				comandos();
				setState(319);
				senao_opcional();
				setState(320);
				match(T__31);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(322);
				match(T__32);
				setState(323);
				exp_aritmetica();
				setState(324);
				match(T__33);
				setState(325);
				selecao();
				setState(326);
				senao_opcional();
				setState(327);
				match(T__34);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(329);
				match(T__35);
				setState(330);
				match(IDENT);
				setState(331);
				match(T__36);
				setState(332);
				exp_aritmetica();
				setState(333);
				match(T__37);
				setState(334);
				exp_aritmetica();
				setState(335);
				match(T__38);
				setState(336);
				comandos();
				setState(337);
				match(T__39);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(339);
				match(T__40);
				setState(340);
				expressao();
				setState(341);
				match(T__38);
				setState(342);
				comandos();
				setState(343);
				match(T__41);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(345);
				match(T__38);
				setState(346);
				comandos();
				setState(347);
				match(T__37);
				setState(348);
				expressao();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(350);
				match(T__8);
				setState(351);
				((CmdContext)_localctx).IDENT = match(IDENT);
				setState(352);
				outros_ident();
				setState(353);
				dimensao();
				setState(354);
				match(T__36);
				setState(355);
				((CmdContext)_localctx).expressao = expressao();
				if(!atribuivel(pilhaDeTabelas.getTipo((((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null)), ((CmdContext)_localctx).expressao.ret))
				            ErrorListener.erroSemantico("Linha " + ((CmdContext)_localctx).IDENT.getLine()
				             + ": atribuicao nao compativel para ^" + (((CmdContext)_localctx).IDENT!=null?((CmdContext)_localctx).IDENT.getText():null));
				         
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(358);
				match(IDENT);
				setState(359);
				match(T__21);
				setState(360);
				argumentos_opcional();
				setState(361);
				match(T__22);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(363);
				chamada_atribuicao();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(364);
				match(T__21);
				setState(365);
				argumentos_opcional();
				setState(366);
				match(T__22);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(368);
				match(T__42);
				setState(369);
				expressao();
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

	public static class Mais_expressaoContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Mais_expressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterMais_expressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitMais_expressao(this);
		}
	}

	public final Mais_expressaoContext mais_expressao() throws RecognitionException {
		Mais_expressaoContext _localctx = new Mais_expressaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mais_expressao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(376);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(372);
				match(T__7);
				setState(373);
				expressao();
				setState(374);
				mais_expressao();
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

	public static class Senao_opcionalContext extends ParserRuleContext {
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Senao_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterSenao_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitSenao_opcional(this);
		}
	}

	public final Senao_opcionalContext senao_opcional() throws RecognitionException {
		Senao_opcionalContext _localctx = new Senao_opcionalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_senao_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(380);
			_la = _input.LA(1);
			if (_la==T__43) {
				{
				setState(378);
				match(T__43);
				setState(379);
				comandos();
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

	public static class Chamada_atribuicaoContext extends ParserRuleContext {
		public Token IDENT;
		public Outros_identContext outros_ident;
		public ExpressaoContext expressao;
		public TerminalNode IDENT() { return getToken(LAlgumaParser.IDENT, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Chamada_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterChamada_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitChamada_atribuicao(this);
		}
	}

	public final Chamada_atribuicaoContext chamada_atribuicao() throws RecognitionException {
		Chamada_atribuicaoContext _localctx = new Chamada_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_chamada_atribuicao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			((Chamada_atribuicaoContext)_localctx).IDENT = match(IDENT);
			setState(383);
			((Chamada_atribuicaoContext)_localctx).outros_ident = outros_ident();
			setState(384);
			dimensao();
			setState(385);
			match(T__36);
			setState(386);
			((Chamada_atribuicaoContext)_localctx).expressao = expressao();

			                        if(((Chamada_atribuicaoContext)_localctx).outros_ident.ret == null){
			                            if(!atribuivel(pilhaDeTabelas.getTipo((((Chamada_atribuicaoContext)_localctx).IDENT!=null?((Chamada_atribuicaoContext)_localctx).IDENT.getText():null)), ((Chamada_atribuicaoContext)_localctx).expressao.ret))
			                                ErrorListener.erroSemantico("Linha " + ((Chamada_atribuicaoContext)_localctx).IDENT.getLine()
			                                 + ": atribuicao nao compativel para " + (((Chamada_atribuicaoContext)_localctx).IDENT!=null?((Chamada_atribuicaoContext)_localctx).IDENT.getText():null));                         
			                        }
			                        else
			                            if(!atribuivel(pilhaDeTabelas.getTipoRegistro((((Chamada_atribuicaoContext)_localctx).IDENT!=null?((Chamada_atribuicaoContext)_localctx).IDENT.getText():null), ((Chamada_atribuicaoContext)_localctx).outros_ident.ret), ((Chamada_atribuicaoContext)_localctx).expressao.ret))
			                                ErrorListener.erroSemantico("Linha " + ((Chamada_atribuicaoContext)_localctx).IDENT.getLine()
			                                 + ": atribuicao nao compativel para " + (((Chamada_atribuicaoContext)_localctx).IDENT!=null?((Chamada_atribuicaoContext)_localctx).IDENT.getText():null) + ((Chamada_atribuicaoContext)_localctx).outros_ident.ret);   
			                    
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

	public static class Argumentos_opcionalContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Argumentos_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterArgumentos_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitArgumentos_opcional(this);
		}
	}

	public final Argumentos_opcionalContext argumentos_opcional() throws RecognitionException {
		Argumentos_opcionalContext _localctx = new Argumentos_opcionalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_argumentos_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << T__16) | (1L << T__17) | (1L << T__21) | (1L << T__45) | (1L << T__49) | (1L << T__56) | (1L << IDENT) | (1L << CADEIA) | (1L << NUM_INT) | (1L << NUM_REAL))) != 0)) {
				{
				setState(389);
				expressao();
				setState(390);
				mais_expressao();
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

	public static class SelecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Mais_selecaoContext mais_selecao() {
			return getRuleContext(Mais_selecaoContext.class,0);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitSelecao(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_selecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(394);
			constantes();
			setState(395);
			match(T__4);
			setState(396);
			comandos();
			setState(397);
			mais_selecao();
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

	public static class Mais_selecaoContext extends ParserRuleContext {
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public Mais_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterMais_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitMais_selecao(this);
		}
	}

	public final Mais_selecaoContext mais_selecao() throws RecognitionException {
		Mais_selecaoContext _localctx = new Mais_selecaoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mais_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			_la = _input.LA(1);
			if (_la==T__45 || _la==NUM_INT) {
				{
				setState(399);
				selecao();
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

	public static class ConstantesContext extends ParserRuleContext {
		public Numero_intervaloContext numero_intervalo() {
			return getRuleContext(Numero_intervaloContext.class,0);
		}
		public Mais_constantesContext mais_constantes() {
			return getRuleContext(Mais_constantesContext.class,0);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitConstantes(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constantes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			numero_intervalo();
			setState(403);
			mais_constantes();
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

	public static class Mais_constantesContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public Mais_constantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterMais_constantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitMais_constantes(this);
		}
	}

	public final Mais_constantesContext mais_constantes() throws RecognitionException {
		Mais_constantesContext _localctx = new Mais_constantesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mais_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(405);
				match(T__7);
				setState(406);
				constantes();
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

	public static class Numero_intervaloContext extends ParserRuleContext {
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LAlgumaParser.NUM_INT, 0); }
		public Intervalo_opcionalContext intervalo_opcional() {
			return getRuleContext(Intervalo_opcionalContext.class,0);
		}
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitNumero_intervalo(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_numero_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			op_unario();
			setState(410);
			match(NUM_INT);
			setState(411);
			intervalo_opcional();
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

	public static class Intervalo_opcionalContext extends ParserRuleContext {
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LAlgumaParser.NUM_INT, 0); }
		public Intervalo_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalo_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterIntervalo_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitIntervalo_opcional(this);
		}
	}

	public final Intervalo_opcionalContext intervalo_opcional() throws RecognitionException {
		Intervalo_opcionalContext _localctx = new Intervalo_opcionalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_intervalo_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(417);
			_la = _input.LA(1);
			if (_la==T__44) {
				{
				setState(413);
				match(T__44);
				setState(414);
				op_unario();
				setState(415);
				match(NUM_INT);
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

	public static class Op_unarioContext extends ParserRuleContext {
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitOp_unario(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_op_unario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			_la = _input.LA(1);
			if (_la==T__45) {
				{
				setState(419);
				match(T__45);
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

	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public String ret;
		public TermoContext termo;
		public Outros_termosContext outros_termos;
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Outros_termosContext outros_termos() {
			return getRuleContext(Outros_termosContext.class,0);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitExp_aritmetica(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exp_aritmetica);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			((Exp_aritmeticaContext)_localctx).termo = termo();
			setState(423);
			((Exp_aritmeticaContext)_localctx).outros_termos = outros_termos();
			((Exp_aritmeticaContext)_localctx).ret =  compare(((Exp_aritmeticaContext)_localctx).termo.ret, ((Exp_aritmeticaContext)_localctx).outros_termos.ret);
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

	public static class Op_multiplicacaoContext extends ParserRuleContext {
		public Op_multiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_multiplicacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterOp_multiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitOp_multiplicacao(this);
		}
	}

	public final Op_multiplicacaoContext op_multiplicacao() throws RecognitionException {
		Op_multiplicacaoContext _localctx = new Op_multiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_op_multiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(426);
			_la = _input.LA(1);
			if ( !(_la==T__46 || _la==T__47) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class Op_adicaoContext extends ParserRuleContext {
		public Op_adicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_adicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterOp_adicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitOp_adicao(this);
		}
	}

	public final Op_adicaoContext op_adicao() throws RecognitionException {
		Op_adicaoContext _localctx = new Op_adicaoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_op_adicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(428);
			_la = _input.LA(1);
			if ( !(_la==T__45 || _la==T__48) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class TermoContext extends ParserRuleContext {
		public String ret;
		public FatorContext fator;
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Outros_fatoresContext outros_fatores() {
			return getRuleContext(Outros_fatoresContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_termo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(430);
			((TermoContext)_localctx).fator = fator();
			setState(431);
			outros_fatores();
			((TermoContext)_localctx).ret =  ((TermoContext)_localctx).fator.ret;
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

	public static class Outros_termosContext extends ParserRuleContext {
		public String ret;
		public TermoContext termo;
		public Outros_termos2Context outros_termos2;
		public Op_adicaoContext op_adicao() {
			return getRuleContext(Op_adicaoContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Outros_termos2Context outros_termos2() {
			return getRuleContext(Outros_termos2Context.class,0);
		}
		public Outros_termosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterOutros_termos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitOutros_termos(this);
		}
	}

	public final Outros_termosContext outros_termos() throws RecognitionException {
		Outros_termosContext _localctx = new Outros_termosContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_outros_termos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(434);
				op_adicao();
				setState(435);
				((Outros_termosContext)_localctx).termo = termo();
				setState(436);
				((Outros_termosContext)_localctx).outros_termos2 = outros_termos2();
				((Outros_termosContext)_localctx).ret =  compare(((Outros_termosContext)_localctx).termo.ret, ((Outros_termosContext)_localctx).outros_termos2.ret);
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

	public static class Outros_termos2Context extends ParserRuleContext {
		public String ret;
		public TermoContext termo;
		public Outros_termosContext outros_termos;
		public Op_adicaoContext op_adicao() {
			return getRuleContext(Op_adicaoContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Outros_termosContext outros_termos() {
			return getRuleContext(Outros_termosContext.class,0);
		}
		public Outros_termos2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterOutros_termos2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitOutros_termos2(this);
		}
	}

	public final Outros_termos2Context outros_termos2() throws RecognitionException {
		Outros_termos2Context _localctx = new Outros_termos2Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_outros_termos2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(441);
				op_adicao();
				setState(442);
				((Outros_termos2Context)_localctx).termo = termo();
				setState(443);
				((Outros_termos2Context)_localctx).outros_termos = outros_termos();
				((Outros_termos2Context)_localctx).ret =  compare(((Outros_termos2Context)_localctx).termo.ret, ((Outros_termos2Context)_localctx).outros_termos.ret);
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

	public static class FatorContext extends ParserRuleContext {
		public String ret;
		public ParcelaContext parcela;
		public ParcelaContext parcela() {
			return getRuleContext(ParcelaContext.class,0);
		}
		public Outras_parcelasContext outras_parcelas() {
			return getRuleContext(Outras_parcelasContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_fator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			((FatorContext)_localctx).parcela = parcela();
			setState(449);
			outras_parcelas();
			((FatorContext)_localctx).ret =  ((FatorContext)_localctx).parcela.ret;
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

	public static class Outros_fatoresContext extends ParserRuleContext {
		public Op_multiplicacaoContext op_multiplicacao() {
			return getRuleContext(Op_multiplicacaoContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Outros_fatoresContext outros_fatores() {
			return getRuleContext(Outros_fatoresContext.class,0);
		}
		public Outros_fatoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterOutros_fatores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitOutros_fatores(this);
		}
	}

	public final Outros_fatoresContext outros_fatores() throws RecognitionException {
		Outros_fatoresContext _localctx = new Outros_fatoresContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_outros_fatores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			_la = _input.LA(1);
			if (_la==T__46 || _la==T__47) {
				{
				setState(452);
				op_multiplicacao();
				setState(453);
				fator();
				setState(454);
				outros_fatores();
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

	public static class ParcelaContext extends ParserRuleContext {
		public String ret;
		public Parcela_unarioContext parcela_unario;
		public Parcela_nao_unarioContext parcela_nao_unario;
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitParcela(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_parcela);
		try {
			setState(465);
			switch (_input.LA(1)) {
			case T__8:
			case T__21:
			case T__45:
			case IDENT:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				op_unario();
				setState(459);
				((ParcelaContext)_localctx).parcela_unario = parcela_unario();
				((ParcelaContext)_localctx).ret =  ((ParcelaContext)_localctx).parcela_unario.ret;
				}
				break;
			case T__49:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				((ParcelaContext)_localctx).parcela_nao_unario = parcela_nao_unario();
				((ParcelaContext)_localctx).ret =  ((ParcelaContext)_localctx).parcela_nao_unario.ret;
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

	public static class Parcela_unarioContext extends ParserRuleContext {
		public String ret;
		public Token IDENT;
		public ExpressaoContext expressao;
		public TerminalNode IDENT() { return getToken(LAlgumaParser.IDENT, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Chamada_partesContext chamada_partes() {
			return getRuleContext(Chamada_partesContext.class,0);
		}
		public TerminalNode NUM_INT() { return getToken(LAlgumaParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LAlgumaParser.NUM_REAL, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitParcela_unario(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parcela_unario);
		try {
			setState(491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(467);
				match(T__8);
				setState(468);
				((Parcela_unarioContext)_localctx).IDENT = match(IDENT);
				setState(469);
				outros_ident();
				setState(470);
				dimensao();
				if(!pilhaDeTabelas.existeSimbolo((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null))){ErrorListener.erroSemantico("Linha "+((Parcela_unarioContext)_localctx).IDENT.getLine()+": identificador "+ (((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null)+" nao declarado");}
				((Parcela_unarioContext)_localctx).ret =  pilhaDeTabelas.getTipo((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(474);
				((Parcela_unarioContext)_localctx).IDENT = match(IDENT);
				setState(475);
				chamada_partes();
				if(!pilhaDeTabelas.existeSimbolo((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null))){ErrorListener.erroSemantico("Linha "+((Parcela_unarioContext)_localctx).IDENT.getLine()+": identificador "+ (((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null)+" nao declarado");}
				((Parcela_unarioContext)_localctx).ret =  pilhaDeTabelas.getTipo((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null));
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(479);
				((Parcela_unarioContext)_localctx).IDENT = match(IDENT);
				if(!pilhaDeTabelas.existeSimbolo((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null))){ErrorListener.erroSemantico("Linha "+((Parcela_unarioContext)_localctx).IDENT.getLine()+": identificador "+ (((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null)+" nao declarado");}
				((Parcela_unarioContext)_localctx).ret =  pilhaDeTabelas.getTipo((((Parcela_unarioContext)_localctx).IDENT!=null?((Parcela_unarioContext)_localctx).IDENT.getText():null));
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(482);
				match(NUM_INT);
				((Parcela_unarioContext)_localctx).ret =  "inteiro";
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(484);
				match(NUM_REAL);
				((Parcela_unarioContext)_localctx).ret =  "real";
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(486);
				match(T__21);
				setState(487);
				((Parcela_unarioContext)_localctx).expressao = expressao();
				setState(488);
				match(T__22);
				((Parcela_unarioContext)_localctx).ret =  ((Parcela_unarioContext)_localctx).expressao.ret;
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

	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public String ret;
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(LAlgumaParser.IDENT, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(LAlgumaParser.CADEIA, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitParcela_nao_unario(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_parcela_nao_unario);
		try {
			setState(501);
			switch (_input.LA(1)) {
			case T__49:
				enterOuterAlt(_localctx, 1);
				{
				setState(493);
				match(T__49);
				setState(494);
				((Parcela_nao_unarioContext)_localctx).IDENT = match(IDENT);
				setState(495);
				outros_ident();
				setState(496);
				dimensao();
				((Parcela_nao_unarioContext)_localctx).ret =  pilhaDeTabelas.getTipo((((Parcela_nao_unarioContext)_localctx).IDENT!=null?((Parcela_nao_unarioContext)_localctx).IDENT.getText():null));
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(499);
				match(CADEIA);
				((Parcela_nao_unarioContext)_localctx).ret =  "literal";
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

	public static class Outras_parcelasContext extends ParserRuleContext {
		public ParcelaContext parcela() {
			return getRuleContext(ParcelaContext.class,0);
		}
		public Outras_parcelasContext outras_parcelas() {
			return getRuleContext(Outras_parcelasContext.class,0);
		}
		public Outras_parcelasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outras_parcelas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterOutras_parcelas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitOutras_parcelas(this);
		}
	}

	public final Outras_parcelasContext outras_parcelas() throws RecognitionException {
		Outras_parcelasContext _localctx = new Outras_parcelasContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_outras_parcelas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			_la = _input.LA(1);
			if (_la==T__50) {
				{
				setState(503);
				match(T__50);
				setState(504);
				parcela();
				setState(505);
				outras_parcelas();
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

	public static class Chamada_partesContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Chamada_partesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chamada_partes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterChamada_partes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitChamada_partes(this);
		}
	}

	public final Chamada_partesContext chamada_partes() throws RecognitionException {
		Chamada_partesContext _localctx = new Chamada_partesContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_chamada_partes);
		try {
			setState(517);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(509);
				match(T__21);
				setState(510);
				expressao();
				setState(511);
				mais_expressao();
				setState(512);
				match(T__22);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				outros_ident();
				setState(515);
				dimensao();
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

	public static class Exp_relacionalContext extends ParserRuleContext {
		public String ret;
		public Exp_aritmeticaContext exp_aritmetica;
		public Op_opcionalContext op_opcional;
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public Op_opcionalContext op_opcional() {
			return getRuleContext(Op_opcionalContext.class,0);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitExp_relacional(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_exp_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			((Exp_relacionalContext)_localctx).exp_aritmetica = exp_aritmetica();
			setState(520);
			((Exp_relacionalContext)_localctx).op_opcional = op_opcional();

			                  if(((Exp_relacionalContext)_localctx).op_opcional.ret == null)
			                    ((Exp_relacionalContext)_localctx).ret =  ((Exp_relacionalContext)_localctx).exp_aritmetica.ret;
			                  else
			                    if(((Exp_relacionalContext)_localctx).exp_aritmetica.ret == ((Exp_relacionalContext)_localctx).op_opcional.ret)
			                        ((Exp_relacionalContext)_localctx).ret =  "logico";
			                    else
			                        ((Exp_relacionalContext)_localctx).ret =  "225: tipo incompativel";
			                
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

	public static class Op_opcionalContext extends ParserRuleContext {
		public String ret;
		public Exp_aritmeticaContext exp_aritmetica;
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public Op_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterOp_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitOp_opcional(this);
		}
	}

	public final Op_opcionalContext op_opcional() throws RecognitionException {
		Op_opcionalContext _localctx = new Op_opcionalContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_op_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55))) != 0)) {
				{
				setState(523);
				op_relacional();
				setState(524);
				((Op_opcionalContext)_localctx).exp_aritmetica = exp_aritmetica();
				((Op_opcionalContext)_localctx).ret =  ((Op_opcionalContext)_localctx).exp_aritmetica.ret;
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

	public static class Op_relacionalContext extends ParserRuleContext {
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitOp_relacional(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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

	public static class ExpressaoContext extends ParserRuleContext {
		public String ret;
		public Termo_logicoContext termo_logico;
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
		}
		public Outros_termos_logicosContext outros_termos_logicos() {
			return getRuleContext(Outros_termos_logicosContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(531);
			((ExpressaoContext)_localctx).termo_logico = termo_logico();
			setState(532);
			outros_termos_logicos();
			((ExpressaoContext)_localctx).ret =  ((ExpressaoContext)_localctx).termo_logico.ret;
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

	public static class Op_naoContext extends ParserRuleContext {
		public Op_naoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_nao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterOp_nao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitOp_nao(this);
		}
	}

	public final Op_naoContext op_nao() throws RecognitionException {
		Op_naoContext _localctx = new Op_naoContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_op_nao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			_la = _input.LA(1);
			if (_la==T__56) {
				{
				setState(535);
				match(T__56);
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

	public static class Termo_logicoContext extends ParserRuleContext {
		public String ret;
		public Fator_logicoContext fator_logico;
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
		}
		public Outros_fatores_logicosContext outros_fatores_logicos() {
			return getRuleContext(Outros_fatores_logicosContext.class,0);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitTermo_logico(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_termo_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			((Termo_logicoContext)_localctx).fator_logico = fator_logico();
			setState(539);
			outros_fatores_logicos();
			((Termo_logicoContext)_localctx).ret =  ((Termo_logicoContext)_localctx).fator_logico.ret;
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

	public static class Outros_termos_logicosContext extends ParserRuleContext {
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
		}
		public Outros_termos_logicosContext outros_termos_logicos() {
			return getRuleContext(Outros_termos_logicosContext.class,0);
		}
		public Outros_termos_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterOutros_termos_logicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitOutros_termos_logicos(this);
		}
	}

	public final Outros_termos_logicosContext outros_termos_logicos() throws RecognitionException {
		Outros_termos_logicosContext _localctx = new Outros_termos_logicosContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_outros_termos_logicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(546);
			_la = _input.LA(1);
			if (_la==T__57) {
				{
				setState(542);
				match(T__57);
				setState(543);
				termo_logico();
				setState(544);
				outros_termos_logicos();
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

	public static class Outros_fatores_logicosContext extends ParserRuleContext {
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
		}
		public Outros_fatores_logicosContext outros_fatores_logicos() {
			return getRuleContext(Outros_fatores_logicosContext.class,0);
		}
		public Outros_fatores_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterOutros_fatores_logicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitOutros_fatores_logicos(this);
		}
	}

	public final Outros_fatores_logicosContext outros_fatores_logicos() throws RecognitionException {
		Outros_fatores_logicosContext _localctx = new Outros_fatores_logicosContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_outros_fatores_logicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			_la = _input.LA(1);
			if (_la==T__58) {
				{
				setState(548);
				match(T__58);
				setState(549);
				fator_logico();
				setState(550);
				outros_fatores_logicos();
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

	public static class Fator_logicoContext extends ParserRuleContext {
		public String ret;
		public Parcela_logicaContext parcela_logica;
		public Op_naoContext op_nao() {
			return getRuleContext(Op_naoContext.class,0);
		}
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitFator_logico(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_fator_logico);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(554);
			op_nao();
			setState(555);
			((Fator_logicoContext)_localctx).parcela_logica = parcela_logica();
			((Fator_logicoContext)_localctx).ret =  ((Fator_logicoContext)_localctx).parcela_logica.ret;
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

	public static class Parcela_logicaContext extends ParserRuleContext {
		public String ret;
		public Exp_relacionalContext exp_relacional;
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAlgumaListener ) ((LAlgumaListener)listener).exitParcela_logica(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_parcela_logica);
		try {
			setState(565);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(558);
				match(T__16);
				((Parcela_logicaContext)_localctx).ret =  "logico";
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(560);
				match(T__17);
				((Parcela_logicaContext)_localctx).ret =  "logico";
				}
				break;
			case T__8:
			case T__21:
			case T__45:
			case T__49:
			case IDENT:
			case CADEIA:
			case NUM_INT:
			case NUM_REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(562);
				((Parcela_logicaContext)_localctx).exp_relacional = exp_relacional();
				((Parcela_logicaContext)_localctx).ret =  ((Parcela_logicaContext)_localctx).exp_relacional.ret;
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3E\u023a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\5\3\u0088\n\3\3\4\3"+
		"\4\5\4\u008c\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5\u009e\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\5\7\u00ad\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\5\t\u00b7\n\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00c0\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u00c7"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00cf\n\f\3\r\3\r\3\r\3\r\5\r\u00d5"+
		"\n\r\3\16\3\16\3\16\5\16\u00da\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00e4\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u00eb\n\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0112\n\24\3\25\5\25\u0115"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\5\27\u011f\n\27\3\30\3\30"+
		"\5\30\u0123\n\30\3\31\3\31\3\31\5\31\u0128\n\31\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\5\33\u0130\n\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\5\34\u0175\n\34\3\35\3\35\3\35\3\35\5\35\u017b\n\35\3\36\3"+
		"\36\5\36\u017f\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \5 \u018b"+
		"\n \3!\3!\3!\3!\3!\3\"\5\"\u0193\n\"\3#\3#\3#\3$\3$\5$\u019a\n$\3%\3%"+
		"\3%\3%\3&\3&\3&\3&\5&\u01a4\n&\3\'\5\'\u01a7\n\'\3(\3(\3(\3(\3)\3)\3*"+
		"\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\5,\u01ba\n,\3-\3-\3-\3-\3-\5-\u01c1\n-"+
		"\3.\3.\3.\3.\3/\3/\3/\3/\5/\u01cb\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\5\60\u01d4\n\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61"+
		"\u01ee\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u01f8\n\62\3"+
		"\63\3\63\3\63\3\63\5\63\u01fe\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\5\64\u0208\n\64\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\5\66\u0212"+
		"\n\66\3\67\3\67\38\38\38\38\39\59\u021b\n9\3:\3:\3:\3:\3;\3;\3;\3;\5;"+
		"\u0225\n;\3<\3<\3<\3<\5<\u022b\n<\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\5>"+
		"\u0238\n>\3>\2\2?\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz\2\6\4\2\23\24?A\3\2\61\62\4"+
		"\2\60\60\63\63\4\2\b\b\66:\u0235\2|\3\2\2\2\4\u0087\3\2\2\2\6\u008b\3"+
		"\2\2\2\b\u009d\3\2\2\2\n\u009f\3\2\2\2\f\u00ac\3\2\2\2\16\u00ae\3\2\2"+
		"\2\20\u00b6\3\2\2\2\22\u00bf\3\2\2\2\24\u00c6\3\2\2\2\26\u00ce\3\2\2\2"+
		"\30\u00d4\3\2\2\2\32\u00d9\3\2\2\2\34\u00e3\3\2\2\2\36\u00ea\3\2\2\2 "+
		"\u00ec\3\2\2\2\"\u00f0\3\2\2\2$\u00f2\3\2\2\2&\u0111\3\2\2\2(\u0114\3"+
		"\2\2\2*\u0116\3\2\2\2,\u011e\3\2\2\2.\u0122\3\2\2\2\60\u0127\3\2\2\2\62"+
		"\u0129\3\2\2\2\64\u012f\3\2\2\2\66\u0174\3\2\2\28\u017a\3\2\2\2:\u017e"+
		"\3\2\2\2<\u0180\3\2\2\2>\u018a\3\2\2\2@\u018c\3\2\2\2B\u0192\3\2\2\2D"+
		"\u0194\3\2\2\2F\u0199\3\2\2\2H\u019b\3\2\2\2J\u01a3\3\2\2\2L\u01a6\3\2"+
		"\2\2N\u01a8\3\2\2\2P\u01ac\3\2\2\2R\u01ae\3\2\2\2T\u01b0\3\2\2\2V\u01b9"+
		"\3\2\2\2X\u01c0\3\2\2\2Z\u01c2\3\2\2\2\\\u01ca\3\2\2\2^\u01d3\3\2\2\2"+
		"`\u01ed\3\2\2\2b\u01f7\3\2\2\2d\u01fd\3\2\2\2f\u0207\3\2\2\2h\u0209\3"+
		"\2\2\2j\u0211\3\2\2\2l\u0213\3\2\2\2n\u0215\3\2\2\2p\u021a\3\2\2\2r\u021c"+
		"\3\2\2\2t\u0224\3\2\2\2v\u022a\3\2\2\2x\u022c\3\2\2\2z\u0237\3\2\2\2|"+
		"}\b\2\1\2}~\5\4\3\2~\177\7\3\2\2\177\u0080\b\2\1\2\u0080\u0081\5\62\32"+
		"\2\u0081\u0082\7\4\2\2\u0082\u0083\b\2\1\2\u0083\3\3\2\2\2\u0084\u0085"+
		"\5\6\4\2\u0085\u0086\5\4\3\2\u0086\u0088\3\2\2\2\u0087\u0084\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\5\3\2\2\2\u0089\u008c\5\b\5\2\u008a\u008c\5&\24\2"+
		"\u008b\u0089\3\2\2\2\u008b\u008a\3\2\2\2\u008c\7\3\2\2\2\u008d\u008e\7"+
		"\5\2\2\u008e\u009e\5\n\6\2\u008f\u0090\7\6\2\2\u0090\u0091\7>\2\2\u0091"+
		"\u0092\7\7\2\2\u0092\u0093\5\34\17\2\u0093\u0094\7\b\2\2\u0094\u0095\5"+
		"\"\22\2\u0095\u0096\b\5\1\2\u0096\u009e\3\2\2\2\u0097\u0098\7\t\2\2\u0098"+
		"\u0099\7>\2\2\u0099\u009a\7\7\2\2\u009a\u009b\5\26\f\2\u009b\u009c\b\5"+
		"\1\2\u009c\u009e\3\2\2\2\u009d\u008d\3\2\2\2\u009d\u008f\3\2\2\2\u009d"+
		"\u0097\3\2\2\2\u009e\t\3\2\2\2\u009f\u00a0\7>\2\2\u00a0\u00a1\5\24\13"+
		"\2\u00a1\u00a2\5\f\7\2\u00a2\u00a3\7\7\2\2\u00a3\u00a4\5\26\f\2\u00a4"+
		"\u00a5\b\6\1\2\u00a5\13\3\2\2\2\u00a6\u00a7\7\n\2\2\u00a7\u00a8\7>\2\2"+
		"\u00a8\u00a9\5\24\13\2\u00a9\u00aa\b\7\1\2\u00aa\u00ab\5\f\7\2\u00ab\u00ad"+
		"\3\2\2\2\u00ac\u00a6\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\r\3\2\2\2\u00ae"+
		"\u00af\5\20\t\2\u00af\u00b0\7>\2\2\u00b0\u00b1\5\24\13\2\u00b1\u00b2\5"+
		"\22\n\2\u00b2\u00b3\b\b\1\2\u00b3\17\3\2\2\2\u00b4\u00b5\7\13\2\2\u00b5"+
		"\u00b7\5\20\t\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\21\3\2\2"+
		"\2\u00b8\u00b9\7\f\2\2\u00b9\u00ba\5\20\t\2\u00ba\u00bb\7>\2\2\u00bb\u00bc"+
		"\5\24\13\2\u00bc\u00bd\5\22\n\2\u00bd\u00be\b\n\1\2\u00be\u00c0\3\2\2"+
		"\2\u00bf\u00b8\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\23\3\2\2\2\u00c1\u00c2"+
		"\7\r\2\2\u00c2\u00c3\5N(\2\u00c3\u00c4\7\16\2\2\u00c4\u00c5\5\24\13\2"+
		"\u00c5\u00c7\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\25"+
		"\3\2\2\2\u00c8\u00c9\5$\23\2\u00c9\u00ca\b\f\1\2\u00ca\u00cf\3\2\2\2\u00cb"+
		"\u00cc\5 \21\2\u00cc\u00cd\b\f\1\2\u00cd\u00cf\3\2\2\2\u00ce\u00c8\3\2"+
		"\2\2\u00ce\u00cb\3\2\2\2\u00cf\27\3\2\2\2\u00d0\u00d1\7\n\2\2\u00d1\u00d2"+
		"\5\16\b\2\u00d2\u00d3\5\30\r\2\u00d3\u00d5\3\2\2\2\u00d4\u00d0\3\2\2\2"+
		"\u00d4\u00d5\3\2\2\2\u00d5\31\3\2\2\2\u00d6\u00d7\5\n\6\2\u00d7\u00d8"+
		"\5\32\16\2\u00d8\u00da\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00da\3\2\2\2"+
		"\u00da\33\3\2\2\2\u00db\u00dc\7\17\2\2\u00dc\u00e4\b\17\1\2\u00dd\u00de"+
		"\7\20\2\2\u00de\u00e4\b\17\1\2\u00df\u00e0\7\21\2\2\u00e0\u00e4\b\17\1"+
		"\2\u00e1\u00e2\7\22\2\2\u00e2\u00e4\b\17\1\2\u00e3\u00db\3\2\2\2\u00e3"+
		"\u00dd\3\2\2\2\u00e3\u00df\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\35\3\2\2"+
		"\2\u00e5\u00e6\5\34\17\2\u00e6\u00e7\b\20\1\2\u00e7\u00eb\3\2\2\2\u00e8"+
		"\u00e9\7>\2\2\u00e9\u00eb\b\20\1\2\u00ea\u00e5\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00eb\37\3\2\2\2\u00ec\u00ed\5\20\t\2\u00ed\u00ee\5\36\20\2\u00ee"+
		"\u00ef\b\21\1\2\u00ef!\3\2\2\2\u00f0\u00f1\t\2\2\2\u00f1#\3\2\2\2\u00f2"+
		"\u00f3\7\25\2\2\u00f3\u00f4\b\23\1\2\u00f4\u00f5\5\n\6\2\u00f5\u00f6\5"+
		"\32\16\2\u00f6\u00f7\7\26\2\2\u00f7\u00f8\b\23\1\2\u00f8%\3\2\2\2\u00f9"+
		"\u00fa\7\27\2\2\u00fa\u00fb\7>\2\2\u00fb\u00fc\7\30\2\2\u00fc\u00fd\5"+
		"(\25\2\u00fd\u00fe\7\31\2\2\u00fe\u00ff\5\60\31\2\u00ff\u0100\5\64\33"+
		"\2\u0100\u0101\7\32\2\2\u0101\u0102\b\24\1\2\u0102\u0103\b\24\1\2\u0103"+
		"\u0112\3\2\2\2\u0104\u0105\7\33\2\2\u0105\u0106\b\24\1\2\u0106\u0107\7"+
		">\2\2\u0107\u0108\7\30\2\2\u0108\u0109\5(\25\2\u0109\u010a\7\31\2\2\u010a"+
		"\u010b\7\7\2\2\u010b\u010c\5 \21\2\u010c\u010d\5\60\31\2\u010d\u010e\5"+
		"\64\33\2\u010e\u010f\7\34\2\2\u010f\u0110\b\24\1\2\u0110\u0112\3\2\2\2"+
		"\u0111\u00f9\3\2\2\2\u0111\u0104\3\2\2\2\u0112\'\3\2\2\2\u0113\u0115\5"+
		"*\26\2\u0114\u0113\3\2\2\2\u0114\u0115\3\2\2\2\u0115)\3\2\2\2\u0116\u0117"+
		"\5,\27\2\u0117\u0118\5\16\b\2\u0118\u0119\5\30\r\2\u0119\u011a\7\7\2\2"+
		"\u011a\u011b\5 \21\2\u011b\u011c\5.\30\2\u011c+\3\2\2\2\u011d\u011f\7"+
		"\35\2\2\u011e\u011d\3\2\2\2\u011e\u011f\3\2\2\2\u011f-\3\2\2\2\u0120\u0121"+
		"\7\n\2\2\u0121\u0123\5*\26\2\u0122\u0120\3\2\2\2\u0122\u0123\3\2\2\2\u0123"+
		"/\3\2\2\2\u0124\u0125\5\b\5\2\u0125\u0126\5\60\31\2\u0126\u0128\3\2\2"+
		"\2\u0127\u0124\3\2\2\2\u0127\u0128\3\2\2\2\u0128\61\3\2\2\2\u0129\u012a"+
		"\5\60\31\2\u012a\u012b\5\64\33\2\u012b\63\3\2\2\2\u012c\u012d\5\66\34"+
		"\2\u012d\u012e\5\64\33\2\u012e\u0130\3\2\2\2\u012f\u012c\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\65\3\2\2\2\u0131\u0132\7\36\2\2\u0132\u0133\7\30"+
		"\2\2\u0133\u0134\5\16\b\2\u0134\u0135\5\30\r\2\u0135\u0136\7\31\2\2\u0136"+
		"\u0175\3\2\2\2\u0137\u0138\7\37\2\2\u0138\u0139\7\30\2\2\u0139\u013a\5"+
		"n8\2\u013a\u013b\58\35\2\u013b\u013c\7\31\2\2\u013c\u0175\3\2\2\2\u013d"+
		"\u013e\7 \2\2\u013e\u013f\5n8\2\u013f\u0140\7!\2\2\u0140\u0141\5\64\33"+
		"\2\u0141\u0142\5:\36\2\u0142\u0143\7\"\2\2\u0143\u0175\3\2\2\2\u0144\u0145"+
		"\7#\2\2\u0145\u0146\5N(\2\u0146\u0147\7$\2\2\u0147\u0148\5@!\2\u0148\u0149"+
		"\5:\36\2\u0149\u014a\7%\2\2\u014a\u0175\3\2\2\2\u014b\u014c\7&\2\2\u014c"+
		"\u014d\7>\2\2\u014d\u014e\7\'\2\2\u014e\u014f\5N(\2\u014f\u0150\7(\2\2"+
		"\u0150\u0151\5N(\2\u0151\u0152\7)\2\2\u0152\u0153\5\64\33\2\u0153\u0154"+
		"\7*\2\2\u0154\u0175\3\2\2\2\u0155\u0156\7+\2\2\u0156\u0157\5n8\2\u0157"+
		"\u0158\7)\2\2\u0158\u0159\5\64\33\2\u0159\u015a\7,\2\2\u015a\u0175\3\2"+
		"\2\2\u015b\u015c\7)\2\2\u015c\u015d\5\64\33\2\u015d\u015e\7(\2\2\u015e"+
		"\u015f\5n8\2\u015f\u0175\3\2\2\2\u0160\u0161\7\13\2\2\u0161\u0162\7>\2"+
		"\2\u0162\u0163\5\22\n\2\u0163\u0164\5\24\13\2\u0164\u0165\7\'\2\2\u0165"+
		"\u0166\5n8\2\u0166\u0167\b\34\1\2\u0167\u0175\3\2\2\2\u0168\u0169\7>\2"+
		"\2\u0169\u016a\7\30\2\2\u016a\u016b\5> \2\u016b\u016c\7\31\2\2\u016c\u0175"+
		"\3\2\2\2\u016d\u0175\5<\37\2\u016e\u016f\7\30\2\2\u016f\u0170\5> \2\u0170"+
		"\u0171\7\31\2\2\u0171\u0175\3\2\2\2\u0172\u0173\7-\2\2\u0173\u0175\5n"+
		"8\2\u0174\u0131\3\2\2\2\u0174\u0137\3\2\2\2\u0174\u013d\3\2\2\2\u0174"+
		"\u0144\3\2\2\2\u0174\u014b\3\2\2\2\u0174\u0155\3\2\2\2\u0174\u015b\3\2"+
		"\2\2\u0174\u0160\3\2\2\2\u0174\u0168\3\2\2\2\u0174\u016d\3\2\2\2\u0174"+
		"\u016e\3\2\2\2\u0174\u0172\3\2\2\2\u0175\67\3\2\2\2\u0176\u0177\7\n\2"+
		"\2\u0177\u0178\5n8\2\u0178\u0179\58\35\2\u0179\u017b\3\2\2\2\u017a\u0176"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b9\3\2\2\2\u017c\u017d\7.\2\2\u017d\u017f"+
		"\5\64\33\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f;\3\2\2\2\u0180"+
		"\u0181\7>\2\2\u0181\u0182\5\22\n\2\u0182\u0183\5\24\13\2\u0183\u0184\7"+
		"\'\2\2\u0184\u0185\5n8\2\u0185\u0186\b\37\1\2\u0186=\3\2\2\2\u0187\u0188"+
		"\5n8\2\u0188\u0189\58\35\2\u0189\u018b\3\2\2\2\u018a\u0187\3\2\2\2\u018a"+
		"\u018b\3\2\2\2\u018b?\3\2\2\2\u018c\u018d\5D#\2\u018d\u018e\7\7\2\2\u018e"+
		"\u018f\5\64\33\2\u018f\u0190\5B\"\2\u0190A\3\2\2\2\u0191\u0193\5@!\2\u0192"+
		"\u0191\3\2\2\2\u0192\u0193\3\2\2\2\u0193C\3\2\2\2\u0194\u0195\5H%\2\u0195"+
		"\u0196\5F$\2\u0196E\3\2\2\2\u0197\u0198\7\n\2\2\u0198\u019a\5D#\2\u0199"+
		"\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019aG\3\2\2\2\u019b\u019c\5L\'\2\u019c"+
		"\u019d\7@\2\2\u019d\u019e\5J&\2\u019eI\3\2\2\2\u019f\u01a0\7/\2\2\u01a0"+
		"\u01a1\5L\'\2\u01a1\u01a2\7@\2\2\u01a2\u01a4\3\2\2\2\u01a3\u019f\3\2\2"+
		"\2\u01a3\u01a4\3\2\2\2\u01a4K\3\2\2\2\u01a5\u01a7\7\60\2\2\u01a6\u01a5"+
		"\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7M\3\2\2\2\u01a8\u01a9\5T+\2\u01a9\u01aa"+
		"\5V,\2\u01aa\u01ab\b(\1\2\u01abO\3\2\2\2\u01ac\u01ad\t\3\2\2\u01adQ\3"+
		"\2\2\2\u01ae\u01af\t\4\2\2\u01afS\3\2\2\2\u01b0\u01b1\5Z.\2\u01b1\u01b2"+
		"\5\\/\2\u01b2\u01b3\b+\1\2\u01b3U\3\2\2\2\u01b4\u01b5\5R*\2\u01b5\u01b6"+
		"\5T+\2\u01b6\u01b7\5X-\2\u01b7\u01b8\b,\1\2\u01b8\u01ba\3\2\2\2\u01b9"+
		"\u01b4\3\2\2\2\u01b9\u01ba\3\2\2\2\u01baW\3\2\2\2\u01bb\u01bc\5R*\2\u01bc"+
		"\u01bd\5T+\2\u01bd\u01be\5V,\2\u01be\u01bf\b-\1\2\u01bf\u01c1\3\2\2\2"+
		"\u01c0\u01bb\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1Y\3\2\2\2\u01c2\u01c3\5"+
		"^\60\2\u01c3\u01c4\5d\63\2\u01c4\u01c5\b.\1\2\u01c5[\3\2\2\2\u01c6\u01c7"+
		"\5P)\2\u01c7\u01c8\5Z.\2\u01c8\u01c9\5\\/\2\u01c9\u01cb\3\2\2\2\u01ca"+
		"\u01c6\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb]\3\2\2\2\u01cc\u01cd\5L\'\2\u01cd"+
		"\u01ce\5`\61\2\u01ce\u01cf\b\60\1\2\u01cf\u01d4\3\2\2\2\u01d0\u01d1\5"+
		"b\62\2\u01d1\u01d2\b\60\1\2\u01d2\u01d4\3\2\2\2\u01d3\u01cc\3\2\2\2\u01d3"+
		"\u01d0\3\2\2\2\u01d4_\3\2\2\2\u01d5\u01d6\7\13\2\2\u01d6\u01d7\7>\2\2"+
		"\u01d7\u01d8\5\22\n\2\u01d8\u01d9\5\24\13\2\u01d9\u01da\b\61\1\2\u01da"+
		"\u01db\b\61\1\2\u01db\u01ee\3\2\2\2\u01dc\u01dd\7>\2\2\u01dd\u01de\5f"+
		"\64\2\u01de\u01df\b\61\1\2\u01df\u01e0\b\61\1\2\u01e0\u01ee\3\2\2\2\u01e1"+
		"\u01e2\7>\2\2\u01e2\u01e3\b\61\1\2\u01e3\u01ee\b\61\1\2\u01e4\u01e5\7"+
		"@\2\2\u01e5\u01ee\b\61\1\2\u01e6\u01e7\7A\2\2\u01e7\u01ee\b\61\1\2\u01e8"+
		"\u01e9\7\30\2\2\u01e9\u01ea\5n8\2\u01ea\u01eb\7\31\2\2\u01eb\u01ec\b\61"+
		"\1\2\u01ec\u01ee\3\2\2\2\u01ed\u01d5\3\2\2\2\u01ed\u01dc\3\2\2\2\u01ed"+
		"\u01e1\3\2\2\2\u01ed\u01e4\3\2\2\2\u01ed\u01e6\3\2\2\2\u01ed\u01e8\3\2"+
		"\2\2\u01eea\3\2\2\2\u01ef\u01f0\7\64\2\2\u01f0\u01f1\7>\2\2\u01f1\u01f2"+
		"\5\22\n\2\u01f2\u01f3\5\24\13\2\u01f3\u01f4\b\62\1\2\u01f4\u01f8\3\2\2"+
		"\2\u01f5\u01f6\7?\2\2\u01f6\u01f8\b\62\1\2\u01f7\u01ef\3\2\2\2\u01f7\u01f5"+
		"\3\2\2\2\u01f8c\3\2\2\2\u01f9\u01fa\7\65\2\2\u01fa\u01fb\5^\60\2\u01fb"+
		"\u01fc\5d\63\2\u01fc\u01fe\3\2\2\2\u01fd\u01f9\3\2\2\2\u01fd\u01fe\3\2"+
		"\2\2\u01fee\3\2\2\2\u01ff\u0200\7\30\2\2\u0200\u0201\5n8\2\u0201\u0202"+
		"\58\35\2\u0202\u0203\7\31\2\2\u0203\u0208\3\2\2\2\u0204\u0205\5\22\n\2"+
		"\u0205\u0206\5\24\13\2\u0206\u0208\3\2\2\2\u0207\u01ff\3\2\2\2\u0207\u0204"+
		"\3\2\2\2\u0208g\3\2\2\2\u0209\u020a\5N(\2\u020a\u020b\5j\66\2\u020b\u020c"+
		"\b\65\1\2\u020ci\3\2\2\2\u020d\u020e\5l\67\2\u020e\u020f\5N(\2\u020f\u0210"+
		"\b\66\1\2\u0210\u0212\3\2\2\2\u0211\u020d\3\2\2\2\u0211\u0212\3\2\2\2"+
		"\u0212k\3\2\2\2\u0213\u0214\t\5\2\2\u0214m\3\2\2\2\u0215\u0216\5r:\2\u0216"+
		"\u0217\5t;\2\u0217\u0218\b8\1\2\u0218o\3\2\2\2\u0219\u021b\7;\2\2\u021a"+
		"\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021bq\3\2\2\2\u021c\u021d\5x=\2\u021d"+
		"\u021e\5v<\2\u021e\u021f\b:\1\2\u021fs\3\2\2\2\u0220\u0221\7<\2\2\u0221"+
		"\u0222\5r:\2\u0222\u0223\5t;\2\u0223\u0225\3\2\2\2\u0224\u0220\3\2\2\2"+
		"\u0224\u0225\3\2\2\2\u0225u\3\2\2\2\u0226\u0227\7=\2\2\u0227\u0228\5x"+
		"=\2\u0228\u0229\5v<\2\u0229\u022b\3\2\2\2\u022a\u0226\3\2\2\2\u022a\u022b"+
		"\3\2\2\2\u022bw\3\2\2\2\u022c\u022d\5p9\2\u022d\u022e\5z>\2\u022e\u022f"+
		"\b=\1\2\u022fy\3\2\2\2\u0230\u0231\7\23\2\2\u0231\u0238\b>\1\2\u0232\u0233"+
		"\7\24\2\2\u0233\u0238\b>\1\2\u0234\u0235\5h\65\2\u0235\u0236\b>\1\2\u0236"+
		"\u0238\3\2\2\2\u0237\u0230\3\2\2\2\u0237\u0232\3\2\2\2\u0237\u0234\3\2"+
		"\2\2\u0238{\3\2\2\2)\u0087\u008b\u009d\u00ac\u00b6\u00bf\u00c6\u00ce\u00d4"+
		"\u00d9\u00e3\u00ea\u0111\u0114\u011e\u0122\u0127\u012f\u0174\u017a\u017e"+
		"\u018a\u0192\u0199\u01a3\u01a6\u01b9\u01c0\u01ca\u01d3\u01ed\u01f7\u01fd"+
		"\u0207\u0211\u021a\u0224\u022a\u0237";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}