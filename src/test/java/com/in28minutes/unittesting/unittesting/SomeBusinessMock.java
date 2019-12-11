package com.in28minutes.unittesting.unittesting;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import com.in28minutes.unittesting.unittesting.business.SomeBusinessImpl;
import com.in28minutes.unittesting.unittesting.business.data.SomeDataService;

/**
 * Clase para probar unit test utilizando mock
 * con la etiqueta @mock no necesito usar la anotación before
 * 
 * */

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMock {
	@InjectMocks
	SomeBusinessImpl impl = new SomeBusinessImpl();
	
	@Mock
	SomeDataService dataMock;
	//SomeDataService dataMock= mock(SomeDataService.class);
	
	
	
	@Before
	public void before(){
		impl.setSomeDataService(dataMock);
	}
	
		
		@Test
		public void calculateTestUsingMock_basic() {
			when(dataMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
			assertEquals(impl.calculateSumUsingDataService(), 6);		
		}
		
		
		@Test
		public void calculateTestUsingMock_empty() {
			when(dataMock.retrieveAllData()).thenReturn(new int[] {});
			assertEquals(impl.calculateSumUsingDataService(), 0);
				
		}
		
		
		@Test
		public void calculateTestUsingMock_oneValue(){
			when(dataMock.retrieveAllData()).thenReturn(new int[] {5});
			assertEquals(5, impl.calculateSumUsingDataService());
		}

}
