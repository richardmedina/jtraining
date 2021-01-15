package jtraining.impl.search;

import jtraining.common.search.SearchDelegate;

public class BinarySearch implements SearchDelegate {

    @Override
    public int search(int value, int[] array) {
        if (array == null || array.length < 1) return -1;

        int low = 0;
        int high = array.length - 1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (value == array[mid])
                return mid;
            if(value < array[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }

        return -1;
    }
}
