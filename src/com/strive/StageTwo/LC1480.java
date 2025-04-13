package com.strive.StageTwo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LC1480 {
    public int[] runningSum(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i = 1; i < nums.length; i++) {
            int sum = list.get(i - 1) + nums[i];
            list.add(sum);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
}
