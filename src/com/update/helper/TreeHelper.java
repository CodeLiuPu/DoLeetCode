package com.update.helper;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : liupu.
 * @date : 2019/01/25
 */
public class TreeHelper {

    public static TreeNode getTree() {
        int[] array = {4, 2, 1, 3, 4, 6, 5, 7};
        return getTree(array);
    }

    public static TreeNode getTree(int[] array) {

        TreeNode root = new TreeNode(array[0]);
        for (int i = 0; i < array.length; i++) {
            add(root, array[i]);
        }
        return root;
    }

    private static TreeNode add(TreeNode node, Integer integer) {
        if (node == null) {
            node = new TreeNode(integer);
        }
        if (integer < node.val) {
            node.left = add(node.left, integer);
        } else if (integer > node.val) {
            node.right = add(node.right, integer);
        }
        return node;
    }

    public static void print(TreeNode root) {
        levelOrder(root);
    }

    private static void levelOrder(TreeNode root) {
        if (null == root) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        System.out.print("[ ");

        while (!queue.isEmpty()) {
            TreeNode cur = queue.remove();
            System.out.print(cur.val + " ");
            if (null != cur.left) {
                queue.add(cur.left);
            }
            if (null != cur.right) {
                queue.add(cur.right);
            }
        }
        System.out.print("]");

    }
}
