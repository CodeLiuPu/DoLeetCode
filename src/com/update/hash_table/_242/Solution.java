package com.update.hash_table._242;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "anagram", t = "nagaram"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: s = "rat", t = "car"
 * 输出: false
 * 说明:
 * 你可以假设字符串只包含小写字母。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-anagram
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

    }

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> maps = putValue2Map(s);
        Map<Character, Integer> mapt = putValue2Map(t);

        for (Character character : maps.keySet()) {
            if (!mapt.containsKey(character)) {
                return false;
            }
            int counts = maps.get(character);
            int countt = mapt.get(character);
            if (counts != countt) {
                return false;
            }
        }
        return true;
    }

    private Map<Character, Integer> putValue2Map(String string) {
        Map<Character, Integer> map = new HashMap();
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {

            if (map.containsKey(chars[i])) {
                int tempCount = map.get(chars[i]);
                map.put(chars[i], ++tempCount);
            } else {
                map.put(chars[i], 1);
            }
        }
        return map;
    }
}