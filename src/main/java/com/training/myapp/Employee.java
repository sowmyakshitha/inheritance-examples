package com.training.myapp;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double hra;
	private double medical;
	private double pf;
	private double pt;
	private double netSalary;
	private double grossSalary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, double basicSalary, double medical) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.hra= basicSalary * 50/100;
		this.medical = medical;
		this.pf = basicSalary * 12/100;
		this.pt = 200;
		this.netSalary = netSalary;
		this.grossSalary = grossSalary;
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

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
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
	
	public double calculateGrossSalary() {
		 grossSalary = basicSalary+hra+medical;
		System.out.println(grossSalary);
		return grossSalary;
	}
	
	public double calculateNetSalary() {
		 netSalary  = this.calculateGrossSalary() - (pt + pf);
		//setNetSalary(net);
		return netSalary;
	}
	
	public String displayDetails() {
		String str = employeeId +employeeName +basicSalary +grossSalary+netSalary; 
		System.out.println(str);
		return str;
	}
	
	
	
	

}
