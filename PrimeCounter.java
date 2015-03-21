import java.util.*;

public class PrimeCounter {
    public static void main(String args[]) {
    	int n; 
    	n = Integer.parseInt(args[0]);
    	int count = 0;
    	for (int i = 2; i <= n; i++) {
    		if (Numbers.isPrime(i)) count++;
    	}
    	System.out.println(count);
    }
}
