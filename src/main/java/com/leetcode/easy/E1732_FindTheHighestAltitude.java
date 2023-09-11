package main.java.com.leetcode.easy;

public class E1732_FindTheHighestAltitude {
    static public int largestAltitude(int[] gain) {
        int res = 0;
        int temp = 0;

        for (int j : gain) {
            temp = temp + j;
            if (temp > res) {
                res = temp;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(largestAltitude(new int[]{-5, 1, 5, 0, -7}));
        System.out.println(largestAltitude(new int[]{-4, -3, -2, -1, 4, 3, 2}));
    }
}
