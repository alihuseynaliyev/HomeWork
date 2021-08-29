package FirstLesson;

//Enter the month, determine which season the given month belongs to.(switch)

import java.util.Scanner;

public class FifthQuestion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter month");
        String month = sc.nextLine();
        System.out.println("The month you entered = " + month);

        switch (month) {

            case "December ":
            case "January ":
            case "February":
                String firstSeason = "Winter";
                System.out.println("Season1 = " + firstSeason);
                break;

            case "March":
            case "April":
            case "May":
                String secondSeason = "Spring";
                System.out.println("Season2 = " + secondSeason);
                break;

            case "June":
            case "July":
            case "August":
                String thirdSeason = "Summer";
                System.out.println("Season3 = " + thirdSeason);
                break;

            case "September":
            case "October":
            case "November":
                String fourthSeason = "Summer";
                System.out.println("Season4 = " + fourthSeason);
                break;
            default:
                System.out.println("Plase enter the correct month");
                break;
        }
/*        if (month.equals("December" ) || month.equals("January") || month.equals("February")) {
            String firstSeason = "Winter";
            System.out.println("Season1 = " + firstSeason);
        } else if (month .equals("March") || month.equals("April") || month.equals("May")) {
            String secondSeason = "Spring";
            System.out.println("Season2 = " + secondSeason);
        } else if (month.equals("June") || month .equals("July") || month.equals("August")) {
            String thirdSeason = "Summer";
            System.out.println("Season3 = " + thirdSeason);
        } else if (month.equals("September") || month.equals("October") || month.equals("November")) {
            String fourthSeason = "Summer";
            System.out.println("Season4 = " + fourthSeason);
        } else System.out.println("Plase enter the correct month");
         */
    }
}
