package com.update.helper;

/**
 * @author : liupu.
 * @date : 2018/12/29
 */
public class LinkedHelper {

    public static ListNode createLinkedList(int[] arr){
        if (arr.length == 0){
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i= 1;i<arr.length;i++){
            ListNode node = new ListNode(arr[i]);
            curr.next = node;
            curr = node;
        }
        return head;
    }

    public static void  printLinkedList(ListNode head){
        ListNode curr = head;
        while (curr != null){

            System.out.print(curr.val+" -> ");
            curr = curr.next;

        }
        System.out.println("NULL");

    }
}
