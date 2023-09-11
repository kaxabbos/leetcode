package main.java.com.leetcode.easy;

public class E509_Fibonacci_Number {
    static public int fib(int n) {
        if (n <= 1 || n > 30) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
    }
}