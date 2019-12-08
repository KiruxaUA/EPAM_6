package ua.epam5;

import org.junit.Test;
import static org.junit.Assert.*;

public class IndexesOfDuplicatesTest {
    private IndexesOfDuplicates indexesOfDuplicates = new IndexesOfDuplicates();

    @Test
    public void isIndexesOfElementsWithTheAbsoluteDifferenceTest() {
        Integer[] arr = new Integer[] {1, 2, 3, 1};
        int k = 3;
        assertTrue(indexesOfDuplicates.isIndexesOfElementsWithTheAbsoluteDifference(arr, k));
    }

    @Test
    public void isIndexesOfElementsWithTheAbsoluteDifferenceTest2() {
        Integer[] arr = new Integer[] {1, 0, 1, 1};
        int k = 1;
        assertTrue(indexesOfDuplicates.isIndexesOfElementsWithTheAbsoluteDifference(arr, k));
    }

    @Test
    public void isIndexesOfElementsWithTheAbsoluteDifferenceTest3() {
        Integer[] arr = new Integer[] {1, 2, 3, 1, 2, 3};
        int k = 2;
        assertFalse(indexesOfDuplicates.isIndexesOfElementsWithTheAbsoluteDifference(arr, k));
    }
}
