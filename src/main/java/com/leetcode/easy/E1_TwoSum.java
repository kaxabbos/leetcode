package main.java.com.leetcode.easy;


import java.util.Arrays;

public class E1_TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int index1 = 0;
        int index2 = 0;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            int a = nums[i];
            int j = 0;
            for (; j < nums.length; j++) {
                if (i == j) continue;
                if (a + nums[j] == target) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                index1 = i;
                index2 = j;
                break;
            }
        }

        return new int[]{index1, index2};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
    }
}
