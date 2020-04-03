package com.update.lcof._021

import com.update.helper.ArrayHelper

/**
 * Created on 2020/04/03
 * Description:
 *
 * @author liupu
 */
class SolutionKt {

    fun exchange(nums: IntArray): IntArray {
        var left = 0
        var right = nums.size - 1

        while (left < right) {
            while ((left < right) && isOddNumber(nums[left])) {
                left += 1
            }
            while ((left < right) && isEvenNumber(nums[right])) {
                right -= 1
            }

            if (isEvenNumber(nums[left]) && isOddNumber(nums[right])){
                swap(nums, left, right)
                left += 1
                right -= 1
            }
        }
        return nums
    }

    /**
     * 判断是否为偶数
     */
    private fun isEvenNumber(num: Int): Boolean {
        return num % 2 == 0
    }

    /**
     * 判断是否为奇数
     */
    private fun isOddNumber(num: Int): Boolean {
        return num % 2 != 0
    }

    private fun swap(arrs: IntArray, x: Int, y: Int) {
        val temp = arrs[x]
        arrs[x] = arrs[y]
        arrs[y] = temp
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
//            val nums = intArrayOf(1, 2, 3, 4)
//            val nums = intArrayOf(1, 3, 5)
            val nums = intArrayOf(1, 11, 14)
            ArrayHelper.printArr(SolutionKt().exchange(nums))
        }
    }
}
