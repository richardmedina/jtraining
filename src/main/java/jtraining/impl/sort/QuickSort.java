package jtraining.impl.sort;

import jtraining.common.sort.SortDelegate;

import java.util.Arrays;

public class QuickSort extends SortDelegate {
    @Override
    public int[] Sort(int[] array) {
        if (array == null || array.length < 1) return array;

        /*
        var arr = new int[array.length];
        for(int i = 0; i < array.length; i++)
            arr[i] = array[i];
        */
        var arr = array.clone();

        quickSort(arr, 0, arr.length -1);

        return arr;
    }

    private void quickSort(int[] array, int first, int last){
        int i = first;
        int j = last;
        int pivot = array[(first + last) / 2];
        int aux = 0;
        System.out.println("Pivot = " + pivot);
        do {
            while(array[i] < pivot) i ++;
            while(array[j] > pivot) j --;

            // interchange
            if(i <= j) {
                if(i != j) {
                    showArrayOperation(array, i, j, pivot);
                    aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
                i ++;
                j --;
            }

        } while(i <= j);

        if(first < j) quickSort(array, first, j);
        if(last > i) quickSort(array, i, last);

        showArray(array);
    }

}
