package com.becoder;

public class Ram implements Action {
	
	public Ram()
	{
		System.out.println("RAM Object is created");
	}

	@Override
	public void eat() {
		System.out.println("ram is eating");
		
	}

	@Override
	public void sleep() {
		System.out.println("ram is sleeping");
	}

}
