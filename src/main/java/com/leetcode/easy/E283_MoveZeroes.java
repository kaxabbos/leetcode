package main.java.com.leetcode.easy;

import java.util.Arrays;

public class E283_MoveZeroes {
    static public void moveZeroes(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return;

        int zero = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zero++;
            } else {
                nums[index] = nums[i];
                index++;
            }
        }

        for (int i = nums.length - 1; i >= nums.length - zero; i--) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] ints = new int[]{0, 1, 0, 3, 12};
        System.out.println(Arrays.toString(ints));
        moveZeroes(ints);
        System.out.println(Arrays.toString(ints));
        ints = new int[]{0};
        System.out.println(Arrays.toString(ints));
        moveZeroes(ints);
        System.out.println(Arrays.toString(ints));
        ints = new int[]{0, 0, 1};
        System.out.println(Arrays.toString(ints));
        moveZeroes(ints);
        System.out.println(Arrays.toString(ints));
        ints = new int[]{0, 0};
        System.out.println(Arrays.toString(ints));
        moveZeroes(ints);
        System.out.println(Arrays.toString(ints));
        ints = new int[]{1, 0};
        System.out.println(Arrays.toString(ints));
        moveZeroes(ints);
        System.out.println(Arrays.toString(ints));
        ints = new int[]{1, 0, 0};
        System.out.println(Arrays.toString(ints));
        moveZeroes(ints);
        System.out.println(Arrays.toString(ints));
    }
}
