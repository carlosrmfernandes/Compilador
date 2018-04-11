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
        listRegras.put(59, new String[]{"44", "79"});
        listRegras.put(60, new String[]{"45", "79"});
        listRegras.put(61, new String[]{"81", "80"});
        listRegras.put(62, new String[]{"81", "80"});
        listRegras.put(63, new String[]{"81", "80"});
        listRegras.put(64, new String[]{"30", "81", "80"});
        listRegras.put(65, new String[]{"31", "81", "80"});
        listRegras.put(66, new String[]{"81", "80"});
        listRegras.put(67, new String[]{"22", "81", "80"});
        listRegras.put(68, new String[]{"30", "81", "80"});
        listRegras.put(69, new String[]{"31", "81", "80"});
        listRegras.put(70, new String[]{"83", "82"});
        listRegras.put(71, new String[]{"83", "82"});
        listRegras.put(72, new String[]{"83", "82"});
        listRegras.put(73, new String[]{"83", "82"});
        listRegras.put(74, new String[]{"23", "83", "82"});
        listRegras.put(75, new String[]{"32", "83", "82"});
        listRegras.put(76, new String[]{"33", "83", "82"});
        listRegras.put(77, new String[]{"24", "83"});
        listRegras.put(78, new String[]{"72"});
        listRegras.put(79, new String[]{"26"});
        listRegras.put(80, new String[]{"36", "77", "37"});
        listRegras.put(81, new String[]{"26", "86", "39", "66", "85"});
        listRegras.put(82, new String[]{"47", "84"});
        listRegras.put(83, new String[]{"46", "26", "86"});
    }
    

    public String[] getGramatica(int regra) {
        return listRegras.get(regra);
    }

}
