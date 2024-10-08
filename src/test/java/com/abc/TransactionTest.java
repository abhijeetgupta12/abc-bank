package com.abc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Before;

public class TransactionTest {
	
	private Transaction transaction;
	private Date date;
	
	@Before
	public void setUp() {
		
		transaction = new Transaction(50.0);
		 date = DateProvider.getInstance().now();
		
	}
	
    @Test
    public void transactionInstanceTest() {
        
        assertTrue(transaction instanceof Transaction);
    }
    
    @Test
	public void transactionAmountTest() {
    	
    	assertEquals(50.0,transaction.amount,0);
    }
    
    @Test
    public void testCurrentDate() {
    	
    	assertEquals(date.getYear(),transaction.transactionDate.getYear());
    	assertEquals(date.getMonth(),transaction.transactionDate.getMonth());
    	assertEquals(date.getDay(),transaction.transactionDate.getDay());
    	
    }
}
