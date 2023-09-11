package main.java.com.leetcode.easy;

public class E67_AddBinary {
    static public String addBinary(String a, String b) {
        int[] res = new int[Math.max(a.length(), b.length())];
        String[] strings1 = a.split("");
        String[] strings2 = b.split("");
        if (strings1.length != strings2.length) {
            if (strings1.length < strings2.length) {
                String[] temp = strings1;
                strings1 = new String[strings2.length];
                System.arraycopy(temp, 0, strings1, strings1.length - temp.length, temp.length);
                for (int i = 0; i < strings1.length; i++) {
                    if (strings1[i] == null) {
                        strings1[i] = "0";
                    }
                }
            } else {
                String[] temp = strings2;
                strings2 = new String[strings1.length];
                System.arraycopy(temp, 0, strings2, strings2.length - temp.length, temp.length);
                for (int i = 0; i < strings2.length; i++) {
                    if (strings2[i] == null) {
                        strings2[i] = "0";
                    }
                }
            }
        }

        for (int i = 0; i < res.length; i++) {
            res[i] = Integer.parseInt(strings1[i]) + Integer.parseInt(strings2[i]);
        }

        for (int i = res.length - 1; i >= 0; i--) {
            if (res[i] == 2) {
                res[i] = 0;
                if (i == 0) {
                    int[] temp = res;
                    res = new int[temp.length + 1];
                    res[0] = 1;
                    System.arraycopy(temp, 0, res, 1, temp.length);
                } else {
                    res[i - 1] = res[i - 1] + 1;
                }
            }
            if (res[i] == 3) {
                res[i] = 1;
                if (i == 0) {
                    int[] temp = res;
                    res = new int[temp.length + 1];
                    res[0] = 1;
                    System.arraycopy(temp, 0, res, 1, temp.length);
                } else {
                    res[i - 1] = res[i - 1] + 1;
                }
            }
        }

        StringBuilder builder = new StringBuilder();

        for (int i : res) builder.append(i);

        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("0", "0"));
        System.out.println(addBinary("11", "1"));
        System.out.println(addBinary("1010", "1011"));
        System.out.println(addBinary("1111", "1111"));
        System.out.println(addBinary("1110110101", "1110111011"));
    }
}
