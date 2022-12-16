/**
 * @author (Kaitlyn Nguy)
 * @version (12.2.22)
 * @Lab (LA19, 2 - Compact)
 * Description: Shifts original array to the left to remove zeroes
 * Purpose: To learn about one dimensional arrays and removing unwanted values
 */
import chn.util.*;
import apcslib.*;
public class PermutationsMain
{
    public static void main(String args[]) {
        Permutations perm = new Permutations();
        System.out.println("\nRandom Permutation List Generator");
        
        for(int inc = 1; inc < 11; inc++) {
            System.out.print("\nList " + inc + ": [ ");
            perm.printPerm(); 
        }
    }
}