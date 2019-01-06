package com.update.easy._326;

/**
 * 给定一个整数，写一个函数来判断它是否是 3 的幂次方。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 27
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入: 0
 * 输出: false
 * <p>
 * 示例 3:
 * <p>
 * 输入: 9
 * 输出: true
 * <p>
 * 示例 4:
 * <p>
 * 输入: 45
 * 输出: false
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num = 6;
        System.out.println(solution.isPowerOfThree(num));
    }

    public boolean isPowerOfThree(int n) {
        if (n <= 0 || n == 2) {
            return false;
        }
        int result = n;
        int more = 0;
        while (result > 1) {
            result = n / 3;
            more = n % 3;
            n = result;
            if (more > 0) {
                return false;
            }
        }
        return true;
    }
}