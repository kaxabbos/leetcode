package main.java.com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class E118_PascalsTriangle {
    static public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> gen = new ArrayList<>();
            gen.add(1);
            if (i != 0) {
                List<Integer> temp = res.get(i - 1);
                for (int j = 1; j < res.size(); j++) {
                    gen.add(temp.get(j - 1) + temp.get(j));
                }
                gen.add(1);
            }
            res.add(gen);
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(generate(1));
        System.out.println(generate(2));
        System.out.println(generate(3));
        System.out.println(generate(4));
        System.out.println(generate(5));
    }
}
