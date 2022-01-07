package com.roma.study.QuickSort;

public class QuickSort {
    static void quickSort(int[] array, int lefBorder, int rightBorder) {
        if (lefBorder < rightBorder) {
            int divideIndex = partition(array, lefBorder, rightBorder);
            quickSort(array, lefBorder, divideIndex);
            quickSort(array, divideIndex, rightBorder);
        }
        System.out.println("QuickSort");
        show(array);
    }

    static int partition(int[] array, int left, int right) {
        int leftIndex = left;
        int rightIndex = right;
        int pivot = array[left];
        while (leftIndex <= rightIndex) {
            while (pivot < array [leftIndex]) {
                leftIndex++;
            }
            while (pivot > array[rightIndex]) {
                rightIndex--;
            }
            if (leftIndex <= array[rightIndex]) {
                swap(array, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;

            }
        }
        return leftIndex;
    }

    static void swap(int[] array, int index1, int index2) {
        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;

    }

    static void show(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        show(array);
        System.out.println("QuickSort");
        quickSort(array,0,array.length-1);
    }
}


