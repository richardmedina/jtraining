package test.jtraining.sort;

import jtraining.impl.sort.QuickSort;
import org.junit.Test;

public class SortTests {

    @Test
    public void QuickSortTest (){
        var array = new int[] {3, 2, 1, 60, 6, 100, 5};
        var sortDelegate = new QuickSort();

        var sortedArray = sortDelegate.Sort(array);

        System.out.println("Sorted");
    }
}
