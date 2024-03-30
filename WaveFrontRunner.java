public class WaveFrontRunner {
    public static void main(String[] args) {
        // inTest is 21x21
        int[][] maze = WaveFrontFunctions.getData("WaveFrontInTest.txt", 21, 21);
        WaveFrontFunctions.showMaze(maze);

        // while not done, do the wave, increment wave
        int curWave = 0;
        boolean done = false;
        while(!done){
            curWave++;
            done = WaveFrontFunctions.performWave(maze, curWave);
        }
        WaveFrontFunctions.showMaze(maze);
        System.out.println(curWave+1);
    
    } // close main
    
}
