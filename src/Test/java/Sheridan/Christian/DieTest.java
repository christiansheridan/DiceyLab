package Sheridan.Christian;

import org.junit.Assert;
import org.junit.Test;

public class DieTest {
    @Test
    public void rollTest(){
        //given - setting the stage
        Die die = new Die();

        //when we call roll it should return an integer
        Integer actual = die.toss();

        //then
        Assert.assertTrue(actual >= 1 && actual<=6);
    }

    @Test
    public void roll20Test(){
        //given
        Die die = new Die(20);

        //when
        Integer actual = die.toss();

        //then
        Assert.assertTrue(actual>=1 && actual<=20);
    }
}
