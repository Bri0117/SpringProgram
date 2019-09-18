package com.nchu.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nchu.service.ProductService;

public class TestSpring {
	public static void main(String[] args){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		ProductService ps = (ProductService)context.getBean("s");
		ps.study();
		ps.play();
	}
}
