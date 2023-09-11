package main.java.com.leetcode.not;

import java.util.Objects;

public class E171_ExcelSheetColumnNumber {
    static String[] strings = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
    static String[] ints = "1234567891011121314151617181920212223242526".split("");

    static public int titleToNumber(String columnTitle) {
        int res = 0;

        String[] temp = columnTitle.split("");

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < strings.length; j++) {
                if (Objects.equals(strings[j], temp[i])) {
                    res += Integer.parseInt(ints[j]) + (25 * i);
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));
        System.out.println(titleToNumber("AB"));
        System.out.println(titleToNumber("ZY"));
    }
}
