package Chapter_2.B;

import java.util.Scanner;

public class Task_5B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int count = countZeros(number);
        System.out.println("Количество значащих нулей в двоичном коде: " + count);
    }

    public static int countZeros(int number) {
        String binary = Integer.toBinaryString(number);

        int originalLength = binary.length();
        int newLength = binary.replace(String.valueOf('0'), "").length();

        return originalLength - newLength;
    }
}
