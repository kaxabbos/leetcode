package main.java.com.leetcode.easy;

public class E14_LongestCommonPrefix {
    static public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];

        StringBuilder builder;
        String res = "";
        for (int i = 1; i < strs.length; i++) {
            String[] s1 = strs[i - 1].split("");
            String[] s2 = strs[i].split("");

            int index = Math.min(s1.length, s2.length);
            builder = new StringBuilder();
            for (int j = 0; j < index; j++) {
                if (s1[j].equals(s2[j])) {
                    builder.append(s1[j]);
                } else {
                    if (builder.length() == 0) {
                        return "";
                    } else {
                        break;
                    }
                }
            }
            if (i == 1) {
                res = builder.toString();
            } else if (builder.length() < res.length()) {
                res = builder.toString();
            }

        }

        return res;
    }

    public static void main(String[] args) {
//        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
//        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println(longestCommonPrefix(new String[]{"acc", "aaa", "aaba"}));
    }
}
