package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> answer = new ArrayList<>();

        int rowLen = matrix[0].length;
        int colLen = matrix.length;

        if (colLen == 1 && rowLen == 1) {
            answer.add(matrix[0][0]);
            return answer;
        }
        if (colLen == 1) {
            for (int i = 0; i < rowLen; i++) {
                answer.add(matrix[0][i]);
            }
            return answer;
        }
        if (rowLen == 1) {
            for (int i = 0; i < colLen; i++) {
                answer.add(matrix[i][0]);
            }
            return answer;
        }

        int iteration = 0;

        while (iteration <= Math.min(rowLen/2, colLen/2)) {
            for (int i = iteration; i < rowLen - iteration -1; i++) {
                answer.add(matrix[iteration][i]);
            }
            for (int i = iteration; i < colLen - iteration -1; i++) {
                answer.add(matrix[i][rowLen-1-iteration]);
            }
            for (int i = rowLen-1-iteration; i > iteration; i--) {
                answer.add(matrix[colLen-1-iteration][i]);
            }
            for (int i = colLen-1-iteration; i > iteration; i--) {
                answer.add(matrix[i][iteration]);
            }
            iteration++;
        }
        if (!answer.contains(matrix[colLen/2][rowLen/2]))
            answer.add(matrix[colLen/2][rowLen/2]);
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