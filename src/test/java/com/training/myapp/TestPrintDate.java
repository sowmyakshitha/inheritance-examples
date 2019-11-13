package com.training.myapp;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class TestPrintDate {
	
	@Test
	public void testPrintDateByCreatingAnObject() throws ParseException {
		PrintDate p = new PrintDate();
		String datePattern = "dd-mm-yyyy";
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date date = format.parse("13-11-2019");
		p.setDate(date);
		Date result = p.getDate();
		assertEquals(date, result);
	}

}
