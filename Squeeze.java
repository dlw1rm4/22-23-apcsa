/**
 * @author (Kaitlyn Nguy)
 * @version (11.28.22)
 * @Lab (LA16, 1 - Squeeze)
 * Description: Removes whitespace at the beginning of each code line
 * Purpose: To learn about text files input and output
 */
import apcslib.*; //imports the AP CSA package
import chn.util.*; //imports the package for Console
public class Squeeze //name of the class
{
    public Squeeze(FileInput inFile, FileOutput outFile) //constructor
    {
        String line; //declares line as type String
        String trimmed; //declares trimmed as type String
        int length; //declares length as type int
        int trimValue; //declares trimValue as type int
        while (inFile.hasMoreLines()) //while loop that runs while inFile has more lines
        {
            line = inFile.readLine(); //declares line as the current line of the inputed value
            length = line.length(); //declares length as the current line's length
            trimmed = line.trim(); //trims to current line
            trimValue = length - trimmed.length(); //declares trimValue as the number of whitespace in the beginning
            outFile.println(trimValue + Format.right("", 2) + trimmed); //prints statement
        }
        outFile.close(); //closes output file
    }
}

