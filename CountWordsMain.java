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
public class CountWordsMain
{
    public static void main(String args[]){
        CountWords cnt = new CountWords(new FileInput("IHaveADream.txt"));
        cnt.table();
    }
}
