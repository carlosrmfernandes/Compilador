package Sintatico;

import java.util.HashMap;
import java.util.Map;

public class Gramatica {

    private Map<Integer, String[]> listRegras = new HashMap<Integer, String[]>();

    public Gramatica() {
        listRegras.put(1 , new String[]{"25","43","17","42","36","47","21"});
        listRegras.put(2 , new String[]{"48","49","50"});
        listRegras.put(3 , new String[]{"3","51","38","52","36","53"});
        listRegras.put(4 , new String[]{"18"});
        listRegras.put(5 , new String[]{"17","54"});
        listRegras.put(6 , new String[]{"40","17","54"});
        listRegras.put(7 , new String[]{"18"});
        listRegras.put(8 , new String[]{"51","38","52","36","53"});
        listRegras.put(9 , new String[]{"18"});
        listRegras.put(10 , new String[]{"15"});
        listRegras.put(11 , new String[]{"5"});
        listRegras.put(12 , new String[]{"19"});
        listRegras.put(13 , new String[]{"8","17","55","35","47","34","49"});
        listRegras.put(14, new String[]{"18"});
        listRegras.put(15, new String[]{"43","17","38","52","56","42"});
        listRegras.put(16, new String[]{"18"});
        listRegras.put(17, new String[]{"36" ,"17"," 38","  52"," 56"});
        listRegras.put(18, new String[]{"18"});
        listRegras.put(19, new String[]{"25","57","58","20"});
        listRegras.put(20, new String[]{"16" ,"59","4","50","60"});
        listRegras.put(21, new String[]{"2","59","22","50"});
        listRegras.put(22, new String[]{"22","50","2","59"});
        listRegras.put(23, new String[]{"7","43","17","42"});
        listRegras.put(24, new String[]{"24","17","61"});
        listRegras.put(25, new String[]{"1","43","62","63","42"});
        listRegras.put(26, new String[]{"23","59","10","64","20"});
        listRegras.put(27, new String[]{"17","37","59","36"});
        listRegras.put(28, new String[]{"18"});
        listRegras.put(29, new String[]{"36","57","58"});
        listRegras.put(30, new String[]{"18"});
        listRegras.put(31, new String[]{"43","59","65","42"});
        listRegras.put(32, new String[]{"18"});
        listRegras.put(33, new String[]{"40","59","65"});
        listRegras.put(34, new String[]{"18"});
        listRegras.put(35, new String[]{"6","57"});
        listRegras.put(36, new String[]{"18"});
        listRegras.put(37, new String[]{"17"});
        listRegras.put(38, new String[]{"40","66","67"});
        listRegras.put(39, new String[]{"18"});
        listRegras.put(40, new String[]{"14"});
        listRegras.put(41, new String[]{"59"});
        listRegras.put(42, new String[]{"40","62","63"});
        listRegras.put(43, new String[]{"18"});
        listRegras.put(44, new String[]{"68","38","50","69"});
        listRegras.put(45, new String[]{"17"});
        listRegras.put(46, new String[]{"12"});
        listRegras.put(47, new String[]{"13"});
        listRegras.put(48, new String[]{"36","64"});
        listRegras.put(49, new String[]{"18"});
        listRegras.put(50, new String[]{"70","71"});
        listRegras.put(51, new String[]{"33","72","73"});
        listRegras.put(52, new String[]{"45","72","73"});
        listRegras.put(53, new String[]{"72","73"});
        listRegras.put(54, new String[]{"29","70"});
        listRegras.put(55, new String[]{"32","70"});
        listRegras.put(56, new String[]{"28","70"});
        listRegras.put(57, new String[]{"27","70"});
        listRegras.put(58, new String[]{"31","70"});
        listRegras.put(59, new String[]{"30","70"});
        listRegras.put(60, new String[]{"18"});
        listRegras.put(61, new String[]{"74","75"});
        listRegras.put(62, new String[]{"33","72","73"});
        listRegras.put(63, new String[]{"45","72","73"});
        listRegras.put(64, new String[]{"9","72","73"});
        listRegras.put(65, new String[]{"18"});
        listRegras.put(66, new String[]{"41","74","75"});
        listRegras.put(67, new String[]{"39","74","75"});
        listRegras.put(68, new String[]{"26","74","75"});
        listRegras.put(69, new String[]{"18"});
        listRegras.put(70, new String[]{"12"});
        listRegras.put(71, new String[]{"5"});
        listRegras.put(72, new String[]{"13"});
        listRegras.put(73, new String[]{"43","59","42"});
        listRegras.put(74, new String[]{"11","74"});
        listRegras.put(75, new String[]{"66"});
    }
    public String[] getGramatica(int regra){
         return listRegras.get(regra);
    }    
        
}
