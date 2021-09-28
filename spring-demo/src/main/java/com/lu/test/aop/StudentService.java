package com.lu.test.aop;

public class StudentService {
	public Student addStudent() {
		System.out.println("=========================添加学生======================");
		Student student = new Student();
		student.setId(1L);
		student.setName("helloworld");
		return student;
	}
}
