package com.roma.study.SearchNumberArray;

public class Searsh {
    static void simpleSearch(int[] array, int number) {
        int detectedNumbers = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                detectedNumbers = array[i];
            }
        }
        if (detectedNumbers == number) {
            System.out.println("Число найдено");
            System.out.println("number = " + detectedNumbers);
        } else {
            System.out.println("Число не найдено");
        }
    }
    static void oldSimpleSearch(int []array,int number){
        for(int i:array){
            if(array[i]==number){
                System.out.println("Число найдено = "+ number);
                break;
            }
            else {
                System.out.println("Число не найдено");
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 4, 3, -3};
        int number = 0;
        oldSimpleSearch(array,number);

    }
}
