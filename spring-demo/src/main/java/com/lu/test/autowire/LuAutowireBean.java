package com.lu.test.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LuAutowireBean {

	private String name;

	private int age;

	private AutowireService autowireService;

	@Autowired
	private AutowireService2 autowireService2;

//	@Autowired(required = false)
//	public LuAutowireBean() {
//
//	}

//	@Autowired(required = false)
//	public LuAutowireBean(String name, int age,@Autowired AutowireService autowireService) {
//		this.name = name;
//		this.age = age;
//	}

	@Autowired
	public LuAutowireBean(@Autowired AutowireService autowireService) {
		this.autowireService=autowireService;
	}

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
