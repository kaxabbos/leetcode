package main.java.com.leetcode.easy;

public class E35_SearchInsertPosition {
    static public int searchInsert(int[] nums, int target) {
        if (nums[nums.length - 1] < target) return nums.length;
        if (nums[nums.length - 1] == target) return nums.length - 1;
        if (nums.length == 1) return 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
            if (nums[i] >= target) {
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 5));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 7));
        System.out.println(searchInsert(new int[]{1}, 2));
        System.out.println(searchInsert(new int[]{1}, 1));
    }
}
