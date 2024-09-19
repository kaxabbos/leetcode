package main.java.com.leetcode.TimeLimitExceeded;

public class M1679_MaxNumberOfK_SumPairs {
    static public int maxOperations(int[] nums, int k) {
        if (k == 0 || nums.length == 1) return 0;
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == 0) continue;
                if (nums[i] + nums[j] == k) {
                    res++;
                    nums[i] = 0;
                    nums[j] = 0;
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
//        System.out.println(maxOperations(new int[]{1, 2, 3, 4}, 5));
//        System.out.println(maxOperations(new int[]{3, 1, 3, 4, 3}, 6));
        System.out.println(maxOperations(new int[]{4, 4, 1, 3, 1, 3, 2, 2, 5, 5, 1, 5, 2, 1, 2, 3, 5, 4}, 2));
    }
}
