package week2.test;

import static org.junit.Assert.*;

import org.junit.Test;

import week2.LCM;

public class LCMTest {

    @Test
    public void testLargestPossibleValues() {
        int n1 = Integer.MAX_VALUE;
        int n2 = Integer.MAX_VALUE - 1;
        assertEquals("wrong answer for arguments " + n1 + " , " + n2 + " possibly overflow", n1* n2, LCM.lcm_fast(n1, n2));
    }

    @Test
    public void testEqualValues() {
        int n = 1000;
        assertEquals("wrong answer for arguements " + n + " , " + n, n, LCM.lcm_fast(n, n));
    }

}
