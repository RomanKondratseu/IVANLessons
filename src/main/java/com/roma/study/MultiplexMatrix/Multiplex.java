package com.roma.study.MultiplexMatrix;

public class Multiplex {
    static int[][] multiplex(int[][] matrix1, int[][] matrix2) {
        int[][] multiplex = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    multiplex[i][j] = multiplex[i][j] + matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return multiplex;
    }

    static void show(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static boolean validateMatrix(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length == matrix2.length) {
            System.out.println("Умножение матриц");
            show(multiplex(matrix1, matrix2));
            return true;

        } else {
            System.out.println("Умножение невозможно");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Matrix1");
        int[][] matrix1 = {{1, 2}, {3, 4}};
        show(matrix1);
        int[][] matrix2 = {{1, 2}, {3, 4}};
        System.out.println("Matrix2");
        show(matrix2);
        validateMatrix(matrix1, matrix2);
    }
}
