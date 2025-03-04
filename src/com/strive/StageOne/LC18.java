package com.strive.StageOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int first = 0; first < n-1; first++) {
            if(first > 0 && nums[first] == nums[first-1]) {
                continue;
            }
            for(int second = first+1; second < n-1; second++) {
                if(second > first+1 && nums[second] == nums[second-1]) {
                    continue;
                }
            }
            int third = first+1;
        }




        return result;
    }

    public static void main(String[] args) {
        LC18 lc = new LC18();
        System.out.println(lc.fourSum(new int[]{1,0,-1,0,-2,2},0));
    }
}
