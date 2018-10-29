package Sheridan.Christian;

import java.util.Random;

public class Die {

    int sides;

    public Die (int sides){
        this.sides = sides;
    }

    public Die (){
        this(6);
    }

    public Integer toss(){
        Random rand = new Random();
        return rand.nextInt(6)+1;
    }


}
