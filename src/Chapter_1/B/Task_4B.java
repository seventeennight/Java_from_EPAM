package Chapter_1.B;

import java.util.Scanner;

public class Task_4B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Числа, которые делятся на 5 и 7: ");
        for (int j : array) {
            if ((j % 5 == 0) && (j % 7 == 0)) {
                System.out.print(j + " ");
            }
        }
        System.out.println();
    }
}
