/**
 * Write a description of class errorMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.*;
public class errorCheck
{
    public static void main(String args[]) {
        ConsoleIO console = new ConsoleIO();
        boolean run = true;
        boolean runTwo = true;
        boolean runThree = true;
        
        System.out.println("\nErrorFreeChecking Test");
        while (run == true) {
            System.out.print("\nPlease enter the starting balance --> ");
            double openingAmt = console.readDouble();
            CheckingAccount errorFree = new CheckingAccount(openingAmt);
            try {
                if (openingAmt < 0) {
                    throw new IllegalArgumentException("Error CheckingAccount: negative initial balance");
                }
                else {
                    run = false;
                    System.out.println("\nAccount opened with balance of " + openingAmt);
                    while (runTwo == true) {
                        System.out.print("\nPlease enter the amount to deposit --> ");
                        double dep = console.readDouble();
                        if (dep < 0) {
                            errorFree.deposit(dep);
                        }
                        else {
                            runTwo = false;
                            errorFree.deposit(dep);
                            System.out.println("\nDeposit made. Current account balance = " + errorFree.getBalance());
                            while (runThree == true) {
                                System.out.print("\nPlease enter the amount to withdraw --> ");
                                double with = console.readDouble();
                                if (with > errorFree.getBalance() || with < 0) {
                                    errorFree.withdraw(with);
                                }
                                else {
                                    runThree = false;
                                    errorFree.withdraw(with);
                                    System.out.print("\nWithdrawal made. Current account balance = " + errorFree.getBalance());
                                }
                            }
                        }
                    }
                }
            }
            catch (IllegalArgumentException error) {
                System.out.println(error.getMessage());
            }
        }
        System.out.println("\n\nThank you for using ErrorFreeChecking...goodbye!");
    }
}