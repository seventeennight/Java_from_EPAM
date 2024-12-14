package Chapter_2.A;

import Chapter_1.A.DevInf;
import java.util.Scanner;

public class Task_1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        for (int j : array) {
            if (max < j) {
                max = j;
            }
            if (min > j) min = j;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        DevInf.main(args);
    }
}
