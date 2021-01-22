package test.jtraining.customproblems;

import jtraining.impl.customproblems.FindPeakElementProblem;
import jtraining.impl.customproblems.MedianOfTwoSortedArraysProblem;
import org.junit.Test;

/**
 * Returns index of the peak element in given array
 */
public class CustomProblemsTests {

    @Test
    public void MedianOfTwoSortedArraysTest(){
        var customproblem = new MedianOfTwoSortedArraysProblem();
        var result = customproblem.run();
        System.out.println("Done");
    }

    @Test
    public void FindPeakElementProblemTest(){
        var customProblem = new FindPeakElementProblem();
        var result = customProblem.run();

        System.out.println("Done");
    }
}
