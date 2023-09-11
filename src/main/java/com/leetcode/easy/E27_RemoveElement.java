package main.java.com.leetcode.easy;

public class E27_RemoveElement {
    static public int removeElement(int[] nums, int val) {
        int[] temp = new int[nums.length];
        int index = 0;
        for (int num : nums) {
            if (num != val) {
                temp[index] = num;
                index++;
            }
        }
        System.arraycopy(temp, 0, nums, 0, index);
        System.out.println();
        return index;
    }

    public static void main(String[] args) {
        System.out.println(removeElement(new int[]{3, 2, 2, 3}, 3));
        System.out.println(removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2));
    }
}
