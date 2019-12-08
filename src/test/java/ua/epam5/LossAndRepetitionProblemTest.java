package ua.epam5;

import org.junit.Test;
import static org.junit.Assert.*;

public class LossAndRepetitionProblemTest {
    private LossAndRepetitionProblem lossAndRepetitionProblem = new LossAndRepetitionProblem();

    @Test
    public void resolveLossAndRepetitionProblem() {
        Integer[] arr = new Integer[] {1, 2, 2, 4};
        Integer[] expectedArray = new Integer[] {2, 3};
        assertArrayEquals(expectedArray, lossAndRepetitionProblem.resolveLossAndRepetitionProblem(arr));
    }
}
