
/**
 * Write a description of class DrawHouse here. //Creates a piece of paper and a pencil,
 * and draws a square 100 units on each side.
 * 
 * @author (Kaitlyn Nguy)
 * @version (8.23.22)
 * @Lab (LA1, 1 - DrawHouse)
 * Description: Creates a sketchpad and a pencil, and draws a house of 260 by 520 pixels with windows, a roof, and a double door
 * Purpose: To draw house using codes 
 */

import apcslib.*; //imports more commands for AP CSA
import java.net.*; //imports JAVA commands (used for creating color)

public class DrawHouse //JAVA file or the function that creates the house
{
    public static void main(String[] args) //code that indicates the main code
    {
        DrawingTool pencil; //declaration of the object pencil class DrawingTool
        SketchPad paper; // declaration of the object paper class SketchPad
        
        paper = new SketchPad(600, 600); //creates a SketchPad window of 600 pixels by 600 pixels
        pencil = new DrawingTool(paper); //creates a drawing tool for the SketchPad
        
        //moves the pencil
        pencil.home(); //moves pencil to the center of the SketchPad
        pencil.up(); //picks pencil up from SketchPad
        pencil.move(0,-150); //moves the pencil to the coordinate (0,-150)
        pencil.down(); //puts pencil down
        
        //draw the rectangle of the house
        pencil.setWidth(3); //sets the pencil width to 3 pixels
        pencil.turnLeft(90); //turns pencil to the left by 90 degrees
        pencil.forward(260); //moves pencil forward by 260 pixels
        pencil.turnLeft(90); //turns pencil to the left by 90 degrees
        pencil.forward(200); //moves pencil forward by 200 pixels
        pencil.turnLeft(90); //turns pencil to the left by 90 degrees
        pencil.forward(520); //moves pencil forward by 520 pixels
        pencil.turnLeft(90); //turns pencil to the left by 90 degrees
        pencil.forward(200); //moves pencil forward by 200 pixels
        pencil.turnLeft(90); //turns pencil left by 90 degrees
        pencil.forward(260); //moves pencil forward 260 pixels
        
        //moves the pencil
        pencil.home(); //moves the pencil to the center of the SketchPad
        pencil.up(); //picks pencil up from SketchPad
        pencil.move(0,-150); //moves pencil to the coordinates (0, -150)
        
        //draw the roof
        pencil.turnLeft(90); //turns pencil to the left by 90 degrees
        pencil.forward(260); //moves pencil forward by 260 pixels
        pencil.turnLeft(90); //turns pencil to the left by 90 degrees
        pencil.forward(200); //moves pencil forward by 200 pixels
        pencil.down(); //puts pencil down on SketchPad
        pencil.turnLeft(60); //turns pencil to the left by 60 degrees
        pencil.forward(150); //moves pencil forward by 300 pixels
        
        //draw chimney
        pencil.turnLeft(-60);
        pencil.forward(20);
        pencil.turnLeft(90);
        pencil.forward(50);
        pencil.backward(50);
        pencil.turnLeft(-90);
        pencil.backward(20);
        pencil.turnLeft(60);
        
        //draw roof (cont.)
        pencil.forward(150); //moves pencil forward by 300 pixels
        pencil.turnLeft(60);
        
        //moves the pencil
        pencil.home(); //moves pencil to the center of the SketchPad
        pencil.up(); //picks pencil up from SketchPad
        pencil.move(0,-150); //moves pencil to the coordinates (0, -150)
        
        //draw the door
        pencil.setWidth(1); //sets the pencil width to 1 pixel
        pencil.down(); //puts pencil down on SketchPad
        pencil.backward(75); //moves pencil backward by 75 pixels
        pencil.up(); //picks pencil up from SketchPad
        pencil.forward(75); //moves pencil forward by 75 pixels
        pencil.down(); //puts pencil down on SketchPad
        pencil.setWidth(3); //sets the pencil width to 3 pixels
        pencil.turnLeft(90); //turns pencil to the left by 90 degrees
        pencil.forward(40); //moves pencil forward by 40 pixels
        pencil.turnLeft(90); //turns pencil to the left by 90 degrees
        pencil.forward(75); //moves pencil forward by 75 pixels
        pencil.turnLeft(90); //turns pencil to the left by 90 degrees
        pencil.forward(80); //moves pencil forward by 80 pixels
        pencil.turnLeft(90); //turns pencil to the left by 90 degrees
        pencil.forward(75); //moves pencil forward by 75 pixels
        
        //moves the pencil
        pencil.home(); //moves pencil to the center of the SketchPad
        pencil.up(); //picks pencil up from SketchPad
        pencil.forward(20); //moves pencil forward by 20 pixels
        pencil.turnLeft(90); //turns pencil to the left by 90 degrees
        pencil.forward(70); //moves pencil forward by 70 pixels
        pencil.down(); //puts pencil down on SketchPad
        
        //draw left window
        pencil.forward(75); //moves pencil forward by 75 pixels
        pencil.turnLeft(90); //turns pencil to the left by 90 degrees
        pencil.forward(75); //moves pencil forward by 75 pixels
        pencil.turnLeft(90); //turns pencil to the left by 90 degrees
        pencil.forward(75); //moves pencil forward by 75 pixels
        pencil.turnLeft(90); //turns pencil to the left by 90 degrees
        pencil.forward(75); //moves pencil forward by 75 pixels
        
        //moves the pencil
        pencil.home(); //moves pencil to the center of the SketchPad
        pencil.up(); //picks pencil up from SketchPad
        pencil.forward(20); //moves pencil forward by 20 pixels
        pencil.turnRight(90); //turns pencil to the right by 90 degrees
        pencil.forward(70); //moves pencil forward by 70 pixels
        pencil.down(); //puts pencil down on SketchPad
        
        //draw right window
        pencil.forward(75); //moves pencil forward by 75 pixels
        pencil.turnRight(90); //turns pencil to the right by 90 degrees
        pencil.forward(75); //moves pencil forward by 75 pixels
        pencil.turnRight(90); //turns pencil to the right by 90 degrees
        pencil.forward(75); //moves pencil forward by 75 pixels
        pencil.turnRight(90); //turns pencil to the right by 90 degrees
        pencil.forward(75); //moves pencil forward by 75 pixels
        
        //moves the pencil
        pencil.home(); //moves pencil to the center of the SketchPad
        pencil.up(); //picks pencil up from SketchPad
        pencil.forward(20); //moves pencil forward by 20 pixels
        pencil.turnRight(90); //turns pencil to the right by 90 degrees
        pencil.forward(70); //moves pencil forward by 70 pixels
        pencil.down(); //puts pencil down on SketchPad
        
        //draw right window frame
        pencil.setWidth(1); //sets the pencil width to 1 pixel 
        pencil.forward(36.5); //moves pencil forward by 36.5 pixels
        pencil.turnRight(90); //turns pencil to the right by 90 degrees
        pencil.forward(75); //moves pencil forward by 75 pixels
        pencil.backward(36.5); //moves pencil backward by 36.5 pixels
        pencil.turnRight(90); //turns pencil to the right by 90 degrees
        pencil.forward(36.5); //moves pencil forward by 36.5 pixels
        pencil.backward(75); //moves pencil backward by 75 pixels
        
        //moves the pencil
        pencil.home(); //moves pencil to the center of the SketchPad
        pencil.up(); //picks pencil up from SketchPad
        pencil.forward(20); //moves pencil forward by 20 pixels
        pencil.turnLeft(90); //turns pencil to the left by 90 degrees
        pencil.forward(70); //moves pencil forward by 70 pixels
        pencil.down(); //puts pencil down on SketchPad
        
        //draw left window frame
        pencil.forward(36.5); //moves pencil forward by 36.5 pixels
        pencil.turnLeft(90); //turns pencil to the left by 90 degrees
        pencil.forward(75); //moves pencil forward by 75 pixels
        pencil.backward(36.5); //moves pencil backward by 36.5 pixels
        pencil.turnLeft(90); //turns pencil to the left by 90 degrees
        pencil.forward(36.5); //moves pencil forward by 36.5 pixels
        pencil.backward(75); //moves pencil backward by 75 pixels
                
        //moves the pencil
        pencil.home(); //moves pencil to the center of the SketchPad
        pencil.up(); //picks pencil up from SketchPad
        pencil.move(0,-150); //moves pencil to the coordinates (0, -150)
        
        //draw door knobs
        pencil.backward(36.5);
        pencil.turnLeft(90);
        pencil.forward(8);
        pencil.down();
        pencil.drawCircle(2);
        pencil.up();
        pencil.turnRight(180);
        pencil.forward(16);
        pencil.down();
        pencil.drawCircle(2);
        
        //moves the pencil
        pencil.home(); //moves pencil to the center of the SketchPad
        pencil.up(); //picks pencil up from SketchPad
        pencil.move(0,-150); //moves pencil to the coordinates (0, -150)
        
        //draw path
        pencil.turnLeft(90);
        pencil.forward(36.5);
        pencil.down();
        pencil.turnRight(50);
        pencil.forward(500);
        pencil.backward(500);
        pencil.turnLeft(50);
        pencil.backward(75);
        pencil.turnLeft(-130);
        pencil.forward(500);
        
   
       
    }

}

