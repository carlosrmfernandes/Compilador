/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semantica;

import Models.Lista;
import Models.Token;
import static java.util.Collections.list;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author comp15
 */
public final class AnalisadorSemanticoVariaveis {

    AnalisadorSemanticoVariaveisNaodeClarada asnc;
    //Map<String ,Stack<String>> map = new HashMap<String, Stack<String>>();

    private Lista listaDeTokens = new Lista();
    private Stack<Token> pilha = new Stack<>();
    private Semantico semantico = new Semantico();
    private int nivel = -1;
    private Stack<String> palavra = new Stack<>();
    int a;

    public AnalisadorSemanticoVariaveis(Lista listaDeTokens) {
        iniciarPilha(listaDeTokens);
//        map.put("Pilha_1", palavra);
//        map.get("Pilha_1");

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
            case 6:
                asnc = new AnalisadorSemanticoVariaveisNaodeClarada(listaDeTokens);
                asnc.iniciarPilha(listaDeTokens);
                break;

        }

    }

    public void verificarProce() {

        while (!pilha.empty()) {
            Token token = pilha.pop();
            int codigo = converterParaInt(token.getCodigo());
            if (codigo == 25) {
                palavra.push(token.getNome());
            } else if (codigo == 47) {
                break;
            }
            nivelvalor(token);
        }

    }

    public void verificarVar() {

        while (!pilha.empty()) {
            Token token = pilha.pop();
            int codigo = converterParaInt(token.getCodigo());
            if (codigo == 25) {
                palavra.push(token.getNome());
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
            verificarProce();

        }
        return token.getCodigo().matches("1|5|13|16|18");

    }

    public int converterParaInt(String string) {
        return Integer.parseInt(string);
    }

}
