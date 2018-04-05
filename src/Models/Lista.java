/**
 *
 * @author Carlos Fernandes
 * @author Clayton Andrade
 *
 */
package Models;

import java.util.ArrayList;

public class Lista {

    private ArrayList<Token> lista;

    public Lista() {
        lista = new ArrayList<Token>();
    }

    public ArrayList<Token> getLista() {
        return lista;
    }

    public void adicionar(Token clas) {
        lista.add(clas);
    }

    public void linpar() {
        lista.clear();
    }
    
     public int tamanho() {
        return lista.size();
    }
    
    public Token retorna(int posicao){
        return lista.get(posicao);
    }
}