package com.roma.study.matrixsumma;

public class MatrixSumma {
    static int[][] summa(int[][] matrix1, int[][] matrix2) {
        int[][] summa = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < summa.length; i++) {
            for (int j = 0; j < summa[0].length; j++) {
                summa[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return summa;

    }

    static void show(int[][] summa) {
        for (int i = 0; i < summa.length; i++) {
            for (int j = 0; j < summa[0].length; j++) {
                System.out.print(summa[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        show(matrix1);
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};
        show(matrix2);
        show(summa(matrix1, matrix2));
    }
}
