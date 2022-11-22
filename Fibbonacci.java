

/**
 * @author (Kaitlyn Nguy)
 * @version (11.10.22)
 * @Lab (LA15, 1 - Fibbonacci)
 * Description: Finds the Fibbonacci number recursively and non-recursively, and finds a product of two numbers using recursion
 * Purpose: To learn about recursion
 */
public class Fibbonacci
{
    private int numA, numB, numC, fibNum; //declares identifer data type for this class only
    public Fibbonacci() //creates constructor
    {
    }
    public int fib(int recNum) //method
    {
        if(recNum <= 1) //if-statement runs when recNum is below or equal to one
        {
            return recNum; //returns recNum
        }
        return fib(recNum - 1) + fib(recNum - 2); //returns recursion
    }
    public void nonRecFib(int noRecNum) //method
    {
        numA = 0; //declares numA as 0
        numB = 1; //declares numB as 1
        numC = 0; //declares numC as 0
        if (noRecNum == 0) //runs code if noRecNum is equivalent as 0
        {
            numC = 0; //declares numC as 0
        }
        else  if (noRecNum == 1) //runs code if noRecNum is equivalent to 1
        {
            numC = 1; //declares numC as 1
        }
        else //runs code if above statements don't run
        {
            for(int inc = 0; inc < (noRecNum - 1); inc++) //for statement
            {
                numC = numA + numB; //declares numC as numA plus numB
                numA = numB; //declares numA as numB
                numB = numC; //declares numB as numC
            }   
        }
        System.out.println("Non Recursive Number (" + noRecNum + "): " + numC); //prints statement
    }
    public int mult(int a, int b) //method
    {
        //  solves for (a * b) by recursively adding a, b times.
        //  precondition:  0 <= a <= 10;  0 <= b <= 10.
        if(0 < a && a < 10 && 0 < b && b < 10) //runs code if precondition is met
        {
            return (a + mult(a, b - 1)); //returns recursion
        }
        else
        {
            return 0; //returns 0;
        }
        }
    }

