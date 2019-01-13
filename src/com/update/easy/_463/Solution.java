package com.update.easy._463;

class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        System.out.println(grid[0].length);
        System.out.println(solution.islandPerimeter(grid));

    }

    // 岛屿有5种状态
    public int islandPerimeter(int[][] grid) {
        int height = grid.length;
        int width = grid[0].length;
        int[] ints = {0, 0, 0, 0, 0};
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                int landLevel = getLandLevel(grid, i, j);
                ints[landLevel]++;

            }
        }
        int result = 0;
        for (int i = 0; i < ints.length; i++) {
            result = result + i * ints[i];
        }
        return result;
    }

    // 周围有多少个边界
    private int getLandLevel(int[][] grid, int x, int y) {
        int result = 0;
        if (isLand(grid, x, y)) {

            int lx = x - 1;
            int ly = y;

            int rx = x + 1;
            int ry = y;

            int tx = x;
            int ty = y - 1;

            int bx = x;
            int by = y + 1;

            if (!isLand(grid, lx, ly)) {
                result++;
            }

            if (!isLand(grid, rx, ry)) {
                result++;
            }

            if (!isLand(grid, tx, ty)) {
                result++;
            }

            if (!isLand(grid, bx, by)) {
                result++;
            }
        }

        return result;
    }


    private boolean isLand(int[][] grid, int x, int y) {
        int height = grid.length;
        int width = grid[0].length;

        if (x >= 0 && x < height && y >= 0 && y < width && grid[x][y] == 1) {
            return true;
        } else {
            return false;
        }
    }
}