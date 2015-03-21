import java.util.*;

public class TotativeCounter {
    public static void main(String args[]) {
    	int n = Integer.parseInt(args[0]);
    	int count = 0;
    	for (int i = 1; i <= n; i++) {
    		if (Numbers.coprime(i, n)) count++;
    	}
    	System.out.println(count);
    }
}
