package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CaculatorStubTest
 {    
	Service  s = new Service() {
        public boolean greater(int x, int y)
        {
            if(x>y)
                return true;
            else
                return false;
        }
        public boolean less(int x, int y)
        {
            if(x<y)
                return true;
            else
                return false;
        }
    };
    Caculator c  = new Caculator(s);
	
	
	@Test
	public void testNumberGreater() {
		assertEquals(false,c.isGreaterFromService(3, 4));	
	}

    @Test
    public void testNumberLesser() {
		assertEquals(true,c.isLessFromService(3, 4));	
    }
}

