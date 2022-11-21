
/**
 * @author (Kaitlyn Nguy)
 * @version (date)
 * @Lab (LA7, 1 - Fun)
 * Description: 
 * Purpose:
 */
import apcslib.*; //imports the AP CSA package
import chn.util.*; //imports the package for Console
public class Fun
{
    public static double fToC(double fahrenheit)
    {
        final double FRACTION1 = (double) 5 / 9;
        return FRACTION1 * (fahrenheit - 32);
    }
    public static double cToF(double celsius)
    {
        final double FRACTION2 = (double) 9 / 5;
        return (FRACTION2 * celsius) + 32;
    }
    public static double vol(double radius)
    {
        final double FRACTION3 = (double) 4 / 3;
        return FRACTION3 * Math.PI * Math.pow(radius, 3);
    }
    public static double hyp(double sideA, double sideB)
    {
        return Math.pow((Math.pow(sideA, 2) + Math.pow(sideB, 2)), 0.5);
    }
}

