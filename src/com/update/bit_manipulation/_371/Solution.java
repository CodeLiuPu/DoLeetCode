package com.update.bit_manipulation._371;

/**
 * 不使用运算符 + 和 - ​​​​​​​，计算两整数 ​​​​​​​a 、b ​​​​​​​之和。
 * <p>
 * 示例 1:
 * <p>
 * 输入: a = 1, b = 2
 * 输出: 3
 * <p>
 * 示例 2:
 * <p>
 * 输入: a = -2, b = 3
 * 输出: 1
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int a = 2;
        int b = 3;
        System.out.println(solution.getSum(a, b));
    }

    public int getSum(int a, int b) {
        if (b == 0) {
            return a;
        }
        int sum = a ^ b;
        int carry = (a & b) << 1;
        return getSum(sum, carry);
    }

}