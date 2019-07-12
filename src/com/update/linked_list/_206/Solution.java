package com.update.linked_list._206;

import com.update.linked_list.LinkedHelper;
import com.update.linked_list.ListNode;

/**
 * 反转一个单链表。

     示例:

     输入: 1->2->3->4->5->NULL
     输出: 5->4->3->2->1->NULL
 */
public class Solution {


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = new int[]{1,2,3,4,5,6,7};
        ListNode node = LinkedHelper.createLinkedList(arr);

//        LinkedHelper.printLinkedList(node);
        LinkedHelper.printLinkedList(solution.reverseList(node));


    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode now = head;

        while (now != null){
            ListNode next = now.next;
            now.next = prev;
            prev = now;
            now = next;
        }

        return prev;
    }

}
