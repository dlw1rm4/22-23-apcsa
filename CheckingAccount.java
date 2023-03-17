/**
 * Write a description of class CheckingAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CheckingAccount
{
    private final double CHECK_CHARGE = 0.15;
    private double myBalance;
    public CheckingAccount() {
        myBalance = 0;
    }
    public CheckingAccount(double initialBalance) {
        myBalance = initialBalance;
    }
    public void deposit(double amount) {
        try {
            if (amount < 0) {
                throw new IllegalArgumentException("Error deposit: negative amount");
            }
            else {
                myBalance += amount;
            }
        }
        catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
    }
    public void withdraw(double amount) {
        try {
            if (myBalance < amount || amount < 0) {
                throw new IllegalArgumentException("Error withdraw: illegal amount");
            }
            else {
                myBalance = myBalance - amount - CHECK_CHARGE;
            }
        }
        catch (IllegalArgumentException error) {
            System.out.println(error.getMessage());
        }
    }
    public double getBalance() {
        return myBalance;
    }
}