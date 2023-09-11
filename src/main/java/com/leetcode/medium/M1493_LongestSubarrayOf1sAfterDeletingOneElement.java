package main.java.com.leetcode.medium;

public class M1493_LongestSubarrayOf1sAfterDeletingOneElement {

    static public int longestSubarray(int[] nums) {
        if (nums.length == 1) return 0;
        if (nums.length == 0) return 0;
        boolean flag = true;
        for (int i : nums) {
            if (i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            return nums.length - 1;
        }

        int index = 0;
        int size = 0;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) temp++;
            if (nums[i] == 0) {
                if (temp > size) {
                    size = temp;
                    index = i - temp;
                }
                temp = 0;
            }
            if (i == nums.length - 1) {
                if (temp > size) {
                    size = temp;
                    index = i - temp;
                }
            }
        }
        int res = 0;
        int one = 1;
        for (int i = index; i < nums.length; i++) {
            if (nums[i] == 0) {
                if (one == 1) {
                    one--;
                } else {
                    break;
                }
            }
            if (nums[i] == 1) res++;
        }

        return res;
    }

    public static void main(String[] args) {
//        System.out.println(longestSubarray(new int[]{1, 1, 0, 1}));
//        System.out.println(longestSubarray(new int[]{0, 1, 1, 1, 0, 1, 1, 0, 1}));
//        System.out.println(longestSubarray(new int[]{1, 1, 1}));
//        System.out.println(longestSubarray(new int[]{0, 0, 1, 1}));
        System.out.println(longestSubarray(new int[]{1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1}));
    }
}
