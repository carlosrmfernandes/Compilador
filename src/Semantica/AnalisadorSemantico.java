/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semantica;

import Models.Constante;
import Models.Identificador;
import Models.Procedure;
import Models.Token;
import Models.Variavel;
import java.util.Stack;

/**
 *
 * @author Polo UAB
 */
public class AnalisadorSemantico {

    private int nivel;
    private final Stack<Token> tokens;
    private ListaDeIdentificadores<Variavel> variaveisSemTipo;
    private ListaDeIdentificadores<Identificador> identificadores;

    public AnalisadorSemantico(Stack<Token> tokens) {
        this.nivel = -1;
        this.tokens = tokens;
        this.variaveisSemTipo = new ListaDeIdentificadores<>();
    }

    public void lerTokens() {
        while (!tokens.empty()) {
            Token token = tokens.pop();
            lerDeclaracao(token);
            //lerAtribuicao(token);
            verificarNivel(token);
        }
        //identificadores.forEach(System.out::println);
    }

    private void lerDeclaracao(Token token) {
        switch (token.getNome()) {
            case "PROGRAM":
                lerProgram();
                break;
            case "PROCEDURE":

                break;
            case "VAR":
                lerVar();
                break;
            case "CONST":
                lerConstante();
                break;
            case "LABEL":

                break;
        }
    }

    private void lerProgram() {
        identificadores.add(new Procedure(tokens.pop(), nivel));
    }

    private void lerVar() {
        Token token = tokens.pop();
        while (!tokens.empty()) {
            if (token.Identificador()) {
                Variavel variavel = new Variavel(token, nivel);
                if (identificadores.contem(variavel) || variaveisSemTipo.contem(variavel)) {

                    System.out.println("simbolo já declarado" + token);
                }
                variaveisSemTipo.add(variavel);
            } else if (token.Tipo()) {
                variaveisSemTipo.adicionarTipo(token.getNome());
                identificadores.addAll(variaveisSemTipo);
                variaveisSemTipo.clear();
            }
            token = tokens.pop();
        }
    }

    private void lerConstante() {
        Token token = tokens.pop();
        while (!tokens.empty()) {
            if (token.Identificador()) {
                identificadores.add(new Constante(token, nivel));
            }
            token = tokens.pop();
        }
    }

    private int verificarNivel(Token token) {
        if (token.getCodigo().toString().matches("1|5|13|16|18")) {
            nivel++;

        } else if (token.getCodigo().equals("7")) {
            nivel--;
        }
        return nivel;
    }

}
