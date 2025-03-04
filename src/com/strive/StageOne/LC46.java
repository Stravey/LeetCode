package com.strive.StageOne;

import java.util.ArrayList;
import java.util.List;

//全排列 给定一个数组 给出它的全部排列方式
public class LC46 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        int[] used = new int[nums.length];
        dfs(temp,nums,used);
        return res;
    }

    void dfs(List<Integer> temp,int[] nums, int[] used) {
        if(temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0; i < nums.length; i++) {
            if(used[i] == 1) {
                continue;
            }
            temp.add(nums[i]);
            used[i] = 1;
            dfs(temp, nums, used);
            temp.remove(temp.size() - 1);
            used[i] = 0;
        }
    }

    public static void main(String[] args) {
        LC46 lc46 = new LC46();
        int[] nums = {1,2,3,4};
        System.out.println(lc46.permute(nums));
    }
}
