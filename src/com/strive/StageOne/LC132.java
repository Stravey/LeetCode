package com.strive.StageOne;

import java.util.Arrays;

public class LC132 {

    public int minCut(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], true);
        }
        for (int i = n - 1; i >= 0 ; i--) {
            for(int j = i + 1; j < n; j++) {
                dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1];
            }
        }
        int a[] = new int[n];
        Arrays.fill(a, Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            if(dp[0][i]) {
                a[i] = 0;
            }else {
                for (int j = 0; j < i; j++) {
                    if(dp[j + 1][i]) {
                        a[i] = Math.min(a[j] + 1, a[i]);
                    }
                }
            }
        }
        return a[n - 1];
    }

    public static void main(String[] args) {
        LC132 l = new LC132();
        System.out.println(l.minCut("abcda"));
    }

}
