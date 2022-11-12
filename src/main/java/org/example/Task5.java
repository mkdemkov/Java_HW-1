package org.example;

import java.util.Scanner;

public class Task5 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String str = scanner.nextLine();
        int[] res = solveTask(str);
        System.out.printf("Количество согласных - %d, количество гласных - %d", res[0], res[1]);
    }

    private static int[] solveTask(String str) {
        int len = str.length();
        char[] symbols = str.toCharArray();
        String consonants = "qwrtpsdfghjklzxcvbnmйцкнгшщзхъфвпрлджчсмтьб";
        String vowels = "eyuioaуеыаоэёяию";
        int[] res = new int[2];
        for (int i = 0; i < len; i++) {
            String symbAsString = Character.toString(symbols[i]);
            if (consonants.contains(symbAsString.toLowerCase())) {
                res[0]++;
            } else if (vowels.contains(symbAsString.toLowerCase())) {
                res[1]++;
            }
        }
        return res;
    }
}
