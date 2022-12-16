
/**
 * Write a description of class testMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.*;

public class testJ
{
    boolean[][] dish;
    int rowDef, colDef;
    FileInput inFile;
    
    public testJ(){
        
    }
    
    public testJ(int x, int y, FileInput file){
        int row, col;
        
        rowDef = x + 2;
        colDef = y + 2;
        inFile = file;        
        dish = new boolean[rowDef][colDef];
        
        System.out.println(inFile.readInt() + " bacteria");
        
        while(inFile.hasMoreTokens()){
            row = inFile.readInt();
            col = inFile.readInt();
            
            dish[row][col] = true;
        }
    }

    public void printBoard(boolean[][] matrix)
    {
        String cell = "";
        for(boolean[] i : matrix){
            for(boolean val : i){
                if(val)
                    cell += "*";
                else
                    cell += " ";
                }
            cell += "\n";
        }
        System.out.println(cell);
    }
    
    public boolean[][] nextGeneration(boolean[][] cells)
    {
    	boolean[][] nextGenerationOfCells = new boolean[cells.length][cells[0].length];
    	int newCellGenerated;
    	for (int i = 0; i < cells.length; i++)
    	{
    		for (int j = 0; j < cells[0].length; j++)
    		{
    			newCellGenerated = NumberOfNeighbors(cells, i, j);
    			if (rulesOfLife(newCellGenerated, cells[i][j]))
    			{
    				nextGenerationOfCells[i][j] = true;
    			}
    		}
    	}
    	return nextGenerationOfCells;
    }
    
    public boolean rulesOfLife(int numberOfNeighbors, boolean alive){
        if( alive && (numberOfNeighbors == 2 || numberOfNeighbors == 3))
            return true;
        else if (!alive && numberOfNeighbors == 3)
            return true;
        else
            return false;
    }
    
    private int NumberOfNeighbors(boolean[][] cells, int r, int c) {
    	int deadOrAlive = cells[r][c] ? -1 : 0;
        for(int i = r - 1; i <= r + 1; i++)
        {
            for(int j = c - 1; j <= c + 1; j++)
            {
                if( insideMatrix(cells, i, j) && cells[i][j] )
                {
                	deadOrAlive++;
                }
            }
        }

        return deadOrAlive;
    }

    private boolean insideMatrix(boolean[][] grid, int i, int j) 
    {
        return i >= 0 && i < grid.length && j >= 0 &&
        		j < grid[0].length;
    }
    
    public void printGeneration(int gen){
        boolean[][] printGen = dish;
        
        for (int i = 0; i < gen; i++){
            printGen = nextGeneration(printGen);
        }
        
        printBoard(printGen);
        
        System.out.print("\n\nTotal alive in row 10 = " + aliveInRowTen(printGen));
        System.out.print("\nTotal alive in col 10 = " + aliveInColTen(printGen));
        System.out.print("\nTotal alive in petriDish = " + getTotalAlive(printGen));
    }
    
    public int aliveInRowTen(boolean[][] gen){
        int alive = 0;
        
        for (int col = 0; col < rowDef; col++){
            if (gen[10][col] == true){
                alive++;
            }
        }
        
        return alive;
    }
    
    public int aliveInColTen(boolean[][] gen){
        int alive = 0;
        
        for (int row = 0; row < colDef; row++){
            if (gen[row][10] == true){
                alive++;
            }
        }
        
        return alive;
    }
    
    public int getTotalAlive(boolean[][] gen){
        int alive = -2;
        
        for (int row = 0; row < rowDef; row++){
            for (int col = 0; col < colDef; col++){
                if (gen[row][col] == true){
                    alive++;
                }
            }
        }
        
        return alive;
    }
}