/**
 * @author (Kaitlyn Nguy)
 * @version (12.2.22)
 * @Lab (LA19, 1 - Statistics)
 * Description: Finds the average, standard deviation, and mode of a text file
 * Purpose: To learn about one dimensional arrays
 */
import chn.util.*;
public class StatisticsMain
{
    public static void main(String args[])
    {
        FileInput inFile = new FileInput("numbers.txt");
        Statistics stats = new Statistics(inFile);
        
        stats.printInfo();
    }
}
