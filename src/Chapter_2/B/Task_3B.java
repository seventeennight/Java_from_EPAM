package Chapter_2.B;

import java.util.Scanner;

public class Task_3B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 3. Проверка принадлежности числа k интервалам.");
        System.out.print("Введите значение k: ");
        double k = scanner.nextDouble();
        System.out.print("Введите значение n: ");
        double n = scanner.nextDouble();
        System.out.print("Введите значение m: ");
        double m = scanner.nextDouble();

        // Проверка принадлежности к разным интервалам
        System.out.println("Принадлежность k интервалам:");
        System.out.println("Интервал (n, m]: " + ((k > n && k <= m) ? "Да" : "Нет"));
        System.out.println("Интервал [n, m): " + ((k >= n && k < m) ? "Да" : "Нет"));
        System.out.println("Интервал (n, m): " + ((k > n && k < m) ? "Да" : "Нет"));
        System.out.println("Интервал [n, m]: " + ((k >= n && k <= m) ? "Да" : "Нет"));
    }
}
