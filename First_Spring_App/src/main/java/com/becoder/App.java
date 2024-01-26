package com.becoder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
      /* Action ac=new Ram();
       ac.eat();
       ac.sleep();*/
    	
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/becoder/config.xml");
    	System.out.println(context);
    	
    	Shyam sh=context.getBean("person",Shyam.class);
    	sh.eat();
    	sh.sleep();
       
       
       
    }
}
