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
        listRegras.put(16, new String[]{"5", "25", "63", "47", "53", "47", "62"});
        listRegras.put(17, new String[]{"36", "55", "39", "8", "37"});
        listRegras.put(18, new String[]{"6", "66", "65", "7"});
        listRegras.put(19, new String[]{"47", "66", "65"});
        listRegras.put(20, new String[]{"64"});
        listRegras.put(21, new String[]{"11", "25", "69"});
        listRegras.put(22, new String[]{"12", "25"});
        listRegras.put(23, new String[]{"13", "77", "14", "66", "71"});
        listRegras.put(24, new String[]{"16", "77", "17", "66"});
        listRegras.put(25, new String[]{"18", "66", "19", "77"});
        listRegras.put(26, new String[]{"20", "36", "72", "74", "37"});
        listRegras.put(27, new String[]{"21", "36", "75", "76", "37"});
        listRegras.put(28, new String[]{"25", "67"});
        listRegras.put(29, new String[]{"27", "25", "38", "77", "28", "77", "17", "66"});
        listRegras.put(30, new String[]{"29", "77", "10", "84", "7"});
        listRegras.put(31, new String[]{"68", "38", "77"});
        listRegras.put(32, new String[]{"68", "38", "77"});
        listRegras.put(33, new String[]{"39", "66"});
        listRegras.put(34, new String[]{"34", "77", "35"});
        listRegras.put(35, new String[]{"36", "77", "70", "37"});
        listRegras.put(36, new String[]{"46", "77", "70"});
        listRegras.put(37, new String[]{"15", "66"});
        listRegras.put(38, new String[]{"25", "73"});
        listRegras.put(39, new String[]{"34", "77", "35"});
        listRegras.put(40, new String[]{"46", "72", "74"});
        listRegras.put(41, new String[]{"77"});
        listRegras.put(42, new String[]{"77"});
        listRegras.put(43, new String[]{"77"});
        listRegras.put(44, new String[]{"77"});
        listRegras.put(45, new String[]{"77"});
        listRegras.put(46, new String[]{"77"});
        listRegras.put(47, new String[]{"48"});
        listRegras.put(48, new String[]{"46", "75", "76"});
        listRegras.put(49, new String[]{"79", "78"});
        listRegras.put(50, new String[]{"79", "78"});
        listRegras.put(51, new String[]{"79", "78"});
        listRegras.put(52, new String[]{"79", "78"});
        listRegras.put(53, new String[]{"79", "78"});
        listRegras.put(54, new String[]{"79", "78"});
        listRegras.put(55, new String[]{"40", "79"});
        listRegras.put(56, new String[]{"41", "79"});
        listRegras.put(57, new String[]{"42", "79"});
        listRegras.put(58, new String[]{"43", "79"});
        listRegras.put(59, new String[]{"", "", "", "", "", ""});
        listRegras.put(60, new String[]{"", "", "", "", "", ""});
        listRegras.put(61, new String[]{"", "", "", "", "", ""});
        listRegras.put(62, new String[]{"", "", "", "", "", ""});
        listRegras.put(63, new String[]{"", "", "", "", "", ""});
        listRegras.put(64, new String[]{"", "", "", "", "", ""});
    }

//<item derivacao="<=|EXPSIMP" codigo="78,44"/>
//<item derivacao="<>|EXPSIMP" codigo="78,45"/>
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
