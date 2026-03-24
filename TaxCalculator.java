import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double weeklyIncome;
        double taxRate;
        double taxWithholding;

        System.out.print("Enter weekly income: ");
        weeklyIncome = input.nextDouble();

        if (weeklyIncome < 500) {
            taxRate = 0.10;
        } else if (weeklyIncome >= 500 && weeklyIncome < 1500) {
            taxRate = 0.15;
        } else if (weeklyIncome >= 1500 && weeklyIncome < 2500) {
            taxRate = 0.20;
        } else {
            taxRate = 0.30;
        }

        taxWithholding = weeklyIncome * taxRate;

        System.out.println("Weekly tax withholding is: $" + taxWithholding);

        input.close();
    }
}