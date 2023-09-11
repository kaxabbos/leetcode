package main.java.com.leetcode.medium;

public class M443_StringCompression {
    static public int compress(char[] chars) {
        if (chars.length == 0 || chars.length == 1) return chars.length;

        int index = 0;
        for (int i = 0; i < chars.length; ) {
            if (chars[i] == '\t') break;
            char c = chars[i];
            int j = i + 1;
            for (; j < chars.length; j++) {
                if (c != chars[j]) break;
            }
            if (j - i == 1) {
                index++;
                i++;
            } else {
                int diff = j - i;
                char[] temp = String.valueOf(diff).toCharArray();
                for (char k : temp) {
                    i++;
                    chars[i] = k;
                    index++;
                }
                index++;
                i++;
                if (diff > 2) {
                    int i1 = i;
                    int j1 = j;
                    for (; j1 < chars.length; i1++, j1++) {
                        chars[i1] = chars[j1];
                    }
                    for (; i1 < chars.length; i1++) {
                        chars[i1] = '\t';
                    }
                }
            }
        }
        System.out.println(chars);
        return index;
    }

    public static void main(String[] args) {
        System.out.println(compress(new char[]{'a', 'a', 'b', 'b', 'c', 'c', 'c'}));
        System.out.println(compress(new char[]{'a', 'a', 'a', 'a', 'a', 'b'}));
        System.out.println(compress(new char[]{'a'}));
        System.out.println(compress(new char[]{'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'}));
        System.out.println(compress(new char[]{'a', 'a', 'a', 'b', 'b', 'a', 'a'}));
        System.out.println(compress(new char[]{'a', 'a', 'a', 'b', 'b', 'a', 'a', 'a', 'a'}));
    }
}
