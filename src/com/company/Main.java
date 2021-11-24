package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	Game g = new Game();
    }
}


class Game {

    int boardsize = 10;

    Board b = new Board(boardsize);

    //opret dyreliste
    Animal[] dyreliste = new Animal[8];

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

    }

}
class Board{
    int boardsize;

    char [][] spilleplade = new char[boardsize][boardsize];

    Board (int boardsize){
        this.boardsize = boardsize;
    }



}

 class   Obstacle{

 }


 class MainCharacter{

 }


class Animal {
    int x;
    int y;

}
