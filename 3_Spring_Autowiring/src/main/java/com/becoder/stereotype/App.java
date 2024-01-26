package com.becoder.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[]args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/becoder/stereotype/config.xml");
		Emp em=context.getBean("employee",Emp.class);
		System.out.println(em);
	}

}
