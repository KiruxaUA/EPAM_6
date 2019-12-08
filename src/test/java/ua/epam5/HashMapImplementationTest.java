package ua.epam5;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashMapImplementationTest {
    private HashMapImplementation hashMap = new HashMapImplementation();

    @Before
    public void initializeHashMap() {
        hashMap.put(1, 1);
        hashMap.put(2, 2);
    }

    @Test
    public void hashMapImplementationTest() {
        initializeHashMap();
        Integer expected = 1;
        Integer actual = hashMap.get(1);
        assertEquals(expected, actual);
    }

    @Test
    public void hashMapImplementationTest2() {
        initializeHashMap();
        Integer expected = -1;
        Integer actual = hashMap.get(3);
        assertEquals(expected, actual);
    }
}
