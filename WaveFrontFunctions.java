import java.io.File;
import java.util.Scanner;

public class WaveFrontFunctions {
    // walls and blocked spots are 999
    // open = 0
    // start = 888
    // finish = 1
    public static int[][] getData(String filename, int height, int width){
        int[][] data = new int[height][width];
        try {
            Scanner input = new Scanner(new File(filename));
            int rowNumber = 0;
            while(input.hasNextLine()){
                String line = input.nextLine();
                
                // convert row into array
                int[] row = new int[width];
                int colNumber = 0;
                for(int i=0; i<width; i++){
                    String tempItem = line.substring(i, i+1);
                    int item = 0;
                    if(tempItem.equals("#")) item = 999;
                    else if(tempItem.equals("E")) item = 1;
                    else if(tempItem.equals("S")) item = 888;
                    else item = 0;
                    row[colNumber] = item;
                    colNumber++;
                }              
                // add that row to the data
                // System.out.println("debugging: " + row);
                data[rowNumber] = row;
                rowNumber++;
            }
            input.close();
        }
        catch(Exception e){
            System.out.println("Error reading or parsing " + filename);
        }
        return data;
    } // close method


    public static void showMaze(int[][] maze){
        System.out.println();
        for(int[] row: maze){
            for(int item: row){
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }


    public static boolean performWave(int[][] maze, int curWave){
        // traverse, if item==curWave, check NESW
        // we will change values in maze, must use indexed loops
        for(int row=0; row<maze.length; row++){
            for(int col=0; col<maze[0].length; col++){
                if(maze[row][col]==curWave){
                    boolean done = checkNESW(maze, row, col, curWave);
                    if(done) return true;
                }
            }
        }
        return false;
    } // close method


    private static boolean checkNESW(int[][] maze, int row, int col, int curWave){
        // at each, check: is it in range? done? open?
        // check N
        if(row>0){
            if(maze[row-1][col]==888) return true;
            else if(maze[row-1][col]==0) maze[row-1][col] = curWave + 1;
        }
        // check S
        if(row<maze.length-1){
            if(maze[row+1][col]==888) return true;
            else if(maze[row+1][col]==0) maze[row+1][col] = curWave + 1;
        }
        // check E
        if(col<maze[0].length){
            if(maze[row][col+1]==888) return true;
            else if(maze[row][col+1]==0) maze[row][col+1] = curWave + 1;
        }
        // check W
        if(col>0){
            if(maze[row][col-1]==888) return true;
            else if(maze[row][col-1]==0) maze[row][col-1] = curWave + 1;
        }
        return false;
    }


}
