package spring.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
	
	
	@Pointcut("execution(public * spring.aop.GreetingServiceImpl.say*(..))")
	public void publicMethod(){}
	
	
	@Before("publicMethod()")
	public void beforeLogging(){
		System.out.println("**�޼ҵ� ȣ�� ��**");
	}
	@AfterReturning(pointcut="publicMethod()",returning="returnValue")
	public void afterLogging(Object returnValue){
		System.out.println("**�޼��� ȣ�� ��**");
	}
	
	@AfterThrowing(pointcut="publicMethod()",throwing="ex")
	public void throwingLogging(Exception ex){
		System.out.println("**���� �߻� : " + ex.getMessage() + " **");
	}
	@After("execution(* *(..))")
	public void alwaysLogging(){
		System.out.println("**�׻� ���� **");
	}
	

}
