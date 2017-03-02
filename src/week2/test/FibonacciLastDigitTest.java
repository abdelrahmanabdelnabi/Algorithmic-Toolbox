package week2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import week2.FibonacciLastDigit;

public class FibonacciLastDigitTest {

    @Test
    public void testGetFibonacciLastDigitFast() {
        // stress test the solution for n up to 45
        for(int n = 0; n < 46; n++){
            assertEquals("wrong answer", FibonacciLastDigit.getFibonacciLastDigitNaive(n) % 10,
                    FibonacciLastDigit.getFibonacciLastDigitFast(n));
        }
        
    }

}
