package com.lu.test.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutowireTest {
	public static void main(String[] args) {
		ApplicationContext context =new AnnotationConfigApplicationContext("com.lu.test.autowire");
		context.getBean("luAutowireBean");
	}
}
