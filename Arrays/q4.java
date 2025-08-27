// Exercise 4: Returning Arrays
// Inspired by Bruce’s method-returning examples.
// Task
// Write a method generatePrimes(int n) that returns an array of the first n prime numbers.


// Print the array in main().


// 💡 Modern Twist: Solve the same with IntStream (Java 8+).




import java.util.Arrays;

class q4 {
    public static void main(String[] args) {
        int n = 4; 
        int[] primes = generatePrimes(n);
        System.out.println(Arrays.toString(primes));
    }

    public static int[] generatePrimes(int n) {
        int[] primes = new int[n];
        int count = 0;   
        int num = 2;     

        while (count < n) {
            if (isPrime(num)) {
                primes[count] = num; 
                count++;
            }
            num++;
        }
        return primes;
    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
