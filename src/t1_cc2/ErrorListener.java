/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t1_cc2;

import java.util.BitSet;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

/**
 *
 * @author G10
 */
class ErrorListener implements ANTLRErrorListener {
    private static Saida out;

    public ErrorListener(Saida out) {
        this.out = out;
    }
  
    //      Este método é para os casos específicos de não fechar comentário
    // ou qualquer outro token perdido no código (como quando não fecha as aspas)
    //      Provavelmente há milhares de maneiras de fazer isso funcionar de uma
    // forma menos precária, mas é issae que tem pra hoje.
    //      #ehnois
    public static boolean erroMiguezento(String token, int linha){   
        if(!out.encontrouErro("sintatico")){
            out.println("sintatico","Linha " + linha + ": " + token + "\n");//"sintatico", "Linha "+linha+": comentario nao fechado");
            return true;
        }
        return false;
    }
    
    public static void erroIdentRedeclarado(String token, int linha){
        // https://www.dicio.com.br/redeclarar/
        if(out.encontrouErro("sintatico"))    
           out.println("semantico", "Linha "+linha+": identificador "+token+" ja declarado anteriormente");
    }
    
        public static void erroIdentIndeclarado(String token, int linha){
            if(out.encontrouErro("sintatico"))    
               out.println("semantico", "Linha "+linha+": identificador "+token+" nao declarado");
        }
        
        public static void erroSemantico(String texto){
            if(out.encontrouErro("sintatico")) //vai dar pau
                System.out.print("");
               out.println("semantico", texto + "\n");
        }
    
//    public static void erroSemantico2(String token, int i){
//        if(out.getPrimeiroErro())    
//           out.printlnSemantico("Linha "+i+": tipo "+token+" nao declarado");
//    }
//    
//    
//    public static void erroSemantico4(String token, int i){
//        if(out.getPrimeiroErro())    
//           out.printlnSemantico("Linha "+i+": incompatibilidade de parametros na chamada de "+token);
//    }
//    
//    public static void erroSemantico5(String token, int i){
//        if(out.getPrimeiroErro())    
//           out.printlnSemantico("Linha "+i+": atribuicao nao compativel para "+token);
//    }
//    
//    public static void erroSemantico6(int i){
//        if(out.getPrimeiroErro())    
//            out.printlnSemantico("Linha "+i+": comando retorne nao permitido nesse escopo");
//    }
//   
    
    @Override
    public void syntaxError(Recognizer<?, ?> rcgnzr, Object o, int linha, int i1, String string, RecognitionException re) {
        String texto = ((CommonToken)o).getText();
//        if (texto.equals("<EOF>"))
//            {
//               texto = "EOF";
//            }
        if(!out.serahQueErrou())
            out.println("sintatico", "Linha "+ linha +": erro sintatico proximo a " + texto.replace("<EOF>","EOF") + "\n");
            out.setErro();
    }

    @Override
    public void reportAmbiguity(Parser parser, DFA dfa, int i, int i1, boolean bln, BitSet bitset, ATNConfigSet atncs) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reportAttemptingFullContext(Parser parser, DFA dfa, int i, int i1, BitSet bitset, ATNConfigSet atncs) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reportContextSensitivity(Parser parser, DFA dfa, int i, int i1, int i2, ATNConfigSet atncs) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
