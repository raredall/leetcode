package com.raredall.array;

/**
 * 59. 螺旋矩阵 II
 *
 * @author Raredall
 */
public class Solution59 {
    public int[][] generateMatrix(int n) {
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int num = 0;
        int[][] res = new int[n][n];

        while (num < n * n) {
            for (int i = left; i <= right; i++) {
                res[top][i] = ++num;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                res[i][right] = ++num;
            }
            right--;

            for (int i = right; i >= left; i--) {
                res[bottom][i] = ++num;
            }
            bottom--;

            for (int i = bottom; i >= top; i--) {
                res[i][left] = ++num;
            }
            left++;
        }

        return res;
    }
}
