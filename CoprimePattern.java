import java.util.*;

public class CoprimePattern {
    public static void main(String args[]) {
        int n = Integer.parseInt(args[0]);
        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
                if (r == 1 && c == 1 || Numbers.coprime(r, c)) System.out.print("* ");
                    else System.out.print("  ");
                }
                System.out.print(r + "\n");
        }
    }
}
