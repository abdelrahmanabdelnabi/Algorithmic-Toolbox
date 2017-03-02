package week2;

import java.util.Scanner;

public class Fibonacci {
    private static long calc_fib(int n) {
        if (n <= 1)
            return n;

        return calc_fib(n - 1) + calc_fib(n - 2);
    }

    private static long calc_fib_fast(int n) {
        if (n <= 1)
            return n;

        long[] fibonacci = new long[n];
        fibonacci[0] = fibonacci[1] = 1;

        // build the Fibonacci table
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci[n - 1];
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        
        System.out.println(calc_fib_fast(n));
    }
}
