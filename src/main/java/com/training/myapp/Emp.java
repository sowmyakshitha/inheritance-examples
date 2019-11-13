package com.training.myapp;

public abstract class Emp {
	
	 protected int employeeId;
	 String employeeName;
	 double basicSalary;
	 double hra;
	 double pf;
	 double pt;
	 double netSalary;
	 double grossSalary;
	
	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(int employeeId, String employeeName, double basicSalary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.hra= basicSalary * 50/100;

		this.pf = basicSalary * 12/100;
		this.pt = 200;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		
		this.hra = hra;
	}


	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getPt() {
		return pt;
	}

	public void setPt(double pt) {
		this.pt = pt;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	
	public abstract double calculateGrossSalary();
	public abstract double calculateNetSalary();
	
	public abstract double displayDetails();

	

}
