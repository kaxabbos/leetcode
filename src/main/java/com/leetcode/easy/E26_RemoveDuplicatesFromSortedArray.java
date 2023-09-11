package main.java.com.leetcode.easy;

import java.util.HashSet;

public class E26_RemoveDuplicatesFromSortedArray {
    static public int removeDuplicates(int[] nums) {
        HashSet<Integer> integers = new HashSet<>();
        for (int num : nums) integers.add(num);
        int index = integers.size();

        return index;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }
}
