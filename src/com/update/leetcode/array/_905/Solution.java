package com.update.leetcode.array._905;

import com.update.helper.ArrayHelper;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {3, 1, 2, 4};
//        int[] ints = {0, 2};
        solution.sortArrayByParity(ints);
        ArrayHelper.printArr(ints);
    }

    public int[] sortArrayByParity(int[] A) {

        int left = 0;
        int right = A.length - 1;

        while (left < right) {
            while (left < right && A[left] % 2 == 0) {
                left++;
            }

            while (left < right && A[right] % 2 > 0) {
                right--;
            }

            swap(A, left, right);
        }


        return A;
    }

    public void swap(int[] arrs, int x, int y) {
        int temp = arrs[x];
        arrs[x] = arrs[y];
        arrs[y] = temp;
    }
}