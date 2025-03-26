package com.strive.StageOne;

public class LC7 {
    public int reverse(int x) {
        int sum = 0;
        while(x != 0) {
            int temp = x % 10;
            if (sum > 214748364 || (sum == 214748364 && temp > 7)) {
                return 0;
            }
            if (sum < -214748364 || (sum == -214748364 && temp < -8)) {
                return 0;
            }
            sum = sum * 10 + temp;
            x /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        LC7 lc = new LC7();
        System.out.println(lc.reverse(12412));
        System.out.println(lc.reverse(-12412));
    }
}
