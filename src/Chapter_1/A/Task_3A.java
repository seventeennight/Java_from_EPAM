package Chapter_1.A;

import java.util.Random;
import java.util.Scanner;

public class Task_3A {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.println(random.nextInt(100));
        }

        System.out.println();

        for (int i = 1; i <= count; i++) {
            System.out.print(random.nextInt(100) + " ");
        }
    }
}

