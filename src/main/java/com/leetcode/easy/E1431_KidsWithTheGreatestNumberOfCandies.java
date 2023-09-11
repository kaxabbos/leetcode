package main.java.com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class E1431_KidsWithTheGreatestNumberOfCandies {
    static public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> booleans = new ArrayList<>();

        int max = candies[0];

        for (int i : candies) if (i > max) max = i;

        for (int i : candies) booleans.add(i + extraCandies >= max);

        return booleans;
    }

    public static void main(String[] args) {
        List<Boolean> temp;
        temp = kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);
        for (boolean i : temp) System.out.print(i + "\t");
        System.out.println();
        temp = kidsWithCandies(new int[]{4, 2, 1, 1, 2}, 1);
        for (boolean i : temp) System.out.print(i + "\t");
        System.out.println();
        temp = kidsWithCandies(new int[]{12, 1, 12}, 10);
        for (boolean i : temp) System.out.print(i + "\t");
        System.out.println();
    }
}
