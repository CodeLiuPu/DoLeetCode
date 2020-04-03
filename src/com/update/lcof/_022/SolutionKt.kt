package com.update.lcof._022

import com.update.helper.LinkedHelper
import com.update.helper.ListNode

/**
 * Created on 2020/04/03
 * Description:
 *
 * @author liupu
 */
class SolutionKt {

    fun getKthFromEnd(head: ListNode?, k: Int): ListNode? {
        var slow = head
        var fast = head
        for (i in 0 until k){
            if (null == fast){
                return null
            }
            fast = fast.next
        }
        while (null != fast){
            slow = slow!!.next
            fast = fast.next

        }
        return slow
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val arr = intArrayOf(1, 2, 3, 4, 5)
            val head = LinkedHelper.createLinkedList(arr)
            val k = 2
            LinkedHelper.printLinkedList(SolutionKt().getKthFromEnd(head, k))
        }
    }
}
