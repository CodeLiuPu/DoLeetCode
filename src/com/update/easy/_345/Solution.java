package com.update.easy._345;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "hello"
 * 输出: "holle"
 * <p>
 * 示例 2:
 * <p>
 * 输入: "leetcode"
 * 输出: "leotcede"
 * <p>
 * 说明:
 * 元音字母不包含字母"y"。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "hello";
        System.out.println(solution.reverseVowels(str));
    }

    // 元音字母 是 aeiou
    public String reverseVowels(String s) {
        int left = 0;
        int right = s.length() - 1;
        List<Character> letters = new ArrayList<>();
        letters.add('a');
        letters.add('e');
        letters.add('i');
        letters.add('o');
        letters.add('u');
        letters.add('A');
        letters.add('E');
        letters.add('I');
        letters.add('O');
        letters.add('U');
        char[] chars = s.toCharArray();

        while (left < right) {

            if (!letters.contains(chars[left])) {
                left++;
                continue;
            }
            if (!letters.contains(chars[right])) {
                right--;
                continue;
            }

            swap(chars,left,right);
            left++;
            right--;
        }
        return new String(chars);
    }

    private void swap(char[] arrs, int x, int y) {
        char temp = arrs[x];
        arrs[x] = arrs[y];
        arrs[y] = temp;
    }
}