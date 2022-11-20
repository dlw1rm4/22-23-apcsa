
/**
 * @author (Kaitlyn Nguy)
 * @version (8.26.22)
 * @Lab (LA2, 1 - Benzene)
 * Description: Creates a hexagonal shape with a circle inside
 * Purpose: To form a drawing of a benzene using code
 */

import apcslib.*; //imports the AP CSA package
import java.awt.*; //imports the JAVA package (used for creating color)

public class Benzene //JAVA file or the function that creates the benzene
{
    public static void main(String[] args) //code that indicates the main code
    {
        DrawingTool pencil; //declaration of the object pencil class DrawingTool
        SketchPad paper; //declaration of the object paper class SketchPad
        
        paper = new SketchPad(1000, 1000); //creates a SketchPad window of 600 pixels by 600 pixels
        pencil = new DrawingTool(paper); //creates a drawing tool for the SketchPad
        
        pencil.setWidth(3);
                
        //move pencil
        pencil.up(); //picks pencil up from SketchPad
        pencil.move(0, 80); //moves pencil to the coordinates (0, -160)
        pencil.down(); //puts pencil down on Sketchpad
        
        //draw a circle
        pencil.drawCircle(120); //draws a circle with a radius of 120 pixels
        
        //move pencil
        pencil.up(); //picks pencil up from SketchPad
        pencil.move(0, 240); //moves pencil to the coordinates (0, -160)
        pencil.down(); //puts pencil down on Sketchpad
        
        //draw hexagon
        pencil.turnRight(90); //turns pencil right by 90 degrees
        pencil.forward(92.5); //moves pencil forward by 90 pixels
        pencil.turnRight(60); //turns pencil right by 60 degrees
        pencil.forward(185); //moves pencil forward by 185 pixels
        pencil.turnRight(60); //turns pencil right by 60 degrees
        pencil.forward(185); //moves pencil forward by 185 pixels
        pencil.turnRight(60); //turns pencil right by 60 degrees
        pencil.forward(185); //moves pencil forward by 185 pixels
        pencil.turnRight(60); //turns pencil right by 60 degrees
        pencil.forward(185); //moves pencil forward by 185 pixels
        pencil.turnRight(60); //turns pencil right by 60 degrees
        pencil.forward(185); //moves pencil forward by 185 pixels
        pencil.turnRight(60); //turns pencil right by 60 degrees
        pencil.forward(92.5); //moves pencil forward by 92.5 pixels
        
        //move pencil
        pencil.up(); //picks pencil up from SketchPad
        pencil.move(0, 80); //moves pencil to the coordinates (0, -160)
        pencil.down(); //puts pencil down on Sketchpad
        
        //draw eyelid
        pencil.setWidth(1);
        pencil.turnRight(90);
        pencil.forward(120);
        pencil.backward(240);
        
        //move pencil
        pencil.up(); //picks pencil up from SketchPad
        pencil.move(0, 20); //moves pencil to the coordinates (0, -160)
        pencil.down(); //puts pencil down on Sketchpad
        
        //draw eyes
        pencil.drawCircle(50);
        
        //move pencil
        pencil.up(); //picks pencil up from SketchPad
        pencil.move(0, 10); //moves pencil to the coordinates (0, -160)
        pencil.down(); //puts pencil down on Sketchpad
        
        //draw pupil
        pencil.setWidth(3);
        pencil.drawCircle(25);
        
        //move pencil
        pencil.up(); //picks pencil up from SketchPad
        pencil.move(0, 50); //moves pencil to the coordinates (0, -160)
        pencil.down(); //puts pencil down on Sketchpad
        
        //draw head
        pencil.setWidth(3);
        pencil.drawCircle(300);

    }
}
