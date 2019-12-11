package com.in28minutes.unittesting.unittesting;

import static org.junit.Assert.*;

import org.junit.Test;

import com.in28minutes.unittesting.unittesting.business.SomeBusinessImpl;

public class SomeBusinessTest {

	@Test
	public void calculateTest_basic() {
		SomeBusinessImpl impl = new SomeBusinessImpl();
		int actualResult = impl.calculateSum(new int[]{1,2,3});
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
			
	}
	
	@Test
	public void calculateTest_empty() {
		SomeBusinessImpl impl = new SomeBusinessImpl();
		int actualResult = impl.calculateSum(new int[]{});
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
			
	}

}
