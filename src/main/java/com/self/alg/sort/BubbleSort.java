package com.self.alg.sort;

/**
 * @author shaojieyue
 * Created at 2020-07-15 14:58
 */
public class BubbleSort implements ArraySort {
    /**
     * 冒泡排序
     * @param array
     */
    @Override
    public void sort(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }
}
