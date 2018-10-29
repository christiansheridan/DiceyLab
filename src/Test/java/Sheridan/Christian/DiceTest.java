package Sheridan.Christian;

import org.junit.Assert;
import org.junit.Test;

public class DiceTest {

    @Test
    public void getNumberOfDiceTest(){
        //given
        Dice dice = new Dice(2);

        //when
        Integer expected = 2;
        Integer actual = dice.getNumberOfDice();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void tossAndSumTest(){
        //given
        Dice dice = new Dice(2);

        //when
        Integer actual = dice.tossAndSum();

        //then
        Assert.assertTrue(actual>=2 && actual<=12);
    }

}
