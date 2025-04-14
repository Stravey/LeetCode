package com.strive.StageTwo;

/**
 * 找到数组中间元素
 */
public class LC1991 {
    public int findMiddleIndex(int[] nums) {
        for(int i = 0;i < nums.length;i++) {
            int l = 0;
            int r = 0;
            for(int j = 0;j < i;j++) {
                l += nums[j];
            }
            for(int j = i + 1;j < nums.length;j++) {
                r += nums[j];
            }
            if(l == r) {
                return i;
            }
        }
        return -1;
    }
}
