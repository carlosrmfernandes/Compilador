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
    private Stack<Token> pilha = new Stack<>();
    private int contadorDeBegins = -1;
    private Semantico semantico = new Semantico();
    private int nivel = -1;

    public AnalisadorSemanticoVariaveisNaodeClarada(Lista listaDeTokens) {
        iniciarPilha(listaDeTokens);
    }

    public void iniciarPilha(Lista lista) {
        for (int i = lista.getLista().size() - 1; i >= 0; i--) {
            pilha.push(lista.getLista().get(i));
        }
    }

    public void analisar() {
        System.out.println("ok");
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
                contadorDeBegins--;
                //System.out.println(nivel);
                break;

            case 6:
                contadorDeBegins++;
                verificarVar();
                break;
            case 25:
                //System.out.println(nome);
                //System.out.println(nome);
                //System.out.println(nivel + " : " + nome);
                // semantico.insere(nivel, nome);
                break;
        }
    }

    public void verificarVar() {
        while (!pilha.empty()) {
            Token token = pilha.pop();
            int codigo = converterParaInt(token.getCodigo());
            if (codigo == 25) {
                // System.out.println(token.getNome());
                semantico.insere(nivel, token.getNome());
            } else if (codigo == 6) {
                contadorDeBegins++;
            } else if (codigo == 7) {
                contadorDeBegins--;
                if (contadorDeBegins == 0) {
                    break;
                }
            }
            nivelvalor(token);
        }
    }

    public boolean isCategoria(Token token) {
        return token.getCodigo().matches("1|5|13|16|18");
    }

    public int converterParaInt(String string) {
        return Integer.parseInt(string);
    }

//    public void comparapilha() {
//        AnalisadorSemanticoVariaveis av = new AnalisadorSemanticoVariaveis(listaDeTokens);
//    }
}
