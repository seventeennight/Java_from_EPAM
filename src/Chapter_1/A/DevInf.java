package Chapter_1.A;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DevInf {
    public static void main(String[] args) {
        String developer = "Бураева Александра Б762-2";
        String date = "07.09.2024 14:00";

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

        System.out.println("Фамилия разработчика: " + developer);
        System.out.println("Дата и время получения задания: " + date);
        System.out.println("Дата и время сдачи задания: " + now.format(formatter));
    }
}
