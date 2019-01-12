package com.update.easy._202;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int n = 19;
        System.out.println(solution.isHappy(n));

    }

    public boolean isHappy(int n) {

        List<Integer> container = new ArrayList<>();
        int count = n;

        while (count != 1) {
            if (container.contains(count)) {
                return false;
            }
            container.add(count);

            List<Integer> list = getNumbers(count);
            count = 0;
            for (int i = 0; i < list.size(); i++) {
                count += getSquare(list.get(i));
            }
            if (count == 1) {
                return true;
            }
        }
        return true;
    }


    private int getSquare(int n) {
        return n * n;
    }

    private List<Integer> getNumbers(int n) {
        List<Integer> result = new ArrayList<>();

        while (n >= 10) {
            result.add(n % 10);
            n = n / 10;
        }

        result.add(n);
        return result;
    }

}