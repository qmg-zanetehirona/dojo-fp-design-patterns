package strategy.arraysearch.lambda;

import org.junit.jupiter.api.Test;
import strategy.search.lambda.exercise.ArraySearchLambda;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static strategy.search.lambda.exercise.SearchStrategyLambda.BINARY;
import static strategy.search.lambda.exercise.SearchStrategyLambda.LINEAR;

public class ArraySearchLambdaTest {

    @Test
    public void containsLinearSearch() {
        String[] unsorted = new String[]{"3", "1", "2"};
        assertFalse(ArraySearchLambda.contains(unsorted, "4", LINEAR));
        assertTrue(ArraySearchLambda.contains(unsorted, "1", LINEAR));
    }

    @Test
    public void containsBinarySearch() {
        String[] sorted = new String[]{"1", "2", "3"};
        assertFalse(ArraySearchLambda.contains(sorted, "4", BINARY));
        assertTrue(ArraySearchLambda.contains(sorted, "1", BINARY));
    }
}
