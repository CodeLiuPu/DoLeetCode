package com.update.leetcode.string._541;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串和一个整数 k，
 * 你需要对从字符串开头算起的每个 2k 个字符的前k个字符进行反转。
 * 如果剩余少于 k 个字符，则将剩余的所有全部反转。
 * 如果有小于 2k 但大于或等于 k 个字符，则反转前 k 个字符，并将剩余的字符保持原样。
 * <p>
 * 示例:
 * <p>
 * 输入: s = "abcdefg", k = 2
 * 输出: "bacdfeg"
 * <p>
 * 要求:
 * <p>
 * 该字符串只包含小写的英文字母。
 * 给定字符串的长度和 k 在[1, 10000]范围内。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String string = "abcdefg";
        int k = 2;
        System.out.println(solution.reverseStr(string, k));
    }

    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();

        List<Integer> lefts = new ArrayList<>();
        List<Integer> rights = new ArrayList<>();

        int left = 0;
        int right = k - 1;
        while (left < s.length()) {
            if (right >= s.length()) {
                right = s.length() - 1;
            }
            lefts.add(left);
            rights.add(right);
            left += 2 * k;
            right += 2 * k;
        }

        for (int i=0;i<lefts.size();i++){
            left = lefts.get(i);
            right = rights.get(i);
            while (left < right) {
                swap(chars, left, right);
                left++;
                right--;
            }
        }
        return new String(chars);
    }

    public void swap(char[] arrs, int x, int y) {
        char temp = arrs[x];
        arrs[x] = arrs[y];
        arrs[y] = temp;
    }
}