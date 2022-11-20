
/**
 * @author (Kaitlyn Nguy)
 * @version (8.30.22)
 * @Lab (LA3, 2 - Easter)
 * Description: Let y be the year (such as 1583 or 2003).
Divide y by 19 and call the remainder a. Ignore the quotient.
Divide y by 100 and get a quotient b and a remainder c.
Divide b by 4 and get a quotient d and a remainder e.
Divide b + 8 by 25 and get a quotient f. Ignore the remainder.
Divide b - f + 1 by 3 and get a quotient g. Ignore the remainder.
Divide 19 * a + b - d - g + 15 by 30 and get a remainder h. Ignore the quotient.
Divide c by 4 and get a quotient i and a remainder k.
Divide 32 + 2 * e + 2 * i - h - k by 7 and get a remainder r. Ignore the quotient.
Divide a + 11 * h + 22 * r by 451 and get a quotient m. Ignore the remainder.
Divide h + r - 7 * m + 114 by 31 and get a quotient n and a remainder p.
 * Purpose: Gives the correct date of Easter for the given year
 */

import apcslib.*; //imports the AP CSA package
import java.awt.*; //imports the JAVA package (used for creating color)

public class Easter //JAVA file or the function that tells us what date Easter falls on in that year
{
    public static void main(String[] args) // //code that indicates the main code
    {
        int year = 2003; // declares the identifier 'year' as the year 2003 using the type 'int'

        int a = year % 19; //declares 'a' as the remainder of the year divided by 19 using the type 'int'
        int b = year / 100; //declares 'b' as the quotient of the year and 100 using the type 'int'
	int c = year % 100; //declares 'c' as the remainder of the year divided by 100 using the type 'int'
	int d = b / 4; //declares 'd' as the quotient of the identifier 'b' and 4 using the type 'int'
	int e = b % 4; //declares 'e' as the remainder of the identifier 'b' divided by 4 using the type 'int'
	int f = (b + 8) / 25; //declares 'f' as the quotient of the identifier 'b' plus 8 and 25 using the type 'int'
	int g = (b - f + 1) / 3; //declares 'g' as the difference of identifiers 'b' - 'f' plus 1 divided by 3 using the type 'int'
	int h = (19 * a + b - d - g + 15) % 30; //declares 'h' as the remainder of 19 * 'a' + 'b' - 'd' - 'g' + 15 divided by 30 using the type 'int'
	int i = c / 4; //declares 'i' as the quotient of the identifier 'c' and 4 using the type 'int'
	int k = c % 4; //declares 'k' as the remainder of the identifier 'c' divided by  4 using the type 'int'
	int r = (32 + 2 * e + 2 * i - h - k) % 7; //declares 'r' as the remainder of 32 + 2 * e + 2 * i - h - k and 7 using the type 'int'
	int m = (a + 11 * h + 22 * r) / 451; //declares 'p' as the quotient of a + 11 * h + 22 * r divided by 451 using the type 'int'
	int n = (h + r - 7 * m + 114) / 31; //declares 'n' as the quotient of h + r - 7 * m + 114 and 31 using the type 'int'
	int p = (h + r - 7 * m + 114) % 31; //declares 'p' as the remainder of h + r - 7 * m + 114 divided by 31 using the type 'int'
	int y = year; //declares 'y' as the identifier 'year'
	
	System.out.println("a = " + a); //prints the statement 'a = ' with the identifier 'a'
	System.out.println("b = " + b); //goes to the next line and prints the statement 'b = ' with the identifier 'b'
	System.out.println("c = " + c); //goes to the next line and prints the statement 'c = ' with the identifier 'c'
	System.out.println("d = " + d); //goes to the next line and prints the statement 'd = ' with the identifier 'd'
	System.out.println("e = " + e); //goes to the next line and prints the statement 'e = ' with the identifier 'e'
	System.out.println("f = " + f); //goes to the next line and prints the statement 'f = ' with the identifier 'f'
	System.out.println("g = " + g); //goes to the next line and prints the statement 'g = ' with the identifier 'g'
	System.out.println("h = " + h); //goes to the next line and prints the statement 'h = ' with the identifier 'h'
	System.out.println("i = " + i); //goes to the next line and prints the statement 'i = ' with the identifier 'i'
	System.out.println("k = " + k); //goes to the next line and prints the statement 'k = ' with the identifier 'k'
	System.out.println("r = " + r); //goes to the next line and prints the statement 'r = ' with the identifier 'r'
	System.out.println("m = " + m); //goes to the next line and prints the statement 'm = ' with the identifier 'm'
	System.out.println("n = " + n); //goes to the next line and prints the statement 'n = ' with the identifier 'n'
	System.out.println("p = " + p ); //goes to the next line and prints the statement 'p = ' with the identifier 'p'
	System.out.println(); //leaves an empty line
	System.out.println("Easter in " + y + " falls on " + n + "/" + (p+1)); //goes to the next line and prints the statement "Easter in " with the identifier 'y' with the statement " falls on " with the identifier 'n' with "/" with the identifier 'p' plus one 
    }
}
