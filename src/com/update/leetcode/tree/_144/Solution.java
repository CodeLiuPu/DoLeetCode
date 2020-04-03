package com.update.leetcode.tree._144;

import com.update.helper.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树，返回它的 前序 遍历。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,null,2,3]
 * // 1
 * //  \
 * //   2
 * //  /
 * // 3
 * <p>
 * 输出: [1,2,3]
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preOrder(result,root);
        return result;
    }

    public void preOrder(List<Integer> list,TreeNode root){
        if (null == root){
            return;
        }
        list.add(root.val);
        preOrder(list,root.left);
        preOrder(list,root.right);
    }

}