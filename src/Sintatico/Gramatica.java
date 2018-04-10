//
//
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

import java.util.HashMap;
import java.util.Map;

public class Gramatica {

    private Map<Integer, String[]> listRegras = new HashMap<Integer, String[]>();

    public Gramatica() {
        listRegras.put(1, new String[]{"1", "25", "47", "53", "49"});
        listRegras.put(2, new String[]{"54", "57", "59", "62", "64"});
        listRegras.put(3, new String[]{"54", "57", "59", "62", "64"});
        listRegras.put(4, new String[]{"54", "57", "59", "62", "64"});
        listRegras.put(5, new String[]{"54", "57", "59", "62", "64"});
        listRegras.put(6, new String[]{"54", "57", "59", "62", "64"});
        listRegras.put(7, new String[]{"2", "55", "47"});
        listRegras.put(8, new String[]{"25", "56"});
        listRegras.put(9, new String[]{"46", "25", "56"});
        listRegras.put(10, new String[]{"3", "25", "40", "26", "47", "58"});
        listRegras.put(11, new String[]{"25", "40", "26", "47", "58"});
        listRegras.put(12, new String[]{"4", "55", "39", "61", "47", "60"});
        listRegras.put(13, new String[]{"55", "39", "61", "47", "60"});
        listRegras.put(14, new String[]{"8"});
        listRegras.put(15, new String[]{"9", "34", "26", "50", "26", "35", "10", "8"});
        listRegras.put(16, new String[]{"5", "25", "63", "47", "53", "47","62"});
        listRegras.put(17, new String[]{"", "", "", "", "", ""});
        listRegras.put(18, new String[]{"", "", "", "", "", ""});
        listRegras.put(19, new String[]{"", "", "", "", "", ""});
        listRegras.put(20, new String[]{"", "", "", "", "", ""});
        listRegras.put(21, new String[]{"", "", "", "", "", ""});
        listRegras.put(22, new String[]{"", "", "", "", "", ""});
        listRegras.put(23, new String[]{"", "", "", "", "", ""});
        listRegras.put(24, new String[]{"", "", "", "", "", ""});
        listRegras.put(25, new String[]{"", "", "", "", "", ""});
        listRegras.put(26, new String[]{"", "", "", "", "", ""});
        listRegras.put(27, new String[]{"", "", "", "", "", ""});
        listRegras.put(28, new String[]{"", "", "", "", "", ""});
        listRegras.put(29, new String[]{"", "", "", "", "", ""});
        listRegras.put(30, new String[]{"", "", "", "", "", ""});
        listRegras.put(31, new String[]{"", "", "", "", "", ""});
        listRegras.put(32, new String[]{"", "", "", "", "", ""});
        listRegras.put(33, new String[]{"", "", "", "", "", ""});
        listRegras.put(34, new String[]{"", "", "", "", "", ""});
        listRegras.put(35, new String[]{"", "", "", "", "", ""});
        listRegras.put(36, new String[]{"", "", "", "", "", ""});
        listRegras.put(37, new String[]{"", "", "", "", "", ""});
        listRegras.put(38, new String[]{"", "", "", "", "", ""});
        listRegras.put(39, new String[]{"", "", "", "", "", ""});
        listRegras.put(40, new String[]{"", "", "", "", "", ""});
        listRegras.put(41, new String[]{"", "", "", "", "", ""});
        listRegras.put(42, new String[]{"", "", "", "", "", ""});
        listRegras.put(43, new String[]{"", "", "", "", "", ""});
        listRegras.put(44, new String[]{"", "", "", "", "", ""});
        listRegras.put(45, new String[]{"", "", "", "", "", ""});
        listRegras.put(46, new String[]{"", "", "", "", "", ""});
        listRegras.put(47, new String[]{"", "", "", "", "", ""});
        listRegras.put(48, new String[]{"", "", "", "", "", ""});
        listRegras.put(49, new String[]{"", "", "", "", "", ""});
        listRegras.put(50, new String[]{"", "", "", "", "", ""});
    }

//<item derivacao="(|LID|:|INTEGER|)" codigo="63,36"/>
//<item derivacao="BEGIN|COMANDO|REPCOMANDO|END" codigo="64,6"/>
//<item derivacao=";|COMANDO|REPCOMANDO" codigo="65,47"/>
//<item derivacao="CORPO" codigo="66,6"/>
//<item derivacao="CALL|IDENTIFICADOR|PARAMETROS" codigo="66,11"/>
//<item derivacao="GOTO|IDENTIFICADOR" codigo="66,12"/>
//<item derivacao="IF|EXPRESSAO|THEN|COMANDO|ELSEPARTE" codigo="66,13"/>
//<item derivacao="WHILE|EXPRESSAO|DO|COMANDO" codigo="66,16"/>
//<item derivacao="REPEAT|COMANDO|UNTIL|EXPRESSAO" codigo="66,18"/>
//<item derivacao="READLN|(|VARIAVEL|REPVARIAVEL|)" codigo="66,20"/>
//<item derivacao="WRITELN|(|ITEMSAIDA|REPITEM|)" codigo="66,21"/>
//<item derivacao="IDENTIFICADOR|RCOMID" codigo="66,25"/>
//<item derivacao="FOR|IDENTIFICADOR|:=|EXPRESSAO|TO|EXPRESSAO|DO|COMANDO" codigo="66,27"/>
//<item derivacao="CASE|EXPRESSAO|OF|CONDCASE|END" codigo="66,29"/>
//<item derivacao="RVAR|:=|EXPRESSAO" codigo="67,34"/>
//<item derivacao="RVAR|:=|EXPRESSAO" codigo="67,38"/>
//<item derivacao=":|COMANDO" codigo="67,39"/>
//<item derivacao="[|EXPRESSAO|]" codigo="68,34"/>
//<item derivacao="(|EXPRESSAO|REPPAR|)" codigo="69,36"/>
//<item derivacao=",|EXPRESSAO|REPPAR" codigo="70,46"/>
//<item derivacao="ELSE|COMANDO" codigo="71,15"/>
//<item derivacao="IDENTIFICADOR|VARIAVEL1" codigo="72,25"/>
//<item derivacao="[|EXPRESSAO|]" codigo="73,34"/>
//<item derivacao=",|VARIAVEL|REPVARIAVEL" codigo="74,46"/>
//<item derivacao="EXPRESSAO" codigo="75,24"/>
//<item derivacao="EXPRESSAO" codigo="75,25"/>
//<item derivacao="EXPRESSAO" codigo="75,26"/>
//<item derivacao="EXPRESSAO" codigo="75,30"/>
//<item derivacao="EXPRESSAO" codigo="75,31"/>
//<item derivacao="EXPRESSAO" codigo="75,36"/>
//<item derivacao="LITERAL" codigo="75,48"/>
//<item derivacao=",|ITEMSAIDA|REPITEM" codigo="76,46"/>
//<item derivacao="EXPSIMP|REPEXPSIMP" codigo="77,24"/>
//<item derivacao="EXPSIMP|REPEXPSIMP" codigo="77,25"/>
//<item derivacao="EXPSIMP|REPEXPSIMP" codigo="77,26"/>
//<item derivacao="EXPSIMP|REPEXPSIMP" codigo="77,30"/>
//<item derivacao="EXPSIMP|REPEXPSIMP" codigo="77,31"/>
//<item derivacao="EXPSIMP|REPEXPSIMP" codigo="77,36"/>
//<item derivacao="=|EXPSIMP" codigo="78,40"/>
//<item derivacao=">|EXPSIMP" codigo="78,41"/>
//<item derivacao=">=|EXPSIMP" codigo="78,42"/>
//<item derivacao="<|EXPSIMP" codigo="78,43"/>
//<!-- Sinal de menor --
//<item derivacao="<=|EXPSIMP" codigo="78,44"/>
//<!-- Sinal de menor ou igual -->
//<item derivacao="<>|EXPSIMP" codigo="78,45"/>
//<!-- Sinal de diferente -->
//<item derivacao="TERMO|REPEXP" codigo="79,24"/>
//<item derivacao="TERMO|REPEXP" codigo="79,25"/>
//<item derivacao="TERMO|REPEXP" codigo="79,26"/>
//<item derivacao="+|TERMO|REPEXP" codigo="79,30"/>
//<item derivacao="-|TERMO|REPEXP" codigo="79,31"/>
//<item derivacao="TERMO|REPEXP" codigo="79,36"/>
//<item derivacao="OR|TERMO|REPEXP" codigo="80,22"/>
//<item derivacao="+|TERMO|REPEXP" codigo="80,30"/>
//<item derivacao="-|TERMO|REPEXP" codigo="80,31"/>
//<item derivacao="FATOR|REPTERMO" codigo="81,24"/>
//<item derivacao="FATOR|REPTERMO" codigo="81,25"/>
//<item derivacao="FATOR|REPTERMO" codigo="81,26"/>
//<item derivacao="FATOR|REPTERMO" codigo="81,36"/>
//<item derivacao="AND|FATOR|REPTERMO" codigo="82,23"/>
//<item derivacao="*|FATOR|REPTERMO" codigo="82,32"/>
//<item derivacao="/|FATOR|REPTERMO" codigo="82,33"/>
//<item derivacao="NOT|FATOR" codigo="83,24"/>
//<item derivacao="VARIAVEL" codigo="83,25"/>
//<item derivacao="INTEIRO" codigo="83,26"/>
//<item derivacao="(|EXPRESSAO|)" codigo="83,36"/>
//<item derivacao="INTEIRO|RPINTEIRO|:|COMANDO|CONTCASE" codigo="84,26"/>
//<item derivacao=";|CONDCASE" codigo="85,47"/>
//<item derivacao=",|INTEIRO|RPINTEIRO" codigo="86,46"/>
    public String[] getGramatica(int regra) {
        return listRegras.get(regra);
    }

}
