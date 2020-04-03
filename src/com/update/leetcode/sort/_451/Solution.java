package com.update.leetcode.sort._451;

import java.util.*;

/**
 * 给定一个字符串，请将字符串里的字符按照出现的频率降序排列。
 * <p>
 * 示例 1:
 * <p>
 * 输入:
 * "tree"
 * <p>
 * 输出:
 * "eert"
 * <p>
 * 解释:
 * 'e'出现两次，'r'和't'都只出现一次。
 * 因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。
 * <p>
 * 示例 2:
 * <p>
 * 输入:
 * "cccaaa"
 * <p>
 * 输出:
 * "cccaaa"
 * <p>
 * 解释:
 * 'c'和'a'都出现三次。此外，"aaaccc"也是有效的答案。
 * 注意"cacaca"是不正确的，因为相同的字母必须放在一起。
 * <p>
 * 示例 3:
 * <p>
 * 输入:
 * "Aabb"
 * <p>
 * 输出:
 * "bbAa"
 * <p>
 * 解释:
 * 此外，"bbaA"也是一个有效的答案，但"Aabb"是不正确的。
 * 注意'A'和'a'被认为是两种不同的字符。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String string = "tree";
        System.out.println(solution.frequencySort(string));

    }

    public String frequencySort(String s) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            if (map.containsKey(character)) {
                int tempCount = map.get(character);
                map.put(character, ++tempCount);
            } else {
                map.put(character, 1);
            }
        }

        List<Integer> list = new ArrayList();
        Set<Map.Entry<Character, Integer>> set = map.entrySet();
        for (Map.Entry<Character, Integer> entry : set) {
            Integer integer = entry.getValue();
            list.add(integer);
            Character character = entry.getKey();
        }

        StringBuilder sb = new StringBuilder();
        Collections.sort(list);
        for (Integer i : list) {
            for (Map.Entry<Character, Integer> entry : set) {
                Integer integer = entry.getValue();
                if (integer == i) {
                    Character character = entry.getKey();
                    if (-1 == sb.indexOf(character + "")) {
                        for (int j = 0;j<i;j++){
                            sb.append(character);
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }

        return sb.reverse().toString();
    }
}