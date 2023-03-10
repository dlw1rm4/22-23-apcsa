
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
public class Lilac implements Comparable<Lilac> {
    private String myId;
    private int myInv;
    public Lilac(String id, int inv)
    {
        myId = id;
        myInv = inv;
    }
    public String getId(){
        return myId;
    }
    public int getInv(){ 
        return myInv;
    }
    public int compareTo(Lilac otherObject){ 
        return this.getInv() - otherObject.getInv();
    }
    public boolean equals(Object otherObject){ 
        return this.equals(otherObject);
    }
    public String toString(){ 
        return "Unique Id: " + myId + ", inv: " + myInv;
    }
}

