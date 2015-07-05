package util1;

import static org.junit.Assert.*;

import org.junit.Test;

import util.Calculate;

public class CalculateTest {

	@Test
	public void testAdd() {
		assertEquals(7,new Calculate().add(3,4));
	}

	@Test
	public void testMultiply() {
		fail("Not yet implemented");
	}

	@Test
	public void testSubstract() {
		fail("Not yet implemented");
	}

	@Test
	public void testDivide() {
		fail("Not yet implemented");
	}

}
