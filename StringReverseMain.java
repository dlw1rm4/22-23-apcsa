/**
 * @author (Kaitlyn Nguy)
 * @version (11.10.22)
 * @Lab (LA15, 2 - String Reverse)
 * Description: Reverses an inputed string
 * Purpose: To learn about recursion
 */
import apcslib.*; //imports the AP CSA package
import chn.util.*; //imports the package for Console
public class StringReverseMain //name of the class
{
    public static void main(String args[]) //main method
    {
        String str = ""; //empty string
        ConsoleIO console = new ConsoleIO(); //creates constructor
        do //do while loop
        {
            System.out.print("\nWhat would you like to reverse? --> "); //prompts input
            str = console.readLine(); //declares str as input
            StringReverse strRev = new StringReverse(); //creates constructor
            System.out.println("Reversed String: " + strRev.reverse(str)); //prints reversed string
        }
        while(!str.equalsIgnoreCase("q")); //ends do while loop when str equals "q"
        System.out.println("\nProgram completed"); //prints statement
    }
}
