/**
 * @author (Kaitlyn Nguy)
 * @version (10.28.22)
 * @Lab (LA13, 3 - Piglatinator)
 * Description: Translates the input into Pig Latin
 * Purpose: To learn about String classes
 */
import apcslib.*; //imports the AP CSA package
import chn.util.*; //imports the package for Console
public class Piglatinator //name of class
{
    private String translateThis, pigLatinWord, pigLatinEnd, phrase, word, vowel, capital; //declares identifiers as String in this class only
    private int translateThisLength, spaceLength, wordLength, stop, start; //declares identifiers as data type int in this class only
    private char charAtPosition, ch; //declares identifiers as data type char in this class only
    public Piglatinator(String englishWord) //constructor
    {
        translateThis = englishWord; //declares identifer as parameter
        pigLatinWord = "";  //declares identifier as an empty string
        pigLatinEnd = ""; //declares identifier as an empty string
        start = 0; //declares identifer as 0
        stop = 0; //declares identifer as 0
        phrase = ""; //declares identifier as an empty string
    }
    public void translateWord() //name of method
    {
        translateThisLength = translateThis.length(); //declares identifier as the length of input
        for (spaceLength = 0; spaceLength < translateThisLength; spaceLength++) //for loop that runs and checks every character in string 
        {
            ch = translateThis.charAt(spaceLength); //declares ch as char at spaceLength of translateThis
            if(ch == ' ') //if statement for when ch is whitespace
            {
                stop++; //adds one to stop
                phrase += " "; //adds whitespace to string
            }
            else if(((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'Z')) == false) //if statement for when ch is a symbol
            {
                phrase += translateThis.charAt(spaceLength); //adds character to string
                start++; //adds one to start
                stop++; //adds one to stop
            }
            else if(spaceLength != start) //else statement for when spaceLength is not equal to start
            {
            }
            else //runs if none of other conditions met
            {
                for(wordLength = spaceLength; ((translateThis.charAt(wordLength) >= 'a' && translateThis.charAt(wordLength) <= 'z') || (translateThis.charAt(wordLength) >= '0' && translateThis.charAt(wordLength) <= '9' || (translateThis.charAt(wordLength) >= 'A' && translateThis.charAt(wordLength) <= 'Z'))) == true; wordLength++) //for statement for length of word
                {
                    stop++; //adds one to stop
                    if(stop == translateThisLength) //if statement for when stop is equal to string length
                    {
                        break; //breaks out of loop
                    }
                } 
                word = translateThis.substring(start, stop); //declares word as substring
                charAtPosition = translateThis.charAt(start); //finds char of translateThis at start
                if(charAtPosition == 'a' || charAtPosition == 'e' || charAtPosition == 'i' || charAtPosition == 'o' || charAtPosition == 'u' || charAtPosition == 'A' || charAtPosition == 'E' || charAtPosition == 'I' || charAtPosition == 'O' || charAtPosition == 'U') //runs code if char is a vowel
                {
                    vowel = word + "yay"; //declares identifier as string
                    phrase += vowel; //adds string to phrase
                }
                else
                {
                    if(translateThis.substring(start, start + 1).equals(translateThis.substring(start, start + 1).toUpperCase())) //runs if statement if first letter of word is capitalized
                    {
                        word = word.toLowerCase(); //makes string all lower case
                        for (int length = 0; length < word.length(); length++) //for statement for length of word
                        {
                            charAtPosition = word.charAt(length); //finds the char at the current length of substring
                            if (charAtPosition == 'a' || charAtPosition == 'e' || charAtPosition == 'i'|| charAtPosition == 'o' || charAtPosition == 'u') //runs code if charAtPosition is a vowel
                            {
                                capital = word.substring(length, length + 1).toUpperCase(); //capitalizes first letter of substring
                                pigLatinWord += capital + word.substring(length + 1, word.length()); //adds string to pigLatinWord
                                break; //breaks out of statement
                            }
                            else //runs below code if above conditions aren't met
                            {
                                pigLatinEnd += charAtPosition; //adds char to string
                            }
                        }
                        phrase += pigLatinWord + pigLatinEnd + "ay"; //adds string to phrase
                        pigLatinEnd = ""; //declares identifier as an empty string
                        pigLatinWord = ""; //declares identifier as an empty string
                    }
                    else //runs code below if above conditions not met
                    {
                        for (int length = 0; length < word.length(); length++) //for statement for length of word
                        {
                            charAtPosition = word.charAt(length); //declares charAtPosition as the character at length of word
                            if (charAtPosition == 'a' || charAtPosition == 'e' || charAtPosition == 'i'|| charAtPosition == 'o' || charAtPosition == 'u') //runs code if charAtPosition is a vowel
                            {
                                pigLatinWord += word.substring(length, word.length()); //adds substring to pigLatinWord
                                break; //breaks out of statement
                            }
                            else //runs below code if above conditions aren't met
                            {
                                pigLatinEnd += charAtPosition; //adds char to string
                            }
                        }
                        phrase += pigLatinWord + pigLatinEnd + "ay"; //adds string to phrase
                        pigLatinEnd = ""; //declares identifier as an empty string
                        pigLatinWord = ""; //declares identifier as an empty string
                    }   
                }
            }
            start = stop; //declares start as stop
        }
        System.out.print("> " + phrase); //prints translation
    }
}
