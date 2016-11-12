// Generated from LAlguma.g4 by ANTLR 4.5.3
package t1_cc2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LAlgumaParser}.
 */
public interface LAlgumaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LAlgumaParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LAlgumaParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(LAlgumaParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(LAlgumaParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(LAlgumaParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(LAlgumaParser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(LAlgumaParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(LAlgumaParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(LAlgumaParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(LAlgumaParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void enterMais_var(LAlgumaParser.Mais_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#mais_var}.
	 * @param ctx the parse tree
	 */
	void exitMais_var(LAlgumaParser.Mais_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(LAlgumaParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(LAlgumaParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#ponteiros_opcionais}.
	 * @param ctx the parse tree
	 */
	void enterPonteiros_opcionais(LAlgumaParser.Ponteiros_opcionaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#ponteiros_opcionais}.
	 * @param ctx the parse tree
	 */
	void exitPonteiros_opcionais(LAlgumaParser.Ponteiros_opcionaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#outros_ident}.
	 * @param ctx the parse tree
	 */
	void enterOutros_ident(LAlgumaParser.Outros_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#outros_ident}.
	 * @param ctx the parse tree
	 */
	void exitOutros_ident(LAlgumaParser.Outros_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(LAlgumaParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(LAlgumaParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(LAlgumaParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(LAlgumaParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#mais_ident}.
	 * @param ctx the parse tree
	 */
	void enterMais_ident(LAlgumaParser.Mais_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#mais_ident}.
	 * @param ctx the parse tree
	 */
	void exitMais_ident(LAlgumaParser.Mais_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#mais_variaveis}.
	 * @param ctx the parse tree
	 */
	void enterMais_variaveis(LAlgumaParser.Mais_variaveisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#mais_variaveis}.
	 * @param ctx the parse tree
	 */
	void exitMais_variaveis(LAlgumaParser.Mais_variaveisContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(LAlgumaParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(LAlgumaParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(LAlgumaParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(LAlgumaParser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(LAlgumaParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(LAlgumaParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(LAlgumaParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(LAlgumaParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(LAlgumaParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(LAlgumaParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(LAlgumaParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(LAlgumaParser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#parametros_opcional}.
	 * @param ctx the parse tree
	 */
	void enterParametros_opcional(LAlgumaParser.Parametros_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#parametros_opcional}.
	 * @param ctx the parse tree
	 */
	void exitParametros_opcional(LAlgumaParser.Parametros_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(LAlgumaParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(LAlgumaParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#var_opcional}.
	 * @param ctx the parse tree
	 */
	void enterVar_opcional(LAlgumaParser.Var_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#var_opcional}.
	 * @param ctx the parse tree
	 */
	void exitVar_opcional(LAlgumaParser.Var_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#mais_parametros}.
	 * @param ctx the parse tree
	 */
	void enterMais_parametros(LAlgumaParser.Mais_parametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#mais_parametros}.
	 * @param ctx the parse tree
	 */
	void exitMais_parametros(LAlgumaParser.Mais_parametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#declaracoes_locais}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes_locais(LAlgumaParser.Declaracoes_locaisContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#declaracoes_locais}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes_locais(LAlgumaParser.Declaracoes_locaisContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(LAlgumaParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(LAlgumaParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(LAlgumaParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(LAlgumaParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(LAlgumaParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(LAlgumaParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#mais_expressao}.
	 * @param ctx the parse tree
	 */
	void enterMais_expressao(LAlgumaParser.Mais_expressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#mais_expressao}.
	 * @param ctx the parse tree
	 */
	void exitMais_expressao(LAlgumaParser.Mais_expressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#senao_opcional}.
	 * @param ctx the parse tree
	 */
	void enterSenao_opcional(LAlgumaParser.Senao_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#senao_opcional}.
	 * @param ctx the parse tree
	 */
	void exitSenao_opcional(LAlgumaParser.Senao_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#chamada_atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterChamada_atribuicao(LAlgumaParser.Chamada_atribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#chamada_atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitChamada_atribuicao(LAlgumaParser.Chamada_atribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#argumentos_opcional}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos_opcional(LAlgumaParser.Argumentos_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#argumentos_opcional}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos_opcional(LAlgumaParser.Argumentos_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(LAlgumaParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(LAlgumaParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#mais_selecao}.
	 * @param ctx the parse tree
	 */
	void enterMais_selecao(LAlgumaParser.Mais_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#mais_selecao}.
	 * @param ctx the parse tree
	 */
	void exitMais_selecao(LAlgumaParser.Mais_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(LAlgumaParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(LAlgumaParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#mais_constantes}.
	 * @param ctx the parse tree
	 */
	void enterMais_constantes(LAlgumaParser.Mais_constantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#mais_constantes}.
	 * @param ctx the parse tree
	 */
	void exitMais_constantes(LAlgumaParser.Mais_constantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(LAlgumaParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(LAlgumaParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#intervalo_opcional}.
	 * @param ctx the parse tree
	 */
	void enterIntervalo_opcional(LAlgumaParser.Intervalo_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#intervalo_opcional}.
	 * @param ctx the parse tree
	 */
	void exitIntervalo_opcional(LAlgumaParser.Intervalo_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(LAlgumaParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(LAlgumaParser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(LAlgumaParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(LAlgumaParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#op_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void enterOp_multiplicacao(LAlgumaParser.Op_multiplicacaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#op_multiplicacao}.
	 * @param ctx the parse tree
	 */
	void exitOp_multiplicacao(LAlgumaParser.Op_multiplicacaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#op_adicao}.
	 * @param ctx the parse tree
	 */
	void enterOp_adicao(LAlgumaParser.Op_adicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#op_adicao}.
	 * @param ctx the parse tree
	 */
	void exitOp_adicao(LAlgumaParser.Op_adicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(LAlgumaParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(LAlgumaParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos(LAlgumaParser.Outros_termosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#outros_termos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos(LAlgumaParser.Outros_termosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(LAlgumaParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(LAlgumaParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#outros_fatores}.
	 * @param ctx the parse tree
	 */
	void enterOutros_fatores(LAlgumaParser.Outros_fatoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#outros_fatores}.
	 * @param ctx the parse tree
	 */
	void exitOutros_fatores(LAlgumaParser.Outros_fatoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(LAlgumaParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(LAlgumaParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(LAlgumaParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(LAlgumaParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(LAlgumaParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(LAlgumaParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#outras_parcelas}.
	 * @param ctx the parse tree
	 */
	void enterOutras_parcelas(LAlgumaParser.Outras_parcelasContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#outras_parcelas}.
	 * @param ctx the parse tree
	 */
	void exitOutras_parcelas(LAlgumaParser.Outras_parcelasContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#chamada_partes}.
	 * @param ctx the parse tree
	 */
	void enterChamada_partes(LAlgumaParser.Chamada_partesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#chamada_partes}.
	 * @param ctx the parse tree
	 */
	void exitChamada_partes(LAlgumaParser.Chamada_partesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(LAlgumaParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(LAlgumaParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#op_opcional}.
	 * @param ctx the parse tree
	 */
	void enterOp_opcional(LAlgumaParser.Op_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#op_opcional}.
	 * @param ctx the parse tree
	 */
	void exitOp_opcional(LAlgumaParser.Op_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(LAlgumaParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(LAlgumaParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(LAlgumaParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(LAlgumaParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#op_nao}.
	 * @param ctx the parse tree
	 */
	void enterOp_nao(LAlgumaParser.Op_naoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#op_nao}.
	 * @param ctx the parse tree
	 */
	void exitOp_nao(LAlgumaParser.Op_naoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(LAlgumaParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(LAlgumaParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#outros_termos_logicos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_termos_logicos(LAlgumaParser.Outros_termos_logicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#outros_termos_logicos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_termos_logicos(LAlgumaParser.Outros_termos_logicosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#outros_fatores_logicos}.
	 * @param ctx the parse tree
	 */
	void enterOutros_fatores_logicos(LAlgumaParser.Outros_fatores_logicosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#outros_fatores_logicos}.
	 * @param ctx the parse tree
	 */
	void exitOutros_fatores_logicos(LAlgumaParser.Outros_fatores_logicosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(LAlgumaParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(LAlgumaParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LAlgumaParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(LAlgumaParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LAlgumaParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(LAlgumaParser.Parcela_logicaContext ctx);
}