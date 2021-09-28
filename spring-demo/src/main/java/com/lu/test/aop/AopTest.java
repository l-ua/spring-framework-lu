package com.lu.test.aop;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AopTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
		StudentService studentService = context.getBean("studentService", StudentService.class);
		studentService.addStudent();
	}

}
