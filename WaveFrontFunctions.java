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
            
            }
            input.close();
        }
        catch(Exception e){
            System.out.println("Error reading or parsing " + filename);
        }
        return data;
    } // close getData()



    public static void showMaze(int[][] maze){
        System.out.println();

    } // close showMaze()



    public static boolean performWave(int[][] maze, int curWave){
        // traverse, if item==curWave, check NESW
        // we will change values in maze, must use indexed loops


        return false;
    } // close performWave()




    private static boolean checkNESW(int[][] maze, int row, int col, int curWave){
        // at each, check: is it in range? done? open?
        // check N

        // check S

        // check E

        // check W

        
        return false;
    } // close checkNESW()


}
