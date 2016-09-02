package spring.aop;

import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.aspectj.lang.ProceedingJoinPoint;

@Component
@Aspect
public class PerformanceAspect {
	
	
	@Pointcut("execution(public * spring.aop..*sayHello*(..))")
	public void setPointCut(){}
	
	@Around("setPointCut()")
	public Object timeCheck(ProceedingJoinPoint joinPoint) throws Throwable{
		Signature s = joinPoint.getSignature();
		String methodName = s.getName();
		long startTime = System.nanoTime();
		System.out.println("[Log]Method Before : " + methodName + "timeCheckStart!!");
		Object obj = null;
		try{
			obj = joinPoint.proceed();
		}
		catch(Exception e){
			System.out.println("[Log]Method error : " + methodName);
		}
		long endTime = System.nanoTime();
		System.out.println("[Log]Method After : " + methodName + "time check end!!!");
		System.out.println("[Log] " + methodName + "Processing time is " + (endTime-startTime)+"ns");
		return obj;
	}

}
