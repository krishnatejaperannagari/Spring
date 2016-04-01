package com.sac.beanprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class StudentBeanProcessor implements BeanPostProcessor{

	@Override
	public Object postProcessAfterInitialization(Object object, String string) throws BeansException {
		System.out.println("Performing PostProcess AfterInitialization for :- " + object);
		return object;
	}

	@Override
	public Object postProcessBeforeInitialization(Object object, String string) throws BeansException {
		System.out.println("Performing PostProcess BeforeInitialization for :- " + object);
		return object;
	}

}
