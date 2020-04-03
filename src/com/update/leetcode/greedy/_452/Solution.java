package com.update.leetcode.greedy._452;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 在二维空间中有许多球形的气球。
 * 对于每个气球，提供的输入是水平方向上，气球直径的开始和结束坐标。
 * 由于它是水平的，所以y坐标并不重要，因此只要知道开始和结束的x坐标就足够了。
 * 开始坐标总是小于结束坐标。平面内最多存在104个气球。
 * <p>
 * 一支弓箭可以沿着x轴从不同点完全垂直地射出。
 * <p>
 * 在坐标x处射出一支箭，
 * 若有一个气球的直径的开始和结束坐标为 xstart，xend， 且满足  xstart ≤ x ≤ xend，则该气球会被引爆。
 * <p>
 * 可以射出的弓箭的数量没有限制。
 * <p>
 * 弓箭一旦被射出之后，可以无限地前进。我们想找到使得所有气球全部被引爆，所需的弓箭的最小数量。
 * <p>
 * Example:
 * <p>
 * 输入:
 * [[10,16], [2,8], [1,6], [7,12]]
 * <p>
 * 输出:
 * 2
 * <p>
 * 解释:
 * 对于该样例，我们可以在x = 6（射爆[2,8],[1,6]两个气球）和 x = 11（射爆另外两个气球）。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-number-of-arrows-to-burst-balloons
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {
    public static void main(String[] args) {
        int[][] nums = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
//        int[][] nums = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        System.out.println(new Solution().findMinArrowShots(nums));
    }

    public int findMinArrowShots(int[][] points) {

        // 题意
        // 气球是二维空间
        // 这里假设只 一维空间 我们看到的只是气球的一个切面的 起点和终点
        // 只要在 起点到终点之间射箭就可以将气球引爆
        if (points.length == 0) {
            return 0;
        }

        // 将数组 按照 区间结尾进行排序
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int cnt = 1;
        int end = points[0][1];

        for (int i = 0; i < points.length; i++) {
            if (points[i][0] <= end) {
                continue;
            }
            end = points[i][1];
            cnt++;
        }
        return cnt;
    }
}