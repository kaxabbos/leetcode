package main.java.com.leetcode.easy;

public class E202_HappyNumber {
    static public boolean isHappy(int n) {
        try {
            int index = 0;
            String[] numbers = String.valueOf(n).split("");
            while (true) {
                if (index == 10) throw new Exception();
                int res = 0;
                for (String i : numbers) {
                    int temp = Integer.parseInt(i);
                    res += temp * temp;
                }
                if (res == 1) return true;
                numbers = String.valueOf(res).split("");
                index++;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }
}
