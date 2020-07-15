package com.self.alg.median;

/**
 * @author shaojieyue
 * Created at 2020-07-15 15:36
 */

public interface Median {
    int median(int[] array);

    default void swap(int[] array, int i, int j) {
        int tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }
}
