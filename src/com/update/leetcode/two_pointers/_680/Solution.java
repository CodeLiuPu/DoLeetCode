package com.update.leetcode.two_pointers._680;

/**
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "aba"
 * 输出: True
 * 示例 2:
 * <p>
 * 输入: "abca"
 * 输出: True
 * 解释: 你可以删除c字符。
 * 注意:
 * <p>
 * 字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-palindrome-ii
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String string = "aba";
        System.out.println(solution.validPalindrome(string));
    }

    /**
     * 左右双指针
     * 如果左右不一样 就分别将判断除去 左或右的中间子字符串 是否为回文串
     */
    public boolean validPalindrome(String s) {
        for (int i = 0; i < s.length(); i++) {
            int length = s.length();
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                return  (isPalindrome(s, i, length - 1 - i - 1)
                        || isPalindrome(s, i + 1, length - 1 - i)) ;
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int l, int r) {
        while (l < r) {
            if (s.charAt(l++) != s.charAt(r--)) {
                return false;
            }
        }
        return true;
    }
}