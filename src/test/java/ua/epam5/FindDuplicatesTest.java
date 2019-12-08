package ua.epam5;

import org.junit.Test;
import static org.junit.Assert.*;

public class FindDuplicatesTest {
    private FindDuplicates findDuplicates = new FindDuplicates();

    @Test
    public void findDuplicatesTest() {
        Integer[] arrayOfInts1 = new Integer[] {1, 2, 3, 1};
        assertTrue(findDuplicates.findDuplicates(arrayOfInts1));
    }

    @Test
    public void findDuplicatesTest2() {
        Integer[] arrayOfInts2 = new Integer[] {1, 2, 3, 4};
        assertFalse(findDuplicates.findDuplicates(arrayOfInts2));
    }

    @Test
    public void findDuplicatesTest3() {
        Integer[] arrayOfInts3 = new Integer[] {1,1,1,3,3,4,3,2,4,2};
        assertTrue(findDuplicates.findDuplicates(arrayOfInts3));
    }
}
