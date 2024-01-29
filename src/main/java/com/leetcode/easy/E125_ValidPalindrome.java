package main.java.com.leetcode.easy;

public class E125_ValidPalindrome {
    static public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");
        System.out.println(s);
        return s.contentEquals(new StringBuilder(s).reverse());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("0P"));
    }
}
