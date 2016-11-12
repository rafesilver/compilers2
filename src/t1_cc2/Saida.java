/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t1_cc2;

/**
 *
 * Arquivo fornecido no Trabalho 2 da disciplina Construção de Compiladores 1.
 */

public class Saida {
    private static StringBuffer texto = new StringBuffer();
    
    private static boolean erroSintatico = false;
    private static boolean erroSemantico = false;
    private static boolean houveErro = false;
    
    public static void println(String erro, String txt) {
        System.out.print(txt); 
        texto.append(txt);
        if(erro == "sintatico")
            erroSintatico = true;
        else
            if(erro == "semantico")
                erroSemantico = true;
    }
    
    public static void clear() {
        texto = new StringBuffer();
    }
    
    public static String getTexto() {
        return texto.toString();
    }
    
    public static boolean encontrouErroSintatico(){
        return erroSintatico;
    }
        
    public static boolean serahQueErrou(){
        return houveErro;
    }
    
    public static void setErro(){
        houveErro = true;
    }
    
    
}
