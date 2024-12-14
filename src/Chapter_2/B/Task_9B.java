package Chapter_2.B;

import java.util.Scanner;

public class Task_9B {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца (1-12): ");
        int month = scanner.nextInt();

        String[] months = {
                "Январь", "Февраль", "Март", "Апрель",
                "Май", "Июнь", "Июль", "Август",
                "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        };

        if (month >= 1 && month <= 12) {
            System.out.println("Месяц: " + months[month - 1]);
        } else {
            System.out.println("Некорректный номер месяца.");
        }
    }
}
