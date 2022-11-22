/**
 * @author (Kaitlyn Nguy)
 * @version (11.10.22)
 * @Lab (LA15, 2 - String Reverse)
 * Description: Reverses an inputed string
 * Purpose: To learn about recursion
 */
import apcslib.*; //imports the AP CSA package
import chn.util.*; //imports the package for Console
public class StringReverse
{
    public StringReverse() //constructor
    {
        
    }
    public String reverse(String s) //name of method
    {
        if(s.length() == 0) //if statement for when length of s is 0
        {
            return s; //returns original string
        }
        else //runs code when above conditions aren't met
        {
            return reverse(s.substring(1)) + s.charAt(0); //returns reversed string by removing first letter and moving it to the front
        }
        }
    }

