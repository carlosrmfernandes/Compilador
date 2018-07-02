/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semantica;

import Models.Identificador;
import Models.Procedure;
import Models.Variavel;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 *
 * @author Polo UAB
 */
public class ListaDeIdentificadores<T extends Identificador> extends ArrayList<T> {

    public ListaDeIdentificadores() {
    }

    public void adicionarTipo(String tipo) {
        for (T identificador : this) {
            if (identificador instanceof Variavel) {
                ((Variavel) identificador).setTipo(tipo);
            }
        }
    }

    public Identificador buscar(Identificador identificador) {
//        identificador = this
//                .stream()
//                .filter(identificador::equals)
//                .findFirst()
//                .orElse(null);
        if (identificador == null) {
            System.out.println(identificador.categoria() + " não declarado");
        }
        return identificador;
    }

    boolean contem(Identificador identificador) {
        return true;
    }

    void add(Procedure procedure) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
