package com.nchu.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import com.nchu.pojo.Category;

public class Student {
	private String name;
	private String age;
	private String sid;
	@Autowired
	private Category category;
	
//	@Autowired
//	private Son son;
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
	//����Ĭ�ϵ�get��set�������ܻᱨ������ԭ��setCategory�е�S��д��
//	public void SetCategory(Category category){
//		this.category=category;
//	}
	public void setCategory(Category category) {
		this.category = category;
	}
//	public Son getSon() {
//		return son;
//	}
//	public void setSon(Son son) {
//		this.son = son;
//	}
}
