/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t1_cc2;

/**
 *
 * Arquivo fornecido no Trabalho 2 da disciplina Construção de Compiladores 1.
 *                                              (mas com algumas alterações...)
 */

public class Saida {
    private static StringBuffer texto = new StringBuffer();
    
    private static boolean erroSintatico = false;
    private static boolean erroSemantico = false;
    private static boolean houveErro = false;

//--------------------------------------------------------------------------------      
// Função/procedimento original do código do T2 de CC1 _com alterações_    
    public static void println(String erro, String txt) {
        if(erroSintatico == false || erro == "fim"){
            if(erro == "sintatico"){
                texto.setLength(0);
                erroSintatico = true;
            }
            else
                if(erro == "semantico")
                    erroSemantico = true;
            
            System.out.print(txt); 
            texto.append(txt);
        }
    }

//--------------------------------------------------------------------------------      
// Função/procedimento original do código do T2 de CC1    
    public static void clear() {
        texto = new StringBuffer();
    }

//--------------------------------------------------------------------------------      
// Função/procedimento original do código do T2 de CC1    
    public static String getTexto() {
        return texto.toString();
    }

//--------------------------------------------------------------------------------      
    public static boolean encontrouErro(String erro){
        if(erro == "sintatico")
            return erroSintatico;
        if(erro == "semantico")
            return erroSemantico;
        return false;
    }

//--------------------------------------------------------------------------------      
    public static boolean serahQueErrou(){
        return houveErro;
    }

//--------------------------------------------------------------------------------      
    public static void setErro(){
        houveErro = true;
    }
    
    
}
