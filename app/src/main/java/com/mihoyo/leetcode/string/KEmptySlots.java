package com.mihoyo.leetcode.string;

import java.util.TreeSet;

/**
 * K个空花盆
 * https://leetcode.cn/leetbook/read/google-interview/1xn0g/
 *
 * n个灯泡排成一行，编号从 1 到n。最初，所有灯泡都关闭。每天只打开一个灯泡，直到n天后所有灯泡都打开。
 *
 * 给你一个长度为n的灯泡数组 blubs ，其中 bulbs[i] = x 意味着在第 (i+1) 天，我们会把在位置 x 的灯泡打开，其中 i 从 0 开始，x 从 1 开始。
 *
 * 给你一个整数k，请返回恰好有两个打开的灯泡，且它们中间 正好 有k个全部关闭的 灯泡的 最小的天数 。如果不存在这种情况，返回 -1 。
 *
 *
 * */
public class KEmptySlots {
    public int kEmptySlots(int[] bulbs, int k) {
        TreeSet<Integer> active = new TreeSet<>();
        for (int i = 0; i < bulbs.length; i++) {
            int x = bulbs[i];
            Integer x_pre = active.floor(x);
            if (x_pre != null && Math.abs(x_pre-x)-1 == k)
                return i+1;
            Integer x_next = active.ceiling(x);
            if (x_next != null && Math.abs(x_next-x)-1 == k)
                return i+1;
            active.add(x);
        }
        return -1;
    }
}
