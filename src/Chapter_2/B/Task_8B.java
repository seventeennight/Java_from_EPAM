package Chapter_2.B;

import java.util.Scanner;

public class Task_8B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вводим исходную систему счисления: ");
        int sourceBase = scanner.nextInt();

        System.out.println("Вводим число: ");
        String number = scanner.next();

        System.out.println("Вводим целевую систему счисления: ");
        int targetBase = scanner.nextInt();

        int decimal = Integer.parseInt(number, sourceBase);
        String target = Integer.toString(decimal, targetBase);

        System.out.println(target);
    }
}
