package main.java.com.leetcode.not;

import java.util.Arrays;

public class M739_DailyTemperatures {
    static public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        res[res.length - 1] = 0;
        for (int i = 0; i < res.length - 1; i++) {
            int j = i + 1;
            for (; j < res.length; j++) {
                if (temperatures[i] < temperatures[j]) break;
            }
            if (j != res.length) res[i] = j - i;
            else res[i] = 0;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{30, 40, 50, 60})));
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{30, 60, 90})));
    }
}
