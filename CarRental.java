
/**
 * @author (Kaitlyn Nguy)
 * @version (9.9.22)
 * @Lab (LA4, 2 - Car Rental)
 * Description: Uses ConsoleIO to identify the characters inputed and converts it based on ASCII to give a make, model, and license plate
 * Purpose: Gives the make, model, and license plate based on the input by user
 */
import apcslib.*; //imports the AP CSA package
import chn.util.*; //imports the package for ConsoleIO

public class CarRental //JAVA file or function that gives 
{
    public static void main(String[] args) //the main function
    {
        ConsoleIO input = new ConsoleIO(); //declares the identifier 'input' as ConsoleIO 
        String carLetters, makeRequest, modelRequest; //declares the following identifiers as strings, meaning they contain a line of code
        
        //sets the identifiers as types
        int carNumber, c4, c5, c6, offset, as_c1, as_c2, as_c3, as_numFin; //sets the following identifiers as type 'int'
        char c1, c2, c3, as_numchar; //sets the following identifiers as type "char"
        
        //asks user for make and model of the car
        System.out.print("\nMake = "); //prints "Make = " after moving to the next line
        makeRequest = input.readToken(); //reads and returns the make of the car
        System.out.print("Model = "); //prints "Model = "
        modelRequest = input.readToken(); //reads and returns the model of the car
        
        //asks user to input the license plate and reads it
        System.out.println("Enter licence plate (3 letters - 3 digits) --> "); //prints out the request of a license plate in a specific format
        carLetters = input.readToken(); //reads and puts down the characters of the license plate
        carNumber = input.readInt(); //reads and puts down the integers of the license plate
        c1 = carLetters.charAt(0); //declares c1 as the first letter of the license plate
        c2 = carLetters.charAt(1); //declares c2 as the second letter of the license plate
        c3 = carLetters.charAt(2); //declares c3 as the third letter of the license plate
        as_c1 = c1; //converts the character into an integer
        as_c2 = c2; //converts the character into an integer
        as_c3 = c3; //converts the character into an integer
        
        //calculates the key ring
        offset = -160; //offsets the ASCII value by adding the integer 
        as_numFin = (as_c1 + as_c2 + as_c3) + offset; //gives the new ASCII value after adding up all the original ASCII values and adding it with the offset
        as_numchar = (char) as_numFin; //converts the ASCII value integer into a character
       
        //prints the output statement
        System.out.println(); //creates an empty line
        System.out.println("Make = " + makeRequest); //prints "Make = " on a new line with the make of the car that was inputted
        System.out.println("Model = " + modelRequest); //prints "Model = " on a new line with the model of the car that was inputted
        System.out.println(carLetters + " " + carNumber + " = " + as_numchar + (c1 + c2 + c3 + carNumber)); //prints the license plate on a new line with " = " with the ASCII value hexadecimal and the sum of the inputted integers and the ASCII values of the hexadecimals of the license plate
    }
}
