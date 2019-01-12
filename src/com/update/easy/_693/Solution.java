package com.update.easy._693;

/**
 * 给定一个正整数，检查他是否为交替位二进制数：换句话说，就是他的二进制数相邻的两个位数永不相等。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 5
 * 输出: True
 * 解释:
 * 5的二进制数是: 101
 * <p>
 * 示例 2:
 * <p>
 * 输入: 7
 * 输出: False
 * 解释:
 * 7的二进制数是: 111
 * <p>
 * 示例 3:
 * <p>
 * 输入: 11
 * 输出: False
 * 解释:
 * 11的二进制数是: 1011
 * <p>
 * 示例 4:
 * <p>
 * 输入: 10
 * 输出: True
 * 解释:
 * 10的二进制数是: 1010
 */
class Solution {
    public static void main(String[] args) {

    }

    public boolean hasAlternatingBits(int n) {
        int last = n & 1;

        while (n > 0) {
            n = n >> 1;
            int temp = n & 1;

            if (!(((last & temp) == 0) && ((last | temp) == 1))) {
                return false;
            }
            last = temp;
        }

        return true;

    }
}