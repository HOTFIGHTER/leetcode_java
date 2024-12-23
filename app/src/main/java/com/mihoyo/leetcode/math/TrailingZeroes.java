package com.mihoyo.leetcode.math;

/**
 * 阶乘后的零
 * https://leetcode.cn/problems/factorial-trailing-zeroes/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * 给定一个整数 n ，返回 n! 结果中尾随零的数量。
 * 提示 n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1
 *
 * */
public class TrailingZeroes {
    public int trailingZeroes(int n) {
        int ans = 0;
        for (int i = 5; i <= n; i += 5) {
            for (int x = i; x % 5 == 0; x /= 5) {
                ++ans;
            }
        }
        return ans;
    }
}
