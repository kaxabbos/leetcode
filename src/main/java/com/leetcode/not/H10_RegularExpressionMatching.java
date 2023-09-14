package main.java.com.leetcode.not;

public class H10_RegularExpressionMatching {
    static public boolean isMatch(String s, String p) {
        return !s.replace(p, "").isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isMatch("aa", "a"));
        System.out.println(isMatch("aa", "a*"));
        System.out.println(isMatch("ab", ".*"));
    }
}
