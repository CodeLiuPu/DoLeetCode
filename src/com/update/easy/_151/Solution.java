package com.update.easy._151;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个字符串，逐个翻转字符串中的每个单词。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入: "the sky is blue"
 * 输出: "blue is sky the"
 * 示例 2：
 * <p>
 * 输入: "  hello world!  "
 * 输出: "world! hello"
 * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 示例 3：
 * <p>
 * 输入: "a good   example"
 * 输出: "example good a"
 * 解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 * <p>
 * <p>
 * 说明：
 * <p>
 * 无空格字符构成一个单词。
 * 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 */
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
