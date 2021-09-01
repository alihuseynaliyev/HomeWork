package FirstLesson;


public class TenthQuestion {
    public static void main(String[] args) {
        int n = 263;

        int firstNumber = n / 100;
        int secondNumber = (n / 10) % 10;
        int thirdNumber = n % 10;

        System.out.println(firstNumber+secondNumber+thirdNumber);

    }
}
