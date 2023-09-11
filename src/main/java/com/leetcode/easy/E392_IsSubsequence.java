package main.java.com.leetcode.easy;

public class E392_IsSubsequence {
    static public boolean isSubsequence(String s, String t) {
        if (s.equals("")) return true;
        if (t.equals("")) return false;
        int index = 0;

        for (int i = 0; i < t.length(); i++) {
            if (index == s.length()) return true;
            if (s.substring(index, index + 1).equals(t.substring(i, i + 1))) {
                index++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("abc", "ahbgdc"));
        System.out.println(isSubsequence("axc", "ahbgdc"));
        System.out.println(isSubsequence("acb", "ahbgdc"));
    }
}
