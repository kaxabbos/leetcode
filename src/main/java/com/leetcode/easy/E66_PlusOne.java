package main.java.com.leetcode.easy;

import java.util.Arrays;

public class E66_PlusOne {
    static public int[] plusOne(int[] digits) {
        int[] temp = new int[digits.length];

        boolean flag = true;
        for (int i = temp.length - 1; i >= 0; i--) {
            if (flag) {
                if (digits[i] == 9) {
                    temp[i] = 0;
                    if (i == 0) {
                        int[] temp1 = temp;
                        temp = new int[temp1.length + 1];
                        temp[0] = 1;
                        System.arraycopy(temp1, 0, temp, 1, temp1.length);
                    }
                } else {
                    temp[i] = digits[i] + 1;
                    flag = false;
                }
            } else {
                temp[i] = digits[i];
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(plusOne(new int[]{4, 3, 2, 1})));
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
        System.out.println(Arrays.toString(plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})));
    }
}
