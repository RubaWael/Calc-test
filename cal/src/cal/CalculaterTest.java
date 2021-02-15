package cal;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author EmadAD
 *
 */
public class CalculaterTest {

	private Calculator myCal;

	@Before
	public void initCalc() {
		myCal = new Calculator();
	}

	@Test
	public void testAddition() {
		int a = 5;
		int b = 6;
		int actual = myCal.add(a, b);
		int expected = 11;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSub() {
		int a = 6;
		int b = 5;
		assertEquals(1, myCal.Sub(a, b));
	}
	
	@Test
	public void testMul() {
		int a = 6;
		int b = 5;
		assertEquals(30, myCal.Mul(a, b));
	}
	
	@Test
	public void testDivision() {
		int a = 10;
		int b = 2;
		double actual = myCal.divide(a, b);
		double expected = 5;
		assertEquals(expected, actual, 0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testDivideByZero() {
		myCal.divide(10, 0);
	}

}
