package com.self.alg;

/**
 * @author shaojieyue
 * Created at 2020-07-13 16:08
 */

public class RepeatElement {
    public static void listRepeat(int[] array) {
        if (array == null || array.length < 2) {
            return;
        }
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int val = array[index];
            if (val == index) {
                index ++;
                continue;
            }
            if (array[val] == val) {
                System.out.println("重复元素："+val);
                break;
            }
            array[index] = array[val];
            array[val] = val;
        }
    }
}
