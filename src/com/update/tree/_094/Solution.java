package com.update.tree._094;

import com.update.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个二叉树，返回它的中序 遍历。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,null,2,3]
 * //  1
 * //   \
 * //   2
 * //  /
 * // 3
 * <p>
 * 输出: [1,3,2]
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inOrder(result,root);
        return result;
    }

    public void inOrder(List<Integer> list,TreeNode root){
        if (null == root){
            return;
        }
        inOrder(list,root.left);
        list.add(root.val);
        inOrder(list,root.right);
    }


}