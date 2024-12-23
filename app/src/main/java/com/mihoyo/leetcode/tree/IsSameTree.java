package com.mihoyo.leetcode.tree;

/**
 * 相同的树
 * https://leetcode.cn/problems/same-tree/?envType=study-plan-v2&envId=top-interview-150
 *
 * 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同。
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 * */
public class IsSameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null) return q == null;
        return q != null && p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
