package main.java.com.leetcode.easy;

public class E643_MaximumAverageSubarrayI {
    static public double findMaxAverage(int[] nums, int k) {
        if (nums.length == 0) return 0;
        double res = 0;

        for (int i = 0; i < nums.length - k + 1; i++) {
            int temp = 0;
            for (int j = i; j < k + i; j++) {
                temp += nums[j];
            }
            if (i == 0) res = (double) temp / k;
            else if (res < (double) temp / k) {
                res = (double) temp / k;

            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4));
        System.out.println(findMaxAverage(new int[]{0, 1, 1, 3, 3}, 4));
        System.out.println(findMaxAverage(new int[]{5}, 1));
    }
}
