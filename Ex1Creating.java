public class Ex1Creating {
    public static void main(String[] args) {
        // using an initializer list
        int[][] nums = {{10, 11, 12}, {20, 22, 24}};
        System.out.println("printing one item: " + nums[1][2]);                 // Q: what will print?
        System.out.println("printing nums[0]: " + nums[0]);                     // Q: what will print? what type of data is this?       

        System.out.println("printing nums.length: " + nums.length);             // Q: is this the number of rows or columns?
        System.out.println("printing nums[0].length: " + nums[0].length);       // Q: is this the number of rows or columns?

        // using default zero/null values
        int[][] scores = new int[3][4];
        System.out.println("printing from a new list: " + scores[1][2]);

    } // close main()
}


