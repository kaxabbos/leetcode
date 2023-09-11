package main.java.com.leetcode.not;

import java.util.Arrays;

public class E338_CountingBits {
    static public int[] countBits(int n) {
        String[] strings = Integer.toString(n, 2).split("");
        System.out.println(Arrays.toString(strings));
        return new int[]{1};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(2)));
        System.out.println(Arrays.toString(countBits(5)));
    }
}
