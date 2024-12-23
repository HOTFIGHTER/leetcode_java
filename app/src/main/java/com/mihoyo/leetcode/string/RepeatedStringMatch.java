package com.mihoyo.leetcode.string;

/**
 * 重复叠加字符串匹配
 * https://leetcode.cn/leetbook/read/google-interview/1hdle/
 *
 * 给定两个字符串a 和 b，寻找重复叠加字符串 a 的最小次数，使得字符串 b 成为叠加后的字符串 a 的子串，如果不存在则返回 -1。
 *
 * 注意：字符串 "abc"重复叠加 0 次是 ""，重复叠加 1 次是"abc"，重复叠加 2 次是"abcabc"。
 *
 * 输入：a = "abcd", b = "cdabcdab"
 * 输出：3
 * 解释：a 重复叠加三遍后为 "abcdabcdabcd", 此时 b 是其子串。
 *
 * */
public class RepeatedStringMatch {
    public int repeatedStringMatch(String a, String b) {
        String c = a;//记录a累加后的字符串
        int count=1;//记录次数
        if(a.contains(b))//本就包含 直接返回
            return count;
        for (int i = 0; i < b.length(); i++) {
            char ch = b.charAt(i);
            if(!a.contains(String.valueOf(ch)))//b中某个字符a中没有
                return -1;
        }
        while(c.length()<(a.length()+b.length())*2){//达到二者的两倍长度和还未匹配到 则失败 返回-1
            if(!c.contains(b)){
                c+=a;
                count++;
            }else
                return count;
        }
        return -1;
    }
}
