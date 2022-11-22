
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
import java.awt.*;
public class kochCurve //name of class
{
    private DrawingTool pen = new DrawingTool(new SketchPad(700, 700)); //constructs an object for this class only
    private int level; //declares identifier as data type int for this class only
    private int length; //declares identifier as data type int for this class only
    public kochCurve() //constructor
    {
    }
    public void center() //method
    {
        pen.up(); //picks pen up
        pen.move(-150, 100); //moves pen to coordinate
        pen.down(); //puts pen down
        pen.setDirection(0); //resets the direction of pen
    }
    public void direction() //method
    {
        pen.turnRight(120); //turns the pen 120 degrees to the right
    }
    public void resetColor()
    {
        pen.setColor(new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256)));
    }
    public void drawKochCurve(int level, int length) //method with parameters int level and int length
    {   
        if(level < 1) //runs code if the level is below 1
        {
            pen.forward(length); //moves pen forward           
        }
        else //runs code if above condition not met
        {
            drawKochCurve(level - 1, length / 3); //recursive method
            pen.turnLeft(60); //turns pen 60 degrees to the left
            drawKochCurve(level - 1, length / 3); //recursive method
            pen.turnRight(120); //turns pen 120 degrees to the right
            drawKochCurve(level - 1, length / 3); //recursive method
            pen.turnLeft(60); //turns pen 60 degrees to the left
            drawKochCurve(level - 1, length / 3); //recursive method
        }
    }
}
