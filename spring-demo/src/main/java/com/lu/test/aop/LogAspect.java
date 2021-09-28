package com.lu.test.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LogAspect {

	// 切入点 可以多个
	@Pointcut("execution(* com.lu.test.aop.StudentService.addStudent(..))")
	public void pointcut1() {
		System.out.println("========================切入点1======================");
	}

	// 前置通知
	@Before(value = "pointcut1()")
	public void before(JoinPoint joinPoint) {
		System.out.println("========================前置通知======================");
	}

	// 后置通知
	@After("pointcut1()")
	public void after() {
		System.out.println("========================后置通知======================");
	}

	@AfterReturning("pointcut1()")
	public void afterReturn() {
		System.out.println("========================后置通知返回======================");
	}

	@AfterThrowing("pointcut1()")
	public void afterThrowing() {
		System.out.println("========================后置通知异常======================");
	}

	// 环绕通知
//	@Around("pointcut1()")
//	public void around() {
//		System.out.println("========================环绕通知======================");
//	}
}
