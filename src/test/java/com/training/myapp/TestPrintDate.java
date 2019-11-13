package com.training.myapp;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;

public class TestPrintDate {
	
	@Test
	public void testPrintDateByCreatingAnObject() {
		PrintDate d = new PrintDate();
		Date da = new Date();
		da.getDate();
		
		d.setDate(13/11/19);
		assertEquals(expected, actual);
	}

}
