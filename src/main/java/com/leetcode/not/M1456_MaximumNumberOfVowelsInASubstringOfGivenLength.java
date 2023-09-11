package main.java.com.leetcode.not;

public class M1456_MaximumNumberOfVowelsInASubstringOfGivenLength {
    static public int maxVowels(String s, int k) {
        if (1 > k || k > s.length()) return 0;

        int res = 0;

        for (int i = 0; i < s.length() - k; i++) {

        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiiif", 3));
        System.out.println(maxVowels("aeiou", 2));
        System.out.println(maxVowels("leetcode", 3));
    }
}
