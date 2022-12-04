/**
 * @author (Kaitlyn Nguy)
 * @version (12.2.22)
 * @Lab (LA19, 1 - Statistics)
 * Description: Finds the average, standard deviation, and mode of a text file
 * Purpose: To learn about one dimensional arrays
 */
import chn.util.*;
import apcslib.*;
public class Statistics
{
    private FileInput inf;
    private int number;
    private int nextNum = 1;
    private double average = 0;
    private int totNum;
    private double standardTotal;
    private int largest = 0;
    private int myMode = 1;
    private int[] use = new int[101];
    private int[] numberArr = new int[1000];
    private double[] averArr = new double[1000];
    private double[] devArr = new double[1000];
    private int[] mode = new int[101];
    public Statistics(FileInput inFile)
    {
        inf = inFile;
    }
    public void printInfo()
    {
        while(inf.hasMoreLines()) 
        {
            number = inf.readInt();
            totNum += number;
            numberArr[nextNum] = number;
            averArr[nextNum] = average();
            nextNum++;
        }
        average = averArr[nextNum - 1];
        System.out.println("The average of the data is: " + Format.right(average, 4, 2));
        System.out.println();
        this.stanDev();
        System.out.println();
        this.mode();
    }
    private double average()
    {
        return (double) totNum / nextNum;
    }
    private void stanDev()
    {
        for(int loop = 1; loop < nextNum; loop++)
        {
            standardTotal += Math.pow(numberArr[loop] - average, 2);
        }
        System.out.println("The standard deviation of the data is: " + Format.right(Math.sqrt((double) standardTotal / (double) nextNum), 4, 2));
    }
    private void mode()
    {
        this.useArray(numberArr);
        this.findMode(use);
        System.out.print("The mode of the data is: ");
        for(int loop = 1; loop < mode.length; loop++)
        {
            if(mode[loop] != 0)
            {
                System.out.print(mode[loop] + " ");
            }
            else
            {
            }
        }
    }
    private int[] useArray(int[] numberArr)
    {
        for(int loop = 1; loop < numberArr.length; loop++)
        {
            use[numberArr[loop]]++; //adds one to any of the same value
        }
        return use;
    }
    private int[] findMode(int[] use)
    {
        for(int loop = 1; loop < use.length; loop++) //looks through use array for largest amount of times
        {
            if (use[loop] == largest)
            {
                myMode++;
                mode[myMode] = loop;
                System.err.println(mode[myMode]);
            }
            else if (use[loop] > largest)
            {                
                myMode = 1; 
                largest = use[loop]; //largest amount of times a number occurred
                mode[myMode] = loop;
            }
            else
            {
                
            }
        }
        return mode;
    }
}