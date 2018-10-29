package Sheridan.Christian;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class BinsTest {
    @Test
    public void constructorTest(){
        //when
        Bins bin = new Bins(2, 12);

        //when
        Integer actual = bin.bins.get(12);
        System.out.println(actual);

        Assert.assertTrue(actual == 0);
    }

    @Test
    public void trackTossTest(){
        //given
        Bins bin = new Bins(2, 12);
        Dice dice = new Dice(2);
        Integer tossAndSum = dice.tossAndSum();
        bin.trackTosses(tossAndSum);

        //When
        Integer actual = bin.bins.get(tossAndSum);

        //Then
        Assert.assertTrue(actual == 1);
    }
}
