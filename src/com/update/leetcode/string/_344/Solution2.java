package com.update.leetcode.string._344;

public class Solution2 {
    public static void main(String[] args) {
        Solution2 solution = new Solution2();

    }

    public String reverseString(String s) {
        int half = s.length() / 2 ;
        int length = s.length();
        char[] chars = s.toCharArray();

        for (int i = 0; i < half; i++) {
            if (length - 1 - i >= 0){
                swap(chars, i, length - 1 - i);
            }
        }
        return new String(chars);
    }

    public void swap(char[] arrs, int x, int y) {
        char temp = arrs[x];
        arrs[x] = arrs[y];
        arrs[y] = temp;
    }

}