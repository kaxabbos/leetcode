package main.java.com.leetcode.easy;

public class E1071_GreatestCommonDivisorOfStrings {
    static public String gcdOfStrings(String str1, String str2) {
        int l1 = str1.length();
        int l2 = str2.length();

        if (l1 < l2) return gcdOfStrings(str2, str1);

        if (l2 == 0) return str1;

        if (!str1.startsWith(str2)) return "";

        return gcdOfStrings(str1.substring(l2), str2);
    }

    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
        System.out.println(gcdOfStrings("ABABAB", "ABAB"));
        System.out.println(gcdOfStrings("LEET", "CODE"));
    }
}
