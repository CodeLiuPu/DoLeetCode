package com.update.easy._203;

import com.update.ListNode;

/**
 * 删除链表中等于给定值 val 的所有节点。
 * 示例:
 *
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
//        solution.removeElements()


    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;
        ListNode prev = dummyHead;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }
        return dummyHead.next;
    }
}
