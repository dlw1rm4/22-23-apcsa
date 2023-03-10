/**
 * Description: Count words in a speech and list them out in order based on occurence
 * Purpose: To learn about binary search
 * @author (Kaitlyn Nguy)
 * @version (3.1.22)
 */
import java.awt.geom.*;
import java.util.*;
import apcslib.*;
import chn.util.*;
public class CountWords
{
    private ArrayList<String> words = new ArrayList<String>();
    private ArrayList<String> uniqueWords = new ArrayList<String>();
    private String revWord = "";
    private int arrSize = 0;
    private int numOccur = 0;
    private String exWord = "";
    private boolean unique = true;
    private boolean extraWord = false;
    private boolean uniqueExtra = true;
    private Lilac[] unicorn;
    public CountWords(FileInput inFile)
    {
        while (inFile.hasMoreTokens()) { //reads inFile and makes ArrayLists
            String word = inFile.readToken().toLowerCase();
            for(int ch = 0; ch < word.length(); ch++) { //removes punctuation marks
                if(word.charAt(ch) == '-') {
                    extraWord = true;
                    exWord = revWord;
                    revWord = "";
                }
                else if (word.charAt(ch) >= 'a' && word.charAt(ch) <= 'z'){
                    revWord += word.charAt(ch);
                }
            }
            for(String urmom : words) { //goes through entire word list
                if (extraWord == true) {
                    if(exWord.equals(urmom)) {
                        uniqueExtra = false;
                    }
                }
                if (revWord.equals(urmom)) { //if statement for not unique words
                    unique = false;
                }
            }
            words.add(revWord); //adds to all words
            if (extraWord == true && uniqueExtra != false) {
                if(uniqueExtra != false) {
                    uniqueWords.add(words.get(words.size() - 1));
                    arrSize++;
                }
                words.add(exWord);
            }
            if (unique != false) {
                uniqueWords.add(revWord);
                arrSize++;
            }
            unique = true;
            extraWord = false;
            uniqueExtra = true;
            revWord = "";
        }
    }
    public void table() {
        Lilac[] unicorn = new Lilac[arrSize];
        for(int inc = 0; inc < uniqueWords.size(); inc++) { //creates unicorn array
            for(int inc2 = 0; inc2 < words.size(); inc2++) {
                if (uniqueWords.get(inc).equals(words.get(inc2))) {
                    numOccur++;
                }
            }
            unicorn[inc] = new Lilac(uniqueWords.get(inc), numOccur);
            numOccur = 0;
        }
        quickSort(unicorn, 0, unicorn.length - 1);
        for (int inc = 1; inc <= 30; inc++) {
            if(inc + 1 % 5 == 0) {
                System.out.println();
            }
            System.out.println();
            System.out.print(Format.right(inc, 4) + Format.right(unicorn[inc - 1].getInv(), 8) + Format.right("", 8) + unicorn[inc - 1].getId());
        }
        System.out.println("\n\nNumber of words used = " + uniqueWords.size());
        System.out.println("Total # of words = " + words.size());
    }
    private void quickSort(Lilac[] list, int first, int last) {
        int left = first;
        int right = last;
        
        int midIndex = (first + last) / 2;
        Lilac pivot = list[midIndex];
        do {
            while (list[left].compareTo(pivot) > 0){
                left++; 
            }
            while (list[right].compareTo(pivot) < 0){
                right--; 
            }
            if (left <= right) {
                Lilac temp = list[left];
                list[left] = list[right];
                list[right] = temp;
                left++;
                right--;
            }
        } while(left < right);
        if (right > first) {
            quickSort(list, first, right);
        }
        if (left < last) {
            quickSort(list, left, last);
        }
    }// private method  
}
