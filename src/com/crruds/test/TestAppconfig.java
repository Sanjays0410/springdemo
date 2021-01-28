package com.crruds.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cruds.Config.AppConfig;

import com.cruds.demo.Book;
import com.cruds.demo.Hellobean;



public class TestAppconfig {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		/*Hellobean hellobean=context.getBean(Hellobean.class);
		
		System.out.println(hellobean.getMsg());*/
	
		
		
	Book user=context.getBean(Book.class);
		System.out.println(user);
		
	}
}
