
/**
 * Write a description of class Quadratic here.
 *
 * @author (Kaitlyn)
 * @version (recoded file bc my flashdrive bit the dust)
 */
import apcslib.*;
import chn.util.*;
public class Quadratic
{
    public static void main(String args[])
    {
        ConsoleIO console = new ConsoleIO();
        
        System.out.println("Here's the quadratic equation: ax^2+bx+c");
        
        System.out.print("\nEnter in a: ");
        double a = console.readDouble();
        
        System.out.print("\nEnter in b: ");
        double b = console.readDouble();
        
        System.out.print("\nEnter in c: ");
        double c = console.readDouble();
        
        double x1 = (-b + Math.pow((Math.pow(b, 2) - 4 * a * c),0.5)) / (2 * a);
        double x2 = (-b - Math.pow((Math.pow(b, 2) - 4 * a * c),0.5)) / (2 * a);
        System.out.println("The roots of your equation are " + Format.right(x1, 4, 2) + " and " + Format.right(x2, 4, 2) + ".");
    }
}
