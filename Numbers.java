
public class Numbers {
    public static boolean isPrime(int  n) {
        if (n == 2) return true;
        if (n <= 0 || n % 2 == 0) return false;
        else {
            for (int i = 3; i < n / 2; i++) {
                if (n % i == 0) return false;
            }
            return true;
        }
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) return a;
            return gcd(b, a % b);
    }
    
    public static boolean coprime(int a, int b) {
        //if (a == b) return false;
        //int f = gcd(a, b);
        if (gcd(a, b) == 1) 
            return true;
        else 
            return false;
    }
    
    public static int sumOfProperDivisors(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) sum += i;
        }
        return sum;
    }
    
    public static boolean isPerfect(int n) {
        if (n <= 0) return false;
        if (sumOfProperDivisors(n) == n) return true;
        else return false;
    }
    
    public static boolean amicable(int a, int b) {
        if (sumOfProperDivisors(a) == b 
                      && sumOfProperDivisors(b) == a) return true;
        else return false;
    }
}
