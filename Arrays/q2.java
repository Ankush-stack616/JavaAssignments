// Exercise 2: Static vs Dynamic Initialization
// Demonstrating array initialization styles.
// Task
// Create an integer array of size 5 using dynamic allocation and fill it with squares of indices.


// Create another integer array using static initialization: {10, 20, 30, 40, 50}.


// Print both arrays using Arrays.toString().


// 💡 Checkpoint: What’s the difference in memory allocation between the two approaches?



public class q2 {
    public static void main(String[] args) {
          int[] squares = new int[5];
        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i;
        }

        // Static initialization
        // int[] numbers = {10, 20, 30, 40, 50};

    }
}
