
public class AmicablePairs {
    public static void main(String args[]) {
    	int n = Integer.parseInt(args[0]);
    	for (int i = 1; i <= n; i++) {
    		for (int j = i; j <= n; j++) {
    			if (i != j && Numbers.amicable(i, j)) System.out.println("(" + i + ", " + j + ")");
    		}
    	}
    }
}
