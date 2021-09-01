package FirstLesson;

import java.util.Scanner;

public class TwelfthQuestion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter width:");
        double widthRectangle = sc.nextDouble();
        System.out.println("Width = " + widthRectangle);

        System.out.println("Please enter height:");
        double heightRectangle = sc.nextDouble();
        System.out.println("Height = " + heightRectangle);

        double areaRectangle = heightRectangle * widthRectangle;
        double perimeterRectangle = 2 * (heightRectangle + widthRectangle);

        System.out.println("Rectangle area = " + areaRectangle);
        System.out.println("Rectangle perimeter = " + perimeterRectangle);
    }
}
