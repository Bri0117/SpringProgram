package com.nchu.service;

import org.springframework.stereotype.Component;

@Component("s")
public class ProductService {
	public void study(){
		System.out.print("好的，我学习了");
	}
	public void play(){
		System.out.print("没错，在玩呢");
	}
}
