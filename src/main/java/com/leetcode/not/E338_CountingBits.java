package main.java.com.leetcode.not;

import java.util.Arrays;

public class E338_CountingBits {
    static public int[] countBits(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i <= n; i++) {
            System.out.println(Integer.toString(i, 2));
            builder.insert(i, Arrays.stream(Integer.toString(i, 2).split("")).reduce(0, (integer, s) -> {
                if (s.equals("1")) return integer + 1;
                return integer;
            }, Integer::sum));
        }
        int[] res = new int[builder.length()];
        for (int i = 0; i < res.length; i++) {
            res[i] = builder.charAt(i) - 48;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(2)));
        System.out.println(Arrays.toString(countBits(5)));
    }
}
