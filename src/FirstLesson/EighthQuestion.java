import java.util.Scanner;

/*
Simple Interest = (P × R × T)/100
P is Principal amount.
R is rate per annum.
T is time in years.
*/
public class EighthQuestion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input information
        System.out.println("Please enter Principal amount");
        double principialAmount = sc.nextDouble();
        System.out.println("Principal amount = " + principialAmount);

        System.out.println("Please enter Rate per annum");
        double ratePerAnnum = sc.nextDouble();
        System.out.println("Rate per annum = " + ratePerAnnum);

        System.out.println("Please enter Time in years");
        double timeInYears = sc.nextDouble();
        System.out.println("Time in years = " + timeInYears);

        // Calculate
        double interestAmount = (principialAmount * timeInYears * ratePerAnnum) / 100;
        System.out.println("Total Accrued Amount = " + interestAmount);

        double totalAccruedAmount = interestAmount + principialAmount;
        System.out.println("Total Accrued Amount = " + totalAccruedAmount);


    }

}
