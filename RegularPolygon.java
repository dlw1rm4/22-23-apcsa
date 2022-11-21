
/**
 * Write a description of class RegularPolgon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RegularPolygon
{
   private int myNumSides;        // # of sides
   private double mySideLength;   // length of side
   private double myR;            // radius of circumscribed circle
   private double myr;            // radius of inscribed circle
   private double seperateC;
    
   // constructors
   public RegularPolygon()
   {
       myNumSides = 3;
       mySideLength = 3;
   }
   public RegularPolygon(int numSides, double sideLength)
   {
       myNumSides = numSides;
       mySideLength = sideLength;
   }
   // private methods
   private void calcr()
   {
       myr = 0.5 * mySideLength * (1 / Math.tan(Math.PI / myNumSides));
   }   
   private void calcR()
   {
       myR = 0.5 * mySideLength * (1 / Math.sin(Math.PI / myNumSides));
   }   
   // public methods
   public double vertexAngle()
   {
       seperateC = (double) (myNumSides - 2) / myNumSides;
       return seperateC * 180;
   }
   public double Perimeter()
   {
       return myNumSides * mySideLength;
   }
   public double Area()
   {
       this.calcR();
       return 0.5 * myNumSides * Math.pow(myR, 2) * Math.sin((2 * Math.PI) / myNumSides);
   }
   public double getNumSide()
   {
       return myNumSides;
   }
   public double getSideLength()
   {
       return mySideLength;
   }
   public double getR()
   {
       this.calcR();
       return myR;
   }
   public double getr()
   {
       this.calcr();
       return myr;
   }
}

