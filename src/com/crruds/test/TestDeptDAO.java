package com.crruds.test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cruds.db.DepartmentDAO;
import com.cruds.entity.Department;
import com.cruds.service.DepartmentService;

public class TestDeptDAO {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DepartmentService dao=(DepartmentService) context.getBean("departmentService");
		//dao.create(new Department(404,"not found"));
		//dao.get(404);
		
		//System.out.println(dao.get(404));
		//dao.delete(404);
		Department d=new Department(100,"sales");
		dao.update(d);
		System.out.println("updated");
		
	}
}
