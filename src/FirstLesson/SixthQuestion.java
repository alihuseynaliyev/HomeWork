package FirstLesson;

import java.util.Scanner;

/*
* The variables x and y store two natural numbers. Co-
create a program to print to the console
* */
public class SixthQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter x");
        int x = sc.nextInt();
        System.out.println("x: " + x);

        System.out.println("-----------------------------------------");

        System.out.println("Please enter y");
        int y = sc.nextInt();//
        System.out.println("y: " + y);

        System.out.println("-----------------------------------------");

        System.out.println("Result of integer division of x by y: " + (x / y));
        System.out.println("Remainder of dividing x by y: " + (x % y));
        System.out.println("Square root of x: " + (x * x));
    }
}
