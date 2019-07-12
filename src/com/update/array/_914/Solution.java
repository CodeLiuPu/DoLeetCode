package com.update.array._914;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 给定一副牌，每张牌上都写着一个整数。
 * <p>
 * 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
 * <p>
 * 每组都有 X 张牌。
 * 组内所有的牌上都写着相同的整数。
 * <p>
 * 仅当你可选的 X >= 2 时返回 true。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：[1,2,3,4,4,3,2,1]
 * 输出：true
 * 解释：可行的分组是 [1,1]，[2,2]，[3,3]，[4,4]
 * <p>
 * 示例 2：
 * <p>
 * 输入：[1,1,1,2,2,2,3,3]
 * 输出：false
 * 解释：没有满足要求的分组。
 * <p>
 * 示例 3：
 * <p>
 * 输入：[1]
 * 输出：false
 * 解释：没有满足要求的分组。
 * <p>
 * 示例 4：
 * <p>
 * 输入：[1,1]
 * 输出：true
 * 解释：可行的分组是 [1,1]
 * <p>
 * 示例 5：
 * <p>
 * 输入：[1,1,2,2,2,2]
 * 输出：true
 * 解释：可行的分组是 [1,1]，[2,2]，[2,2]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= deck.length <= 10000
 * 0 <= deck[i] < 10000
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] ints = {1, 1, 2, 2, 2, 2};
        System.out.println(solution.hasGroupsSizeX(ints));
    }

    // 获取到所有牌是个数 并取最大公约数
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        int index = 0;
        while (index < deck.length) {
            int key = deck[index++];
            if (map.containsKey(key)) {
                int tempValue = map.get(key);
                map.put(key, ++tempValue);
            } else {
                map.put(key, 1);
            }
        }

        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
        Iterator<Map.Entry<Integer, Integer>> iterator = set.iterator();

        Map.Entry<Integer, Integer> firstEntry = iterator.next();

        int value = firstEntry.getValue();

        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            int tempValue = entry.getValue();
            value = getMaxDivide(tempValue, value);
            if (value < 2) {
                return false;
            }
        }
        if (value < 2) {
            return false;
        } else {
            return true;

        }
    }


    public int getMaxDivide(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        int result = -1;
        for (int i = min; i > 1; i--) {
            if (max % i == 0 && min % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}