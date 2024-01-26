package com.becoder.javaconfig;

import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.becoder.dao.StudentDao;
import com.becoder.model.Student;

public class App {
	public static void main(String[]args) throws SQLException {
		ApplicationContext context=new AnnotationConfigApplicationContext(config.class);
		JdbcTemplate jd=context.getBean("jdbc",JdbcTemplate.class);
		
		System.out.println(jd.getDataSource().getConnection());
		
		/*String sql="insert into student(id,name,addres) value(?,?,?)";
		
		int i=jd.update(sql,2,"sourav","westBengal");
		System.out.println("Successfully inserted: "+i);*/
		
		
		/*perform dao operation*/
    	StudentDao dao=context.getBean("stDao",StudentDao.class);
    	
    	/*insert*/
    	Student st=new Student();
    	st.setId(4);
    	st.setName("Jageswar");
    	st.setAddress("London");
    	
    	int i=dao.insert(st);
    	System.out.println("Insert succesfully "+i);
    	
    	/*update details*/
    	/*Student st=new Student();
    	st.setId(3);
    	st.setName("Rakesh");
    	st.setAddress("uk up");
    	
    	int i=dao.updateDetails(st);
    	System.out.println("update succesfully "+i);*/
    	
    	/*delete data*/
    	/*int i=dao.delete(3);
    	System.out.println("delete successfully: "+i);*/
    	
    	/*Fetch 1 data only*/
    	/*Student st=dao.getStudentById(2);
    	System.out.println(st);*/
    	
    	/*Fetch multiple data*/
    	List<Student>list=dao.getAllStudent();
    	for(Student sts:list) {
    		System.out.println(sts);
    	}
    	
    	
    	
    	
    	
    	
    }

	}


