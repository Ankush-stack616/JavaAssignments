// Exercise 7: Multidimensional Array
// Bruce explains how Java supports 2D arrays.
// Task
// Create a 3x3 2D array.


// Fill it with multiplication table values (e.g., arr[i][j] = (i+1)*(j+1)).


// Print the 2D array in matrix form.


// 💡 Challenge: Extend it to n x n matrix (user input).

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
         int[][] arr = new int[3][3]; 

        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }

        
        System.out.println("3x3 Multiplication Table:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " "); 
            }
            System.out.println(); 
        }

// optimized for user input of the matrix size

         Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the size of matrix (n): ");
        int n = sc.nextInt();

        int[][] array = new int[n][n]; 

       
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = (i + 1) * (j + 1);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}
