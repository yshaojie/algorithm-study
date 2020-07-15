package com.self.alg.sort;

/**
 * @author shaojieyue
 * Created at 2020-07-13 16:55
 */

public interface ArraySort {

    void sort(int[] array);

    default void swap(int[] array, int i, int j) {
        int tmp = array[j];
        array[j] = array[i];
        array[i] = tmp;
    }

    default void print(int[] array, int start, int end) {
        for (int i = start; i < end; i++) {
            System.out.print(array[i]+",");
        }
        System.out.println();
    }

}
