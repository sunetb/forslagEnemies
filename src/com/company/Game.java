package com.company;

import java.util.Random;
import java.util.Scanner;

class Game {

    Scanner input = new Scanner(System.in);
    int boardsize = 4;

    Board board = new Board(boardsize);

    //opret dyreliste
    Animal[] dyreliste = new Animal[3];
    // mangler obstacles
    MainCharacter spiller = new MainCharacter();


    Game (){

        //læg nye dyr i listen
        for(int i = 0;i<dyreliste.length;i++){
            dyreliste[i] = new Animal(boardsize);
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

        spiller.x = r.nextInt(boardsize);
        spiller.y = r.nextInt(boardsize);
        startSpil();

    }

    private void startSpil() {

        while (fortsæt()) {
            String retning = input.nextLine();


            for (int i = 0; i < dyreliste.length; i++) {
                dyreliste[i].flyt(12, 12);
            }
            opdater();
            board.visBræt();
        }
    }

    private boolean fortsæt() {
        //er spilleren død?
        //er alle dyrene døde?
        return true;
    }

    public void opdater() {

        //for hvert dyr i listen: sæt dets position på spillepladen 'A'
        for (int i = 0; i < dyreliste.length; i++) {
            Animal a  = dyreliste[i];
            board.spilleplade[a.gammelX][a.gammelY] = '_';
            board.spilleplade[a.x][a.y] = 'A';
            board.spilleplade[spiller.gammelX][spiller.gammelY] = '_';
            board.spilleplade[spiller.x][spiller.y] = 'P';
        }


    }
}

