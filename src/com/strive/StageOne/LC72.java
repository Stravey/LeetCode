package com.strive.StageOne;

public class LC72 {
    public int minDistance(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        int[][] dp = new int[chars1.length + 1][chars2.length + 1];
        dp[0][0] = 0;

        for(int i = 1; i <= chars1.length; i++) {
            dp[i][0] = i;
        }

        for(int j = 1; j <= chars2.length; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= chars1.length; i++) {
            for (int j = 1; j <= chars2.length; j++) {
                int top = dp[i - 1][j] + 1;
                int left = dp[i][j - 1] + 1;
                int bottom = dp[i - 1][j - 1];
                if (chars1[i - 1] != chars2[j - 1]) {
                    bottom++;
                }
                dp[i][j] = Math.min(Math.min(top,left),bottom);
            }
        }
        return dp[chars1.length][chars2.length];
    }
}
