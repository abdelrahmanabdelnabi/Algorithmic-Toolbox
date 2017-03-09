package week2;

import java.util.*;

public class LCM {
    private static long lcm_naive(int a, int b) {
        for (long l = 1; l <= (long) a * b; ++l)
            if (l % a == 0 && l % b == 0)
                return l;

        return (long) a * b;
    }

    /**
     * The LCM of two positive integers a and b is related to the GCD(a, b) by:
     * 
     * LCM(a, b) * GCD(a, b) = a * b
     * 
     * using this property we can find the LCM(a,b) = (a * b) / GCD(a , b) 
     * 
     */
    public static long lcm_fast(int a, int b) {
        int gcd = GCD.gcdRecursiveFast(a, b);
        
        // first divide one of a or b by GCD(a , b) to avoid overflow
        return ((long)(a/gcd)) * b;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        System.out.println(lcm_fast(a, b));
    }
}
