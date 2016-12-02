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
 */
public class EntradaTabelaDeSimbolos {
    private String nome, tipo;
    private List<EntradaTabelaDeSimbolos> registro;
    private int capivaraNoBarranco = 0;

//-------------------------------------------------------------------------------- 
//                          C O N S T R U T O R
//--------------------------------------------------------------------------------
// Função/procedimento original do código do T2 de CC1
    public EntradaTabelaDeSimbolos(String nome, String tipo) {
        //System.out.print("\n" + nome + " - " + tipo + "\n");
        this.nome = nome;
        this.tipo = tipo;
        registro = new ArrayList<EntradaTabelaDeSimbolos>();
    }

//-------------------------------------------------------------------------------- 
//                         G E T   N O M E 
//--------------------------------------------------------------------------------  
// Função/procedimento original do código do T2 de CC1 
    public String getNome() {
        return nome;
    }

//-------------------------------------------------------------------------------- 
//                          G E T   T I P O
//--------------------------------------------------------------------------------      
// Função/procedimento original do código do T2 de CC1
    public String getTipo() {
        return tipo;
    }
    
//-------------------------------------------------------------------------------- 
//                          S E T   N O M E
//--------------------------------------------------------------------------------      
    public void setNome(String param){
        this.nome = param;
    }    
    
//-------------------------------------------------------------------------------- 
//                          S E T   T I P O
//--------------------------------------------------------------------------------      
    public void setTipo(String param){
        this.tipo = param;
    }
    
//-------------------------------------------------------------------------------- 
//                      G E T   R E G I S T R O
//--------------------------------------------------------------------------------      
//      Esta função retorna os atributos do símbolo (sub n EntradaTabelaDeSimbolos
// contidas na EntradaTabelaDeSimbolos), na forma de uma lista de
// EntradaTabelaDeSimbolos.
    public List<EntradaTabelaDeSimbolos> getRegistro(){
        return registro;
    }

//-------------------------------------------------------------------------------- 
//                          T O   S T RI N G
//--------------------------------------------------------------------------------      
// Função/procedimento original do código do T2 de CC1 _com alteração_
//
//      A alteração é meramente para também imprimir os atributos do símbolo,
// na forma ".atributo(tipo)". Alteração apenas para testes durante o desenvolvimento
// (não afeta a funcionalidade do programa). 
//
    @Override
    public String toString() {
        String ret = nome+"("+tipo+")";
        if(registro.size() > 0)
            for(int i = 0; i < registro.size(); i++)
                ret += "\n     " + registro.get(i).toString();
        return ret;
    }

//-------------------------------------------------------------------------------- 
//                      A D D   R E G I S T R O
//--------------------------------------------------------------------------------   
//      Este procedimento adiciona um símbolo como sub-símbolo (ou "atributo")
// do símbolo em questão.
//
//      OBS.: Este procedimento também utiliza o princípio da 'capivaraNobarranco'.
// (para mais detalhes, veja a explicação naclasse TabelaDeSimbolos ou na documentação)
//
    public void addRegistro(String nome, String tipo){
        registro.add(new EntradaTabelaDeSimbolos(nome, tipo));
        if(tipo == "223: 'preencher depois'")
            capivaraNoBarranco++;
        else
            if(capivaraNoBarranco > 0){
                for(int i=0; i<capivaraNoBarranco; i++){
                    registro.get(registro.size() -i -2).setTipo(tipo);
                }
                capivaraNoBarranco = 0;
            }
    }

//-------------------------------------------------------------------------------- 
//                      C O P Y   R E G I S T R O
//--------------------------------------------------------------------------------   
//      Este procedimento recebe uma outra EntradaDeSimbolos e copia todos os
// sub-símbolos (ou "atributos") do argumento para o objeto.
//      Utilizado principalmente para preencher símbolos que possuem um tipo
// "não básico".
    public void copyRegistro(EntradaTabelaDeSimbolos copied){
        for(int i = 0; i < copied.getRegistro().size(); i++){
            addRegistro(copied.getRegistro().get(i).nome,
                    copied.getRegistro().get(i).tipo);
        }
    }
}
