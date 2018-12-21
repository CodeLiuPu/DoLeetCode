package com.update.easy._206;

import com.update.ListNode;

/**
 * 反转一个单链表。

     示例:

     输入: 1->2->3->4->5->NULL
     输出: 5->4->3->2->1->NULL
 */
public class Solution {


    public static void main(String[] args) {
        Solution solution = new Solution();


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
