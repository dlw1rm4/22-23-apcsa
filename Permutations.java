/**
 * @author (Kaitlyn Nguy)
 * @version (12.6.22)
 * @Lab (LA20, 2 - Permutations)
 * Description: Shifts original array to the left to remove zeroes
 * Purpose: To learn about one dimensional arrays and removing unwanted values
 * 
 * Make list for numbers 1 through 10 and remove them when added into list
 * g
 */
import chn.util.*;
import apcslib.*;
import java.util.*;
public class Permutations
{
    ArrayList<Integer> lists = new ArrayList<Integer>();
    private Random rand = new Random();
    private int someNum;
    private int someIndex;
    private int first;
    private int last;
    private int sum;
    public Permutations() {
    }
    public ArrayList nextPermutation() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        lists.clear();
        for(int loop = 0; loop < 10; loop++) {
            someIndex = rand.nextInt(numbers.size());
            someNum = numbers.get(someIndex);
            lists.add(someNum);
            numbers.remove(someIndex);
        }
        first = lists.get(0);
        last = lists.get(9);
        sum = first + last;
        return lists;
    }
    public void printPerm() {
        this.nextPermutation();
        for(int checkList = 0; checkList < 10; checkList++) {
            System.out.print(lists.get(checkList));
            if(checkList + 1 < 10) {
                System.out.print(", ");
            }
            else {
                System.out.print(" ]" + Format.left(" ", 30) + Format.right("Sum of first and last: " + sum, 10));
            }
        }
    }
}