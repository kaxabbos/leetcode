package main.java.com.leetcode.not;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class H68_TextJustification {
    static public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            int lengthWithMinWhiteSpace = words[i].length() + 1;
            int lengthWords = words[i].length();
            int index = i;
            for (int j = i + 1; j < words.length; j++) {
                if (lengthWithMinWhiteSpace + words[j].length() + 1 > maxWidth) {
                    break;
                }
                lengthWithMinWhiteSpace += words[j].length() + 1;
                lengthWords += words[j].length();
                index = j;
            }
            System.out.println("lengthWithMinWhiteSpace: " + lengthWithMinWhiteSpace);
            System.out.println("lengthWords: " + lengthWords);
            System.out.println("index: " + index);

            int maxWhitespace = maxWidth - lengthWords;
            System.out.println("maxWhitespace: " + maxWhitespace);
            int whitespace;
            if (index - i != 0) {
                whitespace = (int) Math.ceil((double) maxWhitespace / (index - i));
            } else {
                whitespace = maxWhitespace;
            }
            System.out.println("whitespace: " + whitespace);

            StringBuilder resString = new StringBuilder();

            for (int j = i; j <= index; j++) {
                if (j != index) {
                    resString.append(words[j]);

                    if (resString.length() + words[j + 1].length() + whitespace > maxWidth) {
                        resString.append(" ".repeat(Math.max(0, whitespace - 1)));
                    } else {
                        resString.append(" ".repeat(Math.max(0, whitespace)));
                    }

                    System.out.println("test1");
                } else {
                    resString.append(words[j]);
                    System.out.println("test2");
                    if (index - i == 0) {
                        resString.append(" ".repeat(Math.max(0, whitespace)));
                    }
                }
            }
            res.add(resString.toString());
            i = index;
            System.out.println("| | | | |");
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(fullJustify(new String[]{"This", "is", "an", "example", "of", "text", "justification."}, 16));
        System.out.println(Arrays.toString(new String[]{"This    is    an", "example  of text", "justification.  "}));
        System.out.println(fullJustify(new String[]{"What", "must", "be", "acknowledgment", "shall", "be"}, 16));
        System.out.println(Arrays.toString(new String[]{"What   must   be", "acknowledgment  ", "shall be        "}));
        System.out.println(fullJustify(new String[]{"Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do"}, 20));
        System.out.println(Arrays.toString(new String[]{"Science  is  what we", "understand      well", "enough to explain to", "a  computer.  Art is", "everything  else  we", "do                  "}));
    }
}
