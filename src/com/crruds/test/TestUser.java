package com.crruds.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cruds.demo.User;

public class TestUser {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		  
		User u=(User) context.getBean("user");
		//System.out.println(u.getName()+"\n"+u.getAge()+"\n"+u.getCountry());
		//System.out.println(u.toString());
		
	 
		System.out.println(u);
	}
}
