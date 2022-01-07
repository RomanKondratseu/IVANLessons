package com.roma.study.Factorial;

import java.util.Scanner;

public class Factorial {
    static void factorial(int number) {
        int summ = 1;
        for (int i = 0; i < number; i++) {
            summ += summ * i;
        }
        System.out.println(summ);
    }

    public static void main(String[] args) {
        System.out.println("Введите факториал числа");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        factorial(number);
    }
}
