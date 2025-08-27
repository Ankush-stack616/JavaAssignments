// Exercise 5: Copying Arrays
// Illustrates that = copies references, not contents.
// Task
// Create an array {1, 2, 3}.

// Assign it to another variable and modify the second array.

// Print both arrays.

// Use Arrays.copyOf() to make a real copy and show the difference.

import java.util.*;

public class q5 {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3 };
        int[] nrr = arr;
        nrr[0] = 3;

        System.out.print(Arrays.toString(arr));

        System.out.println();

        System.out.print(Arrays.toString(arr));
        System.out.println();

        // now we will use copyOf() method

        System.out.println("Using copyOf method");

        int[] Copy = Arrays.copyOf(arr, arr.length);
        Copy[1] = 8;
        System.out.println(Arrays.toString(Copy));

    }
}