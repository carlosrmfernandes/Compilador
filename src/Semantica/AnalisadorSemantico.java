/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Semantica;

import Models.Token;
import Models.Variavel;
import java.util.Stack;

/**
 *
 * @author Polo UAB
 */
public class AnalisadorSemantico {

    private final int nivel;
    private final Stack<Token> tokens;

    public AnalisadorSemantico(Stack<Token> tokens) {
        this.nivel = -1;
        this.tokens = tokens;
        //this.identificadores = new ListaDeIdentificadores<>();
        //this.variaveisSemTipo = new ListaDeIdentificadores<>();
    }

    public void lerTokens() {
        while (!tokens.empty()) {
            Token token = tokens.pop();
            lerDeclaracao(token);
            //lerAtribuicao(token);
            //verificarNivel(token);
        }
        //identificadores.forEach(System.out::println);
    }

    private void lerDeclaracao(Token token) {
        switch (token.getNome()) {
            case "PROGRAM":
                //lerProgram();
                break;
            case "PROCEDURE":
                //lerProcedure();
                break;
            case "VAR":
                //lerVar();
                break;
            case "CONST":
                //lerConstante();
                break;
            case "LABEL":
                //lerRotulo();
                break;
        }
    }

}
