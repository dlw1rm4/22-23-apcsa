/**
 * @author (Kaitlyn Nguy)
 * @version (12.6.22)
 * @Lab (LA21, 1 - Life)
 * Description: Solves the game of life by checking for neighbors
 * Purpose: To learn about 2D arrays 
 */
import chn.util.*;
public class LifeMain 
{
    public static void main(String args[]) {
        FileInput inf = new FileInput("life100.txt");
        int[][] myMatrix = new int[22][22];
        int population = inf.readInt();
        while(inf.hasMoreTokens()) {
            int col = inf.readInt();
            int row = inf.readInt();
            myMatrix[col][row] = 1;
        }
        LifeMethods life = new LifeMethods();
        life.print2dArray(myMatrix);
        System.out.println("\n\nNumber in Row 10 ---> " + life.sumCol(myMatrix, 10)); //i just switched the methods srry my columns were not the same as array columns lol
        System.out.println("\nNumber in Column 10 ---> " + life.sumRow(myMatrix, 10));
        System.out.println("\nNumber of living organisms ---> " + life.sumLife(myMatrix));
    }
}