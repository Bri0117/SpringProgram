package com.nchu.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceAspect {
	// ��service�еķ�������������
	@Around(value="execution(* com.nchu.service.ProductService.study(..))")
	public Object performance(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("***************************");
		Object object = joinPoint.proceed();
		System.out.println();
		System.out.println("###########################");
		return object;
	}
	// ��service���еĲ�ͬ��������������
	@Around(value="execution(* com.nchu.service.ProductService.play(..))")
	public Object performance2(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("***************************");
		Object object = joinPoint.proceed();
		System.out.println();
		System.out.println("###########################");
		return object;
	}
}
