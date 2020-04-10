package com.update.leetcode.string._151;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
    }

    public String reverseWords(String s) {
        String[] strings = s.split(" ");
        List<String> data = new ArrayList<>();

        for (int i = strings.length - 1; i >= 0; i--) {
            String string = strings[i];
            String temp = string.trim();
            if (!"".equals(temp)) {
                data.add(string);
            }
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < data.size(); i++) {
            res.append(data.get(i)).append(" ");
        }
        return res.toString().trim();
    }

}
