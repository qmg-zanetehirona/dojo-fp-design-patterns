package strategy.search.gof;

import strategy.Index;
import strategy.search.SearchStrategy;

public class LinearSearchStrategy implements SearchStrategy {
    @Override
    public Index search(String[] in, String element) {
        for (int i = 0; i < in.length; i++) {
            if (in[i].equals(element)) {
                return new Index(i);
            }
        }
        return new Index(-1);
    }
}
