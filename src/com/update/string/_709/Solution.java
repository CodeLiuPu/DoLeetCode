package com.update.string._709;

/**
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 * <p>
 * 示例 1：
 * <p>
 * 输入: "Hello"
 * 输出: "hello"
 * <p>
 * 示例 2：
 * <p>
 * 输入: "here"
 * 输出: "here"
 * <p>
 * 示例 3：
 * <p>
 * 输入: "LOVELY"
 * 输出: "lovely"
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

    }
    public String toLowerCase(String str) {
        char[] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >='A' && chars[i] <= 'Z'){
                chars[i] = (char) (chars[i] + 32);
            }
        }

        String result = String.copyValueOf(chars);
        return result;
    }
}