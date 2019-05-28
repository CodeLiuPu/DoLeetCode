package com.update.easy._539;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定一个 24 小时制（小时:分钟）的时间列表，找出列表中任意两个时间的最小时间差并已分钟数表示。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入: ["23:59","00:00"]
 * 输出: 1
 * <p>
 * 备注:
 * <p>
 * 列表中时间数在 2~20000 之间。
 * 每个时间取值在 00:00~23:59 之间。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> data = new ArrayList<>();
        data.add("23:59");
        data.add("00:00");
        data.add("00:00");
        System.out.println(solution.findMinDifference(data));
    }

    public int findMinDifference(List<String> timePoints) {
        Collections.sort(timePoints);
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < timePoints.size() - 1; i++) {
            data.add(findMinB2(timePoints.get(i), timePoints.get(i + 1)));
        }
        data.add(findMinB2(timePoints.get(0), timePoints.get(timePoints.size() - 1)));

        Collections.sort(data);
        return data.get(0);
    }

    private int findMinB2(String timeStr1, String timeStr2) {
        int time1 = tranH2M(timeStr1);
        int time2 = tranH2M(timeStr2);

        int minTime = Math.min(time1, time2);
        int maxTime = Math.max(time1, time2);
        int result1 = maxTime - minTime;
        int result2 = minTime + 60 * 24 - maxTime;
        return Math.min(result1, result2);
    }

    private int tranH2M(String time) {
        String[] times = time.split(":");
        int result = Integer.valueOf(times[0]) * 60 + Integer.valueOf(times[1]);
        return result;
    }
}
