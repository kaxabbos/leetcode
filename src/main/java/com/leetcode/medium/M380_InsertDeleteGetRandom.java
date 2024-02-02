package main.java.com.leetcode.medium;

import java.util.Random;

public class M380_InsertDeleteGetRandom {
    static class RandomizedSet {

        int[] nums;

        public RandomizedSet() {
            nums = new int[0];
        }

        public boolean insert(int val) {
            for (int i : nums) {
                if (i == val) return false;
            }
            if (nums.length == 0) {
                nums = new int[]{val};
            } else {
                int[] temp = new int[nums.length];
                System.arraycopy(nums, 0, temp, 0, nums.length);
                nums = new int[nums.length + 1];
                System.arraycopy(temp, 0, nums, 0, temp.length);
                nums[nums.length - 1] = val;
            }
            return true;
        }

        public boolean remove(int val) {
            int index = -1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == val) {
                    index = i;
                    break;
                }
            }
            if (index == -1) return false;

            if (nums.length == 1) {
                nums = new int[0];
            } else {
                int[] temp = new int[nums.length - 1];
                int j = 0;
                for (int i = 0; i < nums.length; i++) {
                    if (i != index) {
                        temp[j] = nums[i];
                        j++;
                    }
                }
                nums = new int[temp.length];
                System.arraycopy(temp, 0, nums, 0, temp.length);
            }

            return true;
        }

        public int getRandom() {
            int size = nums.length;
            int item = new Random().nextInt(size);
            int i = 0;
            for (int num : nums) {
                if (i == item) {
                    return num;
                }
                i++;
            }
            return size;
        }
    }

    public static void main(String[] args) {
        RandomizedSet randomizedSet = new RandomizedSet();
        randomizedSet.insert(1);
        randomizedSet.remove(2);
        randomizedSet.insert(2);
        randomizedSet.getRandom();
        randomizedSet.remove(1);
        randomizedSet.insert(2);
        randomizedSet.getRandom();
    }
}
