package com.crruds.test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cruds.db.UserDAO;

public class TestUserDAO {

	
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserDAO dao=(UserDAO) context.getBean("userDAOImpl");
		dao.create("sam","san@123","dev");
		
		System.out.println("data inserted succesfully"); 
	}

}
