package week1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import week1.MaxPairwiseProduct;

public class stressTest {

    @Test
    public void bothMaxPairwiseProductAlgorithmsShouldReturnSameResult() {
        int count = 0;
        while (count < 1000000) {

            // generate random input
            int n = ((int) Math.random()) % 1000 + 2;

            int[] numbers = new int[n];

            for (int i = 0; i < n; i++) {
                numbers[i] = ((int) Math.random()) % 100000 + 1;
            }

            MaxPairwiseProduct testClass = new MaxPairwiseProduct();
            MaxPairwiseProduct.getMaxPairwiseProductFast(numbers);

            assertEquals("both max pairwise product algorithms should return the same result",
                    MaxPairwiseProduct.getMaxPairwiseProduct(numbers),
                    MaxPairwiseProduct.getMaxPairwiseProductFast(numbers));
            count++;

        }
    }

}
