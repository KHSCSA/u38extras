public class Ex3Algorithms {
    public static void main(String[] args) {
        // create an array
        int[][] nums = new int[3][4];

        // randomize
        nums = randomize(nums);
        display(nums);

        // find sum
        System.out.println("\nThe sum is: " + findSum(nums));


        // find max
        System.out.println("\nThe max is: " + findMax(nums));

        // find index of max
        System.out.print("\nThe index of the max is: ");
        findIndexOfMax(nums);


    } // close main ------------------------



    public static void display(int[][] arr){
        // we are not changing any values
        // so enhanced for loops will work
        for(int[] row: arr){
            for(int item: row){
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    } // close display()

    

    public static int[][] randomize(int[][] arr){
        // we *are* changing values
        // we *must* use indexed loops
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = (int)(Math.random()*21) + 80;
            }
        }
        return arr;
    } // close randomize()


    public static int findSum(int[][] arr){
        // enhanced loops
        int sum = 0;
        for(int[] row: arr){
            for(int item: row){
                sum += item;
            }
        }
        return sum;
    } // close findSum()

    public static int findMax(int[][] arr){
        // we only need the max
        // enhanced loops will work
        int max = arr[0][0];
        for(int[] row: arr){
            for(int item: row){
                if(item > max) max = item;
            }
        }
        return max;
    } // close max()


    public static void findIndexOfMax(int[][] arr){
        // we need the index
        // must use indexed loops
        int row = 0;
        int col = 0;
        int max = arr[0][0];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] > max){
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println("row: " + row + ", col: " + col);
    } // close findIndexOfMax()



}
