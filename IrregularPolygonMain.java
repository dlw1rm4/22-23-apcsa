
/**
 * Description: Calculate the area and perimeter of an irregular polygon given the coordinate points, then drawing it out
 * Purpose: To learn about array lists
 * @author (Kaitlyn Nguy)
 * @version (12.16.22)
 */
import java.awt.geom.*;
import java.util.*;
import apcslib.*;
import chn.util.*;
public class IrregularPolygonMain
{
    public static void main(String args[]) {
        boolean cont = true;
        IrregularPolygon poly = new IrregularPolygon();
        ArrayList<Point2D.Double> myPoints = new ArrayList<Point2D.Double>();
        ConsoleIO console = new ConsoleIO();
        while(cont == true) {
            System.out.print("\nEnter the X coordinate: ");
            double xCoor = console.readDouble();
            System.out.print("Enter the Y coordinate: ");
            double yCoor = console.readDouble();
            
            Point2D.Double aPoint = new Point2D.Double(xCoor, yCoor);
            System.out.println("Your point: (" + xCoor + ", " + yCoor + ")");
            poly.add(aPoint);
            
            System.out.print("\n\nWould you like to add more points? ");
            String answer = console.readLine().toLowerCase();
            if(answer.charAt(0) != 'y') {
                cont = false;
            }
        }
        poly.draw();
        System.out.println("Perimeter: " + Format.right(poly.perimeter(), 4, 2));
        System.out.println("Area: " + Format.right(poly.area(), 4, 2));
    }
}
