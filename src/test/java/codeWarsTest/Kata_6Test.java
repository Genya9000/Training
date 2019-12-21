package codeWarsTest;
import ml.khaliman.codeWars.Kata_6;
import ml.khaliman.codeWars.TriangleTester;
import org.junit.Test;

import static ml.khaliman.codeWars.Kata_6.comp;
import static org.junit.Assert.assertEquals;

public class Kata_6Test {
    @Test
    public void test1() {
        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};

        System.out.println(a[0]);
        assertEquals(true, comp(a, b));

    }

        @Test
        public void publicTests() {
            assertEquals(true, TriangleTester.isTriangle(1,2,2));
            assertEquals(false, TriangleTester.isTriangle(7,2,2));
        }
    @Test
    public void evenTests() {
        assertEquals("es", Kata_6.getMiddle("test"));
        assertEquals("dd", Kata_6.getMiddle("middle"));
    }
    }

