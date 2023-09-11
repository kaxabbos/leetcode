package main.java.com.leetcode.easy;

public class E13_RomanToInteger {
    static public int romanToInt(String s) {
        char[] strings = s.toCharArray();
        int res = 0;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == 'I') {
                if (strings.length - 1 == i) {
                    res += 1;
                    break;
                }
                if (strings[i + 1] == 'V') {
                    res += 4;
                    i++;
                } else if (strings[i + 1] == 'X') {
                    res += 9;
                    i++;
                } else res += 1;
            } else if (strings[i] == 'V') res += 5;
            else if (strings[i] == 'X') {
                if (strings.length - 1 == i) {
                    res += 10;
                    break;
                }
                if (strings[i + 1] == 'L') {
                    res += 40;
                    i++;
                } else if (strings[i + 1] == 'C') {
                    res += 90;
                    i++;
                } else res += 10;
            } else if (strings[i] == 'L') res += 50;
            else if (strings[i] == 'C') {
                if (strings.length - 1 == i) {
                    res += 100;
                    break;
                }
                if (strings[i + 1] == 'D') {
                    res += 400;
                    i++;
                } else if (strings[i + 1] == 'M') {
                    res += 900;
                    i++;
                } else res += 100;
            } else if (strings[i] == 'D') res += 500;
            else if (strings[i] == 'M') res += 1000;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }
}
