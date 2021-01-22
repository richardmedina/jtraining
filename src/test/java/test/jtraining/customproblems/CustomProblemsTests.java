package test.jtraining.customproblems;

import jtraining.impl.customproblems.MedianOfTwoSortedArraysProblem;
import org.junit.Test;

public class CustomProblemsTests {

    @Test
    public void MedianOfTwoSortedArraysTest(){
        var customproblem = new MedianOfTwoSortedArraysProblem();
        var result = customproblem.run();
        System.out.println("Done");
    }
}
