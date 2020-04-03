package com.update.hash_table._242


/**
 * Created on 2020/04/03
 * Description:
 *
 * @author liupu
 */
class SolutionKt {

    fun isAnagram(s: String, t: String): Boolean {
        val sMap = IntArray(26){0}
        val tMap = IntArray(26){0}
        for (c in s.toCharArray()) {
            (sMap[c - 'a'])++
        }
        for (c in t.toCharArray()) {
            (tMap[c - 'a'])++
        }
        return (0..25).none { sMap[it] != tMap[it] }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

//           val s = "anagram"
//            val t = "nagaram"

           val s = "rat"
            val t = "car"

            println(SolutionKt().isAnagram(s,t))

        }
    }
}