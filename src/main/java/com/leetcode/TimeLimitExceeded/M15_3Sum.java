package main.java.com.leetcode.TimeLimitExceeded;

import java.util.*;

public class M15_3Sum {
    static public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) return new ArrayList<>();

        Set<List<Integer>> res = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        if (i != j && i != k && j != k) {
                            List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                            Collections.sort(temp);
                            res.add(temp);
                        }
                    }
                }
            }
        }

        return new ArrayList<>(res);
    }

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
        System.out.println(threeSum(new int[]{0, 1, 1}));
        System.out.println(threeSum(new int[]{0, 0, 0}));
    }
}
