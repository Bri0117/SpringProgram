package com.nchu.pojo;

import org.springframework.stereotype.Component;

@Component("s")
public class Son {
	private int sid=1;
	private String sex;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
