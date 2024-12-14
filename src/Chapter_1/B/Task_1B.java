package Chapter_1.B;

import java.util.Scanner;

public class Task_1B {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Четные числа: ");
        for (int j : array) {
            if (j % 2 == 0) {
                System.out.print(j + " ");
            }
        }
        System.out.println();

        System.out.print("Нечетные числа: ");
        for (int j : array) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
            }
        }
            System.out.println();
    }
}
