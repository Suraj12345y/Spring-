package com.becoder;

public class Shyam implements Action {
	
	public Shyam()
	{
		System.out.println("SHYAM Object is created");
	}


	@Override
	public void eat() {
		System.out.println("shyam is eating");
		
	}

	@Override
	public void sleep() {
		System.out.println("shyam is sleeping");
		
	}

}
