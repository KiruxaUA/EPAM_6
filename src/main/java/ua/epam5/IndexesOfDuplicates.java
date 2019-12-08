package ua.epam5;

import java.util.HashMap;

public class IndexesOfDuplicates {
    public boolean isIndexesOfElementsWithTheAbsoluteDifference(Integer[] arr, int k) {
        if(arr == null || k < 0) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                int previous = map.get(arr[i]);
                if(i - previous <= k) {
                    return true;
                }
            }
            map.put(arr[i], i);
        }
        return false;
    }
}
