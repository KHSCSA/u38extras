
public class Ex2Traversing{
    public static void main(String[] args){
        // defining a 4x2 array using an initilizer list
        String[][] board = {    {"close", "quarter"},
                                {"moon", "rock"},
                                {"band", "stand"},
                                {"out", "shine"} }; 

                                
        // enhanced loop for row arrays
        System.out.println("\nprints memory reference");
        for(String[] row: board){
            System.out.println(row);
        }
  
        // enhanced for row arrays
        System.out.println("\nprints arrays");
        for(String[] row: board){
            System.out.println(java.util.Arrays.toString(row));
        }


        // two enhnaced loops
        // cannot modify this way
        System.out.println("\nprints items");
        for(String[] row: board){
            for(String s: row){
                System.out.print(s + "\t");
            }
            System.out.println(); // Q: what is this for?
        }


        // indexed loops
        // use this when you need to modify values
        System.out.println("\nindexed, modify values");
        for(int row=0; row<board.length; row++){
            for(int col=0; col<board[0].length; col++){
                System.out.print(board[row][col] + "\t");
            }
            System.out.println();
        }

    } // close main
}
