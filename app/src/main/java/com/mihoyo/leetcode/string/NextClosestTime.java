package com.mihoyo.leetcode.string;

import java.util.Arrays;

/**
 * 最近时刻
 * https://leetcode.cn/leetbook/read/google-interview/15mdv/
 *
 * 给定一个形如"HH:MM" 表示的时刻time，利用当前出现过的数字构造下一个距离当前时间最近的时刻。每个出现数字都可以被无限次使用。
 *
 * 你可以认为给定的字符串一定是合法的。例如，"01:34" 和 "12:09" 是合法的，“1:34” 和 “12:9” 是不合法的。
 *
 * */
public class NextClosestTime {
    public String nextClosestTime(String time) {
        char[] chars = new char[4];
        chars[0] = time.charAt(0);
        chars[1] = time.charAt(1);
        chars[2] = time.charAt(3);
        chars[3] = time.charAt(4);
        Arrays.sort(chars);
        char[] chars1 = time.toCharArray();
        char temp = chars1[4];
        chars1[4] = this.findNextCharacter(chars1[4], '9', chars);
        if (chars1[4] > temp) return new String(chars1);
        temp = chars1[3];
        chars1[3] = this.findNextCharacter(chars1[3], '5', chars);
        if (chars1[3] > temp) return new String(chars1);
        temp = chars1[1];
        chars1[1] = this.findNextCharacter(chars1[1], chars1[0] == '2' ? '3' : '9', chars);
        if (chars1[1] > temp) return new String(chars1);
        chars1[0] = this.findNextCharacter(chars1[0], '2', chars);
        return new String(chars1);
    }

    private char findNextCharacter(char current, char upperlimit, char[] digits) {
        if (current == upperlimit) return digits[0];
        int idx = this.binarySearch(digits, 0, digits.length - 1, current);
        while (idx < digits.length && digits[idx] == current)
            ++idx;
        return (idx == digits.length || digits[idx] > upperlimit) ? digits[0] : digits[idx];
    }

    private int binarySearch(char[] chars, int left, int right, char target) {
        if (left > right) return -1;
        int pivot = left + ((right - left) >>> 1);
        if (chars[pivot] == target) return pivot;
        else if (chars[pivot] > target) return this.binarySearch(chars, left, pivot - 1, target);
        else return this.binarySearch(chars, pivot + 1, right, target);
    }
}
