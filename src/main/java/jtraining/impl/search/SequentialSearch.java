package jtraining.impl.search;

import jtraining.common.search.SearchDelegate;

public class SequentialSearch implements SearchDelegate {

    public int search(int value, int[] array) {
        if(array == null || array.length == 0)
            return 0;

        for(int i = 0; i < array.length; i ++)
            if(array[i] == value) return i;
        return -1;
    }
}
