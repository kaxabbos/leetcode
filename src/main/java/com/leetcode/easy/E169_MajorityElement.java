package main.java.com.leetcode.easy;

import java.util.HashMap;

public class E169_MajorityElement {
    static public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i : nums) {
            if (hashMap.containsKey(i)) {
                hashMap.replace(i, hashMap.get(i) + 1);
            } else {
                hashMap.put(i, 1);
            }
        }

        for (int i : hashMap.keySet()) {
            int temp = hashMap.get(i);
            if (temp > nums.length / 2) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3, 2, 3}));
        System.out.println(majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
