package com.self.alg.sort;

/**
 * @author shaojieyue
 * Created at 2020-07-15 14:59
 */

public class InsertSort implements ArraySort {
    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j-1]) {
                    swap(array, i, j);
                }
            }
        }
    }
}
