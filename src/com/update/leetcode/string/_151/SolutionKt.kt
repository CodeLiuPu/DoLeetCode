package com.update.leetcode.string._151

/**
 * Created on 2020/04/03
 * Description:
 *
 * @author liupu
 */
class SolutionKt {

    fun reverseWords(s: String): String {
        return s.split(" ")
                .filter {
                    it.isNotBlank()
                }
                .reversed()
                .joinToString(separator = " ") { it }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val s = "hello hehe jajj    hhh"
            println(SolutionKt().reverseWords(s))
        }
    }
}
