
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author comp15
 */
public class TesteNIvel {

    private Map<Integer, Set<String>> niveis = new HashMap<Integer, Set<String>>();

    public void init(){
        niveis.put(1, new HashSet<String>());
        niveis.put(2, new HashSet<String>());
        niveis.put(3, new HashSet<String>());
    }

    public void insere(int nivel, String var) {
        if(niveis.get(nivel).contains(var)) {
            //ja existe
            System.out.println("ERRO");
        } else {
            niveis.get(nivel).add(var);
        }
    } 
    
    public void teste(){
        init();
        
        insere(1, "a");
        insere(1, "b");
        insere(2, "a");
        insere(2, "b");
        
//        insere(1, "a");
    }
    
    public static void main(String args[]) {
        new TesteNIvel().teste();
    }
}
