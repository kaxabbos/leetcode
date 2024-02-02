package main.java.com.leetcode.not;

public class M55_JumpGame {
    static public boolean canJump(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return true;

        int jump = nums[0];
        int jumpIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            if (jump == nums[i] + 1 || jump == nums[i] - 1) {
                jumpIndex = i;
                jump = nums[i];
            }
        }

        return jumpIndex == nums.length - 1;
    }

    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println(canJump(new int[]{3, 2, 1, 0, 4}));
    }
}
