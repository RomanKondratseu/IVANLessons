package com.roma.study.IvanSort;

public class IvanSort {
    static int findMaxBefore(int[] array, int index) {
        int currentMax = array[index];
        int currentMaxIndex = index;
        for (int i = index; i >= 0; i--) {
            if (currentMax < array[i]) {
                currentMax = array[i];
                currentMaxIndex = i;
            }
        }

        return currentMaxIndex;
    }

    static void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    static void swap(int[] array, int firstIndex, int secondIndex) {
        int a = array[firstIndex];
        int b = array[secondIndex];
        array[firstIndex] = b;
        array[secondIndex] = a;

    }

    static void sort(int[] array) {
        for (int i = 0; i < (array.length - 1); i++) {
            int currentMaxIndex = findMaxBefore(array, (array.length - i - 1));
            swap(array, currentMaxIndex, array.length - i - 1);
        }

    }

    public static void main(String[] args) {
        System.out.println("Original Array");
        int[] array = {9, 2, 4, 0, -3, 2, 1, 0};
        show(array);
        sort(array);
        System.out.println();
        System.out.println("Sort Array");
        show(array);
    }
}

