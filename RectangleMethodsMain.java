
/**
 * Write a description of class RectangleMethodsMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import apcslib.*;
public class RectangleMain
{
    public static void main(String args[])
    {
        final double TURNINC = 30;
        final double WIDTHDEC = 10;
        
        Rectangle rectA = new Rectangle(50, 0, 200, 50);
        Rectangle rectB = new Rectangle(rectA);
        
        rectA.setDirection(0);
        rectA.draw();
        
        rectA.setDirection(rectA.getDirection() + TURNINC);
        rectA.setWidth(rectA.getWidth() - WIDTHDEC);
        rectA.draw();
        
        rectA.setDirection(rectA.getDirection() + TURNINC);
        rectA.setWidth(rectA.getWidth() - WIDTHDEC);
        rectA.draw();
        
        rectA.setDirection(rectA.getDirection() + TURNINC);
        rectA.setWidth(rectA.getWidth() - WIDTHDEC);
        rectA.draw();
        
        rectA.setDirection(rectA.getDirection() + TURNINC);
        rectA.setWidth(rectA.getWidth() - WIDTHDEC);
        rectA.draw();
        
        rectA.setDirection(rectA.getDirection() + TURNINC);
        rectA.setWidth(rectA.getWidth() - WIDTHDEC);
        rectA.draw();
        
        rectA.setDirection(rectA.getDirection() + TURNINC);
        rectA.setWidth(rectA.getWidth() - WIDTHDEC);
        rectA.draw();
        
        rectA.setDirection(rectA.getDirection() + TURNINC);
        rectA.setWidth(rectA.getWidth() - WIDTHDEC);
        rectA.draw();
        
        rectA.setDirection(rectA.getDirection() + TURNINC);
        rectA.setWidth(rectA.getWidth() - WIDTHDEC);
        rectA.draw();
        
        rectA.setDirection(rectA.getDirection() + TURNINC);
        rectA.setWidth(rectA.getWidth() - WIDTHDEC);
        rectA.draw();
        
        rectA.setDirection(rectA.getDirection() + TURNINC);
        rectA.setWidth(rectA.getWidth() - WIDTHDEC);
        rectA.draw();
        
        rectB.draw();
        rectB.drawString();
    }
}
