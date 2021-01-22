package jtraining.impl.customproblems;

import jtraining.common.customproblems.CustomProblem;

public class FindPeakElementProblem implements CustomProblem<Integer> {

    @Override
    public Integer run() {
        var nums = new int[]{1,2,1,3,5,6,4};
        return findPeakElement(nums);
    }

    public int findPeakElement(int[] nums) {
        int peakIndex = 0;
        boolean atLeastTwo = false;

        if(nums.length == 1) return 0;

        for(int i=1; i < nums.length; i ++){
            if(nums[i] > nums[i -1]){
                peakIndex = i;
                atLeastTwo = true;
            }
            else {
                if(atLeastTwo) return peakIndex;
            }
        }
        return atLeastTwo ? peakIndex : 0;
    }
}
