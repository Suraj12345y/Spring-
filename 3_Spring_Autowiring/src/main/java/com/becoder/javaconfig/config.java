package com.becoder.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages="com.becoder.javaconfig")
public class config {
	
	@Bean
	@Primary
	public Address add() {
		return new Address("First Bean");
	}
	
	@Bean
	public Emp getEmp()
	{
		return new Emp(add());
	}

}
