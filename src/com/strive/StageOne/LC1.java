package com.strive.StageOne;

import java.util.Arrays;
import java.util.HashMap;

public class LC1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int y = target - x;
            if(map.containsKey(y)){
                return new int[]{i,map.get(y)};
            }else {
                map.put(x,i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LC1 lc1 = new LC1();
        System.out.println(Arrays.toString(lc1.twoSum(new int[]{1,2,3,4,5,6,7,8,9}, 9)));
    }

}
