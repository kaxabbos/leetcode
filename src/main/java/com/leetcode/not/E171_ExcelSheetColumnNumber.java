package main.java.com.leetcode.not;

public class E171_ExcelSheetColumnNumber {

    static public int titleToNumber(String columnTitle) {
        int res = 0;

        columnTitle = new StringBuilder(columnTitle).reverse().toString();

        for (int i = 0; i < columnTitle.length(); i++) {
            int temp = columnTitle.charAt(i) - 64;
            res += temp + (25 * i * temp);
        }


        return res;
    }

    public static void main(String[] args) {
//        System.out.println((int)'A'-64);

        System.out.println(titleToNumber("A") + " - 1");
        System.out.println(titleToNumber("AB") + " - 28");
        System.out.println(titleToNumber("ZY") + " - 701");
        System.out.println(titleToNumber("FXSHRXW"));
        System.out.println(2147483647);
    }
}
