package main.java.com.leetcode.not;

import java.util.Arrays;

public class E88_MergeSortedArray {
    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length != m + n || nums2.length != n || m < 0 || n > 200 || n == 0) return;

        int index = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (i == 0) {
                if (nums2[index] <= nums1[i]) {
                    for (int j = i + n - index - 1; j > i; j--) {
                        nums1[j] = nums1[j - 1];
                    }
                    nums1[i] = nums2[index];
                    index++;
                }
            } else if (i == nums1.length - 1) {
                if (nums2[index] >= nums1[i]) {
                    for (int j = i + n - index - 1; j > i; j--) {
                        nums1[j] = nums1[j - 1];
                    }
                    nums1[i] = nums2[index];
                    index++;
                }
            } else {
                if (nums1[i] < nums2[index]) {
                    for (int j = i + n - index - 1; j > i; j--) {
                        nums1[j] = nums1[j - 1];
                    }
                    nums1[i] = nums2[index];
                    index++;
                }
            }
            if (index == n) return;
        }

    }

    public static void main(String[] args) {
        int[] test = new int[]{1, 2, 3, 0, 0, 0};
        System.out.println(Arrays.toString(test));
        merge(test, 3, new int[]{2, 5, 6}, 3);
        System.out.println(Arrays.toString(test));
        test = new int[]{1};
        System.out.println(Arrays.toString(test));
        merge(test, 1, new int[]{}, 0);
        System.out.println(Arrays.toString(test));
    }
}
