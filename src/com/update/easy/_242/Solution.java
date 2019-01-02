package com.update.easy._242;

import java.util.HashMap;
import java.util.Map;

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
            if (!mapt.containsKey(character)){
                return false;
            }
            int counts = maps.get(character);
            int countt = mapt.get(character);
            if (counts != countt){
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