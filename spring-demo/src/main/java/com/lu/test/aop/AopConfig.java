package com.lu.test.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class AopConfig {

	@Bean
	public LogAspect logAspect(){
		return new LogAspect();
	}

	@Bean
	public StudentService studentService(){
		return new StudentService();
	}
}
