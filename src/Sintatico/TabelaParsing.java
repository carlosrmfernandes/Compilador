package Sintatico;

public class TabelaParsing {

    private int tabParsing[][] = new int[76][46];

    TabelaParsing() {
        tabParsing[52][21] = 1;
       
    }

    public int regra(int x, int y) {
        int pos = tabParsing[x][y];
        return pos;
    }
}
