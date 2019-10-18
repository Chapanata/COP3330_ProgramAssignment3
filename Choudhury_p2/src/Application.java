import java.util.Scanner;

public class Application {

    public static void main(String args[]) {

        int i;
        double x;
        double y;

        SavingsAccount saver1 = new SavingsAccount(2000.00); // Object 1 for Savings Account
        SavingsAccount saver2 = new SavingsAccount(3000.00); // Object 2 for Savings Account

        saver1.interestRate(0.04); // Set the annual interest rate as 4%
        saver2.interestRate(0.04); // Set the annual interest rate 4%


        // Prints saving balance for interest rate of 4%
        System.out.println("Below shows the new balances of Saver 1 and Saver 2's for each month.");
        System.out.println("Saver 1 has $2000 initially and Saver 2 has $3000 initially. The annual interest rate is 4%");
        System.out.printf("Month # \tSaver 1 \tSaver 2\n");
        // Prints Months 1 - 12 and the corresponding balances for Saver 1 and Saver 2
        for(i = 1; i < 13; i++ ) {
            x = saver1.calculateMonthlyInterest();
            y = saver2.calculateMonthlyInterest();
           System.out.printf("Month %d \t$%.2f \t$%.2f\n", i, x, y);
        }

        System.out.println("");

        saver1.modifyInterestRate(0.05);
        saver2.modifyInterestRate(0.05);

        x = saver1.calculateMonthlyInterest();
        y = saver2.calculateMonthlyInterest();

        System.out.println("Setting the annual interest rate to 5% for Month 13");
        System.out.printf("  \t\t\tSaver 1 \tSaver 2\n");
        System.out.printf("Month 13 \t$%.2f \t$%.2f\n", x, y);
    }

}



