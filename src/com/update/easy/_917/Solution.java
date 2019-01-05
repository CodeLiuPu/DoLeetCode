package com.update.easy._917;

/**
 * 给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入："ab-cd"
 * 输出："dc-ba"
 * <p>
 * 示例 2：
 * <p>
 * 输入："a-bC-dEf-ghIj"
 * 输出："j-Ih-gfE-dCba"
 * <p>
 * 示例 3：
 * <p>
 * 输入："Test1ng-Leet=code-Q!"
 * 输出："Qedo1ct-eeLg=ntse-T!"
 * <p>
 * <p>
 * <p>
 * 提示：
 * <p>
 * S.length <= 100
 * 33 <= S[i].ASCIIcode <= 122
 * S 中不包含 \ or "
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        //String string = "-";
        //String string = "a-bC-dEf-ghIj";
        String string = "z<*zj";
        System.out.println(solution.reverseOnlyLetters(string));
    }

    public String reverseOnlyLetters(String S) {

        int left = 0;
        int right = S.length() - 1;

        char[] chars = S.toCharArray();

        while (left < right) {
            while (left < right && !isLetter(chars[left])) {
                left++;
            }
            while (left < right && !isLetter(chars[right])) {
                right--;
            }
            swap(chars, left, right);
            left++;
            right--;

        }
        return new String(chars);
    }

    private boolean isLetter(char cha) {
        if ((cha >= 'a' && cha <= 'z') || (cha >= 'A' && cha <= 'Z')) {
            return true;
        }
        return false;
    }

    public void swap(char[] arrs, int x, int y) {
        char temp = arrs[x];
        arrs[x] = arrs[y];
        arrs[y] = temp;
    }
}