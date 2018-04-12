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
