package com.training.myapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestTraining {
	
	
	@Test
	public void testPublicTraining() {
		Training p = new PublicTraining(1,"java",5000,50);
		assertEquals(250000,p.getOrderValue());
	}
	
	@Test
	public void testCorporateTraining() {
	Training c = new CorporateTraining(2,"BigData",35000,4);
		assertEquals(140000,c.getOrderValue());
	}

}
;