package Sheridan.Christian;

import org.junit.Test;

public class SimulationTest {

    @Test
    public void runSimulation(){
        Simulation simulation = new Simulation(2,1000000);
        simulation.runSimulation();
        System.out.println(simulation.bin.bins);
    }
}
