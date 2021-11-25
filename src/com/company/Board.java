package com.company;

class Board {
    int boardsize;

    char[][] spilleplade;

    Board(int boardsize) {

        this.boardsize = boardsize;
        spilleplade = new char[boardsize][boardsize];

        nulstilBræt();
        //visBræt();
    }
    //Metode som inialiserer board: sætter alle felter til '_'


    void nulstilBræt() {
        for (int x = 0; x < boardsize; x++) {
            for (int y = 0; y < boardsize; y++) {
                spilleplade[x][y] = '_';
            }
        }
    }

    //Metode som printer boardet
    void visBræt() {
        String kant = "";
        for (int x = 0; x < boardsize; x++) {
            for (int y = 0; y < boardsize; y++) {
                System.out.print(spilleplade[y][x] + " ");
            }
            System.out.println();
            kant += x + " ";
        }
        System.out.println(kant);
    }
    //opdater


}
