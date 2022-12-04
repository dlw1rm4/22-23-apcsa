
/**
 * @author (Kaitlyn Nguy)
 * @version (11.28.22)
 * @Lab (LA16, 2 - Average)
 * Description: Finds the average number based off a list of numbers in a txt file
 * Purpose: To learn about text files input and output
 */
import apcslib.*; //imports apcslib package
import chn.util.*; //imports chn.util package
public class Average //name of class
{
    public Average(FileInput inFile, FileOutput outFile) //constructor
    {
        int num = 0; //declares num to 0
        int totalNum = 0; //declares totalNum 0
        double avgNum = 0; //sets avgNum to 0
        while(inFile.hasMoreTokens()) //while loop
        {
            num += inFile.readInt(); //declares num as itself plus new number
            totalNum++; //adds 1 to totalNum
        }
        avgNum = num / totalNum; //declares avgNum as num divided by totalNum
        outFile.println("Average Number: " + Format.right(avgNum, 4, 2)); //prints statement
        outFile.close(); //closes output file
    }
}
