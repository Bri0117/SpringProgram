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
//	ÿ��������Ҫһ��@Autowiredע��
//	ʹ��@Resourceʱ����Ҫʹ��name������ָ����Ӧ��bean��name
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
	//����Ĭ�ϵ�get��set�������ܻᱨ��������ԭ��setCategory�е�S��д��
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