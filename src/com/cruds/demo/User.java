package com.cruds.demo;

public class User {

	private String name;
	private int age;
	private String country;
	public String getName() {
		return name;
	}
	
	//default as to be there other vise we can use const injection
/*	public User()
	{
		
	}
	*/
	public User(String name, int age, String country) {
		super();
		this.name = name;
		this.age = age;
		this.country = country;
	}


	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", country=" + country + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
}
