package com.example;

import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;

import static org.junit.Assert.assertEquals;

public class CaculatorMockTest {
        
	Service  s = Mockito.mock(Service.class);
    Caculator c  = new Caculator(s);
	
	
	@Test
	public void testNumberGreater() {
		when(s.greater(3,4)).thenReturn(false);
		assertEquals(false,c.isGreaterFromService(3, 4));	
		verify(s).greater(3,4);
	}

    @Test
   
    public void testNumberLesser() {
        when(s.greater(10,9)).thenReturn(false);
		assertEquals(false,c.isLessFromService(10, 9));	
		verify(s).less(10,9);
    }
}