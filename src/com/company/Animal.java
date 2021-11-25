package com.company;

class Animal {
    int x;
    int y;
    int gammelX;
    int gammelY;
    int max;

    Animal(int max){
        this.max = max;
    }

    //død?

        void flyt(int spillerx, int spillery) {
        gammelY = y;
        gammelX = x;


        //flyt: 1 i retning af player
        //Sammenlign spillerx med this.x og det samme med y


        //x++;
        //y++;


        //////håndter ulovlige positioner: over boardsize og under 0
        //tjek om y og/eller x er over max

        //tjek om y og/eller x er under min
        if (y < 0){
            y++;}
        if (x < 0) {
            x++;}

    }



}
