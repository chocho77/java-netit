package examples;

import java.util.Arrays;

public class Example04 {
    // Main driver method
    public static void main(String[] args) {
         // Custom input array
        // It contains 8 elements as follows
        int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

        // Sort subarray from index 1 to 4, i.e.,
        // only sort subarray {7, 6, 45, 21} and
        // keep other elements as it is.
        Arrays.sort(arr, 1, 5);

        // Printing the updated array which is
        // sorted after 2 index inclusive till 5th index
        System.out.println("Modified arr[] : "
                           + Arrays.toString(arr));
        
    }
    
}


/*
 * 
 * // Java program to Sort a Subarray in Array
// Using Arrays.sort() method

// Importing Arrays class from java.util package
import java.util.Arrays;

// Main class
public class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Custom input array
        // It contains 8 elements as follows
        int[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

        // Sort subarray from index 1 to 4, i.e.,
        // only sort subarray {7, 6, 45, 21} and
        // keep other elements as it is.
        Arrays.sort(arr, 1, 5);

        // Printing the updated array which is
        // sorted after 2 index inclusive till 5th index
        System.out.println("Modified arr[] : "
                           + Arrays.toString(arr));
    }
}

 */