package com.lu.test.beantest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AService {
	@Autowired
	private BService b;
}
