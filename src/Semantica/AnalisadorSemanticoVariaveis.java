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

    private Lista listaDeTokens = new Lista();
    private Stack<Token> pilha = new Stack<>();
    private Stack<Token> pilha2 = new Stack<>();

    private Semantico semantico = new Semantico();
    private int nivel = -1;

    private Stack<String> palavra = new Stack<>();
    private Stack<String> palavra2 = new Stack<>();

    SematicaVerificar verificacao = new SematicaVerificar();

    public AnalisadorSemanticoVariaveis(Lista listaDeTokens) {
        iniciarPilha(listaDeTokens);

    }

    public void iniciarPilha(Lista lista) {
        for (int i = lista.getLista().size() - 1; i >= 0; i--) {
            pilha.push(lista.getLista().get(i));
            pilha2.push(lista.getLista().get(i));
        }
    }

    public void analisar() {
        Token token, token2;
        while (!pilha.empty()) {
            token = pilha.pop();
            nivelvalor(token);

        }
        while (!pilha2.empty()) {
            token2 = pilha2.pop();
            nivelvalor2(token2);

        }
        verificacao.Verificar(palavra, palavra2);
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

            case 2:
                verificarLabel();
                break;
            case 3:
                //verificarConst();
                break;
        }

    }

    public void nivelvalor2(Token token) {
        if (isCategoria(token)) {
            nivel++;
            semantico.setNivel(nivel);
            return;
        }

        switch (Integer.parseInt(token.getCodigo())) {

            case 6:
                verificarVariaeisBG();

                break;
            case 3:
                //verificarConst();
                break;

        }

    }

    public void verificarVariaeisBG() {
        while (!pilha2.empty()) {
            Token token = pilha2.pop();
            int codigo = converterParaInt(token.getCodigo());
            if (codigo == 25) {
                palavra2.push(token.getNome());

            } else if (codigo == 49) {
                break;
            }
            nivelvalor(token);
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
                //System.out.println(token.getNome());
                //palavra.push(token.getNome());
                //semantico.insere(nivel, token.getNome());
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
                palavra.push(token.getNome());
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
