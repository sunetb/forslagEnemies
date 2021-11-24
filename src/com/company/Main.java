package com.company;

import java.util.Random;

//Dette er en skitse/et fundament som vi har talt os frem til under projekthjælp
//Byg gerne videre på det

public class Main {

    public static void main(String[] args) {
	Game g = new Game();
	g.opdater();
    }
}


class Game {

    int boardsize = 10;

    Board board = new Board(boardsize);

    //opret dyreliste
    Animal[] dyreliste = new Animal[8];
    // mangler obstacles
    // player

    Game (){

        //læg nye dyr i listen
        for(int i = 0;i<dyreliste.length;i++){
            dyreliste[i] = new Animal();
        }
        Random r = new Random();

        //sæt postion på alle dyrene
        for(int i = 0;i<dyreliste.length;i++){

            dyreliste[i].x = r.nextInt(boardsize);
            dyreliste[i].y = r.nextInt(boardsize);
        }

        //Tjek dyrene
        for (Animal a : dyreliste){
            System.out.println(a.x + ":"+a.y);
        }
        opdater();

    }

    public void opdater() {

        //brug et loop
        Animal a  = dyreliste[0];
        board.spilleplade[a.x][a.y] = 'A';
        board.visBræt();


    }
}


class Board {
    int boardsize;

    char[][] spilleplade;

    Board(int boardsize) {

        this.boardsize = boardsize;
        spilleplade= new char[boardsize][boardsize];
        nulstilBræt();
        visBræt();

    }
        //Metode som inialiserer board: sætter alle felter til '_'


    void nulstilBræt () {
        for (int x = 0; x < boardsize; x++) {
            for (int y = 0; y < boardsize; y++) {
                spilleplade[x][y] = '_';
            }
        }
    }
    //Metode som printer boardet
    void visBræt () {
        for (int x = 0; x < boardsize; x++) {
            for (int y = 0; y < boardsize; y++) {
                System.out.print(spilleplade[y][x] + " ");
            }
            System.out.println();
        }
    }
    //opdater


}

 class   Obstacle{
    int x,y;
 }


 class MainCharacter{
    int x,y;
    //flyt men på en anden måde en fjender: Brugeren styrer
     //kollision og død
 }


class Animal {
    int x;
    int y;

    void flyt(int spillerx, int spillery){
        //hvis spillerx < x -> træk en fra x
        //osv


    }
//flyt: 1 i retning af player
    //kollision og død
}
