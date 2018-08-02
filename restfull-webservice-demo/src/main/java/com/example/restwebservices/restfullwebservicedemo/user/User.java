package com.example.restwebservices.restfullwebservicedemo.user;

import java.util.Date;

import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.wordnik.swagger.annotations.ApiModel;
import com.wordnik.swagger.annotations.ApiModelProperty;

@ApiModel(description="detail about the user")
public class User {

	private Integer id;
	@Size(min=2,message="name should have atleast 2 char")
	@ApiModelProperty(notes="name should atleast2 char ")
	private String name;
	private Integer age;
	@Past
	private Date bateofbirth;

	
	public User(Integer id, String name, Integer age, Date bateofbirth) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.bateofbirth = bateofbirth;
	}
	public User(String name, Integer age, Date bateofbirth) {
		super();
		this.name = name;
		this.age = age;
		this.bateofbirth = bateofbirth;
	}
	
	User()
	{
		
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	public Integer getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", bateofbirth=" + bateofbirth + "]";
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Date getBateofbirth() {
		return bateofbirth;
	}

	public void setBateofbirth(Date bateofbirth) {
		this.bateofbirth = bateofbirth;
	}

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
