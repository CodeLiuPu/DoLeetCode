package com.update.easy._796;

/**
 * 给定两个字符串, A 和 B。
 * <p>
 * A 的旋转操作就是将 A 最左边的字符移动到最右边。例如,
 * 若 A = 'abcde'，在移动一次之后结果就是'bcdea' 。
 * 如果在若干次旋转操作之后，A 能变成B，那么返回True。
 * <p>
 * 示例 1:
 * 输入: A = 'abcde', B = 'cdeab'
 * 输出: true
 * <p>
 * 示例 2:
 * 输入: A = 'abcde', B = 'abced'
 * 输出: false
 * <p>
 * 注意：
 * <p>
 * A 和 B 长度不超过 100。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

    }


    public boolean rotateString(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }

        String C = B + B;
        return C.contains(A);
    }
}