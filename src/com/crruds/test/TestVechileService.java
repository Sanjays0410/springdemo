package com.crruds.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cruds.demo.VechileServiceProvider;

public class TestVechileService {
	
public static void main(String[] args) { 
	
	/*VechileServiceProvider vsp=new VechileServiceProvider();
	vsp.showvechile();*/
	
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	VechileServiceProvider vps=(VechileServiceProvider) context.getBean("vechileServiceProvider");
	vps.showvechile();
}
}
