package FirstLesson;

import java.util.Scanner;

public class ThirdQuestion {
    public static void main(String[] args) {

//        calculator with switch
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        double firstNumber = sc.nextDouble();
        System.out.println("First number: " + firstNumber);

        System.out.println("Please enter second number: ");
        double secondNumber = sc.nextDouble();
        System.out.println("Second number: " + secondNumber);

        System.out.println("Pleae enter calculation number: ");
        System.out.println("/ 1-Addition / 2-Subtraction /  3-Multiplication / 4-Division /");
        int calculationNumber = sc.nextInt();

        switch (calculationNumber) {
            case 1:
                System.out.println(firstNumber + secondNumber);
                break;

            case 2:
                System.out.println(firstNumber - secondNumber);
                break;

            case 3:
                System.out.println(firstNumber * secondNumber);
                break;

            case 4:
                System.out.println(firstNumber / secondNumber);
                break;
            default:
                System.out.println("Please enter numbers 1 to 4");
                break;
        }
    }
}
