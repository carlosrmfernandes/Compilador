/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semantica;

import Models.Lista;
import Models.Token;
import java.util.Stack;

/**
 *
 * @author comp15
 */
public class AnalisadorSemanticoVariaveisNaodeClarada {

    private Lista listaDeTokens = new Lista();
    private Stack<Token> pilha2 = new Stack<>();
    private Semantico semantico = new Semantico();
    private int nivel = -1;
    private Stack<String> palavra2 = new Stack<>();

    public AnalisadorSemanticoVariaveisNaodeClarada(Lista listaDeTokens) {
        iniciarPilha(listaDeTokens);
    }

    public void iniciarPilha(Lista lista) {
        for (int i = lista.getLista().size() - 1; i >= 0; i--) {
            pilha2.push(lista.getLista().get(i));
        }
    }

    public void analisarr() {

        while (!pilha2.empty()) {
            Token token = pilha2.pop();
            nivelvalor(token);
        }
    }

    public void nivelvalor(Token token) {
        if (isCategoria(token)) {
            nivel++;
            semantico.setNivel(nivel);
            return;
        }
        switch (Integer.parseInt(token.getCodigo())) {

            case 6:
                verificarPro();
                break;
        }

    }

    public void verificarPro() {
        while (!pilha2.empty()) {
            Token token = pilha2.pop();
            int codigo = converterParaInt(token.getCodigo());
            if (codigo == 25) {
                palavra2.push(token.getNome());

            } else if (codigo == 7) {
                break;
            }
            nivelvalor(token);
        }

    }

    public boolean isCategoria(Token token) {
        if (token.getCodigo().equals("5")) {
            nivel++;
            semantico.setNivel(nivel);

        }
        return token.getCodigo().matches("1|5|13|16|18");

    }

    public int converterParaInt(String string) {
        return Integer.parseInt(string);
    }

    public Stack<String> getPilha() {
        return palavra2;
    }
}
