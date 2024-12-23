package com.mihoyo.leetcode.math;

/**
 * 位1的个数
 * https://leetcode.cn/problems/number-of-1-bits/?envType=study-plan-v2&envId=top-interview-150
 *
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中
 * 设置位的个数（也被称为汉明重量）。
 *
 * */
public class HammingWeight {
    public int hammingWeight(int n) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                ret++;
            }
        }
        return ret;
    }
}
