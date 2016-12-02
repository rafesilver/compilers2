/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t1_cc2;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * Arquivo fornecido no Trabalho 2 da disciplina Construção de Compiladores 1.
 *                                              (mas com diversas alterações!!!)
 */
public class PilhaDeTabelas {

    private LinkedList<TabelaDeSimbolos> pilha;
    private List<EntradaTabelaDeSimbolos> remains;
    public LinkedList<EntradaTabelaDeSimbolos> argz;

//-------------------------------------------------------------------------------- 
//                            C O N S T R U T O R
//--------------------------------------------------------------------------------      
// Função/procedimento original do código do T2 de CC1
    public PilhaDeTabelas() {
        pilha = new LinkedList<TabelaDeSimbolos>();
        argz = new LinkedList<EntradaTabelaDeSimbolos>();
    }

//-------------------------------------------------------------------------------- 
//                              E M P I L H A R
//--------------------------------------------------------------------------------      
// Função/procedimento original do código do T2 de CC1    
    public void empilhar(TabelaDeSimbolos ts) {
        pilha.push(ts);
    }

//-------------------------------------------------------------------------------- 
//                                 T O P O
//--------------------------------------------------------------------------------  
// Função/procedimento original do código do T2 de CC1    
    public TabelaDeSimbolos topo() {
        return pilha.peek();
    }

//-------------------------------------------------------------------------------- 
//                      E X I S T E   S I M B O L O ?
//--------------------------------------------------------------------------------      
// Função/procedimento original do código do T2 de CC1    
    public boolean existeSimbolo(String nome) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeSimbolo(nome)) {
                return true;
            }
        }
        return false;
    }

//-------------------------------------------------------------------------------- 
//                      G E T   S I M B O L O
//--------------------------------------------------------------------------------    
//      Esta função é similar a função de mesmo nome da classe TabelaDeSimbolos,
// buscando na pilha de tabelas de símbolos um símbolo com o nome igual ao argumento
// passado, caso encontrado.
//
//      OBS.: Diferente da função de TabelaDeSimbolos, esta função busca em todos os
// escopos, e não apenas no atual.
    public EntradaTabelaDeSimbolos getSimbolo(String nome){
        for (TabelaDeSimbolos ts : pilha) {
            EntradaTabelaDeSimbolos aux = ts.getSimbolo(nome);
            if(aux != null)
                return aux;
        }        
        return null;
    }

//-------------------------------------------------------------------------------- 
//                           G E T   T I P O
//--------------------------------------------------------------------------------   
//      Esta função retorna o tipo de um símbolo, buscando não só no escopo atual
// mas em todos os escopos.
    public String getTipo(String name){
        for (TabelaDeSimbolos ts : pilha){
            String ret = ts.getTipo(name);
            if(ret != "224: simbolo nao encontrado")
                return ret;
        }
        return "224: simbolo nao encontrado";
    }

//-------------------------------------------------------------------------------- 
//              G E T   T I P O   R E G I S T R O 
//--------------------------------------------------------------------------------     
//      Similar a função acima de mesmo nome da classe TabelaDeSimbolos, porém
// busca em todos os escopos e não só no escopo atual. Para mais detalhe, veja
// a função de mesmo nome na classe TabelaDeSimbolos.
    public String getTipoRegistro(String name, String reg){
        for (TabelaDeSimbolos ts : pilha){
            String ret = ts.getTipoRegistro(name, reg);
            if(ret != "224: simbolo nao encontrado")
                return ret;
        }
        return "224: simbolo nao encontrado";
    }
    
//-------------------------------------------------------------------------------- 
//                      D E S E M P I L H A R
//--------------------------------------------------------------------------------  
// Função/procedimento original do código do T2 de CC1
    public void desempilhar() {
        remains = pilha.pop().getSimbolos();
        //Saida.println(ret.toString());
    }

//-------------------------------------------------------------------------------- 
//      A D I C I O N A R   S I M B O L O   ( C O M   P A R A M E T R O )
//--------------------------------------------------------------------------------      
//      Adiciona um símbolo com os parametros que está armazenados na variável
// 'remains' (utilizada únicamente para essa função).
//      Esta função é utilizada para adicionar o símbolo de funções e procedimentos,
// pois eles podem ter argumentos relacionados a si. Isto por sua vez, é essencial
// para que haja a checagem de compatibilidade de parametros.
//
//      OBS.: Esta função adiciona os argumentos como "atributos" do símbolo,
// como se fosse um registro. Porém, o nome do "atributo" será sempre "#parametro_N",
// sendo N o número do parâmetro. Como esse nome começa com o caracter '#', nunca
// será possível acidentalmente considerar esse argumento um atributo de verdade.
//
//  (ou seja, 'função.#parametro_1' não funcionaria pois '#' não será reconhecido.)
//
    public void adicionarSimboloComParametro(String nome, String tipo){
        topo().adicionarSimbolo(nome, tipo);
        for(int i = 0; i < remains.size(); i++)
            topo().topo().addRegistro(("#parametro_"+i),remains.get(remains.size()-i-1).getTipo());
        //System.out.print("\n|"+topo().toString() + "\n");
    }

//-------------------------------------------------------------------------------- 
//                  G E T   T O D A S  T A B E L A S
//--------------------------------------------------------------------------------      
// Função/procedimento original do código do T2 de CC1    
//
// OBS.: acho que não usamos esse procedimento...      
    public List getTodasTabelas() {
        return pilha;
    }

//-------------------------------------------------------------------------------- 
//                   S E T   R E G I S T R O   T Y P E
//--------------------------------------------------------------------------------   
//      Este procedimento busca por símbolos com tipos "não básicos" (como inteiro,
// literal, logico, real, etc...) e adiciona os devidos atributos ao símbolo.
//
//      EXEMPLO: Se existe um tipo tTipo (var1 : inteiro, var2 : real), esse 
// procedimento adicionaria os atributos 'var1 : inteiro' e 'var2 : real' a todos
// os símbolos que são do tipo "tTipo".
//
    public void setRegistroType(){
        if(topo().getSimbolos().size() > 0){
            String tipo = topo().getSimbolos().get(topo().getSimbolos().size()-1).getTipo();
            if(existeSimbolo(tipo)){
                topo().getSimbolos().get(topo().getSimbolos().size()-1).copyRegistro(getSimbolo(tipo));
            
                if(topo().getSimbolos().size() > 1)
                    for(int i = 0; i < topo().getSimbolos().size()-1; i++)
                        if(topo().getSimbolos().get(i).getTipo().equals(tipo)){
                            topo().getSimbolos().get(i).copyRegistro(getSimbolo(tipo));
                        }
            }
        }
    }

//-------------------------------------------------------------------------------- 
//                  A D I C I O N A R   S I M B O L O
//--------------------------------------------------------------------------------      
//      Este procedimento combina o procedimento adicionarSimbolo() da classe
// TabelaDeSimbolos com o procedimento setRegistroType() dessa classe.
//      Este procedimento foi criado para substituir as instâncias na gramática
// que chamavam por "pilhaDeTabelas.topo().adicionarSimbolo(...)", substituindo para
// "pilhaDeTabelas.adicionarSimbolo(...)", assim adicionando a chamada de
// setRegistroType() no final das adições de símbolo.
//
//      OBS.: a funcionalidade de setRegistroType() não foi simplesmente adicionado
// no final do procedimento TabelaDeSimbolos.adicionarSimbolo() por causa do
// acesso a escopos diferentes! Dentro de TabelaDeSimbolos, só poderia haver a busca
// de símbolos no mesmo escopo, porém na classe PilhaDeTabelas, conseguimos buscar
// pelo símbolo emqualquer escopo.
    public void adicionarSimbolo(String nome, String tipo){
        topo().adicionarSimbolo(nome, tipo);
        setRegistroType();
    }
    
}
