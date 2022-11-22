
/**
 * @author (Kaitlyn Nguy)
 * @version (11.16.22)
 * @Lab (LA18, 1 - Rolling)
 * Description: Program counts how many times it takes to get all different numbers on all three dies
 * Purpose: To learn about DeMorgan's Law
 */
import apcslib.*; //imports the AP CSA package
import chn.util.*; //imports the package for Console
import static java.lang.Math.*; //imports random generator
public class Rolling //name of class
{
    private int r, first, second, third, count; //declares identifiers as data type int for this class only
    private boolean again; //declares identifier as data type boolean for this class only
    public Rolling() //creates contructor
    {
        r = 0; //declares r as 0
        count = 0; //declares count as 0
        again = true; //declares again as true
    }
    public void returnValues() //method
    {
        while(again == true) //while loop
        {
            this.rollDice(); //calls helper method rollDice()
            System.out.println(first + " " + second + " " + third); //prints dice numbers
            count += 1; //adds 1 to count
            if(!(first == second || second == third || first == third)) //if statement
            {
                again = false; //declares again as false
            }
        }
        System.out.println("count = " + count); //prints statement
    }
    private void rollDice() //helper method for rolling dice
    {
        r = (int) (6 * Math.random() + 1); //declares r as a random int between 1 and 6
        first = r; //declares first as r
        r = (int) (6 * Math.random() + 1); //declares r as a random int between 1 and 6
        second = r; //declares second as r
        r = (int) (6 * Math.random() + 1); //declares r as a random int between 1 and 6
        third = r; //declares third as r
    }
}
