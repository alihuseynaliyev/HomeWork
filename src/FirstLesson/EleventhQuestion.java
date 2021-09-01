package FirstLesson;

import java.util.Scanner;

public class EleventhQuestion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter real number:");
        double realNumber = sc.nextDouble();
        System.out.println("Real number = " + realNumber);

        System.out.println(Math.round(realNumber));
    }

}
