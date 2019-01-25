package com.update.medium._102;

import com.update.TreeHelper;
import com.update.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
 * <p>
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回其层次遍历结果：
 * <p>
 * [
 * [3],
 * [9,20],
 * [15,7]
 * ]
 */
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode root = TreeHelper.getTree();
        solution.levelOrder(root);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        levelOrder(result, root);
        return result;
    }

    private void levelOrder(List<List<Integer>> lists, TreeNode root) {
        if (null == root) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {

            int count = queue.size();

            List<Integer> list = new ArrayList<>();
            while (count > 0) {
                TreeNode cur = queue.remove();
                list.add(cur.val);

                if (null != cur.left) {
                    queue.add(cur.left);
                }
                if (null != cur.right) {
                    queue.add(cur.right);
                }
                count--;
            }
            lists.add(list);
        }
    }
}