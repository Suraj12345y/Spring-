package com.becoder;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.becoder.entity.Address;
import com.becoder.entity.Category;
import com.becoder.entity.Emp;
import com.becoder.entity.Mobile;
import com.becoder.entity.Product;
import com.becoder.repository.AddressRepo;
import com.becoder.repository.EmpRepo;
import com.becoder.repository.MobileRepo;

@SpringBootApplication
public class Application implements CommandLineRunner {
	
	@Autowired
	private EmpRepo empRepo;
	
	@Autowired
	private MobileRepo mobileRepo;
	
	@Autowired
	private AddressRepo addRepo;
	
	

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		/*
		Emp emp=new Emp();
		emp.setEmpName("Suraj");
		
		Mobile mb=new Mobile();
		mb.setMobilename("Apple");
		
		//emp.setMobile(mb);
		mb.setEmp(emp);
		
		empRepo.save(emp);
		mobileRepo.save(mb);
		System.out.println("Save success..");*/
		
		/*
		Emp emp=empRepo.findById(1).get();
		System.out.println("Name= "+emp.getEmpName());
		System.out.println("mobile= "+emp.getMobile().getMobilename());*/
		
		/*
		Mobile mb=mobileRepo.findById(3).get();
		System.out.println("EmpName= "+mb.getEmp().getEmpName());
		System.out.println("mobile= "+mb.getMobilename());*/
		
		//one to many or many to one
		/*Emp emp=new Emp();
		emp.setEmpName("soumen");
		
		Address ad=new Address();
		ad.setAddress("kolkata");
		ad.setType("Permanent address");
		ad.setEmp(emp);
		
		Address ad2=new Address();
		ad2.setAddress("Pune");
		ad2.setType("Current address");
		ad2.setEmp(emp);
	
		List<Address>addList=Arrays.asList(ad,ad2);
		emp.setAddress(addList);
		
		empRepo.save(emp);
		System.out.println("save success");*/
		
		/*Emp emp=empRepo.findById(3).get();		
		
		System.out.println("Emp name= "+emp.getEmpName());
		emp.getAddress().forEach(e->System.out.println(e.getAddress()+"="+e.getType()));*/
		
		/*Address ad=addRepo.findById(4).get();
        System.out.println("Address= "+ad.getAddress());
        System.out.println("Emp Name= "+ad.getEmp().getEmpName());*/
		
		//many to many
		
		Category ca1=new Category();
		ca1.setCategoryname("Electronics");
		
		Category ca2=new Category();
		ca2.setCategoryname("Mobile");
		
		Product p1=new Product();
		p1.setProductName("TV");
		
		Product p2=new Product();
		p2.setProductName("Oneplus mobile");
		
		Product p3=new Product();
		p3.setProductName("Iphone 14");
		
		ca1.getProducts().add(p1);
		ca1.getProducts().add(p2);
		ca1.getProducts().add(p3);
		
		
		ca2.getProducts().add(p2);
		ca2.getProducts().add(p3);
		
		p1.getCategories().add(ca1);
		p2.getCategories().add(ca1);
		p3.getCategories().add(ca1);
		
		p2.getCategories().add(ca2);
		p3.getCategories().add(ca2);
		
		
		
		
	}

}
