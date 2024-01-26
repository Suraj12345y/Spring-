package com.becoder.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.becoder.Student;

public class StudentDaoImpl implements StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	@Override
	public int saveStudent(Student student) {
		int i=(Integer)hibernateTemplate.save(student)
		return i;
	}

	@Override
	public Student getStudent(int id) {
		
		Student st=hibernateTemplate.get(Student.class,id);
		
		return st;
	}

	@Override
	public List<Student> getAllStudent() {
		List<Student>list=hibernateTemplate.loadAll(Student.class);
		return list;
	}

	@Override
	public void updateStudent(Student student) {
		hibernateTemplate.update(student)
		
	}

	@Override
	public void deleteStudent(int id) {
		
		
	}

}
