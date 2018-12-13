package debug.factorial;

import static org.junit.Assert.*;

import org.junit.Test;

import debug.recursion.Factorial;

public class FactorialTest {
	
	@Test
	public void testFactorial0() {
		assertEquals(1, Factorial.factorial(0));
	}
	
	@Test
	public void testFactorial1() {
		assertEquals(1, Factorial.factorial(1));
	}
	
	@Test
	public void testFactorialPositive() {
		assertEquals(120, Factorial.factorial(5));
	}
	
	@Test
	public void testFactorialNegative() {
		assertEquals(-1, Factorial.factorial(-5));
	}
	
}
