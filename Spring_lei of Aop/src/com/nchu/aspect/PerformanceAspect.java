package com.nchu.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class PerformanceAspect {
	public Object performance(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("***************************");
		Object object = joinPoint.proceed();
		System.out.println();
		System.out.println("###########################");
		return object;
	}
	public Object performance2(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("11111111111111111111111111");
		Object object = joinPoint.proceed();
		System.out.println();
		System.out.println("22222222222222222222222222");
		return object;
	}
}
