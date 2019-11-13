package com.training.myapp;

public class CorporateTraining extends Training {
	int days;
	public CorporateTraining() {
		// TODO Auto-generated constructor stub
	}
	public CorporateTraining(int id,String subject,int fees,int days) {
		
		super(id,subject,fees);
		this.days = days;
	}
	public int getOrderValue() {
		int cost = fees*days;
		return cost;
		
	}

}
