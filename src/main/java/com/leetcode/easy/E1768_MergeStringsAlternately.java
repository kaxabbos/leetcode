package main.java.com.leetcode.easy;

public class E1768_MergeStringsAlternately {
    static public String mergeAlternately(String word1, String word2) {
        if (word1.equals("")) return word2;
        if (word2.equals("")) return word1;

        StringBuilder builder = new StringBuilder();
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        if (chars1.length == chars2.length) {
            for (int i = 0; i < chars1.length; i++) {
                builder.append(chars1[i]);
                builder.append(chars2[i]);
            }
            return builder.toString();
        } else if (chars1.length > chars2.length) {
            int i = 0;
            for (; i < chars2.length; i++) {
                builder.append(chars1[i]);
                builder.append(chars2[i]);
            }
            for (; i < chars1.length; i++) {
                builder.append(chars1[i]);
            }
            return builder.toString();
        } else {
            int i = 0;
            for (; i < chars1.length; i++) {
                builder.append(chars1[i]);
                builder.append(chars2[i]);
            }
            for (; i < chars2.length; i++) {
                builder.append(chars2[i]);
            }
            return builder.toString();
        }
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc", "pqr"));
        System.out.println(mergeAlternately("ab", "pqrs"));
    }
}
