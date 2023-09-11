package main.java.com.leetcode.not;

public class M3_LongestSubstringWithoutRepeatingCharacters {
    static public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        char[] temp = s.toCharArray();
        String res = "";
        StringBuilder builder = new StringBuilder();


        for (int i = 0; i < temp.length; i++) {
            boolean flag = true;
            for (char j : builder.toString().toCharArray()) {
                if (temp[i] == j) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                builder.append(temp[i]);
            } else {
                if (res.length() < builder.length()) {
                    res = builder.toString();
                    builder = new StringBuilder();
                    builder.append(temp[i]);
                }
            }
            if (i == temp.length - 1) {
                if (res.length() < builder.length()) {
                    res = builder.toString();
                    builder = new StringBuilder();
                }
            }
        }

        return res.length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring("aab"));
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
}
