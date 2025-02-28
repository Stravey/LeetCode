package com.strive.StageOne;

public class LC42 {

    public static int trap(int[] height) {
        int n = height.length;
        if(n == 0) return 0;
        int[] lMax = new int[n];
        lMax[0] = height[0];
        for(int i = 1; i < n; i++) {
            lMax[i] = Math.max(lMax[i-1], height[i]);
        }

        int[] rMax = new int[n];
        rMax[n-1] = height[n-1];
        for(int i = n -2; i >= 0; i--) {
            rMax[i] = Math.max(rMax[i+1], height[i]);
        }

        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += Math.min(lMax[i], rMax[i]) - height[i];
        }

        return sum;
    }


    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int a = trap(arr);
        System.out.println(a);

    }
}
