package com.strive.StageTwo;

/**
 * 有序数组的单一元素
 */
public class LC540 {
    public int singleNonDuplicate(int[] nums) {
        for(int i = 1;i < nums.length - 1;i++) {
            if(nums[i] != nums[i-1] && nums[i] != nums[i+1]) {
                return nums[i];
            }
        }
        if(nums.length == 1 ) {
            return nums[0];
        }
        if(nums[0] != nums[1]) {
            return nums[0];
        }
        return nums[nums.length-1];
    }
}
