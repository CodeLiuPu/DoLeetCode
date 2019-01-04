package com.update.medium._061;

import com.update.LinkedHelper;
import com.update.ListNode;

/**
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 * <p>
 * 示例 2:
 * <p>
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 * 解释:
 * 向右旋转 1 步: 2->0->1->NULL
 * 向右旋转 2 步: 1->2->0->NULL
 * 向右旋转 3 步: 0->1->2->NULL
 * 向右旋转 4 步: 2->0->1->NULL
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = new int[]{1, 2, 3, 4, 5};
        int k = 2;

        ListNode node = LinkedHelper.createLinkedList(arr);
        ListNode head = solution.rotateRight(node, k);
        LinkedHelper.printLinkedList(head);
    }

    public ListNode rotateRight(ListNode head, int k) {

        if (head == null) {
            return head;
        }
        int length = 0;
        ListNode cur = head;
        ListNode tail = null;
        while (cur != null) {
            length++;
            if (cur.next == null) {
                tail = cur;
            }
            cur = cur.next;
        }
        tail.next = head;
        int n = k % length;
        for (int i = 0; i < length - n; i++) {
            tail = tail.next;
        }
        cur = tail.next;
        tail.next = null;
        return cur;
    }

}