/**
 * @author (Kaitlyn Nguy)
 * @version (10.27.22)
 * @Lab (LA13, 1 - Palidrome)
 * Description: Verifies whether a word or phrase is a palindrome
 * Purpose: To learn about String classes
 */
import apcslib.*; //imports the AP CSA package
import chn.util.*; //imports the package for ConsoleIO
public class Palidrome
{
    private String og, ogRewritten, reversed; //declares following identifiers as data type String for this class only
    private int stringLength; //declares following identifier as data type int for this class only
    private char ch; //declares following identifier as data type char for this class only
    public Palidrome(String original) //creates constructor of class Palidrome
    {
        og = original; //initiates og as original
        reversed = ""; //initiates reveresed as an empty string
        ogRewritten = ""; //initiates ogRewritten as an empty string
    }
    public void compare() //creates method compare()
    {
        if (og.length() > 1) //if-else statement for when the length of the input is greater than 1
        {
            for (stringLength = og.length() - 1; stringLength >= 0; stringLength--) //creates a for statement for the string's length
            {
                ch = og.charAt(stringLength); //initiates ch as the character at the current length of the string
                if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) //creates an if-statement for when ch is a letter or number
                {
                    ogRewritten += ch; //intitiates ogRewritten as itself plus ch
                }
            }
            for(stringLength = ogRewritten.length() - 1; stringLength >= 0; stringLength--)
            {
                reversed += ogRewritten.charAt(stringLength); //initiates reversed as itself plus the character at the current string length
            }
            if(reversed.equalsIgnoreCase(ogRewritten)) //creates if-else statement for comparing the two strings
                System.out.println("Yes, the string you entered is a palidrome"); //prints the following statement
            else //below code runs when condition in if statement isn't met
                System.out.println("No, the string you entered is NOT a palidrome."); //prints the following statement
            }
        else //when string length is below 1 then prints below statement
            System.out.println("No, the string you entered is NOT a palidrome."); //prints the following statement
    }
}