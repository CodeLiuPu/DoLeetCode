package com.update.hard._145;

import com.update.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrder(result,root);
        return result;
    }

    private void postOrder(List<Integer> list,TreeNode root){
        if (null == root){
            return;
        }
        postOrder(list,root.left);
        postOrder(list,root.right);
        list.add(root.val);
    }
}