package FirstLesson;

import java.util.Scanner;

public class SecondQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = sc.nextInt();

        System.out.println("Enter second number");
        int secondNumber = sc.nextInt();


        // to test with "if else" version
        if (firstNumber == secondNumber) {
            System.out.println("The value of a is equal to the value of b");
        } else {
            System.out.println("The value of a is not equal to the value of b");
        }


        // to test with "ternary operator" version
        String s = firstNumber == secondNumber ? "Equal " : "Not equal";
        System.out.println(s);
    }
}
