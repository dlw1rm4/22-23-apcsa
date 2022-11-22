
/**
 * @author (Kaitlyn Nguy)
 * @version (11.16.22)
 * @Lab (LA13, 2 - Shorthand)
 * Description: Shortens sentences
 * Purpose: To learn about String classes
 */
import apcslib.*; //imports the AP CSA package
import chn.util.*; //imports the package for Console
import static java.lang.Math.*; //imports random generator
public class RollingMain //name of class
{
    public static void main(String args[]) //main method
    {
        Rolling roll = new Rolling(); //constructor for Rolling class
        System.out.println(); //prints out an empty line
        roll.returnValues(); //calls method from Rolling class
    }
}
