package main.java.com.leetcode.medium;

import java.util.Arrays;

public class M189_RotateArray {
    static public void rotate(int[] nums, int k) {
        if (k > nums.length) k = k % nums.length;
        int[] temp = new int[nums.length];
        System.arraycopy(nums, 0, temp, 0, nums.length);
        System.arraycopy(nums, nums.length - k, temp, 0, k);
        System.arraycopy(nums, 0, temp, k, nums.length - k);
        System.arraycopy(temp, 0, nums, 0, nums.length);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(nums));
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
        nums = new int[]{-1, -100, 3, 99};
        System.out.println(Arrays.toString(nums));
        rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
        nums = new int[]{1,2};
        System.out.println(Arrays.toString(nums));
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }
}
