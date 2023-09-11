package main.java.com.leetcode.easy;

public class E345_ReverseVowelsOfAString {
    static public String reverseVowels(String s) {
        char[] chars = new char[]{'a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U'};
        char[] word = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char i : word) {
            for (char j : chars) {
                if (i == j) {
                    builder.append(i);
                    break;
                }
            }
        }

        builder.reverse();
        StringBuilder res = new StringBuilder(s);
        char[] chars1 = builder.toString().toCharArray();
        int index = 0;
        for (int i = 0; i < word.length; i++) {
            for (char j : chars) {
                if (word[i] == j) {
                    res.setCharAt(i, chars1[index]);
                    index++;
                    break;
                }
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
        System.out.println(reverseVowels("leetcode"));
        System.out.println(reverseVowels("aA"));
    }
}
