package com.training.myapp;

public abstract class Training {
	
	int id;
	String subject;
	int fees;
	
	
	public Training() {
		// TODO Auto-generated constructor stub
		//this.id=id++;
	}

	public Training(int id, String subject, int fees) {
		super();
		this.id = id;
		this.subject = subject;
		this.fees = fees;
	}
	
	public abstract int getOrderValue();
	
	

}
