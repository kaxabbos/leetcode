package main.java.com.leetcode.easy;

public class E136_SingleNumber {
    static public int singleNumber(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int[][] ints = new int[nums.length][2];

        int temp = 0;

        for (int num : nums) {
            boolean flag = true;
            for (int j = 0; j < temp; j++) {
                if (ints[j][0] == num) {
                    ints[j][1] += 1;
                    flag = false;
                    break;
                }
            }
            if (flag) {
                ints[temp][0] = num;
                ints[temp][1] = 1;
                temp++;
            }
        }

        int res = 0;
        for (int i = 0; i < temp; i++) {
            if (ints[i][1] == 1) {
                res = ints[i][0];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(singleNumber(new int[]{2, 2, 1}));
        System.out.println(singleNumber(new int[]{4, 1, 2, 1, 2}));
        System.out.println(singleNumber(new int[]{1}));
    }
}
