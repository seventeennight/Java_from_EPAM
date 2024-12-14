package Chapter_2.B;

import java.util.Scanner;

public class Task_7B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите десятичное число: ");
        int number = scanner.nextInt();
        System.out.print("Введите основание целевой системы счисления (2-36): ");
        int base = scanner.nextInt();
        if (base < 2 || base > 36) {
            System.out.println("Недопустимое основание системы счисления.");
            return;
        }
        String converted = Integer.toString(number, base).toUpperCase();
        System.out.println("Число " + number + " в системе счисления с основанием " + base + ": " + converted);
    }
}
