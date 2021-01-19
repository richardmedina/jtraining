package test.jtraining.search;

import jtraining.common.search.SearchDelegate;
import jtraining.impl.search.BinarySearch;
import jtraining.impl.search.SequentialSearch;
import org.junit.Assert;
import org.junit.Test;

public class SearchTests {

    private int[] createSizedArray(int size){
        int[] array = new int[size];
        for(int i = 0; i < size; i ++){
            array[i] = i;
        }
        return array;
    }

    @Test
    public void SequentialSearchTest () {
        // Arrange
        int value = 999_999;
        int[] array = createSizedArray(1_000_000);
        int expected = value;
        SearchDelegate searchDelegate = new SequentialSearch();
        // Act
        int actual = searchDelegate.search(value, array);
        // Assert
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void BinarySearch(){
        int value = 999_999;
        int[] array = createSizedArray(1_000_000);
        int expected = value;
        SearchDelegate searchDelegate = new BinarySearch();
        // Act
        int actual = searchDelegate.search(value, array);
        // Assert
        Assert.assertEquals(expected, actual);
    }
}
