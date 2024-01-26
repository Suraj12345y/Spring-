package com.becoder.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("#{2+3}")
	public int sum;
	
	@Value("#{5-3}")
	public int sub;
	
	@Value("#{2*3}")
	public int mul;
	
	@Value("#{15/3}")
	public int div;
	
	@Value("#{1==1}")
	public boolean equalvalid;

	@Override
	public String toString() {
		return "Student [sum=" + sum + ", sub=" + sub + ", mul=" + mul + ", div=" + div + ", equalvalid=" + equalvalid
				+ "]";
	}

	

}
