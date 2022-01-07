package com.roma.study.Fibonacci;

public class Fibonacci {
    static int[] fibonacciFor(int[] array) {
        //todo accept number return number
        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        return array;
    }

    static int fibonacciRecursion(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
        }
    }

    static void showFor(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        showFor(fibonacciFor(array));
        System.out.println(fibonacciRecursion(10));
    }
}
