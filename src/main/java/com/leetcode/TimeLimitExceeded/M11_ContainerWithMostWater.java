package main.java.com.leetcode.TimeLimitExceeded;

public class M11_ContainerWithMostWater {
    static public int maxArea(int[] height) {
        if (height.length == 0 || height.length == 1) return 0;

        int max = 0;

        for (int i = 0; i < height.length; i++) {
            int temp;
            for (int j = i + 1; j < height.length; j++) {
                temp = (j - i) * Math.min(height[i], height[j]);
                if (temp > max) {
                    max = temp;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        System.out.println(maxArea(new int[]{1, 1}));
    }

}
