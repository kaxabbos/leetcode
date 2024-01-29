package main.java.com.leetcode.easy;

import java.util.Arrays;

public class E88_MergeSortedArray {
    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1.length != m + n || nums2.length != n || m < 0 || n > 200 || n == 0) return;

        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, nums1.length);
        } else {
            System.arraycopy(nums2, 0, nums1, m, nums1.length - m);
        }

        if (n + m == 1) return;
        boolean flag = true;
        while (flag) {
            for (int i = 0; i < nums1.length - 1; i++) {
                if (nums1[i] > nums1[i + 1]) {
                    int temp = nums1[i];
                    nums1[i] = nums1[i + 1];
                    nums1[i + 1] = temp;
                }
            }

            for (int i = 0; i < nums1.length - 1; i++) {
                if (nums1[i] <= nums1[i + 1]) {
                    flag = false;
                } else {
                    flag = true;
                    break;
                }
            }
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

        test = new int[]{0};
        System.out.println(Arrays.toString(test));
        merge(test, 0, new int[]{1}, 1);
        System.out.println(Arrays.toString(test));

        test = new int[]{4, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(test));
        merge(test, 1, new int[]{1, 2, 3, 5, 6}, 5);
        System.out.println(Arrays.toString(test));
    }
}
