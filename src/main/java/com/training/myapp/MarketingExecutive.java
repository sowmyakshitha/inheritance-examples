package com.training.myapp;

public class MarketingExecutive extends Emp{
	
	int kilometersTravelled;
	double tourAllowance;
	double telephoneAllowance;
	
	public MarketingExecutive() {
		// TODO Auto-generated constructor stub
	}

	public MarketingExecutive(int employeeId,String employeeName,double basicSalary,int kilometersTravelled) {
		super(employeeId,employeeName,basicSalary);
		this.kilometersTravelled = kilometersTravelled;
		this.tourAllowance = kilometersTravelled * 5;
		this.telephoneAllowance = 1500;
	}

	public int getKilometersTravelled() {
		return kilometersTravelled;
	}

	public void setKilometersTravelled(int kilometersTravelled) {
		this.kilometersTravelled = kilometersTravelled;
	}

	public double getTourAllowance() {
		return tourAllowance;
	}

	public void setTourAllowance(double tourAllowance) {
		this.tourAllowance = tourAllowance;
	}

	public double getTelephoneAllowance() {
		return telephoneAllowance;
	}

	public void setTelephoneAllowance(double telephoneAllowance) {
		this.telephoneAllowance = telephoneAllowance;
	}

	@Override
	public double displayDetails() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double calculateGrossSalary() {
		 grossSalary = basicSalary + hra + tourAllowance + telephoneAllowance;
		System.out.println(grossSalary);
		
		return grossSalary;
	}

	@Override
	public double calculateNetSalary() {
		 netSalary = (this.calculateGrossSalary() - (pf+pt))-(tourAllowance+telephoneAllowance);
		System.out.println(netSalary);
		return netSalary;
	}

	@Override
	public String toString() {
		return "MarketingExecutive [employeeId=" + employeeId + ", employeeName="+ employeeName + ", basicSalary=" + basicSalary + ", netSalary=" + netSalary + ", grossSalary=" + grossSalary + "]";
	}
	
	
	
	
	

}
