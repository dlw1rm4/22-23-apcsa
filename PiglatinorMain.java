/**
 * @author (Kaitlyn Nguy)
 * @version (10.28.22)
 * @Lab (LA13, 3 - Piglatinator)
 * Description: Translates the input into Pig Latin
 * Purpose: To learn about String classes
 */
import apcslib.*; //imports the AP CSA package
import chn.util.*; //imports the package for ConsoleIO
public class PiglatinorMain //name of class
{
    public static void main(String args[]) //main method
    {
        String englishWord = ""; //declares identifier as an empty string
        ConsoleIO console = new ConsoleIO(); //creates constructor
        
        System.out.println("This program can translate English into Pig Latin!"); //prints statement
        System.out.println("Enter in a word or phrase when requested..."); //prints statement
        System.out.println("Or enter 'X' if you want to exit the program."); //prints statement
        do //begins a do while loop
        {
            System.out.println(); //prints an empty line
            System.out.println("What would you like to translate?"); //prints statement
            englishWord = console.readLine(); //declares identifier as input
            if ((englishWord.charAt(0) == 'x'  && englishWord.length() == 1) || (englishWord.charAt(0) == 'X' && englishWord.length() == 1))//performs below code if input is x or X
            {
                break; //breaks out of loop
            }
            System.out.println("\nIn Pig Latin, that would be: "); //prints statement
            Piglatinator piglatinator = new Piglatinator(englishWord); //creates constructor
            piglatinator.translateWord(); //calls method from class Piglatinator
        }
        while (englishWord.charAt(0) != 'X' || englishWord.charAt(0) != 'x'); //runs above code while condition is met
        if ((englishWord.charAt(0) == 'x' && englishWord.length() == 1) || (englishWord.charAt(0) == 'X' && englishWord.length() == 1)) //runs code if input is x or X
        {
            System.out.println("\nExited program."); //prints statement
        }
    }
}
