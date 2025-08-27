// Exercise 8: Array of Strings
// Bruce often mixes primitives with objects.
// Task
// Create an array of String with 5 names.


// Write a method findName(String[] arr, String name) that returns true if the name exists.


// Test it with different names.


// 💡 Modern Twist: Use Arrays.stream(arr).anyMatch(name::equals)

import java.util.Arrays;

public class q8 {
public static void main(String[] args) {
      
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        
        System.out.println("Traditional Method:");
        System.out.println("Find 'Alice': " + findName(names, "Alice"));  
        System.out.println("Find 'Zara': " + findName(names, "Zara"));   

        // Test with Streams
        System.out.println("\nModern Stream-based Method:");
        System.out.println("Find 'David': " + findNameStream(names, "David")); 
        System.out.println("Find 'John': " + findNameStream(names, "John"));   
    }

    
  public static boolean findName(String[] arr, String name) {
        for (String s : arr) {
            if (s.equals(name)) {
                return true;
            }
        }
        return false;
    }

    // Modern Stream-based method

    public static boolean findNameStream(String[] arr, String name) {
        return Arrays.stream(arr).anyMatch(name::equals);
    }
    
}
