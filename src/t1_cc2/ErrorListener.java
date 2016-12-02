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
 * @author G10
 */
class ErrorListener implements ANTLRErrorListener {
    private static Saida out;

//-------------------------------------------------------------------------------- 
//                      C O N S T R U T O R
//--------------------------------------------------------------------------------      
    public ErrorListener(Saida out) {
        this.out = out;
    }
    
//-------------------------------------------------------------------------------- 
//                  E R R O   M I G U E Z E N T O
//--------------------------------------------------------------------------------    
//      Este método é para os casos específicos de não fechar comentário
// ou qualquer outro token perdido no código (como quando não fecha as aspas)
//      Provavelmente há milhares de maneiras de fazer isso funcionar de uma
// forma menos precária, mas é issae que tem pra hoje.

    public static boolean erroMiguezento(String token, int linha){   
        if(!out.encontrouErro("sintatico")){
            out.println("sintatico","Linha " + linha + ": " + token + "\n");//"sintatico", "Linha "+linha+": comentario nao fechado");
            return true;
        }
        return false;
    }
    
//-------------------------------------------------------------------------------- 
//                      E R R O   S E M A N T I C O
//--------------------------------------------------------------------------------     
//      Este procedimento faz um Saida.println(), passando como argumento não só
// o erro, mas explicitando que o erro foi semantico.
//
        public static void erroSemantico(String texto){
               out.println("semantico", texto + "\n");
        }

//-------------------------------------------------------------------------------- 
//      O U T R O S    P R O C E D I M E N T O S   ( O V E R R I D E )
//--------------------------------------------------------------------------------   
    @Override
    public void syntaxError(Recognizer<?, ?> rcgnzr, Object o, int linha, int i1, String string, RecognitionException re) {
        String texto = ((CommonToken)o).getText();

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
