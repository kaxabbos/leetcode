package main.java.com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class E2215_FindTheDifferenceOfTwoArrays {
    static public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> integers1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> temp = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> integers2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        integers1.removeAll(integers2);
        integers2.removeAll(temp);

        List<List<Integer>> lists = new ArrayList<>();

        lists.add(new ArrayList<>(integers1));
        lists.add(new ArrayList<>(integers2));

        return lists;
    }

    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6}));
        System.out.println(findDifference(new int[]{1, 2, 3, 3}, new int[]{1, 1, 2, 2}));
    }
}
