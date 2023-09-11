package main.java.com.leetcode.medium;

public class M151_ReverseWordsInAString {
    static public String reverseWords(String s) {
        String[] strings = s.split(" ");

        StringBuilder res = new StringBuilder();

        for (int i = strings.length - 1; i >= 0; i--) {
            if (!strings[i].equals("")) {
                res.append(strings[i]);
                res.append(" ");
            }
        }

        res.deleteCharAt(res.length() - 1);

        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("  hello world  "));
        System.out.println(reverseWords("a good   example"));
    }
}
