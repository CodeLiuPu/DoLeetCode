package com.update.easy._231;

/**
 * 给定一个整数，编写一个函数来判断它是否是 2 的幂次方。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1
 * 输出: true
 * 解释: 2^0 = 1
 * <p>
 * 示例 2:
 * <p>
 * 输入: 16
 * 输出: true
 * 解释: 2^4 = 16
 * <p>
 * 示例 3:
 * <p>
 * 输入: 218
 * 输出: false
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPowerOfTwo(16));
    }

    public boolean isPowerOfTwo(int n) {
        if (n > 0) {
            return (n & (n - 1)) == 0;
        } else {
            return false;
        }
    }
}