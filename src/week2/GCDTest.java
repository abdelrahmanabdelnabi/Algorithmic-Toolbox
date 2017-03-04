package week2;

import static org.junit.Assert.*;

import org.junit.Test;

public class GCDTest {

    @Test
    public void testGcdRecursiveFast() {
        // test the recursive algorithm for any two integers
        int n1 = ((int) Math.random()) % 2000000 + 1;
        int n2 = ((int) Math.random()) % 2000000 + 1;

        assertEquals("wrong answer", GCD.gcdRecursiveFast(n1, n2), GCD.gcd_naive(n1, n2));
    }

    @Test
    public void testSameOperands() {
        int n = 50;

        assertEquals("wrong answer when both operands are equal", GCD.gcdRecursiveFast(n, n), n);
    }

    @Test
    public void testSwitchedOperands() {
        int n1 = ((int) Math.random()) % 2000000 + 1;
        int n2 = ((int) Math.random()) % 2000000 + 1;

        assertEquals("different answer when operands are switched", GCD.gcdRecursiveFast(n1, n2),
                GCD.gcdRecursiveFast(n2, n1));
    }

}
