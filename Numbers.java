public class Numbers {
    // Return true if n is prime, and false otherwise.
    public static boolean isPrime(int n) {
       // TBD
    }

    // Return the greatest common divisor of a and b, caclulated using 
    // Euclid’s algorithm: 
    // function gcd(a, b)
    //     while b != 0
    //         r := a mod b
    //         a := b
    //         b := r
    //     return a
    public static int gcd(int a, int b) {
        // TBD
    }

    // Return true if a and b are coprime, ie, their gcd is 1, and false 
    // otherwise.
    public static boolean coprime(int a, int b) {
        // TBD
    }

    // Return the sum of the proper divisors of n. Eg, if n is 6, return 
    // 1 + 2 + 3 = 6, since 1, 2, and 3 are the proper divisors of 6.
    public static int sumOfProperDivisors(int n) {
        // TBD
    }
    
    // Return true if n is perfect, ie, its proper divisors add up to n, 
    // and false otherwise.
    public static boolean isPerfect(int n) {
        // TBD
    }

    // Return true if a and b are amicable, ie, the proper divisors of a 
    // add up to b and the proper divisors of b add up to a.
    public static boolean amicable(int a, int b) {
        // TBD
    }

    // Test client (DO NOT EDIT).
    public static void main(String[] args) {
        StdOut.println(isPrime(28));
        StdOut.println(isPrime(29));
        StdOut.println(gcd(24, 128));
        StdOut.println(coprime(28, 29));
        StdOut.println(isPerfect(28));
        StdOut.println(isPerfect(29));
        StdOut.println(amicable(220, 284));
    }
}
