package com.update.lcof._003

/**
 * Created on 2020/04/03
 * Description:
 *
 * @author liupu
 */
class SolutionKt {

    fun findRepeatNumber(nums: IntArray): Int {
        val container = mutableMapOf<Int, Int>()
        for (num in nums) {
            when (container[num]) {
                null -> {
                    container[num] = 1
                }
                else -> {
                    return num
                }
            }
        }
        return -1
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

        }
    }
}
