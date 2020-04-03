package com.update.leetcode.two_pointers._633;

/**
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，
 * 使得 a2 + b2 = c。
 * <p>
 * 示例1:
 * <p>
 * 输入: 5
 * 输出: True
 * 解释: 1 * 1 + 2 * 2 = 5
 * <p>
 * <p>
 * 示例2:
 * <p>
 * 输入: 3
 * 输出: False
 */
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int c = 2;
        System.out.println(solution.judgeSquareSum(c));
    }


    // 优化版
    public boolean judgeSquareSum(int c) {
        int i = 0, j = (int) Math.sqrt(c);

        while (i <= j) {
            int powSum = i * i + j * j;
            if (powSum == c) {
                return true;
            }
            if (powSum > c) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }


    // 最初版
    public boolean judgeSquareSum2(int c) {
        if (1 == c) {
            return true;
        }

        int middle = (int) Math.sqrt(c);
        for (int i = 0; i <= middle; i++) {
            for (int j = i; j <= middle; j++) {
                if (c == i * i + j * j) {
                    return true;
                }
            }
        }

        return false;
    }
}