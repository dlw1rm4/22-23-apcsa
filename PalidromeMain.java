/**
 * @author (Kaitlyn Nguy)
 * @version (10.28.22)
 * @Lab (LA13, 3 - Piglatinator)
 * Description: Translates the input into Pig Latin
 * Purpose: To learn about String classes
 */
import apcslib.*; //imports the AP CSA package
import chn.util.*; //imports the package for ConsoleIO
public class PalidromeMain //name of the class
{
    public static void main(String args[]) //main method
    {
        String original = ""; //placeholder for identifier original
        ConsoleIO input = new ConsoleIO(); //creates a constructor
        do //do-while loop
        {
            System.out.print("Enter a string ('?' to exit): "); //prompts user for string
            original = input.readLine().toLowerCase(); //reads inputed line and converts it to lower case
            if (original.charAt(0) == '?') //if-statement for when inputed character is ?
            {
                break; //breaks out of loop
            }
            Palidrome palidrome = new Palidrome(original); //creates a constructor of Palidrome class
            palidrome.compare(); //uses compare() method from class palidrome
            System.out.println();
        }
        while (original.charAt(0) != '?'); //condition where do-while loop ends
        if (original.charAt(0) == '?') //if-statement
        {
            System.out.println("Exited"); //prints out "Exited" when program exits
        }
        }
    }

