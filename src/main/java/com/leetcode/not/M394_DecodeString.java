package main.java.com.leetcode.not;

public class M394_DecodeString {
    static public String decodeString(String s) {
        if (s.isEmpty() || s.length() > 30) {
            return s;
        }
        
        return "";
    }

    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
        System.out.println(decodeString("3[a2[c]]"));
        System.out.println(decodeString("2[abc]3[cd]ef"));
    }
}
