package org.example;

public class Task1 {
    public static void main(String[] args) {
        solveTask();
    }

    private static void solveTask() {
        for (int i = 1; i <= 100; i++) {
            boolean flag = false;
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
                flag = true;
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
                flag = true;
            }
            if (!flag) {
                System.out.println(i);
            }
        }
    }
}