
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
public class IrregularPolygon
{
    private ArrayList<Point2D.Double> myPolygon;
    private DrawingTool pen = new DrawingTool(new SketchPad(700, 700));
    private Point2D.Double currPoint, nextPoint;
    public IrregularPolygon() {
        myPolygon = new ArrayList<Point2D.Double>();
    }
    public void add(Point2D.Double aPoint) {
        myPolygon.add(aPoint);
    }
    public void draw() {
        pen.up();
        pen.move(myPolygon.get(0).getX(), myPolygon.get(0).getY());
        pen.setDirection(0);
        pen.down();
        for(int points = 1; points < myPolygon.size(); points++) {
            pen.move(myPolygon.get(points).getX(), myPolygon.get(points).getY());
        }
        pen.move(myPolygon.get(0).getX(), myPolygon.get(0).getY());
    }
    public double perimeter() {
        double per = 0;
        for(int points = 0; points < myPolygon.size(); points++) {
            currPoint = myPolygon.get(points);
            if(points + 1 < myPolygon.size()) {
                nextPoint = myPolygon.get(points + 1);
            }
            else {
                nextPoint = myPolygon.get(0);
            }
            per += currPoint.distance(nextPoint);
        }
        return per;
    }
    public double area() {
        double firstArea = 0;
        double secondArea = 0;
        for(int points = 0; points < myPolygon.size(); points++) {
            if(points + 1 >= myPolygon.size()) {
                firstArea += myPolygon.get(points).getX() * myPolygon.get(0).getY();
                secondArea += myPolygon.get(points).getY() * myPolygon.get(0).getX();
            }
            else {
                firstArea += myPolygon.get(points).getX() * myPolygon.get(points + 1).getY();
                secondArea += myPolygon.get(points).getY() * myPolygon.get(points + 1).getX();
            }
        }
        return Math.abs((firstArea - secondArea) / 2);
    }
}
