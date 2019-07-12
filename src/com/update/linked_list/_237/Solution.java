package com.update.linked_list._237;

import com.update.linked_list.ListNode;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

    }
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;

    }
}