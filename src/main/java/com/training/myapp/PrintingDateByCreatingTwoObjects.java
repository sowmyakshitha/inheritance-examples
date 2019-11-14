package com.training.myapp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintingDateByCreatingTwoObjects {
	
	Date date;
	
	public PrintingDateByCreatingTwoObjects() {
		// TODO Auto-generated constructor stub
	}

	public PrintingDateByCreatingTwoObjects(Date date) {
		super();
		this.date = date;
	}
	
	public void print() throws ParseException {
		PrintingDateByCreatingTwoObjects object1 = new PrintingDateByCreatingTwoObjects();
		PrintingDateByCreatingTwoObjects object2 = new PrintingDateByCreatingTwoObjects();
		String datePattern = "dd-mm-yyyy";
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		Date date = format.parse("13-11-2019");
		
	}
	

}
