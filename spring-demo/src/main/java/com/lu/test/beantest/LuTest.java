package com.lu.test.beantest;

import com.lu.test.beantest.service.LuServie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LuTest {
	public static void main(String[] args) {
		// 按配置文件解析
		//ApplicationContext context=new AnnotationConfigApplicationContext(MyConfig.class);
		// 按扫描路径解析
		ApplicationContext context2=new AnnotationConfigApplicationContext("com.lu.test");
		LuServie luServie=context2.getBean("luServie", LuServie.class);
		System.out.println(luServie);

		System.out.println(context2.getBean("&factoryBeanDemo"));

		System.out.println(context2.getBean("factoryBeanDemo"));
		System.out.println(context2.getBean("factoryBeanDemo"));
		System.out.println(context2.getBean("factoryBeanDemo"));


	}
}
