package com.self.alg;

import com.self.alg.sort.BubbleSort;
import com.self.alg.sort.InsertSort;
import com.self.alg.sort.QuickSort;

/**
 * @author shaojieyue
 * Created at 2020-07-13 16:59
 */

public class ArraySortTest {
    public static void main(String[] args) {
        int[] array = {2, 23,2,3,55,21,0,33, 4, 61, 4, 6};
//        bubbleTest(array);
//        insertSortTest(array);
        quickSortTest(array);
    }

    public static void insertSortTest(int[] array) {
        new InsertSort().sort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void bubbleTest(int[] array) {
        new BubbleSort().sort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    public static void quickSortTest(int[] array) {
        new QuickSort().sort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }


}
