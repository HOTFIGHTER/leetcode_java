package com.mihoyo.leetcode.backtrace;

import java.util.ArrayList;
import java.util.List;

/**
 * 括号生成
 * https://leetcode.cn/problems/generate-parentheses/description/?envType=study-plan-v2&envId=top-interview-150
 *
 * 数字n代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且有效的括号组合。
 *
 * */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<String>();
        backtrack(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }

    public void backtrack(List<String> ans, StringBuilder cur, int open, int close, int max) {
        if (cur.length() == max * 2) {
            ans.add(cur.toString());
            return;
        }
        if (open < max) {
            cur.append('(');
            backtrack(ans, cur, open + 1, close, max);
            cur.deleteCharAt(cur.length() - 1);
        }
        if (close < open) {
            cur.append(')');
            backtrack(ans, cur, open, close + 1, max);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}
