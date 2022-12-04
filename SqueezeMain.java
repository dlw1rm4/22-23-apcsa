/**
 * @author (Kaitlyn Nguy)
 * @version (11.28.22)
 * @Lab (LA16, 1 - Squeeze)
 * Description: Removes whitespace at the beginning of each code line
 * Purpose: To learn about text files input and output
 */
import java.io.*; //imports java package
import apcslib.*; //imports the AP CSA package
import chn.util.*; //imports the package for Console
public class SqueezeMain //name of the class
{
    public static void main(String args[]) //main method
    {
        FileInput myFile = new FileInput("PiglatinatorCopy.txt"); //imports the text file of this name
        FileOutput outFile = new FileOutput("SqueezeOutput.txt"); //exports a new text file with this name
        Squeeze sq = new Squeeze(myFile, outFile); //constructor
    }
}
