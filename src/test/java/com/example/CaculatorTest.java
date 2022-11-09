package com.example;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CaculatorTest {

	Caculator c  = new Caculator();
	
	@Test
	public void testNumberGreater() {
		assertEquals(false,c.isGreater(3, 4));	
	}

    @Test
   
    public void testNumberLesser() {
		assertEquals(false,c.isLess(10, 9));	
    }
 
}
