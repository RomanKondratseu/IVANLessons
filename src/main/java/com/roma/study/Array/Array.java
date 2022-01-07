package com.roma.study.Array;

public class Array {

    static void show(int[] array) {
        System.out.print(":");
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

    static int max(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max = array[i];
            }
        }
        System.out.println();
        System.out.println(":"+max);
        return max;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        show(array);
        max(array);
    }
}
