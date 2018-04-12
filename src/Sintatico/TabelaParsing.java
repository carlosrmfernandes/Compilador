//<terminal simbolo="PROGRAM" codigo="1"/>
//<terminal simbolo="LABEL" codigo="2"/>
//<terminal simbolo="CONST" codigo="3"/>
//<terminal simbolo="VAR" codigo="4"/>
//<terminal simbolo="PROCEDURE" codigo="5"/>
//<terminal simbolo="BEGIN" codigo="6"/>
//<terminal simbolo="END" codigo="7"/>
//<terminal simbolo="INTEGER" codigo="8"/>
//<terminal simbolo="ARRAY" codigo="9"/>
//<terminal simbolo="OF" codigo="10"/>
//<terminal simbolo="CALL" codigo="11"/>
//<terminal simbolo="GOTO" codigo="12"/>
//<terminal simbolo="IF" codigo="13"/>
//<terminal simbolo="THEN" codigo="14"/>
//<terminal simbolo="ELSE" codigo="15"/>
//<terminal simbolo="WHILE" codigo="16"/>
//<terminal simbolo="DO" codigo="17"/>
//<terminal simbolo="REPEAT" codigo="18"/>
//<terminal simbolo="UNTIL" codigo="19"/>
//<terminal simbolo="READLN" codigo="20"/>
//<terminal simbolo="WRITELN" codigo="21"/>
//<terminal simbolo="OR" codigo="22"/>
//<terminal simbolo="AND" codigo="23"/>
//<terminal simbolo="NOT" codigo="24"/>
//<terminal simbolo="IDENTIFICADOR" codigo="25"/>
//<!-- Nome de variáveis, qualquer nome-->
//<terminal simbolo="INTEIRO" codigo="26"/>
//<!-- números inteiros 0..9 -->
//<terminal simbolo="FOR" codigo="27"/>
//<terminal simbolo="TO" codigo="28"/>
//<terminal simbolo="CASE" codigo="29"/>
//<!--simbolos especiais -->
//<terminal simbolo="+" codigo="30"/>
//<terminal simbolo="-" codigo="31"/>
//<terminal simbolo="*" codigo="32"/>
//<terminal simbolo="/" codigo="33"/>
//<terminal simbolo="[" codigo="34"/>
//<terminal simbolo="]" codigo="35"/>
//<terminal simbolo="(" codigo="36"/>
//<terminal simbolo=")" codigo="37"/>
//<terminal simbolo=":=" codigo="38"/>
//<terminal simbolo=":" codigo="39"/>
//<terminal simbolo="=" codigo="40"/>
//<terminal simbolo=">" codigo="41"/>
//<terminal simbolo=">=" codigo="42"/>
//<terminal simbolo="<" codigo="43"/>
//<!-- Sinal de menor -->
//<terminal simbolo="<=" codigo="44"/>
//<!-- Sinal de menor ou igual-->
//<terminal simbolo="<>" codigo="45"/>
//<!-- Sinal de diferente -->
//<terminal simbolo="," codigo="46"/>
//<terminal simbolo=";" codigo="47"/>
//<terminal simbolo="LITERAL" codigo="48"/>
//<terminal simbolo="." codigo="49"/>
//<terminal simbolo=".." codigo="50"/>
//<terminal simbolo="$" codigo="51"/>
//<!-- símbolo para finalização do programa -->
//</terminais>
//-<naoTerminais>
//<naoTerminal simbolo="PROGRAMA" codigo="52"/>
//<naoTerminal simbolo="BLOCO" codigo="53"/>
//<naoTerminal simbolo="DCLROT" codigo="54"/>
//<naoTerminal simbolo="LID" codigo="55"/>
//<naoTerminal simbolo="REPIDENT" codigo="56"/>
//<naoTerminal simbolo="DCLCONST" codigo="57"/>
//<naoTerminal simbolo="LDCONST" codigo="58"/>
//<naoTerminal simbolo="DCLVAR" codigo="59"/>
//<naoTerminal simbolo="LDVAR" codigo="60"/>
//<naoTerminal simbolo="TIPO" codigo="61"/>
//<naoTerminal simbolo="DCLPROC" codigo="62"/>
//<naoTerminal simbolo="DEFPAR" codigo="63"/>
//<naoTerminal simbolo="CORPO" codigo="64"/>
//<naoTerminal simbolo="REPCOMANDO" codigo="65"/>
//<naoTerminal simbolo="COMANDO" codigo="66"/>
//<naoTerminal simbolo="RCOMID" codigo="67"/>
//<naoTerminal simbolo="RVAR" codigo="68"/>
//<naoTerminal simbolo="PARAMETROS" codigo="69"/>
//<naoTerminal simbolo="REPPAR" codigo="70"/>
//<naoTerminal simbolo="ELSEPARTE" codigo="71"/>
//<naoTerminal simbolo="VARIAVEL" codigo="72"/>
//<naoTerminal simbolo="VARIAVEL1" codigo="73"/>
//<naoTerminal simbolo="REPVARIAVEL" codigo="74"/>
//<naoTerminal simbolo="ITEMSAIDA" codigo="75"/>
//<naoTerminal simbolo="REPITEM" codigo="76"/>
//<naoTerminal simbolo="EXPRESSAO" codigo="77"/>
//<naoTerminal simbolo="REPEXPSIMP" codigo="78"/>
//<naoTerminal simbolo="EXPSIMP" codigo="79"/>
//<naoTerminal simbolo="REPEXP" codigo="80"/>
//<naoTerminal simbolo="TERMO" codigo="81"/>
//<naoTerminal simbolo="REPTERMO" codigo="82"/>
//<naoTerminal simbolo="FATOR" codigo="83"/>
//<naoTerminal simbolo="CONDCASE" codigo="84"/>
//<naoTerminal simbolo="CONTCASE" codigo="85"/>
//<naoTerminal simbolo="RPINTEIRO" codigo="86"/>
//<naoTerminal simbolo="SEMEFEITO" codigo="87"/>
package Sintatico;

public class TabelaParsing {

    private int tabParsing[][] = new int[76][46];

    TabelaParsing() {
        tabParsing[52][1] = 1;
        tabParsing[53][2] = 2;
        tabParsing[53][3] = 3;
        tabParsing[53][4] = 4;
        tabParsing[53][5] = 5;
        tabParsing[53][6] = 6;
        tabParsing[54][2] = 7;
        tabParsing[55][25] = 8;
        tabParsing[56][46] = 9;
        tabParsing[57][3] = 10;
        tabParsing[58][25] = 11;
        tabParsing[59][4] = 12;
        tabParsing[60][25] = 13;
        tabParsing[61][8] = 14;
        tabParsing[61][9] = 15;
        tabParsing[62][5] = 16;
        tabParsing[63][36] = 17;
        tabParsing[64][6] = 18;
        tabParsing[65][47] = 19;
        tabParsing[66][6] = 20;
        tabParsing[66][11] = 21;
        tabParsing[66][12] = 22;
        tabParsing[66][13] = 23;
        tabParsing[66][16] = 24;
        tabParsing[66][18] = 25;
        tabParsing[66][20] = 26;
        tabParsing[66][21] = 27;
        tabParsing[66][25] = 28;
        tabParsing[66][27] = 29;
        tabParsing[66][29] = 30;
        tabParsing[67][34] = 31;
        tabParsing[67][38] = 32;
        tabParsing[67][39] = 33;
        tabParsing[68][34] = 34;
        tabParsing[69][36] = 35;
        tabParsing[70][46] = 36;
        tabParsing[71][15] = 37;
        tabParsing[72][25] = 38;
        tabParsing[73][34] = 39;
        tabParsing[74][46] = 40;
        tabParsing[75][24] = 41;
        tabParsing[75][25] = 42;
        tabParsing[75][26] = 43;
        tabParsing[75][30] = 44;
        tabParsing[75][31] = 45;
        tabParsing[75][36] = 46;
        tabParsing[75][48] = 47;
        tabParsing[76][46] = 48;
        tabParsing[77][24] = 49;
        tabParsing[77][25] = 50;
        tabParsing[77][26] = 51;
        tabParsing[77][30] = 52;
        tabParsing[77][31] = 53;
        tabParsing[77][36] = 54;
        tabParsing[78][40] = 55;
        tabParsing[78][41] = 56;
        tabParsing[78][42] = 57;
        tabParsing[78][43] = 58;
        tabParsing[78][44] = 59;
        tabParsing[78][45] = 60;
        tabParsing[79][24] = 61;
        tabParsing[79][25] = 62;
        tabParsing[79][26] = 63;
        tabParsing[79][30] =64;
        tabParsing[79][31] = 65;
        tabParsing[79][36] =66;
        tabParsing[80][22] =67;
        tabParsing[80][30] = 68;
        tabParsing[80][31] = 69;
        tabParsing[81][24] = 70;
        tabParsing[81][25] = 71;
        tabParsing[81][26] = 72;
        tabParsing[81][36] = 73;
        tabParsing[82][23] = 74;
        tabParsing[82][32] = 75;
        tabParsing[82][33] = 76;
        tabParsing[83][24] = 77;
        tabParsing[83][25] = 78;
        tabParsing[83][26] = 79;
        tabParsing[83][36] = 80;
        tabParsing[84][26] = 81;
        tabParsing[85][47] = 82;
        tabParsing[86][46] = 83;

    }

    public int regra(int x, int y) {
        int pos = tabParsing[x][y];
        return pos;
    }
}
