import java.util.Scanner;

public class NinthQuestion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // imput number
        System.out.println("Please enter number");
        double number = sc.nextDouble();
        System.out.println("Entered number = " + number);

        // Check number
        if ((number % 1) == 0) {
            System.out.println("Entered number not real part");
        } else {
            System.out.println("Entered number real part");
        }
    }
}
