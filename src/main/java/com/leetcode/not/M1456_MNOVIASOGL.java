package main.java.com.leetcode.not;

import java.util.Arrays;

public class M1456_MNOVIASOGL {

    static public int maxVowels(String s, int k) {
        if (k > s.length()) return 0;

        String[][] words = new String[(int) Math.ceil((double) s.length() / k)][k];

        int index = 0;

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length; j++) {
                words[i][j] = String.valueOf(s.charAt(index));
                index++;
                if (index == s.length()) break;
            }
        }

        System.out.println(Arrays.deepToString(words));

        String[] vowels = {"a", "e", "i", "o", "u"};
        int res = 0;

        for (int i = 0; i < words.length; i++) {
            int max = 0;
            for (int j = 0; j < words[i].length; j++) {
                if (words[i][j] == null) break;
                for (int l = 0; l < vowels.length; l++) {
                    if (words[i][j].equals(vowels[l])) max++;
                    if (max == k) return k;
                    else if (max > res) res = max;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(maxVowels("abciiidef", 3));
        System.out.println(maxVowels("aeiou", 2));
        System.out.println(maxVowels("leetcode", 3));
        System.out.println(maxVowels("weallloveyou", 7));
    }
}
