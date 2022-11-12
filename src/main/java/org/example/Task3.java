package org.example;

import java.util.Scanner;

public class Task3 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt(); // ограничимся интом
        long factorial = findFactorial(n);
        System.out.println(factorial);
    }

    private static long findFactorial(int n) {
        long res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
