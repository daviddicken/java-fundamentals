package basiclibrary;

import org.junit.Test;
import static org.junit.Assert.*;

public class RollingDiceTest {

    @Test public void testRollingDice()
    {
        RollingDice rollTest = new RollingDice();
        int numRolls = 5;
        int moreRolls = 100;

        int[] returnedArr = rollTest.roll(numRolls);

        int[] randomArr = rollTest.roll(moreRolls);
        boolean flag = true;
        boolean sameFlag = false;

        // test to see if numbers are between 1-6
        for(int i = 0; i < randomArr.length; i++)
        {
            if(!(randomArr[i] > 0) && !(randomArr[i] < 7))
            {
                flag = false;
            }
        }

        //test to make sure that it is not the same number
        for(int i = 0; i < randomArr.length - 1; i++)
        {
            if(!(randomArr[i] == randomArr[i + 1]))
            {
                sameFlag = true;
            }
        }
        assertEquals(returnedArr.length, numRolls);
        assertTrue(flag);
        assertTrue(sameFlag);
    }

    @Test public void testDuplicates()
    {
        RollingDice rollTest = new RollingDice();

        int[] trueArr = {1,2,3,4,5};
        int[] doubleArr = {1,2,3,4,2};

        assertTrue(rollTest.containsDuplicates(doubleArr));
        assertFalse(rollTest.containsDuplicates(trueArr));
    }

    @Test public void testAverages()
    {
        RollingDice rollTest = new RollingDice();

        int[] testArr = {2,2,2,2};
        int[] secondArr = {0,5,10};

        assertEquals(2.0,rollTest.calcAvg(testArr), 0 );
        assertEquals(5.0,rollTest.calcAvg(secondArr), 0 );
        assertNotEquals(2.0,rollTest.calcAvg(secondArr),0);
    }

    @Test public void testArrayofArray()
    {
        RollingDice rollTest = new RollingDice();

        int[][] test = {
                {66, 64, 58, 65, 71, 57, 60},
                {5, 10, 20, 10, 16, 12, 22},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        int[] lowAvg = {5, 10, 20, 10, 16, 12, 22};

        assertArrayEquals(lowAvg, rollTest.arrayAvg(test) );
    }
}

