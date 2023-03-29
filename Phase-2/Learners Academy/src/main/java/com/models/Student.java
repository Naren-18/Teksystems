package com.models;

public class Student {
	
	private int id;
	private String firstname;
	private String lastname;
	private int age;
	private int aclass;
	
	
	
	
	public Student(int id, String firstname, String lastname, int age, int aclass) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.aclass = aclass;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getfirstname() {
		return firstname;
	}
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getlastname() {
		return lastname;
	}
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAclass() {
		return aclass;
	}
	public void setAclass(int aclass) {
		this.aclass = aclass;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", aclass=" + aclass
				+ "]";
	}
 
	

}
