package com.update.easy._058;

/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * <p>
 * 如果不存在最后一个单词，请返回 0 。
 * <p>
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 * <p>
 * 示例:
 * <p>
 * 输入: "Hello World"
 * 输出: 5
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "Hello World";
        System.out.println( solution.lengthOfLastWord(str));
    }

    public int lengthOfLastWord(String s) {
        int lastLength = 0;

        if (null == s || "".equalsIgnoreCase(s)){
            return lastLength;
        }

        String[] strs = s.split(" ");

        if (null == strs || strs.length <= 0){
            return lastLength;
        }

        String lastString = strs[strs.length-1];

        lastLength = lastString.length();


        return lastLength;
    }
}