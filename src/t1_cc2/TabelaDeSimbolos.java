/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t1_cc2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Arquivo fornecido no Trabalho 2 da disciplina Construção de Compiladores 1.
 *                                              (mas com diversas alterações!!!)
 * 
 * ATENÇÃO:
 *          Alteração para incluir a funcionalidade 'Capivara no Barranco'
 * -----------------------------------------------------------------------------
 * PORQUE ISSO FOI PRECISO?
 * 
 *      Estavamos com um problema de atribuir o
 * tipo dos símbolos quando acontecia uma atribuição múltipla, como em:
 * 
 *      ' declare var1, var2, var3 : literal '
 * 
 *      Neste caso acima, estavamos conseguindo apenas atribuir o tipo 'literal'
 * à 'var1'. Portanto, criamos esta funcionalidade.
 * -----------------------------------------------------------------------------
 * COMO FUNCIONA?
 * 
 *      A idéia dessa funcionalidade é passar um tipo temporário, que vai ser
 * alterado depois! Logo, quando um símbolo recebe o tipo '223: preencher depois',
 * a funcionalidade detecta que há algo que precisa ser tratado depois, ou seja,
 * que há uma capivara no barranco causando inconveniência! Portando, cada vez
 * que este tipo é declarado, a funcionalidade incrementa a variável
 * 'capivaraNoBarranco'.
 * 
 *      Quando um símbolo é adicionado com um tipo que não seja o 223, a
 * funcionalidade detecta que todas as capivaras já foram adicionadas! Neste
 * momento, a funcionalidade atribui este tipo que está sendo passado por último,
 * aos N símbolos anteriores, sendo N o número de capivaras no barranco!
 * 
 *      Naturalmente, a variavel 'capivaraNoBarranco' é igualada ao 0 após isso
 * tudo.
 * 
 */
public class TabelaDeSimbolos {
    private String escopo;
    private List<EntradaTabelaDeSimbolos> simbolos;
    private boolean registro = false; 
    // Veja acima sobre a variável 'capivaraNoBarranco'!
    private Integer capivaraNoBarranco = 0;

//--------------------------------------------------------------------------------    
//                              C O N S T R U T O R
//--------------------------------------------------------------------------------        
// Construtor original do código do T2 de CC1    
    public TabelaDeSimbolos(String escopo) {
        simbolos = new ArrayList<EntradaTabelaDeSimbolos>();
        this.escopo = escopo;
    }

//-------------------------------------------------------------------------------- 
//                      A D I C I O N A R   S I M B O L O
//--------------------------------------------------------------------------------     
// Função/procedimento original do código do T2 de CC1 _com alterações_
//    
//      ATELRAÇÕES: Bom, houve várias alterações nesse procedimento... 
//
//  1) Funcionalidade 'capivaraNoBarranco' (veja acima ou na documentação) para 
// cada simbolo adicionado.
//
//  2) Quando (registro == true), o código está entre 'registro' e 'fim_registro',
// ou seja, estamos adicionado os atributos de uma variável. Portanto, se 
// (registro == true), este procedimento ao invés de adicionar o simbolo na tabela
// de simbolos, adiciona ele como registro dentro do último símbolo símbolo na
// tabela.
//
//  3) Ao terminar de inserir os atribuitos de um registro, ao invés da função
// adicionar o símbolo do registro, ela apenas troca o nome do símbolo temporário
// no qual os atribuitos foram inseridos para o nome correto.
    
    public void adicionarSimbolo(String nome, String tipo) {
        //System.out.print("\n" + nome + " : " + tipo); 
        if(registro == false && tipo != "Tipo"){
            simbolos.add(new EntradaTabelaDeSimbolos(nome,tipo));
            if(tipo == "223: 'preencher depois'")
                capivaraNoBarranco++;
            else
                if(capivaraNoBarranco > 0){
                    for(int i=0; i<capivaraNoBarranco; i++){
                        simbolos.get(simbolos.size() -i -2).setTipo(tipo);
                        if(existeSimbolo(tipo))
                            simbolos.get(simbolos.size() -i -2).copyRegistro(getSimbolo(tipo));
                    }
                    if(tipo == "registro"){
                        simbolos.get(simbolos.size() -1).copyRegistro(simbolos.get(simbolos.size() -2));
                        if(capivaraNoBarranco > 1)
                            for(int i=3; i<capivaraNoBarranco+2; i++)
                                simbolos.get(simbolos.size() -i).copyRegistro(simbolos.get(simbolos.size() -2));
                    }
                    capivaraNoBarranco = 0;
                }        
        }
        else{
            if(registro == true){
                //if(simbolos.size() == 0)
                    //simbolos.add(new EntradaTabelaDeSimbolos("#temp","registro"));
                simbolos.get(simbolos.size()-1).addRegistro("."+nome,tipo);
            }
            else
                simbolos.get(simbolos.size()-1).setNome(nome);
        }

        //System.out.print("\n" + this.toString() + "\n");
    }
//--------------------------------------------------------------------------------
//                      A D I C I O N A R   S I M B O L O
//                          ( S Ó   Q U E   N Ã O)    
//--------------------------------------------------------------------------------    
//      Por causa da funcionalidade 'capivaraNoBarranco', o símbolo precisa
// ser adicionado em algumas situações mesmo se houver erro semântico do símbolo
// já ter sido declarado.
//      Portanto, a saída mais fácil foi adicionar "só que não" o símbolo,
// que é este procedimento que chama adicionarSimbolo(), porém logo depois remove
// o último símbolo adicionado. Desta forma, a funcionalidade 'capivaraNoBarranco'
// é acionada e funciona normalmente.
//      Este exemplo é do caso com erro semântico #12:
//
//      declare
//          tVinho, vinho, vinhoCaro: tVinho
//
//      Porém, já existe o símbolo tVinho na tabela (como o tipo tVinho), portanto
// é um erro semântico. Mas é necessário adicionar "só que não" esse segundo 
// tVinho para atribuir o tipo coretamente em 'vinho' e 'vinhoCaro'.
//
    public void adicionarSimboloSohQueNao(String nome, String tipo){
        adicionarSimbolo(nome, tipo);
        simbolos.remove(simbolos.size()-1);
        //System.out.print("[só que não ^]\n\n" + this.toString() + "\n");
    }

//--------------------------------------------------------------------------------  
//                      A D I C I O N A R   S I M B O L O >S<  
//                              ( n ã o   u s a d a )
//--------------------------------------------------------------------------------      
// Função/procedimento original do código do T2 de CC1
//
// OBS.: acho que não usamos esse procedimento...    
    public void adicionarSimbolos(List<String> nomes, String tipo) {
        for(String s:nomes) {
            simbolos.add(new EntradaTabelaDeSimbolos(s, tipo));
        }
    }

//--------------------------------------------------------------------------------  
//                      E X I S T E   S I M B O L O ?  
//--------------------------------------------------------------------------------      
// Função/procedimento original do código do T2 de CC1    
    public boolean existeSimbolo(String nome) {
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }

//--------------------------------------------------------------------------------  
//                          G E T   S I M B O L O    
//--------------------------------------------------------------------------------  
//      Esta função percorre a tabela e retorna o objeto EntradaTabelaDeSimbolos
// que tenha o nome igual a 'nome'.
//      Similar à função de mesmo nome da classe PilhaDeTabelas, porém no nível
// de TabelaDeSimbolos.
    public EntradaTabelaDeSimbolos getSimbolo(String nome){
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(nome)) {
                return etds;
            }
        }
        return null;    
    }

//--------------------------------------------------------------------------------  
//                              G E T   T I P O
//--------------------------------------------------------------------------------      
//      Similar a função acima (getSimbolo), porém ao invés de retornar o objeto
// EntradaTabelaDeSimbolos, retorna apenas o valor do atributo 'tipo' desse objeto
// por meio da função getTipo() do objeto.    
    public String getTipo(String nome) {
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(nome)) {
                return etds.getTipo();
            }
        }
        return "224: simbolo nao encontrado";
    }

//--------------------------------------------------------------------------------
//                            S E T   R E G I S T R O
//--------------------------------------------------------------------------------
//      Função para atribuir o valor a variável auxiliar 'registro' dessa classe
// TabelaDeSimbolos.
//      Além de fazer a atribuição, esta função também adiciona um símbolo
// "temporário" na TabelaDeSimbolos, para inserir os atributos do registro nele.
// Eventualmente, o procedimento adicionarSimbolo() irá renomear este símbolo
// temporário.
//    
    public void setRegistro(boolean value){
        if(value == true)
            if(simbolos.size() > 0){
                 if(simbolos.get(simbolos.size()-1).getTipo() != "223: 'preencher depois'")
                    simbolos.add(new EntradaTabelaDeSimbolos("#temp","registro"));}
            else
                simbolos.add(new EntradaTabelaDeSimbolos("#temp","registro"));
        registro = value;

    }
    
//--------------------------------------------------------------------------------
//                          G E T   S I M B O L O S
//--------------------------------------------------------------------------------
//      Essa função retorna o próprio objeto 'simbolos', ou seja, a lista das
// EntradaTabelaDeSimbolos.    
    public List<EntradaTabelaDeSimbolos> getSimbolos(){
        return simbolos;
    }

//--------------------------------------------------------------------------------
//                      G E T   T I P O -> R E G I S T R O
//--------------------------------------------------------------------------------
//      Similar a função getTipo(), porém esta função retorna o tipo de um atributo
// específico do símbolo em questão.
//
//  EXEMPLO:
//
//      declare
//          var1 : registro    
//                    x : inteiro
//                    y : real
//                    z : literal
//                  fim_registro  
//
//      Nesse exemplo:
//          getTipo("var1","x") retornará "inteiro" 
//          getTipo("var1","y") retornará "real"
//          getTipo("var1","z") retornará "literal"
//          getTipo("var1","w") retornará "224: simbolo nao encontrado"
    
    public String getTipoRegistro(String nome, String reg){
        if(reg == null)
            return getTipo(nome);
        else
            for(EntradaTabelaDeSimbolos etds:simbolos)
                if(etds.getNome().equals(nome))
                    for(int i = 0; i < etds.getRegistro().size(); i++)
                        if(etds.getRegistro().get(i).getNome().equals(reg))
                            return etds.getRegistro().get(i).getTipo();

        return "224: simbolo nao encontrado";
    }
 
//--------------------------------------------------------------------------------
//                             G E T   T O P O 
//--------------------------------------------------------------------------------
//      Similar a função topo() da classe TabelaDeSimbolos, esta função retorna
// o último elemento de 'simbolos', ou seja, a última EntradaTabelaDeSimbolos que
// foi adicionada na tabela.
    public EntradaTabelaDeSimbolos topo(){
        return simbolos.get(simbolos.size()-1);
    }

//--------------------------------------------------------------------------------
//                            T O   S T R I N G
//--------------------------------------------------------------------------------
// Função/procedimento original do código do T2 de CC1   
    @Override
    public String toString() {
        String ret = "Escopo: "+escopo;
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            ret += "\n   "+etds;
        }
        return ret;
    }

//-------------------------------------------------------------------------------- 
//                          C H E C K   E S C O P O
//--------------------------------------------------------------------------------     
//      Essa simples função retorna verdadeiro caso o escopo da tabela é igual a
// String passada como argumento, e falso caso contrário.    
    public boolean checkEscopo(String value){
        if(value == escopo)
            return true;
        else
            return false;
    }
}
