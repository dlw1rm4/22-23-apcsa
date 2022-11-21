
/**
 * Write a description of class FunMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import apcslib.*; //imports the AP CSA package
import chn.util.*; //imports the package for Console
public class FunMain
{
    public static void main(String args[])
    {
        System.out.println("212 F --> " + Format.left(Fun.fToC(212), 7, 2) + "C");
        System.out.println("98.6 C --> " + Format.left(Fun.cToF(70), 7, 2) + "F");
        System.out.println("Volume of Sphere with Radius 1 --> " + Format.left(Fun.vol(1), 10, 2));
        System.out.println("Hypotenuse of Right Triangle with Sides 6.75 and 12.31 --> " + Format.left(Fun.hyp(6.75, 12.31), 10, 2));
    }
}
