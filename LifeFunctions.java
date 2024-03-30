import java.io.File;
import java.util.Scanner;

public class LifeFunctions {
    
    public static boolean[][] getData(String filename, int height, int width){
        boolean[][] data = new boolean[height][width];
        try {
            Scanner input = new Scanner(new File(filename));
            while(input.hasNextLine()){
                int row = input.nextInt();
                int col = input.nextInt();
                data[row][col] = true;
                // System.out.println("debugging: " + row + " " + col);     
            }
            input.close();
        }
        catch(Exception e){
            System.out.println("Error reading or parsing " + filename);
        }
        return data;
    } // close getData()


    public static void showGrid(boolean[][] grid){
        System.out.println();
        for(boolean[] row: grid){
            for(boolean item: row){
                if(item) System.out.print("1 ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    } // close showGrid()


    public static boolean[][] oneCycle(boolean[][] now){
        int height = now.length;
        int width = now[0].length;
        boolean[][] next = new boolean[height][width];
        // iterate through 'now', count neighbors, setup 'next'
        for(int row=0; row<now.length; row++){
            for(int col=0; col<now[0].length; col++){
                int count = countNeighbors(now, row, col);
                if(now[row][col] && (count==2 || count==3)) next[row][col] = true;
                else if(!now[row][col] && count==3) next[row][col] = true;
            }
        }
        // note: now = next does not work, you must return an array
        return next;
    } // close oneCycle


    private static int countNeighbors(boolean[][] grid, int row, int col){
        int count = 0;
        //check N
        if(row>0 && grid[row-1][col]) count++;
        // check NE
        if(row>0 && col<grid[0].length-1 && grid[row-1][col+1]) count++;
        // check E
        if(col<grid[0].length-1 && grid[row][col+1]) count++;
        // check SE
        if(col<grid[0].length-1 && row<grid.length-1 && grid[row+1][col+1]) count++;
        // check S
        if(row<grid.length-1 && grid[row+1][col]) count++;
        // check SW
        if(row<grid.length-1 && col>0 && grid[row+1][col-1]) count++;
        // check W
        if(col>0 && grid[row][col-1]) count++;
        // check NW
        if(row>0 && col>0 && grid[row-1][col-1]) count++;
        return count;
    } // close countNeighbors

    public static int countAlive(boolean[][] grid){
        int count = 0;
        for(boolean[] row: grid){
            for(boolean item: row){
                if(item) count++;
            }
        }
        return count;
    } // close countAlive


}
