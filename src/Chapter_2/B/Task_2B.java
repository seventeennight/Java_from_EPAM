package Chapter_2.B;

import java.util.Scanner;

public class Task_2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
