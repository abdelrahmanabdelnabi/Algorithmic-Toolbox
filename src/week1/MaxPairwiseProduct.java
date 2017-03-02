package week1;
import java.util.*;
import java.io.*;

public class MaxPairwiseProduct {
    public static int getMaxPairwiseProduct(int[] numbers) {
        int result = 0;
        int n = numbers.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (numbers[i] * numbers[j] > result) {
                    result = numbers[i] * numbers[j];
                }
            }
        }
        return result;
    }

    public static long getMaxPairwiseProductFast(int[] numbers) {
        // find the first maximum
        int max_index1 = -1;
        for (int i = 0; i < numbers.length; ++i)
            if ((max_index1 == -1) || (numbers[i] > numbers[max_index1]))
                max_index1 = i;

        // find the second maximum
        int max_index2 = -1;
        for (int j = 0; j < numbers.length; j++) {
            if ((j != max_index1) && ((max_index2 == -1) || (numbers[j] > numbers[max_index2])))
                max_index2 = j;
        }

        return ((long)numbers[max_index1]) * numbers[max_index2];

    }

    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println(getMaxPairwiseProductFast(numbers));
    }
}
