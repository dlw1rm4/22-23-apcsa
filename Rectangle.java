
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import apcslib.*;
import chn.util.*;
public class Rectangle
{
    private double myX;
    private double myY;
    private double myWidth;
    private double myHeight;
    private static DrawingTool pen = new DrawingTool(new SketchPad(500, 500));
    public Rectangle()
    {
        myX = 0;
        myY = 0;
        myWidth = 0;
        myHeight = 0;
    }
    public Rectangle(int x, int y, int width, int height)
    {
        myX = x;
        myY = y;
        myWidth = width;
        myHeight = height;
    }
    public double getPerimeter()
    {
        return (myWidth * 2) + (myHeight * 2);
    }
    public double getArea()
    {
        return myWidth * myHeight;
    }
    public void draw()
    {
        pen.up();
        pen.move(myX, myY);
        pen.down();
        pen.setDirection(90);
        
        pen.forward(myHeight);
        pen.turnRight(90);
        pen.forward(myWidth);
        pen.turnRight(90);
        pen.forward(myHeight);
        pen.turnRight(90);
        pen.forward(myWidth);
        
        pen.up();
        pen.move(myX, myY + 133.33);
        pen.down();
        pen.setDirection(90);
        
        pen.forward(myHeight);
        pen.turnRight(90);
        pen.forward(myWidth);
        pen.turnRight(90);
        pen.forward(myHeight);
        pen.turnRight(90);
        pen.forward(myWidth);
        
        pen.up();
        pen.move(myX, myY);
        pen.down();
        pen.setDirection(0);
        
        pen.forward(myHeight);
        pen.turnLeft(90);
        pen.forward(myWidth);
        pen.turnLeft(90);
        pen.forward(myHeight);
        pen.turnLeft(90);
        pen.forward(myWidth);
        
        pen.up();
        pen.move(myX + 133.33, myY);
        pen.down();
        pen.setDirection(0);
        
        pen.forward(myHeight);
        pen.turnLeft(90);
        pen.forward(myWidth);
        pen.turnLeft(90);
        pen.forward(myHeight);
        pen.turnLeft(90);
        pen.forward(myWidth);
    }
}
