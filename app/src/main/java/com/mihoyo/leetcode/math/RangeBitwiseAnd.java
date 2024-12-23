package com.mihoyo.leetcode.math;

/**
 * 数字范围按位与
 * https://leetcode.cn/problems/bitwise-and-of-numbers-range/?envType=study-plan-v2&envId=top-interview-150
 *
 * 给你两个整数 left 和 right ，表示区间 [left, right] ，返回此区间内所有数字 按位与 的结果（包含 left 、right 端点）。
 *
 * */
public class RangeBitwiseAnd {
    public int rangeBitwiseAnd(int m, int n) {
        while (m < n) {
            // 抹去最右边的 1
            n = n & (n - 1);
        }
        return n;
    }
}
