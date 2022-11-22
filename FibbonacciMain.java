
/**
 * @author (Kaitlyn Nguy)
 * @version (11.10.22)
 * @Lab (LA15, 1 - Fibbonacci)
 * Description: Finds the Fibbonacci number recursively and non-recursively, and finds a product of two numbers using recursion
 * Purpose: To learn about recursion
 */
import apcslib.*; //imports the AP CSA package
import chn.util.*; //imports the package for Console
public class FibbonacciMain //name of class
{
    public void main(String args[]) //main method
    {
        Fibbonacci fibbonacci = new Fibbonacci(); //constructor
        
        System.out.println("\nFibbonacci Number: " + fibbonacci.fib(0)); //prints statement
        System.out.println("Fibbonacci Number: " + fibbonacci.fib(3)); //prints statement
        System.out.println("Fibbonacci Number: " + fibbonacci.fib(11)); //prints statement
        fibbonacci.nonRecFib(1); //prints statement
        fibbonacci.nonRecFib(5); //prints statement 
        fibbonacci.nonRecFib(14); //prints statement
        System.out.println("Product: " + fibbonacci.mult(0, 4)); //prints statement
        System.out.println("Product: " + fibbonacci.mult(3, 1)); //prints statement
        System.out.println("Product: " + fibbonacci.mult(7, 8)); //prints statement
        System.out.println("Product: " + fibbonacci.mult(5, 0)); //prints statement
    }
}
