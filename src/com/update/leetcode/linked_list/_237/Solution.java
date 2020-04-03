package com.update.leetcode.linked_list._237;

import com.update.helper.ListNode;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

    }
}