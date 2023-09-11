package main.java.com.leetcode.easy;

public class E70_Climbing_Stairs {
    static public int climbStairs(int n) {
        int pre = 1;
        int curr = 1;
        int temp;

        for (int i = 1; i < n; i++) {
            temp = curr;
            curr = curr + pre;
            pre = temp;
        }

        return curr;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
    }
}
