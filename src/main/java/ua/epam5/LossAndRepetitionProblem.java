package ua.epam5;

import java.util.Arrays;

public class LossAndRepetitionProblem {
    public Integer[] resolveLossAndRepetitionProblem(Integer[] arr) {
        if(arr == null || arr.length < 2) {
            return new Integer[] {-1};
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i].equals(arr[i + 1])) {
                return new Integer[] {arr[i], arr[i] + 1};
            }
        }
        return new Integer[] {-1};
    }
}
