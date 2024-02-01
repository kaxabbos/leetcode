package main.java.com.leetcode.medium;

import java.util.SortedMap;
import java.util.TreeMap;

public class M80_RemoveDuplicatesFromSortedArrayII {
    static public int removeDuplicates(int[] nums) {
        SortedMap<Integer, Integer> sortedMap = new TreeMap<>();

        for (int i : nums) {
            if (sortedMap.containsKey(i)) {
                sortedMap.replace(i, 2);
            } else {
                sortedMap.put(i, 1);
            }
        }

        int index = 0;
        int res = 0;
        for (int i : sortedMap.keySet()) {
            if (sortedMap.get(i) == 2) {
                nums[index] = i;
                index++;
                nums[index] = i;
                index++;
                res += 2;
            } else {
                nums[index] = i;
                index++;
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{1, 1, 1, 2, 2, 3}));
        System.out.println(removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3}));
    }
}
