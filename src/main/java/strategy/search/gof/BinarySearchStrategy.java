package strategy.search.gof;

import strategy.Index;
import strategy.search.SearchStrategy;

import java.util.Arrays;

public class BinarySearchStrategy implements SearchStrategy {
    @Override
    public Index search(String[] in, String element) {
        return new Index(Arrays.binarySearch(in, element));
    }
}
