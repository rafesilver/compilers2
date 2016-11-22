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
 * 
 * 
 * ATENÇÃO:
 *          Alteração para incluir a funcionalidade 'Capivara no Barranco'
 * -----------------------------------------------------------------------------
 * PORQUE ISSO FOI PRECISO?
 * 
 *      Estavamos com um problema de atribuir o
 * tipo dos símbolos quando acontecia uma atribuição múltipla, como em:
 * 
 *      ' declare var1, var2, var3 : literal '
 * 
 *      Neste caso acima, estavamos conseguindo apenas atribuir o tipo 'literal'
 * à 'var1'. Portanto, criamos esta funcionalidade.
 * -----------------------------------------------------------------------------
 * COMO FUNCIONA?
 * 
 *      A idéia dessa funcionalidade é passar um tipo temporário, que vai ser
 * alterado depois! Logo, quando um símbolo recebe o tipo '223: preencher depois',
 * a funcionalidade detecta que há algo que precisa ser tratado depois, ou seja,
 * que há uma capivara no barranco causando inconveniência! Portando, cada vez
 * que este tipo é declarado, a funcionalidade incrementa a variável
 * 'capivaraNoBarranco'.
 * 
 *      Quando um símbolo é adicionado com um tipo que não seja o 223, a
 * funcionalidade detecta que todas as capivaras já foram adicionadas! Neste
 * momento, a funcionalidade atribui este tipo que está sendo passado por último,
 * aos N símbolos anteriores, sendo N o número de capivaras no barranco!
 * 
 *      Naturalmente, a variavel 'capivaraNoBarranco' é igualada ao 0 após isso
 * tudo.
 * 
 */
public class TabelaDeSimbolos {
    private String escopo;
    private List<EntradaTabelaDeSimbolos> simbolos;
    // Veja acima sobre a variável 'capivaraNoBarranco'!
    private Integer capivaraNoBarranco = 0;
    
    public TabelaDeSimbolos(String escopo) {
        simbolos = new ArrayList<EntradaTabelaDeSimbolos>();
        this.escopo = escopo;
    }
    
    public void adicionarSimbolo(String nome, String tipo) {
        simbolos.add(new EntradaTabelaDeSimbolos(nome,tipo));
        if(tipo == "223: 'preencher depois'")
            capivaraNoBarranco++;
        else
            if(capivaraNoBarranco > 0){
                for(int i=0; i<capivaraNoBarranco; i++){
                    simbolos.get(simbolos.size() -i -2).setTipo(tipo);
                }
                capivaraNoBarranco = 0;
            }
        //System.out.print("\n" + this.toString() + "\n");
    }
    
    public void adicionarSimbolos(List<String> nomes, String tipo) {
        for(String s:nomes) {
            simbolos.add(new EntradaTabelaDeSimbolos(s, tipo));
        }
    }
    
    public boolean existeSimbolo(String nome) {
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }
    
    public String getTipo(String nome) {
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(nome)) {
                return etds.getTipo();
            }
        }
        return "224: simbolo nao encontrado";
    }
    
    @Override
    public String toString() {
        String ret = "Escopo: "+escopo;
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            ret += "\n   "+etds;
        }
        return ret;
    }
}
