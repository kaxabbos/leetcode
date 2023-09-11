package main.java.com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class E119_PascalsTriangleII {
    static public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            List<Integer> integers = new ArrayList<>();
            integers.add(1);
            return integers;
        }
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < rowIndex + 1; i++) {
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

        return res.get(rowIndex);
    }

    public static void main(String[] args) {
//        System.out.println(getRow(0));
        System.out.println(getRow(1));
        System.out.println(getRow(2));
        System.out.println(getRow(3));
        System.out.println(getRow(4));
        System.out.println(getRow(5));
    }
}
