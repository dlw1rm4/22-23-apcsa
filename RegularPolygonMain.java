
/**
 * Write a description of class RegularPolygonMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.*;
import apcslib.*;
public class RegularPolygonMain
{
    public static void main(String args[])
    {
        ConsoleIO console = new ConsoleIO();
        
        System.out.print("\nInsert Number of Sides --> ");
        int numSides = console.readInt();
        System.out.print("\nInsert Side Length --> ");
        double sideLength = console.readDouble();
        
        System.out.println("\n");
        
        RegularPolygon poly = new RegularPolygon(numSides, sideLength);
        System.out.println("Number of Sides --> " + numSides);
        System.out.println("Side Length --> " + sideLength);
        System.out.println("Degrees --> " + Format.left(poly.vertexAngle(), 4, 2));
        System.out.println("Radius of Inscribed --> " + Format.left(poly.getr(), 4, 2));
        System.out.println("Radius of Circumscribed --> " + Format.left(poly.getR(), 4, 2));
        System.out.println("Perimeter --> " + Format.left(poly.Perimeter(), 4, 2));
        System.out.println("Area --> " + Format.left(poly.Area(), 4, 2));
    }
}
