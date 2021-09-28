package com.lu.test.beantest.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class FactoryBeanDemo implements FactoryBean<LuBean> {
	@Override
	public LuBean getObject() throws Exception {
		return new LuBean();
	}

	@Override
	public Class<?> getObjectType() {
		return LuBean.class;
	}
}
