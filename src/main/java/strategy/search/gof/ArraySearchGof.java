package strategy.search.gof;

import strategy.search.SearchStrategy;

public class ArraySearchGof {
    public static boolean contains(String[] array, String element, SearchStrategy strategy) {
        return strategy.search(array, element).isPositive();
    }
}
