package ua.epam5;

import org.junit.Test;
import static org.junit.Assert.*;

public class CandiesTest {
    private Candies candies = new Candies();

    @Test
    public void candiesTest() {
        Integer[] arr = new Integer[] {1,1,2,2,3,3};
        int expected = 3;
        assertEquals(expected, candies.getMaxSistersCandies(arr));
    }

    @Test
    public void candiesTest2() {
        Integer[] arr = new Integer[] {1,1,2,3};
        int expected = 2;
        assertEquals(expected, candies.getMaxSistersCandies(arr));
    }
}
