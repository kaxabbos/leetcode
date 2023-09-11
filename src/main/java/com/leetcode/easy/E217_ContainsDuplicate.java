package main.java.com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class E217_ContainsDuplicate {
    static public boolean containsDuplicate(int[] nums) {
        Set<Integer> integers = new HashSet<>();

        for (int i : nums) {
            if (integers.contains(i)) {
                return true;
            } else {
                integers.add(i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 1}));
        System.out.println(containsDuplicate(new int[]{1, 2, 3, 4}));
        System.out.println(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}
