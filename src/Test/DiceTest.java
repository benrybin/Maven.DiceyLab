import org.junit.Assert;

import static org.junit.Assert.*;

public class DiceTest {

    @org.junit.Test
    public void rollDice() {
        int rolls = 99;
        Dice testDice = new Dice(rolls);

        int actual = testDice.rollDice(99);

        Assert.assertTrue(actual >=rolls && actual <= (rolls *6));

    }
}