/**
 *
 * @author Carlos Fernandes
 * @author Clayton Andrade
 *
 */
package Controller;

import Models.Lista;
import Models.Token;
import Interface.UserInterface;
import javax.swing.JOptionPane;

public class ControllerClassifica {

    Token token = new Token();
    Lista listaToken = new Lista();
    UserInterface ui = new UserInterface();

    /**
     * Para verificar se é uma variavél
     */
    public static boolean verifacar_tamanho_do_numero(int numero) {

        if (numero > -32767 && numero < 32767) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "O numero passou o seu limite ex: numero > -32767 && numero < 32767 ");
            return false;
        }
    }

    public static boolean verifacar_tamanho_do_Identificador(String paToken) {

        if (paToken.length() <= 30) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "O Idenficador passou o seu limite ex: Maximo de caracter 30 ");
            return false;
        }
    }

    public void erro(int contadorDelinha) {
        JOptionPane.showMessageDialog(null, "erro lexico ouve uma interrupção erro na linha : " + contadorDelinha);

    }

    public Lista getPalavra(String texto) {

        int contadorDelinha = 1;// Esta variavel conta as linhas do texto
        String paToken = "";
        char caracter;
        try {
            for (int i = 0; i < texto.length(); i++) {
                Token token = new Token();
                caracter = texto.charAt(i);
                //esse if é a validaçao da contagem de linha 
                if (String.valueOf(caracter).matches("[\n]")) {
                    contadorDelinha++;
                } else {
                    //esse if ignora os espaços
                    if (String.valueOf(caracter).matches(" ")) {

                    } else {
                        //^[a-zA-Z].*
                        //Esse if trata os comandos nativos e palavras de variaveis 
                        if (String.valueOf(caracter).matches("[a-zA-Z_]")) {

                            while (String.valueOf(caracter).matches("[a-zA-Z0-9_]")) {

                                caracter = texto.charAt(i);
                                paToken += String.valueOf(caracter);

                                i++;
                                caracter = texto.charAt(i);

                            }

                            setLista(paToken, contadorDelinha);

                            paToken = "";
                            i--;

                        } else {
                            //inteiros 
                            if (String.valueOf(caracter).matches("[0-9]")) {
                                boolean num = false;
                                // se for numero verifica 
                                while (String.valueOf(caracter).matches("[0-9a-zA-Z_.]")) {

                                    caracter = texto.charAt(i);
                                    paToken += String.valueOf(caracter);
                                    i++;
                                    caracter = texto.charAt(i);

                                }
                                String palavra1 = paToken;

                                int numero = Integer.parseInt(palavra1);

                                if (verifacar_tamanho_do_numero(numero)) {
                                    token.setCodigo("26");
                                    token.setlinha(String.valueOf(contadorDelinha));
                                    token.setNome(paToken);
                                    listaToken.adicionar(token);
                                    paToken = "";
                                }

//                                } else {
//
//                                    JOptionPane.showMessageDialog(null, "Erro de Lexico"+"\nLinha:"+contadorDelinha+"\nPalavra:"+paToken);
//
//                                }
                            } else {
                                // esse if e a definição de literal ' Texto'
                                if (String.valueOf(caracter).matches("[']")) {
                                    int j = i + 1;
                                    char a = texto.charAt(j);
                                    paToken += String.valueOf(caracter);
                                    while (!String.valueOf(a).matches("[']")) {
                                        a = texto.charAt(j);
                                        paToken += String.valueOf(a);
                                        j++;
                                    }
                                    j--;
                                    i = j;
                                    token.setCodigo("48");
                                    token.setlinha(String.valueOf(contadorDelinha));
                                    token.setNome(paToken);
                                    listaToken.adicionar(token);
                                    paToken = "";

                                } else {
                                    //Daqui até o final Tratamento de operadores 
                                    if (String.valueOf(caracter).matches("<")) {
                                        paToken += String.valueOf(caracter);
                                        char a;
                                        int j = i + 1;
                                        a = texto.charAt(j);
                                        if (String.valueOf(a).matches("[=]")) {
                                            paToken += String.valueOf(a);
                                            i = j;
                                        } else {
                                            if (String.valueOf(a).matches("[>]")) {
                                                paToken += String.valueOf(a);
                                                i = j;
                                            }
                                        }

                                        setLista(paToken, contadorDelinha);
                                        paToken = "";
                                    } else {
                                        if (String.valueOf(caracter).matches(">")) {
                                            paToken += String.valueOf(caracter);
                                            char a;
                                            int j = i + 1;
                                            a = texto.charAt(j);
                                            if (String.valueOf(a).matches("[=]")) {
                                                paToken += String.valueOf(a);

                                                i = j;
                                            }
                                            setLista(paToken, contadorDelinha);
                                            paToken = "";

                                        } else {
                                            if (String.valueOf(caracter).matches(":")) {
                                                paToken += String.valueOf(caracter);
                                                char a;
                                                int j = i + 1;
                                                a = texto.charAt(j);

                                                if (String.valueOf(a).matches("[=]")) {
                                                    paToken += String.valueOf(a);
                                                    i = j;
                                                } else {
                                                    if (String.valueOf(a).matches("[:]")) {
                                                        paToken += String.valueOf(a);

                                                        i = j;
                                                    }
                                                }
                                                setLista(paToken, contadorDelinha);
                                                paToken = "";

                                            } else {

                                                if (String.valueOf(caracter).matches("[\\[\\]=+;,*)(-/]")) {
                                                    paToken += String.valueOf(caracter);
                                                    setLista(paToken, contadorDelinha);
                                                    paToken = "";

                                                } else {

                                                    //esse if trata o comentario de linha ou de bloco e ignorar ele 
                                                    // comentario de linha sera de #
                                                    //comentario de bloco ##   ##
                                                    //caracter == '[' || caracter == ']'
                                                    if (String.valueOf(caracter).matches("[#]")) {

                                                        char a;
                                                        int j = i + 1;
                                                        a = texto.charAt(j);
                                                        if (!String.valueOf(a).matches("[#]")) {
                                                            while (!String.valueOf(a).matches("[\n]")) {

                                                                a = texto.charAt(j);
                                                                j++;
                                                                i = j;
                                                                i--;
                                                            }
                                                        } else {

                                                            if (String.valueOf(a).matches("[#]")) {
                                                                boolean aox = false;
                                                                for (j = j; j < texto.length(); j++) {
                                                                    if (String.valueOf(texto.charAt(j)).equals("#")) {
                                                                        j++;
                                                                        if (String.valueOf(texto.charAt(j)).equals("#")) {
                                                                            i = j;
                                                                            aox = true;
                                                                        }
                                                                    }
                                                                    if (String.valueOf(texto.charAt(j)).matches("[\n]")) {
                                                                        contadorDelinha++;
                                                                    }
                                                                }
                                                                contadorDelinha--;
                                                                if (!aox) {
                                                                    setLista("Erro  comentario", contadorDelinha);
                                                                    JOptionPane.showMessageDialog(null, "erro lexico Erro na Linha" + contadorDelinha);

                                                                    i = j;
                                                                    break;
                                                                }
                                                            } else {
                                                                setLista("#", contadorDelinha);

                                                            }
                                                        }

                                                    } else {
                                                        //se nao cair em nenhum é um caracter invalido 
                                                        JOptionPane.showMessageDialog(null, "erro lexico ouve uma interrupção erro na linha : " + contadorDelinha);

                                                        break;
                                                        //setLista("Invalido erro", contadorDelinha);
                                                    }
                                                }
                                            }
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
            }

        } catch (Exception e) {

            setLista(paToken, contadorDelinha);
            erro(contadorDelinha);

            //System.out.println(paToken);
        }
        //quando sair do ciclo e final de arquivo 
        //setLista("$", contadorDelinha);
        ui.getListaMunuAtt(listaToken);
        return listaToken;

    }

    public void setLista(String palavra, int linha) {

        Token token = new Token();

        switch (palavra) {
            case "program":
                token.setCodigo("1");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;

            case "label":
                token.setCodigo("2");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;

            case "const":
                token.setCodigo("3");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;

            case "var":
                token.setCodigo("4");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;

            case "procedure":
                token.setCodigo("5");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;

            case "begin":
                token.setCodigo("6");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;

            case "end":
                token.setCodigo("7");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;

            case "integer":
                token.setCodigo("8");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "array":
                token.setCodigo("9");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;

            case "of":
                token.setCodigo("10");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;

            case "call":
                token.setCodigo("11");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "goto":
                token.setCodigo("12");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "if":
                token.setCodigo("13");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "then":
                token.setCodigo("14");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "else":
                token.setCodigo("15");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "while":
                token.setCodigo("16");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "do":
                token.setCodigo("17");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "repeat":
                token.setCodigo("18");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "until":
                token.setCodigo("19");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "readln":
                token.setCodigo("20");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "writeln":
                token.setCodigo("21");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "or":
                token.setCodigo("22");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "and":
                token.setCodigo("23");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "not":
                token.setCodigo("24");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;

            case "inteiro":
                token.setCodigo("26");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "for":
                token.setCodigo("27");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "to":
                token.setCodigo("28");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "case":
                token.setCodigo("29");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "+":
                token.setCodigo("30");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "-":
                token.setCodigo("31");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "*":
                token.setCodigo("32");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "/":
                token.setCodigo("33");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "[":
                token.setCodigo("34");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "]":
                token.setCodigo("35");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "(":
                token.setCodigo("36");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case ")":
                token.setCodigo("37");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case ":=":
                token.setCodigo("38");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case ":":
                token.setCodigo("39");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "=":
                token.setCodigo("40");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case ">":
                token.setCodigo("41");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case ">=":
                token.setCodigo("42");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "<":
                token.setCodigo("43");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "<=":
                token.setCodigo("44");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "<>":
                token.setCodigo("45");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case ",":
                token.setCodigo("46");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case ";":
                token.setCodigo("47");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "literal":
                token.setCodigo("48");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case ".":
                token.setCodigo("49");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "..":
                token.setCodigo("50");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "$":
                token.setCodigo("51");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "PROGRAMA":
                token.setCodigo("52");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "BLOCO":
                token.setCodigo("53");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "DCLROT":
                token.setCodigo("54");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "LID":
                token.setCodigo("55");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "REPIDENT":
                token.setCodigo("56");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "DCLCONST":
                token.setCodigo("57");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "LDCONST":
                token.setCodigo("58");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "DCLVAR":
                token.setCodigo("59");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "LDVAR":
                token.setCodigo("60");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "TIPO":
                token.setCodigo("61");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "DCLPROC":
                token.setCodigo("62");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "DEFPAR":
                token.setCodigo("63");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "CORPO":
                token.setCodigo("64");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "REPCOMANDO":
                token.setCodigo("65");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "COMANDO":
                token.setCodigo("66");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "RCOMID":
                token.setCodigo("67");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "RVAR":
                token.setCodigo("68");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "PARAMETROS":
                token.setCodigo("69");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "REPPAR":
                token.setCodigo("70");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "ELSEPARTE":
                token.setCodigo("71");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "VARIAVEL":
                token.setCodigo("72");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "VARIAVEL1":
                token.setCodigo("73");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "REPVARIAVEL":
                token.setCodigo("74");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "ITEMSAIDA":
                token.setCodigo("75");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "REPITEM":
                token.setCodigo("76");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "EXPRESSAO":
                token.setCodigo("77");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "REPEXPSIMP":
                token.setCodigo("78");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "EXPSIMP":
                token.setCodigo("79");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "REPEXP":
                token.setCodigo("80");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "TERMO":
                token.setCodigo("81");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "REPTERMO":
                token.setCodigo("82");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "FATOR":
                token.setCodigo("83");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "CONDCASE":
                token.setCodigo("84");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "CONTCASE":
                token.setCodigo("85");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "RPINTEIRO":
                token.setCodigo("86");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
            case "SEMEFEITO":
                token.setCodigo("87");
                token.setNome(palavra);
                token.setlinha(String.valueOf(linha));
                break;
           
            default:

                if (verifacar_tamanho_do_Identificador(palavra)) {
                    token.setCodigo("25");
                    token.setNome(palavra);
                    token.setlinha(String.valueOf(linha));
                }
                break;

        }

        listaToken.adicionar(token);

    }
}
