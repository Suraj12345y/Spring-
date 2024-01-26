package com.becoder.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[]args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
		Emp em=context.getBean("getEmp",Emp.class);
		System.out.println(em);
	}

}
