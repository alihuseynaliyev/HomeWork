package FirstLesson;

import java.util.Scanner;
/*
* Calculate circle area and circumference with radius
* */
public class SeventhQuestion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter Circle Radius");
        double radiusCircle = sc.nextDouble();
        System.out.println("Radius = " + radiusCircle);

        double circumference = 2 * Math.PI * radiusCircle;
        System.out.println("Circumference = " + circumference);

        double area = Math.PI * radiusCircle * radiusCircle;
        System.out.println("Area = " + area);
    }
}
