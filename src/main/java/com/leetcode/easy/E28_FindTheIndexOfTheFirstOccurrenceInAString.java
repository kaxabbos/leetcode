package main.java.com.leetcode.easy;

public class E28_FindTheIndexOfTheFirstOccurrenceInAString {
    static public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        System.out.println(strStr("sadbutsad", "sad"));
        System.out.println(strStr("leetcode", "leeto"));
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("bbbbababbbaabbba", "abb"));
    }
}
