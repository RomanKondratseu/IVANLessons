package com.roma.study.BinarySearch;

public class BinarySearch {
    static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = tmp;
                }
            }
        }
        return array;
    }

    static int binarySearch(int[] array, int first, int last, int number) {
        int result = 0;
        while (first <= last) {
            int middle = (first + last) / 2;
            if (array[middle] < number) {
                first = middle + 1;
            }
            if (array[middle] > number) {
                last = middle - 1;
            }
            if (array[middle] == number) {
                result = result + number;
                break;
            }
        }
        return result;
    }

    static void show(int number, int result) {
        if (number != result) {
            System.out.println("");
        } else {
            System.out.println(" = " + result);
        }
    }

    public static void main(String[] args) {
        int[] array = {20, 10, 50, 40};
        int first = 0;
        int last = array.length - 1;
        int number = 20;
        show(number, binarySearch(sort(array), first, last, number));
    }
}
