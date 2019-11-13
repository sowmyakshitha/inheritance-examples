package com.training.myapp;

public class Manager extends Emp {
	
	double petrolAllowances;
	double foodAllowances;
	double otherAllowances;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(int employeeId,String employeeName,double basicSalary) {
		super(employeeId,employeeName,basicSalary);
		this.petrolAllowances = basicSalary * 8/100;
		this.foodAllowances = basicSalary * 13/100;
		this.otherAllowances = basicSalary * 3/100;
	}

	public double getPetrolAllowances() {
		return petrolAllowances;
	}

	public void setPetrolAllowances(double petrolAllowances) {
		this.petrolAllowances = petrolAllowances;
	}

	public double getFoodAllowances() {
		return foodAllowances;
	}

	public void setFoodAllowances(double foodAllowances) {
		this.foodAllowances = foodAllowances;
	}

	public double getOtherAllowances() {
		return otherAllowances;
	}

	public void setOtherAllowances(double otherAllowances) {
		this.otherAllowances = otherAllowances;
	}

	@Override
	public double calculateGrossSalary() {
	 grossSalary = basicSalary+hra+petrolAllowances+foodAllowances+otherAllowances;
		
		System.out.println(grossSalary);
		return grossSalary;
	}

	@Override
	public double calculateNetSalary() {
		 netSalary = this.calculateGrossSalary() - (petrolAllowances+foodAllowances+otherAllowances+pf+pt);
		System.out.println(netSalary);
		return netSalary;
	}

	@Override
	public double displayDetails() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Manager [ employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary + ", hra=" + hra + ", pf=" + pf + ", pt=" + pt
				+ ", netSalary=" + netSalary + ", grossSalary=" + grossSalary + "]";
	}
	
	
	
	
	

}
