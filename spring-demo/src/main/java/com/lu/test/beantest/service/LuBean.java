package com.lu.test.beantest.service;

import org.springframework.beans.factory.annotation.Autowired;

public class LuBean {
	private String name;

	private int age;

	@Autowired
	private AService aService;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
