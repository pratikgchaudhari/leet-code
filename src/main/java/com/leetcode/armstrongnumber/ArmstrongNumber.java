package com.leetcode.armstrongnumber;

public class ArmstrongNumber {
    public boolean isArmstrong(int n) {

        var numStr = String.valueOf(n);

        var r = armstrong(n, numStr.length());

        return r == n;
    }

    private int armstrong(int n, int k) {
        if (n / 10 != 0) {
            return (raiseToPower((n % 10), k) + armstrong(n / 10, k));
        }
        return raiseToPower(n, k);
    }

    private int raiseToPower(int n, int k) {
        return ((int) Math.pow((n % 10), k));
    }
}
