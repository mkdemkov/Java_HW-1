package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Введите размер массива: ");
        int n = scanner.nextInt(); // вводим размер массива
        System.out.println("Вводите элементы массива через пробел");
        int[] arr = new int[n];
        int el;
        for (int i = 0; i < n; i++) {
            el = scanner.nextInt();
            arr[i] = el;
        }
        sortArray(arr);
        System.out.println("Массив отсортирован");
        System.out.println(Arrays.toString(arr));
    }

    private static void sortArray(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
