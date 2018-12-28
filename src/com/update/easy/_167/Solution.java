package com.update.easy._167;

/**
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 * <p>
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 * <p>
 * 说明:
 * <p>
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * <p>
 * 示例:
 * <p>
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(solution.twoSum(numbers, target));
    }

    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int temp = target - numbers[i];
            int rightIndex = binarySearch(numbers, temp, i + 1, numbers.length - 1);
            if (rightIndex >= 0) {
                return new int[]{i + 1, rightIndex + 1};
            }

        }

        return new int[]{};
    }

    private int binarySearch(int[] numbers, int target, int left, int right) {
        while (left <= right) {
            int middle = (left + right) / 2;

            if (numbers[middle] == target) {
                return middle;
            }

            if (numbers[middle] < target) {
                left = middle + 1;
            } else if (numbers[middle] > target) {
                right = middle - 1;
            }
        }
        return -1;
    }
}