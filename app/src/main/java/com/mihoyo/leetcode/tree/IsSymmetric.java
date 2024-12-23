package com.mihoyo.leetcode.tree;

/**
 * 对称二叉树
 * https://leetcode.cn/problems/symmetric-tree/?envType=study-plan-v2&envId=top-interview-150
 *
 * 给你一个二叉树的根节点root,检查它是否轴对称。
 * */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    public boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && check(p.left, q.right) && check(p.right, q.left);
    }
}
