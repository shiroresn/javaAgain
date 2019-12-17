package com.first.constructorPractice;

public class Telicom {
	private int id;
	private String name;
	private int CallingRates;
	
	public Telicom() {
		System.out.println("Welcome to all India Telicom Company");
	}
	
	public Telicom(int id, String name, int callingRates) {
		super();
		this.id = id;
		this.name = name;
		CallingRates = callingRates;
	}
	
	public static void main(String[] args) {
		Telicom t1 = new Telicom(1,"Idea",3);

	}
	
}
