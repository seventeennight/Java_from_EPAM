package Chapter_2.B;

public class Task_1B {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %2d\t", i, j, i * j);
            }
            System.out.println();
        }
    }
}
