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
 */
public class PilhaDeTabelas {

    private LinkedList<TabelaDeSimbolos> pilha;

    public PilhaDeTabelas() {
        pilha = new LinkedList<TabelaDeSimbolos>();
    }

    public void empilhar(TabelaDeSimbolos ts) {
        pilha.push(ts);
    }

    public TabelaDeSimbolos topo() {
        return pilha.peek();
    }

    public boolean existeSimbolo(String nome) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeSimbolo(nome)) {
                return true;
            }
        }
        return false;
    }
    
    public String getTipo(String name){
        for (TabelaDeSimbolos ts : pilha){
            String ret = ts.getTipo(name);
            if(ret != "224: simbolo nao encontrado")
                return ret;
        }
        return "224: simbolo nao encontrado";
    }
    
    public String getTipoRegistro(String name, String reg){
        for (TabelaDeSimbolos ts : pilha){
            String ret = ts.getTipoRegistro(name, reg);
            if(ret != "224: simbolo nao encontrado")
                return ret;
        }
        return "224: simbolo nao encontrado";
    }

    public void desempilhar() {
        TabelaDeSimbolos ret = pilha.pop();
        //Saida.println(ret.toString());
    }
    
    public void parametrizador(){
        
    }

    public List getTodasTabelas() {
        return pilha;
    }
}
