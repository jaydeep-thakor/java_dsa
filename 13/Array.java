import java.util.Arrays;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        /*
         * An array in Java is a fixed-size collection of elements of the same type,
         * stored in contiguous memory (all elements are stored right next to each
         * other, one after another) and accessed by a zero-based index in O(1) time.
         */

        // Declare Arrays
        // 1 - Declaration only (then allocate later)
        int[] arr;
        arr = new int[5];

        // 2 - Declaration with size
        int[] arr1 = new int[5]; // {0, 0, 0, 0, 0}
        String[] arr2 = new String[3]; // {null, null, null}

        // 3 - Declaration with initial values
        int[] arr3 = { 1, 2, 3, 4, 5 };
        int[] arr4 = new int[] { 1, 2, 3, 4, 5 };

        // 4 - Assigning values after declaration
        int[] arr5;
        arr5 = new int[] { 10, 20, 30 }; // must use "new int[]" here
        // arr5 = {10, 20, 30}; // ❌ compile error


        int[] marks = {76,96,78,88,92};
        // access elements
        System.out.println("value at index 0 is "+marks[0]);
        System.out.println("value at index 1 is "+marks[1]);

        // access elements using for each loop
        for(int val: marks){
            System.out.println(val);
        }

        // take inputs in array using loop
        Scanner sc = new Scanner(System.in);
        int[] customArr = new int[5];
        for(int i = 0; i<customArr.length; i++){
            System.out.print("provide input for index " + i + " = ");
            customArr[i] = sc.nextInt();
        }
        // print
        System.out.println(Arrays.toString(customArr));
        // print using foreach
        for(int val:customArr){
            System.out.println(val);
        }


        // 2d array
        // Declare Arrays
        // 1 - Declaration only (then allocate later)
        int[][] arr6;
        arr6 = new int[7][8];

        // 2 - Declaration with size
        int[][] arr7 = new int[3][4];
        // {
        //  {0, 0, 0, 0},
        //  {0, 0, 0, 0},
        //  {0, 0, 0, 0}
        // }
        String[][] arr8 = new String[3][3];
        // {
        //  {null, null, null},
        //  {null, null, null},
        //  {null, null, null},
        // }
        // 3 - Declaration with initial values
        int[][] arr9 = {
            {1,2},
            {3,4},
            {5,6}
        };
        int[][] arr10 = new int[][] {
            {1,2},
            {3,4},
            {5,6}
        };

        // 4 - Assigning values after declaration
        int[][] arr11;
        arr11 = new int[][] { {10, 20}, {10, 20} }; // must use "new int[][]" here
        // arr11 = {{10, 20}, {10, 20}}; // ❌ compile error

        int[][] twoDArr = {
            {1,2},
            {2,3},
            {3,4},
            {4,5}
        };
        // access the element of 2d array
        System.out.println(twoDArr[1][1]);

        // print 2d array using for loop
        for(int row = 0; row<twoDArr.length; row++){
            for(int col = 0; col<twoDArr[row].length; col++){
                System.out.print(twoDArr[row][col] + " ");
            }
        }
        System.out.println();

        int[][] customArr1 = new int[3][4];

        for(int row = 0; row<customArr1.length; row++){
            for(int col = 0; col<customArr1[row].length; col++){
                System.out.println("provide the input for " + row + " and " + col);
                customArr1[row][col] = sc.nextInt();
            }
        }
        for(int row = 0; row<customArr1.length; row++){
            for(int col = 0; col<customArr1[row].length; col++){
                System.out.print(customArr1[row][col] + " ");
            }
        }

    }

}
