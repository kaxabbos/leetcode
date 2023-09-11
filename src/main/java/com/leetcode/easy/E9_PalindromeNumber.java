package main.java.com.leetcode.easy;

public class E9_PalindromeNumber {
    static public boolean isPalindrome(int x) {
        StringBuilder res = new StringBuilder(String.valueOf(x));
        return res.toString().contentEquals(res.reverse());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }
}
