package com.self.alg;

import com.self.alg.median.QuickSortMedian;

/**
 * @author shaojieyue
 * Created at 2020-07-15 15:46
 */

public class QuickSortMedianTest {
    public static void main(String[] args) {
        int[] array = {2, 23,2,3,55,21,0,33, 4, 61, 4, 6};
        final int median = new QuickSortMedian().median(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("中位数:"+median);
    }
}
