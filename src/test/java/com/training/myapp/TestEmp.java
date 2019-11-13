package com.training.myapp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestEmp {
	
	
	
	@Test
	public void testGrossAndNetSalaryOfManager() {
		Emp e = new Manager(1,"Sowmya",5000);
		assertEquals(8700, e.calculateGrossSalary(),0.02);
		assertEquals(6700, e.calculateNetSalary(),0.02);
	}
	
	@Test
	public void testGrossAndNetsalaryOfMarketingExecutive() {
		Emp e = new MarketingExecutive(2,"Pinky",5000,4);
		assertEquals(9020, e.calculateGrossSalary(),0.02);
		assertEquals(6700, e.calculateNetSalary(),0.02);
	}
	

	public void showDetails(Emp e) {
		e=new Manager();
		e.calculateNetSalary();
		System.out.println(e.toString());
		e=new MarketingExecutive();
		System.out.println(e.toString());
		
	}

}
