package com.mihoyo.leetcode.tree;

/**
 * 翻转二叉树
 * https://leetcode.cn/problems/invert-binary-tree/?envType=study-plan-v2&envId=top-interview-150
 *
 * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
 * */
public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }
}
