package com.strive.StageOne;

public class LC171 {

    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int m = 1;
        int res = 0;
        for (int i = n - 1; i >= 0; i--) {
            int k = columnTitle.charAt(i) - 'A' + 1;
            res += m * k;
            m *= 26;
        }
        return res;
    }

    public static void main(String[] args) {
        LC171 lc171 = new LC171();
        System.out.println(lc171.titleToNumber("ABC"));
        System.out.println(lc171.titleToNumber("A"));
        System.out.println(lc171.titleToNumber("AB"));
        System.out.println(lc171.titleToNumber("ZY"));
        System.out.println(lc171.titleToNumber("BYQ"));
        System.out.println(lc171.titleToNumber("AAA"));
    }
}
