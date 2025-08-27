// Exercise 10: Matrix Diagonal Sum
// A slightly advanced exercise.
// Task
// Create a 3x3 matrix.


// Fill it with numbers 1–9.


// Find the sum of the primary diagonal.


// Find the sum of the secondary diagonal.


// 💡 Checkpoint: What happens if matrix is not square?



public class q10 {
    public static void main(String[] args) {
        
    
    int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int n = matrix.length; 

        int primarySum = 0;
        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i];
        }

        
        int secondarySum = 0;
        for (int i = 0; i < n; i++) {
            secondarySum += matrix[i][n - 1 - i];
        }

      
        System.out.println("Matrix:");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

     
        System.out.println("\nPrimary Diagonal Sum: " + primarySum);
        System.out.println("Secondary Diagonal Sum: " + secondarySum);
}
}