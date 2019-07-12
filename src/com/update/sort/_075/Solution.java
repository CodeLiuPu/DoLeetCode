package com.update.sort._075;

/**
 * 给定一个包含红色、白色和蓝色，一共 n 个元素的数组，原地对它们进行排序，使得相同颜色的元素相邻，并按照红色、白色、蓝色顺序排列。
 * <p>
 * 此题中，我们使用整数 0、 1 和 2 分别表示红色、白色和蓝色。
 * <p>
 * 注意:
 * 不能使用代码库中的排序函数来解决这道题。
 * <p>
 * 示例:
 * <p>
 * 输入: [2,0,2,1,1,0]
 * 输出: [0,0,1,1,2,2]
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    // 三路快排
    public void sortColors(int[] nums) {
        int zero = -1;
        int two = nums.length;
        int index = 0;
        while (index < two) {
            if (nums[index] == 1) {
                index++;
            } else if (nums[index] == 0) {
                zero++;
                int temp = nums[zero];
                nums[zero] = nums[index];
                nums[index] = temp;
                index++;
            } else {
                two--;
                int temp = nums[two];
                nums[two] = nums[index];
                nums[index] = temp;
            }
        }
    }

    // 暴力 遍历
    public void sortColors2(int[] nums) {
        int[] count = new int[3];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int index = 0;

        for (int i = 0; i < count.length; i++) {
            int value = count[i];
            for (int j = 0; j < value; j++) {
                nums[index++] = i;
            }
        }
    }
}