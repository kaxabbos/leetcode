package main.java.com.leetcode.medium;

import java.util.ArrayList;

public class M334_IncreasingTripletSubsequence {
    static public boolean increasingTriplet(int[] nums) {
        if (nums.length == 0 || nums.length == 1 || nums.length == 2) return false;

        ArrayList<Integer> diffNum = new ArrayList<>();

        boolean flag = true;

        for (int num : nums) {
            if (!diffNum.contains(num)) {
                diffNum.add(num);
            }
            if (diffNum.size() > 2) {
                flag = false;
                break;
            }
        }

        if (flag) {
            return false;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[j] < nums[k]) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
//        System.out.println(increasingTriplet(new int[]{1, 2, 3, 4, 5}));
//        System.out.println(increasingTriplet(new int[]{5, 4, 3, 2, 1}));
//        System.out.println(increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
        System.out.println(increasingTriplet(new int[]{1, 2, 1, 3}));
    }
}
