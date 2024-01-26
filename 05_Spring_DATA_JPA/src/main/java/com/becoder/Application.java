package com.becoder;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import com.becoder.entites.Student;
import com.becoder.repository.StudentRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(Application.class, args);
		
		StudentRepo strepo=context.getBean(StudentRepo.class);
		
		//Student st=new Student();
		//st.setName("Avishek");
		//st.setAddress("mugma");
		
		
		//strepo.save(st);
		
		//List<Student> list=(List<Student>)strepo.findAll();
		
		//list.forEach(student -> System.out.println(student));
		
		//Student st=strepo.findById(1).get();
		//System.out.println(st);
		
		/*
		st.setName("suraj goswami");
		st.setAddress("Kolkata");
		
		Student updatedStudent=strepo.save(st);
	    System.out.println("Updated Data...");
		System.out.println(updatedStudent);
		*/
		
		 //strepo.delete(st);
		 //System.out.println("Delete successfuly...");
		
		
		//get student by name
		
		//Student st=strepo.findByName("suraj");
		//System.out.println(st);
		
		//get student by address
		//Student st=strepo.findByAddress("USA");
		//System.out.println(st);
		
		
		//get student by and using 
		
		//Student st=strepo.findByNameAndAddress("shyam","Burnpur");
		//System.out.println(st);
		
		//get student by or using 
		//Student st=strepo.findByNameOrAddress("shyam","Uk");
		//System.out.println(st);
		
		//List<Student> st=strepo.findByNameLike("Avishek");
		//st.forEach(e->System.out.println(e));
		
		//List<Student> st=strepo.findByNameStartingWith("A");
		//st.forEach(e->System.out.println(e));
		
		//List<Student> st=strepo.findByNameContaining("a");
		//st.forEach(e->System.out.println(e));
		
		//List<Student> st=strepo.findByOrderByNameDesc();
		//st.forEach(e->System.out.println(e));
		
		//Boolean f=strepo.existsByName("sourav g");
		//System.out.println(f);
		
		//custom query using
		
		//Student st=strepo.getStudentByNameAndAddress("shyam", "Burnpur");
		//System.out.println(st);
		
		//List<Student> st=strepo.searchname("suraj");
		//st.forEach(e->System.out.println(e));
		
		
		//pagination
		
		//Sort sort=Sort.by("name").ascending();
		Sort sort=Sort.by("id").ascending();
		
		List<Student>listSortStudent=strepo.findAll(sort);
		System.out.println("-----------sorting student details---------------");
		listSortStudent.forEach(e->System.out.println(e));
		System.out.println("--------------------------");
		org.springframework.data.domain.Pageable pageable=PageRequest.of(0, 5,sort);
		
		
		Page<Student>page=strepo.findAll(pageable);
		page.get().forEach(e->System.out.println(e));
		System.out.println("Size= "+page.getSize());
		System.out.println("Total elements= "+page.getTotalElements());
		System.out.println("Pages= "+page.getTotalPages());
		
		
		
		
		
		
		
		
	}

}
