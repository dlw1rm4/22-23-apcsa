
/**
 * @author (Kaitlyn Nguy)
 * @version (9.6.22)
 * @Lab (LA4, 1 - Change)
 * Description: Uses ConsoleIO to give a certain amount of quarters, dimes, nickels, and pennies when depending on the remaining cents
 * Purpose: Gives the correct amount of change given an amount
 */
import apcslib.*; //imports the AP CSA package
import chn.util.*; //imports the package for ConsoleIO

public class Change //JAVA file or the function that gives us the amount of change needed given the cash tendered
{
    public static void main(String[] args)
    {
    double purchaseAmount, cashPaid, temp; //declares the following variables as type double, meaning they have decimals
    int change, dollars, quarterCount, dimeCount, nickelCount, penniesCount, centsLeft; //declares the following varaiables as type int, meaning they're whole numbers
    
    ConsoleIO input = new ConsoleIO(); //declares the identifier 'input' as ConsoleIO
    
    System.out.print("\nAmount of purchase = "); //prints "Amount of purchase" on the next line
    purchaseAmount = input.readDouble(); //sets 'purchaseAmount' as a variable that reads the input of the purchase amount, allowing decimals
    
    System.out.print("\nCash tendered = "); //prints "Cash tendered" on the next line
    cashPaid = input.readDouble(); //sets 'cashPaid' as a variable that reads the input of the given cash amount, allowing decimals
    
    System.out.print("\nAmount of coins needed: "); //prints "Amount of coins needed" on the next line
    temp = cashPaid - purchaseAmount; //sets 'temp' as the difference between the two varaibles 'cashPaid' and 'purchase amount'
    temp = temp - (int)temp; //sets 'temp' as the difference of the initial 'temp' and the whole number of 'temp'
    change = (int)(temp * 100); //sets 'change' as the whole number of 'temp' multiplied by 100
   
    quarterCount = (int) change / 25; //sets 'quarterCount' as whole number of the quotient of the variable 'change' and 25
    centsLeft = change - (quarterCount * 25); //sets 'centsLeft' as the difference the amount of quarters from the change for the cents remaining
    dimeCount = (int) centsLeft / 10; //sets 'dimeCount' as whole number of the quotient of the variable 'centsLeft' and 10
    centsLeft = change - (quarterCount * 25) - (dimeCount * 10); //sets 'centsLeft' as the difference of the amount of quarters and dimes from the change for the cents remaining
    nickelCount = (int) centsLeft / 5; //sets 'nickelCount' as whole number of the quotient of the variable 'centsLeft' and 5
    centsLeft = change - (quarterCount * 25) - (dimeCount * 10) - (nickelCount * 5); //sets 'centsLeft' as the difference  of the amount of quarters, dimes, and nickels from the change for the cents remaining
    penniesCount = (int) centsLeft; //gives us the amount of pennies needed based on the cents left
    
    System.out.println(); //creates an empty line
    System.out.println(); //creates an empty line

    System.out.println(Format.right(change, 5) + " cents =" + '\n'); //prints the amount of change needed in cents 5 pixels to the right and creates a new line
    
    System.out.println(Format.right(quarterCount, 7) + " quarters"); //prints the amount of quarters needed based on the remaining change 7 pixels to the right
    System.out.println(Format.right(dimeCount, 7) + " dime");  //prints the amount of dimes needed based on the remaining change 7 pixels to the right
    System.out.println(Format.right(nickelCount, 7) + " nickel");  //prints the amount of nickels needed based on the remaining change 7 pixels to the right
    System.out.println(Format.right(penniesCount, 7) + " pennies");  //prints the amount of pennies needed based on the remaining change 7 pixels to the right

 }
}