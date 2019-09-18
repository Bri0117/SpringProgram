package com.nchu.pojo;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("p")
public class Student {
	private String name="lei";
	private String age;
	private String sid;
	@Autowired
	private Category category;
//	每个对象都需要一个@Autowired注解
//	使用@Resource时，需要使用name属性来指定对应的bean的name
	@Resource(name="s")
	private Son son;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public Category getCategory(){
		return category;
	}
	//不是默认的get、set方法可能会报错，报错原因：setCategory中的S大写了
//	public void SetCategory(Category category){
//		this.category=category;
//	}
//	@Autowired
	public void setCategory(Category category) {
		this.category = category;
	}
	public Son getSon() {
		return son;
	}
	public void setSon(Son son) {
		this.son = son;
	}
}
