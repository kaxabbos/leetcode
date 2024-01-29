package main.java.com.leetcode.easy;

import java.util.SortedSet;
import java.util.TreeSet;

public class E26_RemoveDuplicatesFromSortedArray {
    static public int removeDuplicates(int[] nums) {
        SortedSet<Integer> integers = new TreeSet<>();
        for (int num : nums) integers.add(num);
        int index = 0;
        for (int i : integers) {
            nums[index] = i;
            index++;
        }
        return integers.size();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 2}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
        System.out.println(removeDuplicates(new int[]{-3, -1, 0, 0, 0, 3, 3}));
    }
}
