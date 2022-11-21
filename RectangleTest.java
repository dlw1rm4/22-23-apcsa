
/**
 * Write a description of class RectangleMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import apcslib.*;
import chn.util.*;
public class RectangleTest
{
    public static void main(String args[])
    {
        Rectangle rectA = new Rectangle(-200, -200, 400, 266);
        rectA.draw();
        
        System.out.println("Perimeter = " + rectA.getPerimeter());
        System.out.println("Area = " + rectA.getArea());
    }
}
