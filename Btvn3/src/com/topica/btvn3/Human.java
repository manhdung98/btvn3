package com.topica.btvn3;

public class Human {
	@Init
	private String name;
	private Integer age;
	
	
	public static final int a = 2;
	public static final String s = "abcd";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Init
	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
//	@Init("init1")
//	@Init("init2")
	

}
