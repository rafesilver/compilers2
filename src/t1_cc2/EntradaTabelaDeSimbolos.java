/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t1_cc2;

/**
 *
 * Arquivo fornecido no Trabalho 2 da disciplina Construção de Compiladores 1.
 */
public class EntradaTabelaDeSimbolos {
    private String nome, tipo;
    
    public EntradaTabelaDeSimbolos(String nome, String tipo) {
        //System.out.print("\n" + nome + " - " + tipo + "\n");
        this.nome = nome;
        this.tipo = tipo;
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
    
    @Override
    public String toString() {
        return nome+"("+tipo+")";
    }
}
