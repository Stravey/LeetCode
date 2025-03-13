package com.strive.StageOne;

import java.util.Arrays;

public class LC85 {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        if(m == 0) return 0;
        int n = matrix[0].length;
        int maxArea = 0;

        int[] lLower = new int[n];
        int[] rLower = new int[n];
        Arrays.fill(lLower, -1);
        Arrays.fill(rLower, n);

        int[] heights = new int[n];

        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == '1') {
                    heights[j] += 1;
                }else {
                    heights[j] = 0;
                }
            }
            int lower = -1;
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == '1') {
                    lLower[j] = Math.max(lLower[j], lower);
                }else {
                    lLower[j] = -1;
                    lower = j;
                }
            }
            lower = n;
            for(int j = n - 1; j >= 0; j--) {
                if(matrix[i][j] == '1') {
                    rLower[j] = Math.min(rLower[j], lower);
                }else {
                    rLower[j] = n;
                    lower = j;
                }
            }

            for(int j = 0; j < n; j++) {
                int area = (rLower[j] - lLower[j] - 1) * heights[j];
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
}
