package com.self.alg.sort;

/**
 * @author shaojieyue
 * Created at 2020-07-15 15:01
 */

public class QuickSort implements ArraySort {
    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length);
    }

    private void quickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        final int pivot = pivot(array, start, end);
        quickSort(array,start,pivot);
        quickSort(array,pivot+1,end);
    }

    private int pivot(int[] array,int start,int end) {
        int pivot = start;
        for (int i = start+1; i < end; i++) {
            if (array[pivot] > array[i]) {
                for (int j = i; j > pivot; j--) {
                    swap(array,j,j-1);
                }
                pivot ++;

            }
        }
        return pivot;
    }

}
