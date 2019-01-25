package com.update.easy._226;

import com.update.TreeNode;

/**
 * 翻转一棵二叉树。
 * <p>
 * 示例：
 * <p>
 * 输入：
 * <p>
 * 4
 * /   \
 * 2     7
 * / \   / \
 * 1   3 6   9
 * <p>
 * 输出：
 * <p>
 * 4
 * /   \
 * 7     2
 * / \   / \
 * 9   6 3   1
 */
class Solution {

    public static void main(String[] args) {

    }

    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    public void invert(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;

        invert(root.left);
        invert(root.right);

    }
}