package FirstLesson;

import java.util.Scanner;

/*Check if the entered number belongs to the specified ranges:
	0...9
	10...99
	100...999*/

public class FourthQuestion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a number");
        double number = sc.nextDouble();
        System.out.println("Included numbers = " + number);

        if (number >= 0 && number <= 9) {
            System.out.println("The entered numbers are between 0 and 9");
        }
        else if (number >= 10 && number <= 99) {
            System.out.println("The entered numbers are not between 0 and 9");
            System.out.println("The entered numbers are between 10 and 99");
        }
        else if(number >= 100 && number <= 999) {
            System.out.println("The entered numbers are not between 10 and 99");
            System.out.println("The entered numbers are between 100 and 999");
        }
        else {
            System.out.println("The entered numbers are not between 0 and 999");
        }
    }
}
