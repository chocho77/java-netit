package examples;

import java.util.Arrays;
import java.util.Collections;

public class Example06 {
    public static void main(String[] args) {
         // Custom input string
         String arr[] = { "practice.geeksforgeeks.org",
         "www.geeksforgeeks.org",
         "code.geeksforgeeks.org" };

        // Sorts arr[] in ascending order
        Arrays.sort(arr);
        System.out.println("Modified arr[] : "
           + Arrays.toString(arr));

        // Sorts arr[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        // Lastly printing the above array
        System.out.println("Modified arr[] :"
           + Arrays.toString(arr));
        
    }
}

/*  https://www.geeksforgeeks.org/arrays-sort-in-java-with-examples/
 * 
 * // Java program to sort an array of strings
// in ascending and descending alphabetical order
// Using Arrays.sort()

// Importing arrays and Collections class
// from java.util class
import java.util.Arrays;
import java.util.Collections;

// Main class
public class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Custom input string
        String arr[] = { "practice.geeksforgeeks.org",
                         "www.geeksforgeeks.org",
                         "code.geeksforgeeks.org" };

        // Sorts arr[] in ascending order
        Arrays.sort(arr);
        System.out.println("Modified arr[] : "
                           + Arrays.toString(arr));

        // Sorts arr[] in descending order
        Arrays.sort(arr, Collections.reverseOrder());

        // Lastly printing the above array
        System.out.println("Modified arr[] :"
                           + Arrays.toString(arr));
    }
}

 */
