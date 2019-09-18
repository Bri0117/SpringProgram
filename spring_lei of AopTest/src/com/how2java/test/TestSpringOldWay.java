package com.how2java.test;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.how2java.pojo.Category;
// 手动调用context进行bean的获取

public class TestSpringOldWay {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "applicationContext.xml" });

		Category c = (Category) context.getBean("c");

		System.out.println(c.getName());
	}
}