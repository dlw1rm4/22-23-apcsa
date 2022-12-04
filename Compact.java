/**
 * @author (Kaitlyn Nguy)
 * @version (12.2.22)
 * @Lab (LA19, 2 - Compact)
 * Description: Shifts original array to the left to remove zeroes
 * Purpose: To learn about one dimensional arrays and removing unwanted values
 */
import chn.util.*;
import apcslib.*;
public class Compact {
    private FileInput inf;
    private int length = 0;
    private int arrLength;
    private int[] result;
    private int num = 0;
    private int[] numbers = new int[20];
    public Compact(FileInput inFile) {
        inf = inFile;
    }
    public void printResult()
    {
        System.out.print("\nBefore: ");
        while(inf.hasMoreTokens()) { //runs while there are still integers
            numbers[length] = inf.readInt();
            System.out.print(numbers[length]);
            length++;
            if(!inf.hasMoreTokens()) {
                break;
            }
            else {
                System.out.print(", ");
            }
        }
        this.compact();
        System.out.print("\nAfter: ");
        for(int loop = 0; loop < num; loop++) {
            System.out.print(numbers[loop] + " ");
        }
    }
    public int[] compact()
    {
        arrLength = length;
        length = 0;
        for(int loop = 0; loop < arrLength; loop++) { //runs all numbers in arra
            if(numbers[length] == 0) { //occurs when number is not zero
                while(numbers[length + 1] == 0) { //checks for zeroes
                    if(length + 1 == arrLength - 1) { //breaks out when the length is too big 
                        break;
                    }
                    else {
                        length++;
                    }
                }
                if(length + 1 == arrLength - 1) { //breaks out when length is too big for array
                    break;
                }
                else {
                    numbers[loop] = numbers[length + 1]; //moves array when element is 0
                    length++;
                }
            }
            else {
                numbers[loop] = numbers[length]; 
            }
            num++; //adds up total numbers in edited array
            length++;
        }
        return numbers;
    }
}

