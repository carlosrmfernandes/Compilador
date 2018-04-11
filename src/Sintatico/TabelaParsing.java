package Sintatico;

public class TabelaParsing {

    private int tabParsing[][] = new int[76][46];

    TabelaParsing() {
        tabParsing[52][1] = 1;
        tabParsing[53][2] = 2;
        

    }

    public int regra(int x, int y) {
        int pos = tabParsing[x][y];
        return pos;
    }
}
