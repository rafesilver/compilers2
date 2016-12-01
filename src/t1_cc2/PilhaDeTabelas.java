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
    private List<EntradaTabelaDeSimbolos> remains;
    public LinkedList<EntradaTabelaDeSimbolos> argz;

// Função/procedimento original do código do T2 de CC1
    public PilhaDeTabelas() {
        pilha = new LinkedList<TabelaDeSimbolos>();
        argz = new LinkedList<EntradaTabelaDeSimbolos>();
    }

// Função/procedimento original do código do T2 de CC1    
    public void empilhar(TabelaDeSimbolos ts) {
        pilha.push(ts);
    }

// Função/procedimento original do código do T2 de CC1    
    public TabelaDeSimbolos topo() {
        return pilha.peek();
    }

// Função/procedimento original do código do T2 de CC1    
    public boolean existeSimbolo(String nome) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeSimbolo(nome)) {
                return true;
            }
        }
        return false;
    }
    
    public EntradaTabelaDeSimbolos getSimbolo(String nome){
        for (TabelaDeSimbolos ts : pilha) {
            EntradaTabelaDeSimbolos aux = ts.getSimbolo(nome);
            if(aux != null)
                return aux;
        }        
        return null;
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

// Função/procedimento original do código do T2 de CC1
    public void desempilhar() {
        remains = pilha.pop().getSimbolos();
        //Saida.println(ret.toString());
    }
        
    public void adicionarSimboloComParametro(String nome, String tipo){
        topo().adicionarSimbolo(nome, tipo);
        for(int i = 0; i < remains.size(); i++)
            topo().topo().addRegistro(("#parametro_"+i),remains.get(remains.size()-i-1).getTipo());
        //System.out.print("\n|"+topo().toString() + "\n");
    }

// Função/procedimento original do código do T2 de CC1    
    public List getTodasTabelas() {
        return pilha;
    }
    
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
    
    public void adicionarSimbolo(String nome, String tipo){
        topo().adicionarSimbolo(nome, tipo);
        setRegistroType();
    }
    
}
