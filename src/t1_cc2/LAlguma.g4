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
                        pilhaDeTabelas.topo().adicionarSimbolo($IDENT.text, $tipo_basico.ret);
                    else
                        // Se o simbolo já está na tabela, é erro semântico
                        ErrorListener.erroSemantico(
                            "Linha " + $IDENT.getLine() + ": identificador "
                            + $IDENT.text + " ja declarado anteriormente");
                }

		| 'tipo' IDENT ':' tipo

                {
                    // Adicionar símbolo à pilha (se ainda não estiver na tabela)
                    if(!pilhaDeTabelas.existeSimbolo($IDENT.text))
                        pilhaDeTabelas.topo().adicionarSimbolo($IDENT.text, "Tipo");
                    else
                        // Se o simbolo já está na tabela, é erro semântico
                        ErrorListener.erroSemantico(
                            "Linha " + $IDENT.getLine() + ": identificador "
                            + $IDENT.text + " ja declarado anteriormente");
                }

		;

// 5.
variavel	: IDENT dimensao mais_var ':' tipo 
              {
               if(!pilhaDeTabelas.existeSimbolo($IDENT.text)){                                           
                    pilhaDeTabelas.topo().adicionarSimbolo($IDENT.text, $tipo.ret);
               }
               else{
                   ErrorListener.erroSemantico(
                            "Linha " + $IDENT.getLine() + ": identificador "
                            + $IDENT.text + " ja declarado anteriormente");
                   pilhaDeTabelas.topo().adicionarSimboloSohQueNao($IDENT.text, $tipo.ret);  
                }
              }
            ;

// 6.
mais_var	: (',' IDENT dimensao 
               
               {
                if(!pilhaDeTabelas.existeSimbolo($IDENT.text))
                    pilhaDeTabelas.topo().adicionarSimbolo($IDENT.text, "223: 'preencher depois'");
                else
                   ErrorListener.erroSemantico(
                            "Linha " + $IDENT.getLine() + ": identificador "
                            + $IDENT.text + " ja declarado anteriormente");
               }
               
               mais_var)? ;

// 7.
identificador	: ponteiros_opcionais IDENT 
                  dimensao outros_ident
                  {
                    if ($outros_ident.ret == null)
                        if(!pilhaDeTabelas.existeSimbolo($IDENT.text))
                            ErrorListener.erroSemantico(
                            "Linha " + $IDENT.getLine() + ": identificador "
                            + $IDENT.text + " nao declarado");
                    //else
                  }
                ;

// 8.
ponteiros_opcionais : ('^' ponteiros_opcionais)? ;

// 9.
outros_ident returns [String ret]
            : ('.' ponteiros_opcionais IDENT 
                  dimensao outros_ident {$ret = "."+$IDENT.text;})? ;

// 10.
dimensao : ('[' exp_aritmetica ']' dimensao)? ;

// 11.
tipo returns [String ret]
        : registro {$ret = "registro";}
        | tipo_estendido {$ret = $tipo_estendido.ret;}
        ;

// 12.
mais_ident : (',' identificador mais_ident)? ;

// 13.
mais_variaveis : (variavel mais_variaveis)? ;

// 14.
tipo_basico returns [String ret]
        : 'literal' {$ret = "literal";}
        | 'inteiro' {$ret = "inteiro";}
        | 'real' {$ret = "real";}
        | 'logico' {$ret = "logico";};

// 15.
tipo_basico_ident returns [String ret]
                  : tipo_basico {$ret = $tipo_basico.ret;}
                  | IDENT 
                  {
                   if(!pilhaDeTabelas.existeSimbolo($IDENT.text))
                        ErrorListener.erroSemantico(
                        "Linha " + $IDENT.getLine() + ": tipo "
                        + $IDENT.text + " nao declarado");
                   $ret = $IDENT.text;
                  }
                  ;

// 16.
tipo_estendido returns [String ret]	
            : ponteiros_opcionais tipo_basico_ident 
            {$ret = $tipo_basico_ident.ret;}
            ;

// 17.
valor_constante : CADEIA | NUM_INT | NUM_REAL | 'verdadeiro' | 'falso' ;

// 18.
registro	: 'registro' {pilhaDeTabelas.topo().setRegistro(true);}
                variavel mais_variaveis
                'fim_registro' {pilhaDeTabelas.topo().setRegistro(false);}
                ;

// 19.
declaracao_global :

                'procedimento'

                IDENT '(' parametros_opcional ')' declaracoes_locais comandos 'fim_procedimento'

                {
                 if(!pilhaDeTabelas.existeSimbolo($IDENT.text))
                    pilhaDeTabelas.topo().adicionarSimbolo($IDENT.text, "Procedimento");
                 else
                    ErrorListener.erroIdentRedeclarado($IDENT.text, $IDENT.getLine());
                    
                 // Escopo de Procedimento
                    TabelaDeSimbolos outraTabela = new TabelaDeSimbolos("procedimento");
                    pilhaDeTabelas.empilhar(outraTabela);   
                }
                
                
                    // Fim do Escopo
                    {pilhaDeTabelas.desempilhar();}

		| 'funcao'

                {
                    // Escopo de Função
                    TabelaDeSimbolos outraTabela = new TabelaDeSimbolos("função");
                    pilhaDeTabelas.empilhar(outraTabela);}

                IDENT '(' parametros_opcional ')' ':' tipo_estendido declaracoes_locais comandos 'fim_funcao'

                {
                 // Fim do Escopo
                 pilhaDeTabelas.desempilhar();
                 
                 if(!pilhaDeTabelas.existeSimbolo($IDENT.text))
                    pilhaDeTabelas.topo().adicionarSimbolo($IDENT.text, "Funcao");
                 else
                        ErrorListener.erroSemantico(
                            "Linha " + $IDENT.getLine() + ": identificador "
                            + $IDENT.text + " ja declarado anteriormente");
                }
                

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
comandos : (cmd comandos)?;

// 27.
cmd	: 'leia' '(' identificador mais_ident ')'
	| 'escreva' '(' expressao mais_expressao ')'
	| 'se' expressao 'entao' comandos senao_opcional 'fim_se'
	| 'caso' exp_aritmetica 'seja' selecao senao_opcional 'fim_caso'
	| 'para' IDENT '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' comandos 'fim_para'
	| 'enquanto' expressao 'faca' comandos 'fim_enquanto'
	| 'faca' comandos 'ate' expressao
	| '^' IDENT outros_ident dimensao '<-' expressao
         {if(!atribuivel(pilhaDeTabelas.getTipo($IDENT.text), $expressao.ret))
            ErrorListener.erroSemantico("Linha " + $IDENT.getLine()
             + ": atribuicao nao compativel para ^" + $IDENT.text);
         }
	| IDENT '(' argumentos_opcional ')'
        | chamada_atribuicao
        | '(' argumentos_opcional ')'
	| 'retorne' expressao
	;

// 28.
mais_expressao	: (',' expressao mais_expressao)? ;

// 29.
senao_opcional	: ('senao' comandos)? ;

// 30.
chamada_atribuicao : IDENT outros_ident dimensao '<-' expressao
                   {
                        if($outros_ident.ret == null){
                            if(!atribuivel(pilhaDeTabelas.getTipo($IDENT.text), $expressao.ret))
                                ErrorListener.erroSemantico("Linha " + $IDENT.getLine()
                                 + ": atribuicao nao compativel para " + $IDENT.text);                         
                        }
                        else
                            if(!atribuivel(pilhaDeTabelas.getTipoRegistro($IDENT.text, $outros_ident.ret), $expressao.ret))
                                ErrorListener.erroSemantico("Linha " + $IDENT.getLine()
                                 + ": atribuicao nao compativel para " + $IDENT.text + $outros_ident.ret);   
                    }
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
exp_aritmetica returns [String ret] 
              : termo outros_termos
              {$ret = compare($termo.ret, $outros_termos.ret);}
               ;

// 40.
op_multiplicacao : '*' | '/' ;

// 41.
op_adicao : '+' | '-' ;

// 42.
termo returns [String ret] 
    : fator outros_fatores {$ret = $fator.ret;};

// 43a.
outros_termos returns [String ret] :
        (op_adicao termo outros_termos2
            {$ret = compare($termo.ret, $outros_termos2.ret);}
        )?;

// 43b.
outros_termos2 returns [String ret] :
        (op_adicao termo outros_termos
            {$ret = compare($termo.ret, $outros_termos.ret);}
        )?;

// 44.
fator returns [String ret] 
        : parcela outras_parcelas {$ret = $parcela.ret;};

// 45.
outros_fatores : (op_multiplicacao fator outros_fatores)? ;

// 46.
parcela	returns [String ret]
        : op_unario parcela_unario {$ret = $parcela_unario.ret;}
	| parcela_nao_unario {$ret = $parcela_nao_unario.ret;}
	;

// 47.
parcela_unario returns [String ret]
                : '^' IDENT outros_ident dimensao
                  {if(!pilhaDeTabelas.existeSimbolo($IDENT.text)){ErrorListener.erroSemantico("Linha "+$IDENT.getLine()+": identificador "+ $IDENT.text+" nao declarado");}}
                  {$ret = pilhaDeTabelas.getTipo($IDENT.text);}
		| IDENT chamada_partes
                  {if(!pilhaDeTabelas.existeSimbolo($IDENT.text)){ErrorListener.erroSemantico("Linha "+$IDENT.getLine()+": identificador "+ $IDENT.text+" nao declarado");}}
                  {$ret = pilhaDeTabelas.getTipo($IDENT.text);}
                | IDENT
                  {if(!pilhaDeTabelas.existeSimbolo($IDENT.text)){ErrorListener.erroSemantico("Linha "+$IDENT.getLine()+": identificador "+ $IDENT.text+" nao declarado");}}
                  {$ret = pilhaDeTabelas.getTipo($IDENT.text);}
		| NUM_INT {$ret = "inteiro";}
		| NUM_REAL {$ret = "real";}
		| '(' expressao ')' {$ret = $expressao.ret;}
		;

// 48.
parcela_nao_unario returns [String ret]
                : '&' IDENT outros_ident dimensao {$ret = pilhaDeTabelas.getTipo($IDENT.text);}
		| CADEIA {$ret = "literal";}
		;

// 49.
outras_parcelas	: ('%' parcela outras_parcelas)? ;

// 50.
chamada_partes	: '(' expressao mais_expressao ')'
		| outros_ident dimensao
		;
// 51.
exp_relacional returns [String ret]
                : exp_aritmetica op_opcional 
                  {
                  if($op_opcional.ret == null)
                    $ret = $exp_aritmetica.ret;
                  else
                    if($exp_aritmetica.ret == $op_opcional.ret)
                        $ret = "logico";
                    else
                        $ret = "225: tipo incompativel";
                }
                ;

// 52. 
op_opcional returns [String ret]
                : (op_relacional exp_aritmetica {$ret = $exp_aritmetica.ret;})? ;

// 53.
op_relacional	: '='
		| '<>'
		| '>='
		| '<='
		| '>'
		| '<'
		;

// 54.
expressao returns [String ret]	
        : termo_logico outros_termos_logicos 
        {$ret = $termo_logico.ret;};

// 55.
op_nao	: ('nao')? ;

// 56.
termo_logico returns [String ret]
                : fator_logico outros_fatores_logicos 
                {$ret = $fator_logico.ret;};

// 57.
outros_termos_logicos	: ('ou' termo_logico outros_termos_logicos)? ;

// 58.
outros_fatores_logicos	: ('e' fator_logico outros_fatores_logicos)? ;

// 59.
fator_logico returns [String ret]
                : op_nao parcela_logica {$ret = $parcela_logica.ret;};

// 60.
parcela_logica returns [String ret]
                : 'verdadeiro' {$ret = "logico";}
		| 'falso' {$ret = "logico";}
		| exp_relacional {$ret = $exp_relacional.ret;}
		;

// OUTROS

IDENT	: ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')* ;

CADEIA	: '"' ~('\n' | '\r' | '"')* '"' ;

NUM_INT	: ('0'..'9')+ ;

NUM_REAL : ('0'..'9')+ '.' ('0'..'9')+ ;

COMENTARIO : '{' ~('\n' | '\r' | '}')* '}' {skip();} ;

COMENTARIO_ERRADO : '{' ~('\n' | '}')* '\n'
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

