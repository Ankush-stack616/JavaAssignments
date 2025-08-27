// Exercise 9: Reverse an Array
// A classic array manipulation task.
// Task
// Create an array {1, 2, 3, 4, 5}.


// Write a method to reverse it in-place.


// Print original and reversed arrays.


// 💡 Challenge: Solve with recursion.

import java.util.Arrays;

public class q9 {

public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

        System.out.println( Arrays.toString(arr1));

        revI(arr1);
        System.out.println( Arrays.toString(arr1));

        revR(arr2, 0, arr2.length - 1);
        System.out.println( Arrays.toString(arr2));
    
}


     public static void revI(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    // Recursion method to reverse array in-place

    public static void revR(int[] arr, int left, int right) {
        if (left >= right) {
            return; 
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        revR(arr, left + 1, right - 1);
    }

    
}