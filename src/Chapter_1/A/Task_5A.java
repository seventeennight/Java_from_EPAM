package Chapter_1.A;

public class Task_5A {
    public static void main(String[] args) {

        int sum = 0;
        int product = 1;

        for (String arg : args) {
            int num = Integer.parseInt(arg);

            sum += num;
            product *= num;
        }

        System.out.println(sum);
        System.out.println(product);

    }
}
