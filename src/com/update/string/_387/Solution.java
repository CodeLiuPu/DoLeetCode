package com.update.string._387;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * <p>
 * 案例:
 * <p>
 * s = "leetcode"
 * 返回 0.
 * <p>
 * s = "loveleetcode",
 * 返回 2.
 * <p>
 * <p>
 * 注意事项：您可以假定该字符串只包含小写字母。
 */
class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "dddccdbba";
        System.out.println(solution.firstUniqChar(str));

    }

    public int firstUniqChar(String s) {
        List<Character> chars = new ArrayList<>(26);
        List<Integer> ints = new ArrayList<>(26);
        Map<Character, Integer> indexs = new HashMap<>();
        char[] charArr = s.toCharArray();

        for (int i = 0; i < charArr.length; i++) {
            add(chars, ints, indexs, charArr[i], i);
        }

        for (int i = 0; i < ints.size(); i++) {
            if (ints.get(i) == 1) {
                return indexs.get(chars.get(i));
            }
        }

        return -1;
    }

    private void add(List<Character> chars, List<Integer> ints, Map<Character, Integer> indexs, char ch, int index) {
        if (chars.contains(ch)) {
            int i = chars.indexOf(ch);
            int count = ints.get(i);
            ints.set(i, ++count);
        } else {
            chars.add(ch);
            ints.add(1);
            indexs.put(ch, index);
        }
    }
}