package com.update.leetcode.hash_table._350;

import com.update.helper.ArrayHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2,2]
 * <p>
 * 示例 2:
 * <p>
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [4,9]
 * <p>
 * 说明：
 * <p>
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
 * 我们可以不考虑输出结果的顺序。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1, 2, 3, 4, 5, 6, 7, 7, 8, 5};
        int[] nums2 = new int[]{0, 2, 3, 4, 0};
        ArrayHelper.printArr(solution.intersect(nums1, nums2));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map.containsKey(nums1[i])) {
                int tempCount = map.get(nums1[i]);
                map.put(nums1[i], ++tempCount);
            } else {
                map.put(nums1[i], 1);
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums2.length; i++) {
            if (map.containsKey(nums2[i])) {
                if (map.get(nums2[i]) > 0) {
                    list.add(nums2[i]);
                }
                int tempCount = map.get(nums2[i]);
                if (tempCount == 1) {
                    map.remove(nums2[i]);
                } else {
                    map.put(nums2[i], --tempCount);
                }
            }
        }

        int index = 0;
        int[] arr = new int[list.size()];
        for (Integer integer : list) {
            arr[index++] = integer;
        }
        return arr;
    }

}