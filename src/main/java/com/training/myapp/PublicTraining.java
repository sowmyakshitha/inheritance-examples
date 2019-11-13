package com.training.myapp;

public class PublicTraining extends Training {
	int participants;

	public PublicTraining() {
		// TODO Auto-generated constructor stub
	}

	public PublicTraining(int id, String subject, int fees, int participants) {
		super(id, subject, fees);
		// super();
		this.participants = participants;
	}

	public int getOrderValue() {
		int cost = fees * participants;
		return cost;
	}

}
