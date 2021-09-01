package FirstLesson;

import java.util.Scanner;

public class ThirteenthQuestion {
    public static void main(String[] args){

        double speedOfSound = 343;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter time in\n" +
                "Seconds between flash and thunderclap");

        double seconds = sc.nextDouble();
        System.out.println("Seconds between flash and thunderclap = " + seconds);

        double distanceToThePlaceOfTheLightningStrike = speedOfSound/seconds;
        System.out.println("Distance to the place of the lightning strike = "
                +distanceToThePlaceOfTheLightningStrike+"m");

    }
}
