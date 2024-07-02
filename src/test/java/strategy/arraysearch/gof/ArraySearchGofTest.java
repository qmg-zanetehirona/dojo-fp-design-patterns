package strategy.arraysearch.gof;

import org.junit.jupiter.api.Test;
import strategy.search.gof.ArraySearchGof;
import strategy.search.gof.BinarySearchStrategy;
import strategy.search.gof.LinearSearchStrategy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArraySearchGofTest {

    @Test
    public void containsLinearSearch() {
        String[] unsorted = new String[]{"3", "1", "2"};
        LinearSearchStrategy strategy = new LinearSearchStrategy();
        assertFalse(ArraySearchGof.contains(unsorted, "4", strategy));
        assertTrue(ArraySearchGof.contains(unsorted, "1", strategy));
    }

    @Test
    public void containsBinarySearch() {
        String[] sorted = new String[]{"1", "2", "3"};
        BinarySearchStrategy strategy = new BinarySearchStrategy();
        assertFalse(ArraySearchGof.contains(sorted, "4", strategy));
        assertTrue(ArraySearchGof.contains(sorted, "1", strategy));

    }
}
