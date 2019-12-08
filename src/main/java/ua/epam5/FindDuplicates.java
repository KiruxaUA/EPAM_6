package ua.epam5;

import java.util.HashMap;

public class FindDuplicates {
    public boolean findDuplicates(Integer[] arr) {
        if(arr == null || arr.length == 0) {
            throw new IllegalArgumentException();
        }
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for(int i = 0; i < arr.length; i++) {
            if(hashMap.containsKey(Integer.toString(arr[i]))) {
                return true;
            }
            else {
                hashMap.put(Integer.toString(arr[i]), arr[i]);
            }
        }
        return false;
    }
}
