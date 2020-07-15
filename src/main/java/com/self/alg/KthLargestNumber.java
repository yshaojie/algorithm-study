package com.self.alg;

/**
 * 基于快排
 * 求第K个大的数字
 * @author shaojieyue
 * Created at 2020-07-15 16:50
 */

public class KthLargestNumber {

    public int kthNumber(int[] array,int kth) {
        final int pivot = kthNumber(array, 0, array.length,kth);
        return array[pivot];
    }

    private int kthNumber(int[] array, int start, int end,int kth) {
        final int pivot = pivot(array, start, end);
        int medianIndex;
        if (pivot == kth) {
            medianIndex = pivot;
        }
        //kth在左边
        else if (pivot > kth) {
            medianIndex = kthNumber(array, start, pivot,kth);
        }
        //kth在右边
        else {
            medianIndex = kthNumber(array, pivot+1, end,kth);
        }
        return medianIndex;
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

    private void swap(int[] array, int i, int j) {
        int tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }
}
