package com.crruds.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.cruds.demo.Book;

public class TestBook {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		Book b=(Book) context.getBean("book");
		System.out.println(b);
	}

}
