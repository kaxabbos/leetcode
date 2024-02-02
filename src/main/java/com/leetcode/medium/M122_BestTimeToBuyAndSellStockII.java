package main.java.com.leetcode.medium;

public class M122_BestTimeToBuyAndSellStockII {
    public static int maxProfit(int[] prices) {
        int res = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[i] < prices[j]) {
                    if (j + 1 != prices.length) {
                        if (prices[j] < prices[j + 1]) {
                            continue;
                        }
                    }
                    res += prices[j] - prices[i];
                    i = j;
                    break;
                } else {
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
//        System.out.println(maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
//        System.out.println(maxProfit(new int[]{1, 2, 3, 4, 5}));
//        System.out.println(maxProfit(new int[]{7, 6, 4, 3, 1}));
        System.out.println(maxProfit(new int[]{6, 1, 3, 2, 4, 7}));
    }

}
