package test.jtraining.customproblems;

import jtraining.impl.customproblems.FindPeakElementProblem;
import jtraining.impl.customproblems.LongestPalindromeProblem;
import jtraining.impl.customproblems.MedianOfTwoSortedArraysProblem;
import org.junit.Test;

import java.util.HashSet;

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
    @Test
    public void LongestPalindromeTest(){
        var customProblem = new LongestPalindromeProblem();
        var result = customProblem.run();

        System.out.println("Done");
    }

    @Test
    public void SingleTest(){
        var text = "pwwkew";
        var result = lengthOfLongestSubstring(text);

        System.out.println("Result: " + result);
    }

    public int lengthOfLongestSubstring(String s) {
        if(s == null || s == "") return 0;
        if(s.length() == 1) return 1;

        HashSet<Character> hashSet = new HashSet<>();

        int longestCount = 0;
        //int currentCount = 0;
        int i = 0;

        while(i < s.length()){
            int currentCount = 1;
            hashSet.clear();
            var pivotChar = s.charAt(i);
            hashSet.add(pivotChar);
            int j = i + 1;
            while (j < s.length()){
                var cChar = s.charAt(j);
                currentCount ++;

                if(hashSet.contains(cChar)){
                    longestCount = longestCount < currentCount -1
                            ? currentCount -1
                            : longestCount;
                    break;
                }

                hashSet.add(cChar);

                j++;
            }

            longestCount = longestCount < currentCount -1
                    ? currentCount -1
                    : longestCount;

            i++;
        }

        return longestCount;
    }
}
