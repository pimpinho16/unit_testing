package com.in28minutes.unittesting.unittesting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.in28minutes.unittesting.unittesting.business.SomeBusinessImpl;
import com.in28minutes.unittesting.unittesting.business.data.SomeDataService;

class SomeDataServiceStub implements SomeDataService {

	@Override
	public int[] retrieveAllData() {
		
		return new int[] {1,2,3};
	}
	
}

class SomeDataServiceEmptyStub implements SomeDataService {

	@Override
	public int[] retrieveAllData() {
		
		return new int[] {};
	}
	
}



public class SomeBusinessStubTest {
	@Test
	public void calculateTestUsingDataService_basic() {
		SomeBusinessImpl impl = new SomeBusinessImpl();
		impl.setSomeDataService(new  SomeDataServiceStub());
		int actualResult = impl.calculateSumUsingDataService();
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
			
	}
	
	@Test
	public void calculateTestUsingDataService_empty() {
		SomeBusinessImpl impl = new SomeBusinessImpl();
		impl.setSomeDataService(new  SomeDataServiceEmptyStub());
		int actualResult = impl.calculateSumUsingDataService();
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
			
	}
}
