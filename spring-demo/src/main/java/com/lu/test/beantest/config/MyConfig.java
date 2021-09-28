package com.lu.test.beantest.config;

import com.lu.test.beantest.service.LuServie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

	@Bean
	public LuServie luServie(){
		return new LuServie();
	}

}
