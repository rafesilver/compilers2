grammar LAlguma;

// -----------------------------------------------------------------------------
//				~ Lembrete para testar o arquivo LAlguma.g4 ~
//
// Na pasta:    C:\Users\Fuler\Documents\NetBeansProjects\T1_CC2\src\t1_cc2\
// Comando:     java -jar c:\Users\Fuler\Desktop\antlr-4.5.3-complete.jar -package t1_cc2 LAlguma.g4
// -----------------------------------------------------------------------------

@members{
    static String grupo = "<407950 & 407895>"; 
    PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
    
    public void erro(String txt, int line){
        ErrorListener.erroMiguezento(line);
	throw new ParseCancellationException(txt);
    }
}

//-------------------------------------------------------
// LINGUAGEM LA (Linguagem Los Angeles)
//-------------------------------------------------------
// Numeração de acordo com o arquivo LA_022012.pdf

// 1.
programa : {
                // Escopo Global
                TabelaDeSimbolos primeiraTabela = new TabelaDeSimbolos("global");
                pilhaDeTabelas.empilhar(primeiraTabela);}

            declaracoes 'algoritmo'

            {
                // Escopo do Programa
                TabelaDeSimbolos segundaTabela = new TabelaDeSimbolos("programa");
                pilhaDeTabelas.empilhar(segundaTabela);}

            corpo 'fim_algoritmo' 

            {
                // Fim dos Escopos (Programa e Global)
                pilhaDeTabelas.desempilhar();
                pilhaDeTabelas.desempilhar();
            }
                
            ;

// 2.
declaracoes : (decl_local_global declaracoes)? ;

// 3.
decl_local_global : declaracao_local | declaracao_global ;

// 4.
declaracao_local : 'declare' variavel
		| 'constante' IDENT ':' tipo_basico '=' valor_constante

                {
                    // Adicionar símbolo à pilha (se ainda não estiver na tabela)
                    if(!pilhaDeTabelas.existeSimbolo($IDENT.text))
                        pilhaDeTabelas.topo().adicionarSimbolo($IDENT.text, "Constante");
                    else
                        // Se o simbolo já está na tabela, é erro semântico
                        ErrorListener.erroIdentRedeclarado($IDENT.text, $IDENT.getLine());
                }

		| 'tipo' IDENT ':' tipo

                {
                    // Adicionar símbolo à pilha (se ainda não estiver na tabela)
                    if(!pilhaDeTabelas.existeSimbolo($IDENT.text))
                        pilhaDeTabelas.topo().adicionarSimbolo($IDENT.text, "Tipo");
                    else
                        // Se o simbolo já está na tabela, é erro semântico
                        ErrorListener.erroIdentRedeclarado($IDENT.text, $IDENT.getLine());
                }

		;

// 5.
variavel	: IDENT dimensao mais_var ':' tipo ;

// 6.
mais_var	: (',' IDENT dimensao mais_var)? ;

// 7.
identificador	: ponteiros_opcionais IDENT dimensao outros_ident ;

// 8.
ponteiros_opcionais : ('^' ponteiros_opcionais)? ;

// 9.
outros_ident : ('.' identificador)? ;

// 10.
dimensao : ('[' exp_aritmetica ']' dimensao)? ;

// 11.
tipo	: registro | tipo_estendido ;

// 12.
mais_ident : (',' identificador mais_ident)? ;

// 13.
mais_variaveis : (variavel mais_variaveis)? ;

// 14.
tipo_basico	: 'literal' | 'inteiro' | 'real' | 'logico' ;

// 15.
tipo_basico_ident : tipo_basico | IDENT ;

// 16.
tipo_estendido	: ponteiros_opcionais tipo_basico_ident ;

// 17.
valor_constante : CADEIA | NUM_INT | NUM_REAL | 'verdadeiro' | 'falso' ;

// 18.
registro	: 'registro' variavel mais_variaveis 'fim_registro' ;

// 19.
declaracao_global :

                'procedimento'

                {
                    // Escopo de Procedimento
                    TabelaDeSimbolos outraTabela = new TabelaDeSimbolos("procedimento");
                    pilhaDeTabelas.empilhar(outraTabela);}

                IDENT '(' parametros_opcional ')' declaracoes_locais comandos 'fim_procedimento'

                {
                    // Fim do Escopo
                    pilhaDeTabelas.desempilhar();}

		| 'funcao'

                {
                    // Escopo de Função
                    TabelaDeSimbolos outraTabela = new TabelaDeSimbolos("função");
                    pilhaDeTabelas.empilhar(outraTabela);}

                IDENT '(' parametros_opcional ')' ':' tipo_estendido declaracoes_locais comandos 'fim_funcao'

                {
                    // Fim do Escopo
                    pilhaDeTabelas.desempilhar();}

                ;

// 20.
parametros_opcional : (parametro)? ;

// 21.
parametro : var_opcional identificador mais_ident ':' tipo_estendido mais_parametros ;

// 22.
var_opcional : ('var')? ;

// 23.
mais_parametros : (',' parametro)? ;

// 24.
declaracoes_locais : (declaracao_local declaracoes_locais)? ;

// 25.
corpo : declaracoes_locais comandos ;

// 26.
comandos : (cmd comandos)? ;

// 27.
cmd	: 'leia' '(' identificador mais_ident ')'
	| 'escreva' '(' expressao mais_expressao ')'
	| 'se' expressao 'entao' comandos senao_opcional 'fim_se'
	| 'caso' exp_aritmetica 'seja' selecao senao_opcional 'fim_caso'
	| 'para' IDENT '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' comandos 'fim_para'
	| 'enquanto' expressao 'faca' comandos 'fim_enquanto'
	| 'faca' comandos 'ate' expressao
	| '^' IDENT outros_ident dimensao '<-' expressao
	| IDENT chamada_atribuicao
	| 'retorne' expressao
	;

// 28.
mais_expressao	: (',' expressao mais_expressao)? ;

// 29.
senao_opcional	: ('senao' comandos)? ;

// 30.
chamada_atribuicao : '(' argumentos_opcional ')'
				| outros_ident dimensao '<-' expressao
				;

// 31.
argumentos_opcional : (expressao mais_expressao)? ;

// 32.
selecao	: constantes ':' comandos mais_selecao ;

// 33.
mais_selecao	: (selecao)? ;

// 34.
constantes	: numero_intervalo mais_constantes ;

// 35.
mais_constantes	: (',' constantes)? ;

// 36.
numero_intervalo : op_unario NUM_INT intervalo_opcional ;

// 37.
intervalo_opcional : ('..' op_unario NUM_INT)? ;

// 38.
op_unario : ('-')? ;

// 39.
exp_aritmetica : termo outros_termos ;

// 40.
op_multiplicacao : '*' | '/' ;

// 41.
op_adicao : '+' | '-' ;

// 42.
termo : fator outros_fatores ;

// 43.
outros_termos : (op_adicao termo outros_termos)? ;

// 44.
fator : parcela outras_parcelas ;

// 45.
outros_fatores : (op_multiplicacao fator outros_fatores)? ;

// 46.
parcela	: op_unario parcela_unario
	| parcela_nao_unario
	;

// 47.
parcela_unario	: '^' IDENT outros_ident dimensao
		| IDENT chamada_partes
                | IDENT
		| NUM_INT
		| NUM_REAL
		| '(' expressao ')'
		;

// 48.
parcela_nao_unario : '&' IDENT outros_ident dimensao
			| CADEIA
			;

// 49.
outras_parcelas	: ('%' parcela outras_parcelas)? ;

// 50.
chamada_partes	: '(' expressao mais_expressao ')'
		| outros_ident dimensao
		;
// 51.
exp_relacional	: exp_aritmetica op_opcional ;

// 52. 
op_opcional	: (op_relacional exp_aritmetica)? ;

// 53.
op_relacional	: '='
				| '<>'
				| '>='
				| '<='
				| '>'
				| '<'
				;

// 54.
expressao	: termo_logico outros_termos_logicos ;

// 55.
op_nao	: ('nao')? ;

// 56.
termo_logico	: fator_logico outros_fatores_logicos ;

// 57.
outros_termos_logicos	: ('ou' termo_logico outros_termos_logicos)? ;

// 58.
outros_fatores_logicos	: ('e' fator_logico outros_fatores_logicos)? ;

// 59.
fator_logico	: op_nao parcela_logica ;

// 60.
parcela_logica	: 'verdadeiro'
		| 'falso'
		| exp_relacional
		;

// OUTROS

IDENT	: ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')* ;

CADEIA	: '"' ~('\n' | '\r' | '"')* '"' ;

NUM_INT	: ('0'..'9')+ ;

NUM_REAL : ('0'..'9')+ '.' ('0'..'9')+ ;

COMENTARIO : '{' ~('\n' | '\r' | '}')* '}' {skip();} ;

COMENTARIO_ERRADO : '{'
                   //{stop("Linha "+getLine()+": comentario nao fechado");}
                    {
                     erro("comentario nao fechado", getLine());
                    }
                  ;

// Espacos, tabs, returns e novas linhas ignorados
ESPACOS  :   ( ' ' | '\t' | '\r' | '\n' ){skip();}   ;

RESTO : .
        {
        erro(getText() + " - simbolo nao identificado", getLine());
        }
      ;

