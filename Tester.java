public class Tester {
    public static void main(String[] args) {
        int[][] twoD = {{1,2,3}, {6,5,4}};
        mystery(twoD);
        for(int[] row: twoD){
            for(int item: row){
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }


    public static void mystery(int[][] arr){
        int[][] temp = {{0,0,0}, {0,0,0}};
        arr = temp;
    }
    
}
