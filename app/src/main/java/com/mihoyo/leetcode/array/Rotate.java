package com.mihoyo.leetcode.array;

/**
 * 轮转数组
 * https://leetcode.cn/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 */
public class Rotate {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newArr = new int[n];
        for (int i = 0; i < n; i++) {
          newArr[(i+k)%n]=nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, n);
    }
}
