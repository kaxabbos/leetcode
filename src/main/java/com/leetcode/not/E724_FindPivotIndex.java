package main.java.com.leetcode.not;

public class E724_FindPivotIndex {
    static public int pivotIndex(int[] nums) {
        int total = 0;
        for(int i : nums) total += i;
        int left = 0;
        for (int i = 0; i < nums.length; i++) {
            int right = total - left - nums[i];

            if (left == right) return i;

            left += nums[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(pivotIndex(new int[]{1, 7, 3, 6, 5, 6}));
        System.out.println(pivotIndex(new int[]{1, 2, 3}));
        System.out.println(pivotIndex(new int[]{2, 1, -1}));
        System.out.println(pivotIndex(new int[]{-1, -1, 0, 1, 1, 0}));
    }
}
