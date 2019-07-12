package com.update.two_pointers._088;

import com.update.array.ArrayHelper;

/**
 * 给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 * <p>
 * 说明:
 * <p>
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 * <p>
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 * <p>
 * 输出: [1,2,2,3,5,6]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {2, 0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        solution.merge(nums1, m, nums2, n);
        ArrayHelper.printArr(nums1);
    }

    /**
     * 从后至前 进行插入排序
     * 后面的是 0 所以从后面插入排序不会对 已有的值 有影响
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // 判断nums2 是否为空 为空则直接返回nums1
        if ((nums2.length == 0)
                || (n == 0)) {
            return;
        }

        // 从后至前 进行插入排序
        int realLength = m + n;
        int realIndex = realLength - 1;

        int rm = m > 0 ? m - 1 : m;
        int rn = n > 0 ? n - 1 : n;

        while (rm >= 0 && rn >= 0) {
            if (nums1[rm] > nums2[rn]) {
                nums1[realIndex] = nums1[rm];
                rm--;
            } else {
                nums1[realIndex] = nums2[rn];
                rn--;
            }
            realIndex--;
        }

        // 如果nums2 还有剩余的直接添加至nums1 即可
        if (rn >= 0) {
            for (int i = 0; i <= rn; i++) {
                nums1[i] = nums2[i];
            }
        }
    }
}