package org.example;

import java.util.Scanner;

public class Task2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        printFibonacciNumbers(n);
    }

    private static void printFibonacciNumbers(int n) {
        if (n < 3) {
            switch (n) {
                case 1:
                    System.out.println(1);
                    break;
                case 2:
                    System.out.println(1);
                    System.out.println(1);
                    break;
                default:
                    System.out.println("Последовательность из 0 чисел пустая");
            }
        } else {
            int[] arr = new int[n];
            arr[0] = 1;
            arr[1] = 1;
            System.out.println(1);
            System.out.println(1);
            for (int i = 2; i < n; i++) {
                arr[i] = arr[i - 1] + arr[i - 2];
                System.out.println(arr[i]);
            }
        }
    }
}
