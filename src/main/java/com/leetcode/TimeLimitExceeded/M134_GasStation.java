package main.java.com.leetcode.TimeLimitExceeded;

public class M134_GasStation {
    static public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas.length != cost.length) return -1;
        if (gas.length == 0) return -1;

        boolean flag = false;
        for (int i = 0; i < gas.length; i++) {
            int temp = gas[i];
            for (int j = i + 1; true; j++) {
                if (j == cost.length) j = 0;
                if (j != 0) temp -= cost[j - 1];
                else temp -= cost[cost.length - 1];
                if (temp < 0) break;
                if (i == j) {
                    if (temp >= 0) flag = true;
                    break;
                }
                temp += gas[j];
            }
            if (flag) return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2}));
        System.out.println(canCompleteCircuit(new int[]{2, 3, 4}, new int[]{3, 4, 3}));
    }
}
