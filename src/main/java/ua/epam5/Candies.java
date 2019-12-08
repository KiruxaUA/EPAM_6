package ua.epam5;

import java.util.Arrays;
import java.util.HashSet;

public class Candies {
    public int getMaxSistersCandies(Integer[] arr) {
        if(arr == null) {
            return -1;
        }
        HashSet<Integer> hashSet = new HashSet<Integer>();
        hashSet.addAll(Arrays.asList(arr));
        return Math.min(hashSet.size(), arr.length / 2);
    }
}
