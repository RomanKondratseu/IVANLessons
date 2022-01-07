package com.roma.study.ReverseNumber;

public class Reverse {
    static int[] reverse(int number) {
        //todo
        int[] array = new int[4];
        int x = 0;
        int i = 0;
        for (int j = number; j > 0; j = j / 10) {
            number = number / 10;
            x = j - number * 10;
            array[i] = x;
            i = i + 1;
        }
        return array;
    }

    static void show(int[] array){
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]);
        }
    }

    public static void main(String[] args) {
        int number = 3215;
        show(reverse(number));
    }
}
