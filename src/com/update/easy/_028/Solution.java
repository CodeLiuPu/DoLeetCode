package com.update.easy._028;

/**
 * 实现 strStr() 函数。
 * <p>
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * <p>
 * 示例 2:
 * <p>
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.strStr("mississippi", "pi"));
    }

    public int strStr(String haystack, String needle) {

        int result = -1;
        if ("".equals(needle)) {
            return 0;
        }

        if (!haystack.contains(needle)) {
            return -1;
        }

        int lengthH = haystack.length();
        int lengthN = needle.length();

        char[] charH = haystack.toCharArray();
        char[] charN = needle.toCharArray();

        int indexH = 0;
        int indexN = 0;

        while (indexH < lengthH && indexN < lengthN) {
            if (charH[indexH] == charN[0]) {
                result = indexH;

                for (int i = 0; i < lengthN; i++) {
                   if ( indexH < lengthH && indexN < lengthN){
                       if (charH[indexH] != charN[indexN]) {
                           indexN = 0;
                           indexH = result+1;
                           result = -1;
                           break;
                       }
                       indexH++;
                       indexN++;
                   }
                }
            } else {
                indexH++;
            }
        }
        return result;
    }

}