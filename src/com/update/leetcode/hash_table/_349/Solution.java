package com.update.leetcode.hash_table._349;

import com.update.helper.ArrayHelper;

import java.util.*;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * <p>
 * 示例 2:
 * <p>
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums1 = new int[]{1, 2, 3, 4, 5, 6, 7, 7, 8, 5};
        int[] nums2 = new int[]{0, 2, 3, 4, 0};
        ArrayHelper.printArr(solution.intersection(nums1, nums2));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        Set set = new HashSet();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        Set<Integer> finalSet = new HashSet();

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                finalSet.add(nums2[i]);
            }
        }

        int[] result = new int[finalSet.size()];
        int index = 0;
        Iterator<Integer> iterator = finalSet.iterator();
        while (iterator.hasNext()) {
            result[index++] = iterator.next();
        }

        return result;
    }

}