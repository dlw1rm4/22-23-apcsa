
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.*;

public class testMain
{
    public static void main(String[] args){
        ConsoleIO input = new ConsoleIO();
        
        FileInput inFile = new FileInput("life100.txt");        
        testJ life = new testJ(20, 20, inFile);
        
        System.out.print("\nGeneration 5: \n");
        life.printGeneration(5);
    }
}
