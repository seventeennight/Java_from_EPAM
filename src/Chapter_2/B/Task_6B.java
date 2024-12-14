package Chapter_2.B;

import java.util.Scanner;

public class Task_6B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вводим десятичное число: ");
        int n = scanner.nextInt();
        double base = Math.sqrt(n);
        if (base == (int) base) {
            System.out.println("Основание: " + (int) base);
        } else {
            System.out.println("Такого основания не существует.");
        }
    }
}
