
/**
 * Description: 
 * Purpose: 
 * @author (Kaitlyn Nguy)
 * @version (3.1.22)
 */
import java.awt.geom.*;
import java.util.*;
import apcslib.*;
import chn.util.*;
public class Item implements Comparable<Item> {
    private int myId;
    private int myInv;
    public Item(int id, int inv)
    {
        myId = id;
        myInv = inv;
    }
    public int getId(){
        return myId;
    }
    public int getInv(){ 
        return myInv;
    }
    public int compareTo(Item otherObject){ 
        return myId - otherObject.getId();
    }
    public boolean equals(Object otherObject){ 
        return this.equals(otherObject);
    }
    public String toString(){ 
        return "Item Id: " + myId + ", inv: " + myInv;
    }
}

