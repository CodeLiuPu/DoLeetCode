package com.update.medium._209;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的连续子数组。如果不存在符合条件的连续子数组，返回 0。
 * <p>
 * 示例:
 * <p>
 * 输入: s = 7, nums = [2,3,1,2,4,3]
 * 输出: 2
 * 解释: 子数组 [4,3] 是该条件下的长度最小的连续子数组。
 * <p>
 * 进阶:
 * <p>
 * 如果你已经完成了O(n) 时间复杂度的解法, 请尝试 O(n log n) 时间复杂度的解法。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int s = 15;
        int[] nums = new int[]{5, 1, 3, 5, 10, 7, 4, 9, 2, 8};
        System.out.println(solution.minSubArrayLen(s, nums));
    }

    public int minSubArrayLen(int s, int[] nums) {
        int sonLength = 0;
        int fast = 0;
        int slow = 0;
        int sum = 0;

        while (slow < nums.length && fast < nums.length) {

            if (fast != slow) {
                sum += nums[fast];
            } else {
                sum = nums[slow];
            }

            if (sum >= s) {
                int tempLength = fast - slow + 1;
                if (sonLength > tempLength || sonLength == 0) {
                    sonLength = tempLength;
                }
                slow++;
                fast = slow;
                continue;
            } else if (fast == nums.length - 1) {
                slow++;
                fast = slow;
                continue;
            }

            fast++;
        }
        return sonLength;
    }
}