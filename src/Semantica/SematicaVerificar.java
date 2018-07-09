/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semantica;

import Models.Lista;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author CarlosFernandes
 */
public class SematicaVerificar {

    void Verificar(Stack<String> palavra, Stack<String> palavra2) {

//        for (int i = 0; i < palavra.size(); i++) {
//            System.out.println(palavra.get(i));
//        }
//        System.out.println("=====================================");
//        for (int i = 0; i < palavra2.size(); i++) {
//            System.out.println(palavra2.get(i));
//        }

        int cont = 0;

        for (int i = 0; i < palavra2.size(); i++) {
            String aux = palavra2.get(i);
            String ax = "";
            cont = 0;
            for (int j = 0; j < palavra.size(); j++) {
                if (!(aux.equals(palavra.get(j)))) {
                    // System.out.println("Diferente " + palavra.get(j));
                    ax = aux;
                    cont++;
                } else {
                    //System.out.println("Igual  " + palavra.get(j));

                }
            }
            if (cont >= palavra.size()) {
                JOptionPane.showMessageDialog(null, "Não Foi Declarado " + "( " + aux + " )");
                return;

            }

        }

//        String array11[] = new String[4];
//        String array12[] = new String[5];
//
//        array11[0] = "A";
//        array11[1] = "b";
//        array11[2] = "y";
//        array11[3] = "c";
//
//        array12[0] = "A";
//        array12[1] = "b";
//        array12[2] = "c";
//        array12[3] = "S";
//        array12[4] = "Q";
//
//        for (int i = 0; i < 5; i++) {
//            String aux = array12[i];
//            String ax = "";
//            cont = 0;
//
//            for (int j = 0; j < 4; j++) {
//
//                if ((aux != array11[j])) {
//                    //System.out.println("Diferente " + array1[j]);
//
//                    ax = aux;
//                    cont++;
//                } else {
//                    // System.out.println("Igual " + array1[j]);
//
//                }
//            }
//            if (cont > 3) {
//                System.out.println("Letra Nao Encotrada: " + ax);
//            }
//       }
    }
}
