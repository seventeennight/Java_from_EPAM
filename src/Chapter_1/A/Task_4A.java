package Chapter_1.A;

public class Task_4A {
    public static void main(String[] args) {

        String truePassword = "password";

        if (args.length > 0) {
            String inputPassword = args[0];

            if (inputPassword.equals(truePassword)) {
                System.out.println("correct password");
            } else {
                System.out.println("incorrect password");
            }
        }
    }
}