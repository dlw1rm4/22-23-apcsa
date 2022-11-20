
/**
/**
 * @author (Kaitlyn Nguy)
 * @version (9.16.22)
 * @Lab (LA5, 1 - Taxes)
 * Description: Uses ConsoleIO to identify the characters inputed and converts it based on ASCII to give a make, model, and license plate
 * Purpose: Gives the make, model, and license plate based on the input by user
 */
import apcslib.*; //imports the AP CSA package
import chn.util.*; //imports the package for ConsoleIO
import java.lang.*;
public class Taxes
{
   public static void main(String[] args)
   {
    int hrsWorkedRequest;
    double hrsRateRequest, grossPay,taxPercent, taxDed;
    
    ConsoleIO input = new ConsoleIO();
    
    System.out.println();
    System.out.print("Enter hours worked ");
    hrsWorkedRequest = input.readInt();
    System.out.print("Enter hourly rate ");
    hrsRateRequest = input.readDouble();
    
    grossPay = hrsWorkedRequest * hrsRateRequest;
    
    final double FEDERAL_TAX = 0.15;
    final double FICA_TAX = 0.0765;
    final double STATE_TAX = 0.04;
    
    taxDed = grossPay - (FEDERAL_TAX * grossPay) - (FICA_TAX * grossPay) - (STATE_TAX * grossPay);
    int fedTax = FEDERAL_TAX * grossPay;
    int ficaTax = FICA_TAX * grossPay;
    int stateTax = STATE_TAX * grossPay;
    
    System.out.println();
    System.out.print("Gross pay ");
    System.out.printf("%,.2f", grossPay);
    
    System.out.println();
    System.out.println();
    System.out.print("Federal tax " + "(15%) ");
    System.out.printf("%,.2f", ();
    System.out.println("FICA " + "(7.65%)");
    System.out.printf("%,.2f", ficaTax);
    System.out.println("State tax  " + "(4%)");

    System.out.println();
    System.out.print("Net pay ");
    System.out.printf("%,.2f", taxDed);
    }
}
