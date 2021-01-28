package com.cruds.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cruds.demo.Author;
import com.cruds.demo.Book;
import com.cruds.demo.Hellobean;

@Configuration
public class AppConfig {

	@Bean
	public Hellobean hellobean(){
		
		Hellobean bean=new Hellobean();
		bean.setMsg("hello beannnnnn");
		return bean;
		
	}
	@Bean
	public Author author()
	{
		return new Author("tumkur","ss puram");
		
	}
	@Bean
	public Book book()
	{
		Book b=new Book(90,"java",1000);
		b.setAuthor(author());
		return b;
		
	}
}
