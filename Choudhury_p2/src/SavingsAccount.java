public class SavingsAccount {
    static private double annualInterestRate;
    private double savingsBalance;

    // Constructor to instantiate objects with initial balance
    public SavingsAccount(double initialBalance) {
        savingsBalance = initialBalance;
    }

    // When called instantiates with annual interest rate
    public void interestRate(double enterRate) {
        annualInterestRate = enterRate;
    }

    // Does the caluclation and returns the balance for the month. Each month uses the previous balance
    public double calculateMonthlyInterest() {
        double monthlyInterest;
        monthlyInterest = (annualInterestRate * savingsBalance) / 12;
        savingsBalance += monthlyInterest;
        return savingsBalance;
    }

    // When called annual interest rate is changed
    public static void modifyInterestRate(double newRate) {
        annualInterestRate = newRate;
    }
}
