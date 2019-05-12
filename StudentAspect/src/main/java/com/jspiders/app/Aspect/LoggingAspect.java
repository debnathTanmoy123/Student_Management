package com.jspiders.app.Aspect;



import java.util.Arrays;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class LoggingAspect {
	
	Logger log=Logger.getLogger(LoggingAspect.class);
	
	
	

	@Pointcut("within(com.jspiders.app.controller..*) ")
	void withinMyChoice() {
	}
	
	
	/*@Before("withinMyChoice()")
	void befor() {
		System.out.println("all methods will have additional values");
	}*/

	
	  @Around("withinMyChoice()") public Object Advice(ProceedingJoinPoint join)
	  throws Throwable { 
		  Signature signature = join.getSignature();
		  String name = signature.getName(); 
		  Object[] argsArray=join.getArgs();
		  String args = Arrays.toString(argsArray);// alternative for for loop
		  Object proceed = join.proceed();
	  log.info(signature+" args ->"+args+" result-> "+proceed );
	  System.out.println(signature+" args ->"+args+" result->"+proceed );
	  return proceed;
	  }
	 
	
}