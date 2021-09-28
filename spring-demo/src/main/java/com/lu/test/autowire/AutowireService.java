package com.lu.test.autowire;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class AutowireService {
	private String a;

	private String b;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}

	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}
}
