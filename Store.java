
/**
 * Write a description of class testSearch here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.awt.geom.*;
import java.util.*;
import apcslib.*;
import chn.util.*;
public class Store
{
    private Item[] myStore;
    public Store(String fileName) { 
        FileInput inFile = new FileInput(fileName);
        myStore = new Item[inFile.readInt()];
        for(int inc = 0; inc < myStore.length; inc++) {
            myStore[inc] = new Item(inFile.readInt(), inFile.readInt());
        }
    }        // loads the data file into 'myStore'
    public void displayStore() { // displays the data
        System.out.println(Format.right("", 4) + Format.right("Id", 6) + Format.right("Inv", 10));
        for(int inc = 1; inc <= myStore.length; inc++) {
            if((inc - 1) % 10 == 0) {
                System.out.println();
            }
            System.out.println(Format.right(inc, 2) + Format.right(myStore[inc - 1].getId(), 8) + Format.right(myStore[inc - 1].getInv(), 10));
        }
    }
    public void doSort()                    // public method that calls 'quickSort' of 'myStore'
    {
        quickSort(myStore, 0, myStore.length - 1); // code as shown
    }
    private void quickSort(Item[] list, int first, int last) {
        int left = first;
        int right = last;
        
        int midIndex = (first + last) / 2;
        Item pivot = list[midIndex];
        System.err.println(pivot);
        do {
            while (list[left].compareTo(pivot) < 0){ //when list[left] is less than pivot value, left index goes up
                left++; //left of pivot index goes up
            }
            while (list[right].compareTo(pivot) > 0){
                right--; //right of pivot index goes down
            }
            if (left <= right) {
                Item temp = list[left];
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
    public void testSearch()
    {
        int idToFind;
        int invReturn;
        int index;
        ConsoleIO console = new ConsoleIO();
    
        System.out.println("Testing search algorithm\n");
        System.out.print("Enter Id value to search for (-1 to quit) ---> ");
        idToFind = console.readInt();
        while (idToFind >= 0)
        {
            // calling iterative version of binary search  
            index = bsearch(new Item(idToFind, 0));
            System.out.print("Iterative binary search: Id # " + idToFind);
            if (index == -1) {
                System.out.println("     No such part in stock");
            }
            else {
                System.out.println("     Inventory = " + myStore[index].getInv());
            }
            // calling recursive version of binary search
            index = bsearch(new Item(idToFind, 0), 0, myStore.length-1);
            System.out.print("Recursive binary search: Id # " + idToFind);
            if (index == -1) {
                System.out.println("     No such part in stock");
            }
            else {
                System.out.println("     Inventory = " + myStore[index].getInv());
            }
            System.out.print("\nEnter Id value to search for (-1 to quit) ---> ");
            idToFind = console.readInt();
        }
    }
    /**
    *  Searches the myStore array of Item Objects for the specified
    *  item object using a iterative binary search algorithm
    *
    * @param  idToSearch  Item object containing Id value being search for
    * @return             index of Item if found, -1 if not found
    */
    int bsearch(Item idToSearch)
    {
        int first = 0;
        int last = myStore.length - 1;
        while (first <= last) {
            int middle = first + (last - first) / 2;
            if(myStore[middle].getId() == idToSearch.getId()) {
                return middle;
            }
            else if (idToSearch.getId() > myStore[middle].getId()) {
                first = middle + 1;
            }
            else {
                last = middle - 1;
            }
        }
        return -1;
    }   
    /**
    *  Searches the specified array of Item Objects for the specified
    *  item object using a recursive binary search algorithm
    *
    * @param  idToSearch  Item object containing Id value being search for
    * @param  first       Starting index of search range
    * @param  last        Ending index of search range
    * @return             index of Item if found, -1 if not found
    */ 
    int bsearch (Item idToSearch, int first, int last)
    {
        if (last < myStore.length) {
            int middle = first + ((last - first) / 2);
            if (myStore[middle].compareTo(idToSearch) == 0) {
                return middle;
            }
            else if (myStore[middle].compareTo(idToSearch) < 0) {
                if (middle + 1 >= 50) {
                    return -1;
                }
                else {
                    return bsearch(idToSearch, middle + 1, last);
                }
            }
            else {
                if (middle - 1 < 1) {
                    return -1;
                }
                else {
                    return bsearch(idToSearch, first, middle - 1);
                }
            }
        }
        return -1;
    }
}
