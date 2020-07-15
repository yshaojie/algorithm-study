package com.self.alg.median;

import com.self.alg.KthLargestNumber;

/**
 *
 * 基于快排的思路查到中位数
 * @author shaojieyue
 * Created at 2020-07-15 15:37
 */

public class QuickSortMedian implements Median {
    private KthLargestNumber kthLargestNumber = new KthLargestNumber();
    @Override
    public int median(int[] array) {
        return kthLargestNumber.kthNumber(array, array.length / 2);
    }
}
