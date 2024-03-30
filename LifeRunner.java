public class LifeRunner {
    public static void main(String[] args) {
        
        boolean[][] grid = LifeFunctions.getData("Life100.txt", 24, 24);

        System.out.println("alive " + LifeFunctions.countAlive(grid));
        LifeFunctions.showGrid(grid);
        for(int i=1; i<=5; i++){
            grid = LifeFunctions.oneCycle(grid);
            // System.out.println(i);
            // LifeFunctions.showGrid(grid);
        }
        LifeFunctions.showGrid(grid);
        System.out.println("alive " + LifeFunctions.countAlive(grid));


    } // close main
}
