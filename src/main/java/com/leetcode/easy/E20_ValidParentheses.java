package main.java.com.leetcode.easy;

import java.util.ArrayDeque;
import java.util.Deque;

public class E20_ValidParentheses {
    public static boolean isValid(String s) {
        if (s == null || s.trim().isEmpty()) {
            return true;
        }

        if (s.length() % 2 != 0) {
            return false;
        }

        int length = s.length();

        Deque<Character> deque = new ArrayDeque<>(length);

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                deque.push(s.charAt(i));
            } else {
                if (deque.isEmpty()) {
                    return false;
                }
                switch (s.charAt(i)) {
                    case ')' -> {
                        if (deque.pop() != '(') {
                            return false;
                        }
                    }
                    case ']' -> {
                        if (deque.pop() != '[') {
                            return false;
                        }
                    }
                    case '}' -> {
                        if (deque.pop() != '{') {
                            return false;
                        }
                    }
                }
            }
        }

        return deque.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("["));
        System.out.println(isValid("[["));
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("({[)"));
    }
}
