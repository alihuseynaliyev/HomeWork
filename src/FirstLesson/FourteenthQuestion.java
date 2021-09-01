package FirstLesson;

import java.util.Scanner;

public class FourteenthQuestion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter second");
        int seconds = sc.nextInt();

        int minutes = seconds / 60;
        int hours = minutes / 60;
        int days = hours / 24;
        System.out.println(days + " days, " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
    }
}
