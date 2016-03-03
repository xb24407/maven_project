package com.app.model;
import java.io.Serializable;
public class Teacher implements Serializable {
	private Integer id;
	private String name;
	private Integer age;

	public void setId(Integer id){
		this.id = id;
	}
	public Integer getId() {
		return this.id;
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getAge() {
		return this.age;
	}

}
