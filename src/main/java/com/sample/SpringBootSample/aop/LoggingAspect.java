package com.sample.SpringBootSample.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

//	@Before("testAspect()")
	public void loggingAdvvice() {
		System.out.println("Logging instruction is executed");
	}
}
