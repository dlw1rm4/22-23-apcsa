/**
 * @author (Kaitlyn Nguy)
 * @version (11.28.22)
 * @Lab (LA16, 2 - Average)
 * Description: Finds the average number based off a list of numbers in a txt file
 * Purpose: To learn about text files input and output
 */
import chn.util.*; //import chn.util package
public class AverageMain //name of class
{
    public static void main(String args[]) //main method
    {
        FileInput inFile = new FileInput("numbers.txt"); //constructor for input file
        FileOutput outFile = new FileOutput("averageFinal.txt"); //constructor for output file
        Average avg = new Average(inFile, outFile); //constructor for class Average
    }
}