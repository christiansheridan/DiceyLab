package Sheridan.Christian;

public class Simulation {

    int numberOfDice;
    int numberOfTosses;
    Dice dice;
    Bins bin;

    public Simulation(int numberOfDice, int numberOfTosses){
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
        this.dice = new Dice(numberOfDice);
        this.bin = new Bins(numberOfDice, numberOfDice*6);
    }

    public void runSimulation(){
        for (int i = 0; i<numberOfTosses; i++){
            bin.trackTosses(dice.tossAndSum());
        }
    }

    public Bins returnResults(){
        return this.bin;
    }
}
