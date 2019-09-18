package com.nchu.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nchu.pojo.Student;


public class TestSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		//	通过ClassPathXmlApplicationContext来获取xml文件中的bean
//		Category c = (Category) context.getBean("c");
		Student p = (Student) context.getBean("p");
		System.out.println(p.getCategory().getName());
		System.out.println(p.getName());
//		System.out.println(p.getSon().getSid());
	}
}
