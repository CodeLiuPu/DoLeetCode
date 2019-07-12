package com.update.hash_table._202;

import java.util.ArrayList;
import java.util.List;

/**
 * 编写一个算法来判断一个数是不是“快乐数”。
 * <p>
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 * <p>
 * 示例: 
 * <p>
 * 输入: 19
 * 输出: true
 * 解释:
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/happy-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int n = 19;
        System.out.println(solution.isHappy(n));

    }

    public boolean isHappy(int n) {

        List<Integer> container = new ArrayList<>();
        int count = n;

        while (count != 1) {
            if (container.contains(count)) {
                return false;
            }
            container.add(count);

            List<Integer> list = getNumbers(count);
            count = 0;
            for (int i = 0; i < list.size(); i++) {
                count += getSquare(list.get(i));
            }
            if (count == 1) {
                return true;
            }
        }
        return true;
    }


    private int getSquare(int n) {
        return n * n;
    }

    private List<Integer> getNumbers(int n) {
        List<Integer> result = new ArrayList<>();

        while (n >= 10) {
            result.add(n % 10);
            n = n / 10;
        }

        result.add(n);
        return result;
    }

}