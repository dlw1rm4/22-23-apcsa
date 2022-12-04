
/**
 * @author (Kaitlyn Nguy)
 * @version (12.2.22)
 * @Lab (LA19, 2 - Compact)
 * Description: Shifts original array to the left to remove zeroes
 * Purpose: To learn about one dimensional arrays and removing unwanted values
 */
import chn.util.*;
import apcslib.*;
public class CompactMain {
    public static void main(String args[]) {
        FileInput inFile = new FileInput("compact.txt");
        Compact comp = new Compact(inFile);
        
        comp.printResult();
    }
}
