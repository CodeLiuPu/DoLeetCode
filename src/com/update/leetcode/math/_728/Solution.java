package com.update.leetcode.math._728;

import java.util.ArrayList;
import java.util.List;

/**
 * 自除数 是指可以被它包含的每一位数除尽的数。
 * <p>
 * 例如，128 是一个自除数，因为 128 % 1 == 0，128 % 2 == 0，128 % 8 == 0。
 * <p>
 * 还有，自除数不允许包含 0 。
 * <p>
 * 给定上边界和下边界数字，输出一个列表，列表的元素是边界（含边界）内所有的自除数。
 * <p>
 * 示例 1：
 * <p>
 * 输入：
 * 上边界left = 1, 下边界right = 22
 * 输出： [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * <p>
 * 注意：
 * <p>
 * 每个输入参数的边界满足 1 <= left <= right <= 10000。
 */
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        int index = left;
        while (index <= right) {
            if (isSelfDividingNumber(index)) {
                result.add(index);
            }
            index++;
        }

        return result;
    }

    private boolean isSelfDividingNumber(int n) {

        List<Integer> list = getNumbers(n);

        if (list.contains(0)) {
            return false;
        }

        for (int i = 0; i < list.size(); i++) {
            if (n % list.get(i) != 0) {
                return false;
            }
        }
        return true;
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