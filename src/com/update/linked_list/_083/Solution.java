package com.update.linked_list._083;


import com.update.linked_list.LinkedHelper;
import com.update.linked_list.ListNode;

/**
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * <p>
 * 示例 2:
 * <p>
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 7, 8};
        ListNode node = LinkedHelper.createLinkedList(arr);

        LinkedHelper.printLinkedList(node);
        LinkedHelper.printLinkedList(solution.deleteDuplicates(node));
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null){
            if (curr.val == curr.next.val){
                ListNode node = curr.next;
                curr.next = node.next;
                node = null;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

}