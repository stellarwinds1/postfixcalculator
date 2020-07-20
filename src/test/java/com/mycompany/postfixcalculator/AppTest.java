package com.mycompany.postfixcalculator;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Test Addition
     */
    @Test
    public void testAddition()
    {
		double d1 = 23;
		double d2 = 10.2;
		String result = "";

		try {
			System.out.println("d1 = " + d1 + " d2 = " + d2);
			result = PostFixCalculator.calculate(d1, d2, '+');

			System.out.println("Addition result = " + result);
			assertEquals(result, "33.20");
		} catch (Exception e) {
			fail("caught an exception " + e.getMessage() + " incorrectly");
		}
    }

    @Test
    public void testInvalidOperator()
    {
		double d1 = 23;
		double d2 = 10.2;
		String result = "";

		try {
			System.out.println("d1 = " + d1 + " d2 = " + d2);
			result = PostFixCalculator.calculate(d1, d2, 'x');
			fail("Failed to catch the invalid operator exception");

		} catch (Exception e) {
			System.err.println("caught an exception " + e.getMessage() + " correctly");
		}
    }

    @Test
    public void testZeroDivision()
    {
		double d1 = 23;
		double d2 = 0;
		String result = "";

		try {
			System.out.println("d1 = " + d1 + " d2 = " + d2);
			result = PostFixCalculator.calculate(d1, d2, '/');
			fail("Failed to catch the zero division exception");

		} catch (Exception e) {
			System.err.println("caught an exception " + e.getMessage() + " correctly");
		}
    }
}
