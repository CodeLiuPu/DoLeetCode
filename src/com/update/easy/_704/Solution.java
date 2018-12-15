package com.update.easy._704;

import javax.sound.midi.Soundbank;

/**
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * <p>
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [-1,0,3,5,9,12], target = 9
 * 输出: 4
 * 解释: 9 出现在 nums 中并且下标为 4
 * <p>
 * 示例 2:
 * <p>
 * 输入: nums = [-1,0,3,5,9,12], target = 2
 * 输出: -1
 * 解释: 2 不存在 nums 中因此返回 -1
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

       int[] nums = {-1,0,3,5,9,12};
       int target = 5;
//               int[] nums = {5};
//       int target = 5;
        System.out.println(solution.search(nums,target));
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        int middle = (left + right) / 2;
        while (left <= right) {
            if (nums[middle] == target) {
                return middle;
            }

            if (nums[middle] < target) {
                left = middle + 1;
            }

            if (nums[middle] > target) {
                right = middle - 1;
            }
            middle = (left + right) / 2;

        }
        return -1;
    }
}