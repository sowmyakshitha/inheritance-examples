package com.training.myapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestEmployee {
	
	Employee e = new Employee(1,"Sowmya",5000,180);
	
	@Test
	public void testGrossValue() {
		assertEquals(7680, e.calculateGrossSalary(),0.05);
	}
	
	@Test
	public void testNetValue() {
		assertEquals(6880, e.calculateNetSalary(),0.05);
		String str1 = "1Sowmya5000.07680.06880.0";
		assertEquals(str1, e.displayDetails());
	}
	
//	@Test
//	public void testDisplayDetails() {
//		String str1 = "1Sowmya5000.07680.06880.0";
//		assertEquals(str1, e.displayDetails());
//	}

}
