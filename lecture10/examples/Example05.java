package examples;

import java.util.Arrays;
import java.util.Collections;

public class Example05 {
    public static void main(String[] args) {
        // Note that we have Integer here instead of
        // int[] as Collections.reverseOrder doesn't
        // work for primitive types.
        Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

        // Sorts arr[] in descending order using
        // reverseOrder() method of Collections class
        // in Array.sort() as an argument to it
        Arrays.sort(arr, Collections.reverseOrder());

        // Printing the array as generated above
        System.out.println("Modified arr[] : "
                           + Arrays.toString(arr));
        
    }
}


/*
 * 
 * // Java program to Sort a Subarray in Descending order
// Using Arrays.sort()

// Importing Collections class and arrays classes
// from java.util package
import java.util.Arrays;
import java.util.Collections;

// Main class
public class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Note that we have Integer here instead of
        // int[] as Collections.reverseOrder doesn't
        // work for primitive types.
        Integer[] arr = { 13, 7, 6, 45, 21, 9, 2, 100 };

        // Sorts arr[] in descending order using
        // reverseOrder() method of Collections class
        // in Array.sort() as an argument to it
        Arrays.sort(arr, Collections.reverseOrder());

        // Printing the array as generated above
        System.out.println("Modified arr[] : "
                           + Arrays.toString(arr));
    }
}

 */