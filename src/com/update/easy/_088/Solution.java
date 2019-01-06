package com.update.easy._088;

import com.update.ArrayHelper;

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

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        // 判断nums2 是否为空 为空则直接返回nums1
        if ((nums2.length == 0)
                || (n == 0)) {
            return;
        }

        // 从后至前 进行拆入排序
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