package week2;

import java.util.*;

public class GCD {
    public static int gcd_naive(int a, int b) {
        int current_gcd = 1;
        for (int d = 2; d <= a && d <= b; ++d) {
            if (a % d == 0 && b % d == 0) {
                if (d > current_gcd) {
                    current_gcd = d;
                }
            }
        }

        return current_gcd;
    }

    public static int gcdRecursiveFast(int a, int b) {
        if(b == 0)
            return a;
        
        return gcdRecursiveFast(b, a%b);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(gcdRecursiveFast(a, b));
    }
}
