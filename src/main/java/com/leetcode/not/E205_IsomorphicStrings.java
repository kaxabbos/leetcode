package main.java.com.leetcode.not;

public class E205_IsomorphicStrings {
    static public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                if (t.charAt(i) == t.charAt(i + 1)) {
                    return false;
                }
            }
            if (s.charAt(i) == s.charAt(i + 1)) {
                if (t.charAt(i) != t.charAt(i + 1)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
        System.out.println(isIsomorphic("foo", "bar"));
        System.out.println(isIsomorphic("paper", "title"));
        System.out.println(isIsomorphic("badc", "baba"));
    }
}
