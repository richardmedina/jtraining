package jtraining.impl.customproblems;

import jtraining.common.customproblems.CustomProblem;

/**
 * Returns median of the two elements in the middle of two sorted arrays
 */
public class MedianOfTwoSortedArraysProblem implements CustomProblem<Double> {

    void printArray(int[] array){
        System.out.print("[");

        for(var item : array){
            System.out.print(item + ",");
        }

        System.out.println("]");
    }

    @Override
    public Double run() {
        var nums1 = new int[]{1, 3};
        var nums2 = new int[]{2};

        var sortedArray = new int[nums1.length + nums2.length];
        var sortedArrayIndex = 0;

        var maxIndex = (nums1.length > nums2.length) ? nums1.length : nums2.length;

        var i1 =0;
        var i2 =0;

        while (i1 < nums1.length || i2 < nums2.length){
            boolean num1Exists = i1 < nums1.length;
            boolean num2Exists = i2 < nums2.length;

            if(!num1Exists) {
                sortedArray[sortedArrayIndex ++] = nums2[i2++];
                continue;
            }
            if(!num2Exists) {
                sortedArray[sortedArrayIndex ++] = nums1[i1++];
                continue;
            }

            if(nums1[i1] > nums2[i2]){
                sortedArray[sortedArrayIndex ++] = nums2[i2 ++];
            } else {
                sortedArray[sortedArrayIndex ++] = nums1[i1 ++];
            }
        }

        printArray(sortedArray);

        if (sortedArray.length % 2 == 0) {
            var firstMiddle = sortedArray[(sortedArray.length / 2) - 1];
            var secondMiddle = sortedArray[((sortedArray.length) / 2)];
            return Double.valueOf(((double)firstMiddle + (double)secondMiddle) / 2);
        }
        var middle = (sortedArray.length / 2);
        return Double.valueOf(sortedArray[(int)middle]);
    }
}
