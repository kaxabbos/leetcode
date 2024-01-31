package main.java.com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class M22_GenerateParentheses {

    static public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(0, 0, "", n, res);
        return res;
    }

    static private void generate(int openCount, int closeCount, String currentString, int max, List<String> res) {
        if (openCount > max || closeCount > max || openCount < closeCount) {
            return;
        }

        if (openCount == max && closeCount == max) {
            res.add(currentString);
            return;
        }

        generate(openCount + 1, closeCount, currentString + "(", max, res);
        generate(openCount, closeCount + 1, currentString + ")", max, res);
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
        System.out.println(generateParenthesis(1));
    }
}
