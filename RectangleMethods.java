
/**
 * Write a description of class RectangleMethods here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import apcslib.*;
public class Rectangle
{
    private double myX;      // the x coordinate of the rectangle
    private double myY;      // the y coordinate of the rectangle
    private double myWidth;  // the width of the rectangle
    private double myHeight; // the height of the rectangle
    private double myDirection;
    private static DrawingTool pen = new DrawingTool(new SketchPad(500, 500));
    Rectangle()
    {
        myX =0;
        myY = 0;
        myWidth = 0;
        myHeight = 0;
    }
    Rectangle(double x, double y, double width, double height)
    {
        myX = x;
        myY = y;
        myWidth = width;
        myHeight = height;
    }
    Rectangle(Rectangle rm)
    {
        myX = -225;
        myY = 140;
        myWidth = rm.myWidth;
        myHeight = rm.myHeight;
    }
    public void setXPos(double x)
    {
        myX = x;
    }
    public void setYPos(double y)
    {
        myY = y;
    }
    public void setWidth(double width)
    {
        myWidth = width;
    }
    public void setHeight(double height)
    {
        myHeight = height;
    }
    public void setDirection(double direction)
    {
        myDirection = direction;
        System.err.println(myDirection);
    }
    public double getXPos()
    {
        return myX;
    }
    public double getYPos()
    {
        return myY;
    }
    public double getWidth()
    {
        return myWidth;
    }
    public double getHeight()
    {
        return myHeight;
    }
    public double getDirection()
    {
        return myDirection;
    }
    public double getPerimeter()
    {
        return myHeight * 2 + myWidth * 2;
    }
    public double getArea()
    {
        return myWidth * myHeight;
    }
    public void drawString()
    {
        pen.up();
        pen.move(myX + 10, myY + 15);
        pen.down();
        pen.drawString("Area: " + getArea());
        
        pen.up();
        pen.move(myX + 10, myY + 55);
        pen.down();
        pen.drawString("Width: " + getWidth());
        
        pen.up();
        pen.move(myX + 10, myY - 20);
        pen.down();
        pen.drawString("Perimeter: " + getPerimeter());
        
        pen.up();
        pen.move(myX + 210, myY + 15);
        pen.down();
        pen.drawString("Height: " + getHeight());
    }
    public void draw()
    {   
        pen.up();
        pen.move(myX, myY);
        pen.setDirection(0);
        pen.turnRight(myDirection);
        pen.down();
        
        pen.forward(myWidth);
        pen.turnLeft(90);
        pen.forward(myHeight);
        pen.turnLeft(90);
        pen.forward(myWidth);
        pen.turnLeft(90);
        pen.forward(myHeight);
    }
}  
