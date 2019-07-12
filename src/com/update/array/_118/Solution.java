package com.update.array._118;

import java.util.ArrayList;
import java.util.List;

/**
 * 杨辉三角
 * //       1
 * //      1 1
 * //     1 2 1
 * //    1 3 3 1
 * //   1 4 6 4 1
 * // 1 5 10 10 5 1
 */
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generate(5));

    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<List<Integer>>();

        if (numRows == 0) {
            return triangle;
        }

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i-1);
            row.add(1);

            for (int j = 1; j < i; j++) {
                int num = prevRow.get(j - 1) + prevRow.get(j);
                row.add(num);
            }

            row.add(1);
            triangle.add(row);
        }

        return triangle;

    }
}