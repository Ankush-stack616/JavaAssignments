// Exercise 6: Sorting & Searching
// Using java.util.Arrays.
// Task
// Create an array {7, 2, 9, 4, 1}.


// Sort it using Arrays.sort().


// Search for 4 using Arrays.binarySearch().


// Print the sorted array and index of 4.


// 💡 Challenge: Try Arrays.parallelSort() and compare runtime on a large dataset.


import java.util.*;

public class q6 {
    public static void main(String[] args) {
        int [] arr = {7, 2, 9, 4, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,4));
        

    }
    
}
