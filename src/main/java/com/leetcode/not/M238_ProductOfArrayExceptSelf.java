package main.java.com.leetcode.not;

import java.util.Arrays;

public class M238_ProductOfArrayExceptSelf {
    static public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];

        res[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        int temp = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            res[i] = res[i] * temp;
            temp *= nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(productExceptSelf(new int[]{-1, 1, 0, -3, 3})));

    }
}
