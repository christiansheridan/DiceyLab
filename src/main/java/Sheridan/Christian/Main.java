package Sheridan.Christian;

public class Main {
    public static void main(String[] args) {
        Simulation simulation = new Simulation(2,10);
        simulation.runSimulation();
        System.out.println(simulation.bin.bins);
    }
}
