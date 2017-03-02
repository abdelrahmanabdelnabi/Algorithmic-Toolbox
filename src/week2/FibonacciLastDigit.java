package week2;

import java.util.*;

public class FibonacciLastDigit {
    public static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % 10;
    }

    public static int getFibonacciLastDigitFast(int n) {
        if(n <= 1)
            return n;
        
        int[] lastDigit = new int[n];
        lastDigit[0] = lastDigit[1] = 1;
        
        for(int i = 2; i < n; i++){
            lastDigit[i] = (lastDigit[i-1] + lastDigit[i-2]) % 10;
        }
        
        return lastDigit[n-1];

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitFast(n);
        System.out.println(c);
    }
}
