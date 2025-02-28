package com.strive.StageOne;

import java.util.ArrayList;

public class LC55 {

    public boolean canJump(int[] nums) {
        int n = nums.length - 1;
        int max = 0;
        for(int i = 0 ; i <= n ; i++) {
            if(i > max) {
                return false;
            }
            max = Math.max(max, i + nums[i]);
            if(max >= n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(1);
        list.add(1);
        list.add(4);
        list.forEach(System.out::println);
        System.out.println();
    }

}
