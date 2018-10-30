package Sheridan.Christian;

public class Simulation {

    int numberOfDice;
    int numberOfTosses;
    Dice dice;
    Bins bin;

    public Simulation(int numberOfDice, int numberOfTosses) {
        this.numberOfDice = numberOfDice;
        this.numberOfTosses = numberOfTosses;
        this.dice = new Dice(numberOfDice);
        this.bin = new Bins(numberOfDice, numberOfDice * 6);
    }

    public void runSimulation() {
        for (int i = 0; i < numberOfTosses; i++) {
            bin.trackTosses(dice.tossAndSum());
        }
    }

    public void printResults() {
        System.out.println("***");
        System.out.println("Simulation " + numberOfDice + " dice tossed for " + numberOfTosses);
        System.out.println("***");
        System.out.println();

        for (int i = numberOfDice; i <= numberOfDice * 6; i++) {
            double average = (double) bin.getBin(i) / numberOfTosses;
            String stars = "";
            if (average >= 0 && average < 0.025) {
                stars = "*";
            }
            if(average > 0.025 && average < 0.05){
                stars = "**";
            }
            if(average > 0.050 && average <0.075){
                stars = "****";
            }
            if(average > .075 && average<.1){
                stars = "******";
            }if(average > .1 && average<.125){
                stars = "********";
            }if(average > .125 && average<.15){
                stars = "**********";
            }if(average > .15 && average<.175){
                stars = "************";
            }
            System.out.println(String.format("%2d :", i) + String.format("%10d: ", bin.getBin(i))
                    + String.format("%.2f ",(double) bin.getBin(i)/numberOfTosses) + stars);
        }
        }
    }
