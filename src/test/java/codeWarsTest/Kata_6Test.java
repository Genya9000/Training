package codeWarsTest;
import ml.khaliman.codeWars.*;
import org.junit.Test;

import static ml.khaliman.codeWars.Kata_6.comp;
import static org.junit.Assert.*;

public class Kata_6Test {
    @Test
    public void test_1() {
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
    @Test
    public void findShort() throws Exception {
        assertEquals(3, Kata.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, Kata.findShort("turns out random test cases are easier than writing out basic ones"));
    }
    @Test
    public void testBasic() {
        assertFalse("0  is not prime", Prime.isPrime(0));
        assertFalse("1  is not prime", Prime.isPrime(1));
        assertTrue ("2  is prime",     Prime.isPrime(2));
        assertTrue ("73 is prime",     Prime.isPrime(73));
        assertFalse("75 is not prime", Prime.isPrime(75));
        assertFalse("-1 is not prime", Prime.isPrime(-1));
    }

    @Test
    public void testPrime() {
        assertTrue("3 is prime", Prime.isPrime(3));
        assertTrue("5 is prime", Prime.isPrime(5));
        assertTrue("7 is prime", Prime.isPrime(7));
        assertTrue("41 is prime", Prime.isPrime(41));
        assertTrue("5099 is prime", Prime.isPrime(5099));
    }

    @Test
    public void testNotPrime() {
        assertFalse("4 is not prime", Prime.isPrime(4));
        assertFalse("6 is not prime", Prime.isPrime(6));
        assertFalse("8 is not prime", Prime.isPrime(8));
        assertFalse("9 is not prime", Prime.isPrime(9));
        assertFalse("45 is not prime", Prime.isPrime(45));
        assertFalse("-5 is not prime", Prime.isPrime(-5));
        assertFalse("-8 is not prime", Prime.isPrime(-8));
        assertFalse("-41 is not prime", Prime.isPrime(-41));
    }
    Sum s = new Sum();

    @Test
    public void Test1()
    {
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
    }
    @Test
    public void test() {
        assertEquals("emocleW", new SpinWords().spinWords("Welcome"));
        assertEquals("Hey wollef sroirraw", new SpinWords().spinWords("Hey fellow warriors"));
    }
    @Test
    public void test_01() {
        assertEquals(0, DescendingOrder.sortDesc(0));
    }

    @Test
    public void test_02() {
        assertEquals(51, DescendingOrder.sortDesc(15));
    }


    @Test
    public void test_03() {
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }

    @Test
    public void FixedTests() {
        assertEquals(true, isogram.isIsogram("Dermatoglyphics"));
        assertEquals(true, isogram.isIsogram("isogram"));
        assertEquals(false, isogram.isIsogram("moose"));
        assertEquals(false, isogram.isIsogram("isIsogram"));
        assertEquals(false, isogram.isIsogram("aba"));
        assertEquals(false, isogram.isIsogram("moOse"));
        assertEquals(true, isogram.isIsogram("thumbscrewjapingly"));
        assertEquals(true, isogram.isIsogram(""));
    }
    @Test
    public void test3() {
        assertEquals("1,94", NthSeries.seriesSum(15));
    }
    @Test
    public void Tests() {
        assertEquals("makeReadable(0)", "00:00:00", HumanReadableTime.makeReadable(0));
        assertEquals("makeReadable(5)", "00:00:05", HumanReadableTime.makeReadable(5));
        assertEquals("makeReadable(60)", "00:01:00", HumanReadableTime.makeReadable(60));
        assertEquals("makeReadable(86399)", "23:59:59", HumanReadableTime.makeReadable(86399));
        assertEquals("makeReadable(359999)", "99:59:59", HumanReadableTime.makeReadable(359999));
    }
    @Test
    public void testExample() {
        int[] exampleTest1 = {2,6,8,-10,3};
        int[] exampleTest2 = {206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781};
        int[] exampleTest3 = {Integer.MAX_VALUE, 0, 1};
        assertEquals(3, FindOutlier.find(exampleTest1));
        assertEquals(206847684, FindOutlier.find(exampleTest2));
        assertEquals(0, FindOutlier.find(exampleTest3));
    }
    @Test
    public void test1() {
        assertEquals(3, BouncingBall.bouncingBall(3.0, 0.66, 1.5));
    }
    @Test
    public void test2() {
        assertEquals(15, BouncingBall.bouncingBall(30.0, 0.66, 1.5));
    }
    @Test
    public void testSomething() {
        assertEquals("10 + 2", Kata.expandedForm(12));
        assertEquals("40 + 2", Kata.expandedForm(42));
        assertEquals("70000 + 300 + 4", Kata.expandedForm(70304));
    }
}

