/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * TO RUN: java -jar "C:\Users\Fuler\Documents\NetBeansProjects\T1_CC2\dist\T1_CC2.jar" "semantico (5).txt" "output.txt"
 * ( 'cd Desktop/TestFolder' before running)
 *
 */
package t1_cc2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author Grupo 10 (best group)
 */

public class Main {
    
    public static void main(String[] args) throws IOException {
        Saida saida = new Saida();
        ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));
        LAlgumaLexer lexer = new LAlgumaLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LAlgumaParser parser = new LAlgumaParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(new ErrorListener(saida));
        System.out.print("\n");
        try {
            //GeradorDeCodigo gdc = new GeradorDeCodigo(o);
            LAlgumaParser.ProgramaContext raiz = parser.programa();
            //ParseTreeWalker ptw = new ParseTreeWalker();
            //ptw.walk(gdc, raiz);
        }
        catch (ParseCancellationException pce) {
            if (pce.getMessage()!= null) {
                saida.println("parser", pce.getMessage());
               
        }    
        }
        PrintWriter pw = new PrintWriter(args[1]);
        if(saida.encontrouErro("sintatico")){
            saida.println("fim", "Fim da compilacao\n");
            pw.print(saida.getTexto());
        }
        else
            if(saida.encontrouErro("semantico")){
                saida.println("fim", "Fim da compilacao\n");
                pw.print(saida.getTexto());
//        }else{
//            pw.print(saida.getTextoCodigo());
        }
        
        pw.flush();
        pw.close();
        
        parser.removeErrorListeners();
        //      Nota: no arquivo de saída, esta parte sai como "Fim da compilacao"
        // para se adequar com a saída dos arquivos de teste.
        System.out.print("\n--- O código chegou ao fim. ---\n"); 
    }
    
    

}
