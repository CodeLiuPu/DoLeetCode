package com.update.easy._205;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定两个字符串 s 和 t，判断它们是否是同构的。
 * <p>
 * 如果 s 中的字符可以被替换得到 t ，那么这两个字符串是同构的。
 * <p>
 * 所有出现的字符都必须用另一个字符替换，同时保留字符的顺序。两个字符不能映射到同一个字符上，但字符可以映射自己本身。
 * <p>
 * 示例 1:
 * <p>
 * 输入: s = "egg", t = "add"
 * 输出: true
 * <p>
 * 示例 2:
 * <p>
 * 输入: s = "foo", t = "bar"
 * 输出: false
 * <p>
 * 示例 3:
 * <p>
 * 输入: s = "paper", t = "title"
 * 输出: true
 * <p>
 * 说明:
 * 你可以假设 s 和 t 具有相同的长度
 */
public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

    }

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int length = s.length();
        Map<Character, Character> map = new HashMap<>();
        char[] chars = s.toCharArray();
        char[] chart = t.toCharArray();
        for (int i = 0; i < length; i++) {
            if (map.containsKey(chars[i])) {
                if (chart[i] != map.put(chars[i], chart[i])) {
                    return false;
                }
            } else if (map.containsValue(chart[i])) {
                return false;
            } else {
                map.put(chars[i], chart[i]);
            }

        }
        return true;
    }
}