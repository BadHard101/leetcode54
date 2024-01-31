package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> answer = new ArrayList<>();

        int rowLen = matrix[0].length;
        int colLen = matrix.length;

        int

        return answer;
    }

    public static void main(String[] args) {
        /*System.out.println(spiralOrder(new int[][]{
                {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18},
                {19, 20, 21, 22, 23, 24},
                {25, 26, 27, 28, 29, 30},
                {31, 32, 33, 34, 35, 36}
        }));
        System.out.println(spiralOrder(new int[][]{
                {1, 2, 3, 4, 5, 6, 7},
                {8, 9, 10, 11, 12, 13, 14},
                {15, 16, 17, 18, 19, 20, 21},
                {22, 23, 24, 25, 26, 27, 28},
                {29, 30, 31, 32, 33, 34, 35},
                {36, 37, 38, 39, 40, 41, 42},
                {43, 44, 45, 46, 47, 48, 49},
                {50, 51, 52, 53, 54, 55, 56}
        }));
        System.out.println(spiralOrder(new int[][]{
                {6,9,7,9}
        }));*/
        System.out.println(spiralOrder(new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
                {13, 14, 15}
        }));
    }
}