package Sheridan.Christian;
import java.math.*;
import java.util.HashMap;
import java.util.Map;

public class Bins {

    HashMap<Integer, Integer> bins;

    public Bins(int min, int max) {

        bins = new HashMap<Integer, Integer>();
        initializedBins(min, max);
    }

    private void initializedBins(Integer min, Integer max) {
        for (int i = min; i <= max; i++) {
            bins.put(i, 0);
        }
    }

    public void trackTosses(int sum) {
        bins.put(sum, bins.get(sum) + 1);
    }


    public int getBin(int number) {
        return bins.get(number);
    }

    public void incrementBin(int number){
        int value = bins.get(number);
        value++;
        bins.put(number, value);
    }
}