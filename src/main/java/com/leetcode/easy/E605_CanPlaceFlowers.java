package main.java.com.leetcode.easy;

public class E605_CanPlaceFlowers {
    static public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 0) return false;
        if (n == 0) return true;
        if (flowerbed.length == 1) return flowerbed[0] == 0 && n == 1;
        if (flowerbed.length == 2) return (flowerbed[0] == 0 && flowerbed[1] == 0) && n == 1;

        for (int i = 0; i < flowerbed.length; i++) {
            if (n == 0) break;
            if (i == 0) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            } else if (i == flowerbed.length - 1) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            } else {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0 && flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }

        return n == 0;
    }


    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 1));
        System.out.println(canPlaceFlowers(new int[]{1, 0, 0, 0, 1}, 2));

    }
}
