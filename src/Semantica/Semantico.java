/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semantica;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Polo UAB
 */
public class Semantico {

    private Map<Integer, Set<String>> niveis = new HashMap<Integer, Set<String>>();
    int nivel;

    public Semantico() {
        init();
    }

    public void init() {
        niveis.put(getNivel(), new HashSet<String>());

    }

    public void insere(int nivel, String var) {

        if (niveis.get(nivel).contains(var)) {
            JOptionPane.showMessageDialog(null, "Variável Já Existe " + "( " + var + " )");
        } else {
            niveis.get(nivel).add(var);
        }
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
        init();
    }
}
