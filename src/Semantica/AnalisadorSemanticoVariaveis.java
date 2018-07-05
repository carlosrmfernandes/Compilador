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
public final class AnalisadorSemanticoVariaveis {

    private Lista listaDeTokens = new Lista();
    private Stack<Token> pilha = new Stack<>();
    private Semantico semantico = new Semantico();
    private int nivel = -1;

    public AnalisadorSemanticoVariaveis(Lista listaDeTokens) {
        iniciarPilha(listaDeTokens);
    }

    public void iniciarPilha(Lista lista) {
        for (int i = lista.getLista().size() - 1; i >= 0; i--) {
            pilha.push(lista.getLista().get(i));
        }
    }

    public void analisar() {

        while (!pilha.empty()) {
            Token token = pilha.pop();

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
            case 7:
                nivel--;
                break;

            case 4:
                verificarVar();
                break;

            case 3:
                //verificarConst();
                break;

            case 2:
                verificarLabel();
                break;

        }
    }

    public void verificarVar() {
        while (!pilha.empty()) {
            Token token = pilha.pop();
            System.out.println(token.getNome());
            int codigo = converterParaInt(token.getCodigo());
            if (codigo == 25) {
                System.out.println(token.getNome());
                semantico.insere(nivel, token.getNome());
            } else if (isCategoria(token) || codigo == 6) {
                break;
            }
            nivelvalor(token);
        }
    }

    public void verificarConst() {

        while (!pilha.empty()) {
            Token token = pilha.pop();
            int codigo = converterParaInt(token.getCodigo());
            if (codigo == 25) {
                semantico.insere(nivel, token.getNome());
            } else if (isCategoria(token) || codigo == 4) {
                break;
            }
            nivelvalor(token);
        }
    }

    public void verificarLabel() {

        while (!pilha.empty()) {
            Token token = pilha.pop();
            int codigo = converterParaInt(token.getCodigo());
            if (codigo == 25) {
                semantico.insere(nivel, token.getNome());
            } else if (isCategoria(token) || codigo == 3) {
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
}
