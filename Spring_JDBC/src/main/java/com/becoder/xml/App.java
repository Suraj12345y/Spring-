package com.becoder.xml;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.becoder.dao.StudentDao;
import com.becoder.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("com/becoder/xml/config.xml");
    	JdbcTemplate jd=context.getBean("jdbcTemplate",JdbcTemplate.class);
    	System.out.println(jd.getDataSource().getConnection());
    	
    	/*
    	String sql="insert into student(id,name,addres) values(?,?,?)";
    	int i=jd.update(sql,1,"suraj","Asansol");
    	System.out.println("Succesfully inserted"+i);
    	*/
    	
    	/*insert*/
    	/*String sql="insert into student(id,name,addres) values(?,?,?)";
    	int i=jd.update(sql,3,"Rakesh","USA");
    	System.out.println("Succesfully inserted"+i);*/
    	
    	/*update data*/
    	/*String sql="update student set name=?, addres=? where id=?";
    	int i=jd.update(sql,"Rakesh Up","USA up",3);
    	System.out.println("update successfully: "+i);*/
    	
    	/*delete data*/
    	/*String sql="delete from student where id=?";
    	int i=jd.update(sql,3);
    	System.out.println("delete successfully: "+i);*/
    	
    	/*perform dao operation*/
    	StudentDao dao=context.getBean("stDao",StudentDao.class);
    	
    	/*insert*/
    	Student st=new Student();
    	st.setId(3);
    	st.setName("Rakesh");
    	st.setAddress("uk");
    	
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