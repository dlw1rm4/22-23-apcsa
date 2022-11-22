
/**
 * @author (Kaitlyn Nguy)
 * @version (11.14.22)
 * @Lab (LA15, 3 - Koch Curve)
 * Description: Draws fractals
 * Purpose: To learn about recursion
 * SIDE NOTE: levels adjusted to 5 because 6 would make values too close to 0, therefore nothing would show up
 */
import apcslib.*; //imports the AP CSA package
import chn.util.*; //imports the package for Console
public class kochCurveMain //name of class
{
    public static void main(String args[]) //main method
    {
        kochCurve curve = new kochCurve(); //constructor
        curve.center(); //calls center() method from kochCurve class
        for (int got7 = 0; got7 < 6; got7++) //for loop runs 6 times to draw entire Koch Curve
        {
            curve.drawKochCurve(6, 300); //see side note + draws Koch Curve
            curve.direction(); //calls direction() method from kochCurve class
        }
        }
    }

