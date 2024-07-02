package strategy.search;

import strategy.Index;

@FunctionalInterface
public interface SearchStrategy {
    Index search(String[] in, String element);
}
