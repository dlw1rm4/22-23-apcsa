/**
 * @author (Kaitlyn Nguy)
 * @version (12.6.22)
 * @Lab (LA21, 1 - Life)
 * Description: Solves the game of life by checking for neighbors
 * Purpose: To learn about 2D arrays 
 */
import apcslib.*;
public class LifeMethods
{
    private int[][] deadOrAlive = new int[22][22]; //length 22 becuse for loop goes 2 more
    public LifeMethods() {
    }
    public int sumLife(int[][] myMatrix) {
        int sum = 0;
        for(int colLoop = 1; colLoop <= 20; colLoop++) {
            for(int rowLoop = 1; rowLoop <= 20; rowLoop++) {
                if(myMatrix[colLoop][rowLoop] == 1) {
                    sum++;
                }
            }
        }
        return sum;
    }
    public int sumCol(int[][] myMatrix, int col) {
        int column = 0;
        for(int rowLoop = 1; rowLoop <= 20; rowLoop++) {
            if(myMatrix[col][rowLoop] == 1) {
                column++;
            }
        }
        return column;
    }
    public int sumRow(int[][] myMatrix, int row) {
        int rowTot = 0;
        for(int colLoop = 1; colLoop <= 20; colLoop++) {
            if(myMatrix[colLoop][row] == 1) {
                rowTot++;
            }
        }
        return rowTot;
    }
    public void print2dArray(int[][] myMatrix) {
        for(int years = 1; years <= 5; years++) {
            System.out.println("Generation " + years + ":" + "\n");
            System.out.print(Format.right("", 7));
            for(int colLoop = 1; colLoop <= 20; colLoop++) {
                System.out.print(colLoop % 10);
            }
            this.fill2dArray(myMatrix);
            System.out.println("\n");
            }
    }
    public void fill2dArray(int[][] myMatrix) {
        this.yearGrowth(myMatrix);
        System.out.println();
        for(int colLoop = 1; colLoop <= 20; colLoop++) {
            System.out.print(colLoop);
            System.out.print(Format.right("", 6));
            for(int rowLoop = 1; rowLoop <= 20; rowLoop++) {
                if(deadOrAlive[colLoop][rowLoop] == 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for(int newCol = 1; newCol <= 20; newCol++) {
            for(int newRow = 1; newRow <= 20; newRow++) {
                myMatrix[newCol][newRow] = deadOrAlive[newCol][newRow];
            }
        }    
    }
    public void yearGrowth(int[][] myMatrix) {
        int neighbors = 0;
        for(int colNum = 1; colNum <= 20; colNum++) {
            for(int rowNum = 1; rowNum <= 20; rowNum++) {
                neighbors = checkForNeighbors(myMatrix, colNum, rowNum); //finds number of neighbors throughout array
                if(neighbors == 3 && myMatrix[colNum][rowNum] == 0) {
                    deadOrAlive[colNum][rowNum] = 1;
                }
                else if(((neighbors < 2) || (neighbors > 3)) && myMatrix[colNum][rowNum] == 1) {
                    deadOrAlive[colNum][rowNum] = 0;
                }
                else {
                    deadOrAlive[colNum][rowNum] = myMatrix[colNum][rowNum];
                }
            }
        }
    }
    public int checkForNeighbors(int[][] myMatrix, int col, int row) {
        int neighbors = 0;
        for(int loop = col - 1; loop < col + 2; loop++) {
            for(int inc = row - 1; inc < row + 2; inc++) {
                if(myMatrix[loop][inc] == 1) {
                    neighbors++;
                }
            }
        }
        if(myMatrix[col][row] == 1) {
            neighbors--;
        }
        return neighbors;
    }
}

