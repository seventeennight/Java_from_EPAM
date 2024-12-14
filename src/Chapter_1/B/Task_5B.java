package Chapter_1.B;

import java.util.Scanner;

public class Task_5B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Трехзначные числа с уникальными цифрами: ");
        boolean hasUniqueDigits = false;
        for (int i : array) {
            if (i >= 100 && i < 1000) {
                int hundreds = i / 100;
                int tens = (i / 10) % 10;
                int units = i % 10;

                if (hundreds != tens && hundreds != units && tens != units) {
                    System.out.print(i + " ");
                    hasUniqueDigits = true;
                }
            }
        }
        if (!hasUniqueDigits) {
            System.out.print("Нет трехзначных чисел с уникальными цифрами");
        }
        System.out.println();
    }
}
