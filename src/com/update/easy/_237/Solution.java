package com.update.easy._237;

import com.update.ListNode;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

    }
}