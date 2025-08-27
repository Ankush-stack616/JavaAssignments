// Exercise 3: Jagged Arrays
// Bruce shows arrays of arrays where rows can have different lengths.
// Task
// Create a jagged array with 3 rows.


// Row 1 → 2 elements


// Row 2 → 4 elements


// Row 3 → 3 elements


// Fill it with sequential numbers.


// Print it row by row.


// 💡 Challenge: Print in matrix form neatly formatted.



public class q3 {
    public static void main(String[] args) {

        int [][] jagged = new int[5][];
        int value =1;
        jagged[0] = new int[3];
        jagged[1] = new int[3];
        jagged[2] = new int[3];
        jagged[3] = new int[3];
        jagged[4] = new int[3];
        for(int i=0;i<jagged.length;i++){
            for(int j = 0;j<jagged[i].length;j++){
               jagged[i][j] = value++;
               System.out.print(jagged[i][j]+" ");
            }
             System.out.println();
        }
       
       
            
    }
}
