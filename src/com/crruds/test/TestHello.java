package com.crruds.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cruds.demo.Hellobean;

public class TestHello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Hellobean bean=(Hellobean) context.getBean("hellobean");
		System.out.println(bean.getMsg());

	}

}
