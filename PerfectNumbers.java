
public class PerfectNumbers {
    public static void main(String args[]) {
    	int n = Integer.parseInt(args[0]);
    	for (int i = 0; i <= n; i++) {
    		if (Numbers.isPerfect(i)) System.out.println(i);
    	}
    }
}
