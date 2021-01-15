package jtraining.test.search;

import jtraining.common.search.SearchDelegate;
import jtraining.impl.search.SequentialSearch;
import org.junit.Assert;
import org.junit.Test;

public class SearchTests {
    @Test
    public void SequentialSearchTest () {
        // Arrange
        int value = 10;
        int[] array = new int[]{ 1, 2, 3, 4, 5, 6, 10, 20,30};
        int expected = 6;
        SearchDelegate searchDelegate = new SequentialSearch();
        // Act
        int actual = searchDelegate.search(value, array);
        //Asserts
        Assert.assertEquals(expected, actual);
    }
}
