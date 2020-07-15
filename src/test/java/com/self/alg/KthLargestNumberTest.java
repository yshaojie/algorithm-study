package com.self.alg;

/**
 * @author shaojieyue
 * Created at 2020-07-15 16:53
 */

public class KthLargestNumberTest {
    public static void main(String[] args) {
        int[] array = {2, 23,2,3,55,21,0,33, 4, 61, 4, 6};
        final int kthNumber = new KthLargestNumber().kthNumber(array, array.length/2);
        System.out.println(kthNumber);
    }
}
