package jtraining.impl.customproblems;

import jtraining.common.customproblems.CustomProblem;

public class InsertToSortedArray implements CustomProblem<Boolean> {

    @Override
    public Boolean run() {
        int[] array = {1, 4, 11, 30, 50};

        array = insertToSortedArray(100, array);
        array = insertToSortedArray(0, array);
        array = insertToSortedArray(20, array);

        System.out.println("Array: " + array);

        return true;
    }


    int[] insertToSortedArray(int value, int[] array){
        int i = 0;
        var nArray = new int[array.length + 1];
        while(i < array.length && value > array[i]) {
            nArray[i] = array[i];
            i ++;
        }

        nArray[i++] = value;

        while((i-1) < array.length){
            nArray[i] = array[i - 1];
            i++;
        }

        return nArray;
    }
}
