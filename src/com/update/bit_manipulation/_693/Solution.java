package com.update.bit_manipulation._693;


class Solution {
    public static void main(String[] args) {

    }

    public boolean hasAlternatingBits(int n) {
        int last = n & 1;

        while (n > 0) {
            n = n >> 1;
            int temp = n & 1;

            if (!(((last & temp) == 0) && ((last | temp) == 1))) {
                return false;
            }
            last = temp;
        }

        return true;

    }
}