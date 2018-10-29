package Sheridan.Christian;

import java.util.ArrayList;

public class Dice {

    ArrayList<Die> dice;
    public Dice(Integer number){
        dice = new ArrayList<Die>();
        initializedDice(number);
    }

    private void initializedDice(Integer number){
        for (int i = 0; i < number; i++){
            Die die = new Die();
            dice.add(die);
        }
    }

    public Integer getNumberOfDice(){
        return dice.size();
    }

    public Integer tossAndSum(){
        Integer sum = 0;
        for (Die die: dice){
            sum += die.toss();
        } return sum;
    }

}
