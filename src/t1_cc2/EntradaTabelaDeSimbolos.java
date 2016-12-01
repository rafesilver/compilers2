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
 */
public class EntradaTabelaDeSimbolos {
    private String nome, tipo;
    private List<EntradaTabelaDeSimbolos> registro;
    private int capivaraNoBarranco = 0;
    
    public EntradaTabelaDeSimbolos(String nome, String tipo) {
        //System.out.print("\n" + nome + " - " + tipo + "\n");
        this.nome = nome;
        this.tipo = tipo;
        registro = new ArrayList<EntradaTabelaDeSimbolos>();
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String param){
        this.tipo = param;
    }
    
    public void setNome(String param){
        this.nome = param;
    }
    
    public List<EntradaTabelaDeSimbolos> getRegistro(){
        return registro;
    }
    
    @Override
    public String toString() {
        String ret = nome+"("+tipo+")";
        if(registro.size() > 0)
            for(int i = 0; i < registro.size(); i++)
                ret += "\n     " + registro.get(i).toString();
        return ret;
    }
    
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
    
    public void copyRegistro(EntradaTabelaDeSimbolos copied){
        for(int i = 0; i < copied.getRegistro().size(); i++){
            addRegistro(copied.getRegistro().get(i).nome,
                    copied.getRegistro().get(i).tipo);
        }
    }
}
