package com.update.linked_list._021;

import com.update.linked_list.ListNode;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(-1);
        ListNode curr = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val <l2.val){
                curr.next = l1;
                curr = curr.next;
                l1 = l1.next;
            } else {
                curr.next = l2;
                curr = curr.next;
                l2 = l2.next;
            }
        }
        if (l1 == null){
            curr.next = l2;
        } else {
            curr.next = l1;
        }
        return dummyHead.next;
    }
}