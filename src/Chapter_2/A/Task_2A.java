package Chapter_2.A;

import Chapter_1.A.DevInf;
import java.util.Scanner;
import java.util.Arrays;

public class Task_2A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
        DevInf.main(args);
    }
}
