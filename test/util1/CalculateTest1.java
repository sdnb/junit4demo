package util1;

import static org.junit.Assert.*;

import org.junit.Test;

import util.Calculate;

public class CalculateTest1 {

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	@Test
	public void add(){
		assertEquals(9,new Calculate().add(4,5));
	}
	@Test
	public void testMultiply(){
		assertEquals(21,new Calculate().multiply(4,5));
	}
}
