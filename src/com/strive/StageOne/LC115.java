package com.strive.StageOne;

public class LC115 {
    public int numDistinct(String s, String t) {
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        int m = sChar.length, n = tChar.length;
        int[][] dp = new int[m + 1][n + 1];

        if(m < n) {
            return 0;
        }
        for(int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }

        for(int i = 1; i <= m; i++) {
            for(int j = 1; j <= n; j++) {
                if(sChar[i - 1] == tChar[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                }else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        System.out.println(new LC115().numDistinct("rabbbit", "rabbit"));
    }
}
