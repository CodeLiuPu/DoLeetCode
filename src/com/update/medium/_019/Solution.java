package com.update.medium._019;

import com.update.LinkedHelper;
import com.update.ListNode;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 * <p>
 * 示例：
 * <p>
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * <p>
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * <p>
 * 说明：
 * <p>
 * 给定的 n 保证是有效的。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{1};
        ListNode node = LinkedHelper.createLinkedList(arr);
        LinkedHelper.printLinkedList(node);
        LinkedHelper.printLinkedList(solution.removeNthFromEnd(node,1));

    }


    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummyFast = new ListNode(-1);
        dummyFast.next = head;
        ListNode dummySlow = new ListNode(-1);
        dummySlow.next = head;

        ListNode currFast = dummyFast;
        ListNode currSlow = dummySlow;

        int index = 0;

        while (index < n) {
            index++;
            currFast = currFast.next;
        }

        while (currFast.next != null) {
            currFast = currFast.next;
            currSlow = currSlow.next;
        }

        currSlow.next = currSlow.next.next;

        return dummySlow.next;
    }
}