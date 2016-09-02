package spring.chap01;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;


@Component
@Aspect
public class LoggingAspect {
	
	private Log log = LogFactory.getLog(getClass());
	
	
	@Pointcut("execution(* *..*Service.*(..))")
	public void checkMethod(){}
	
	
	@Around("checkMethod()")
	public Object logging(ProceedingJoinPoint joinPoint) throws Throwable{
		log.info("��Ͻ���");
		StopWatch stopWatch = new StopWatch();
		try{
			stopWatch.start();
			Object retValue = joinPoint.proceed();//������ ��û�߶� �޼��带 ������ (���⼱ write�޼ҵ���)
			return retValue;
		}
		catch(Throwable e){
			throw e;
		}
		finally{
			stopWatch.stop();
			log.info("��� ����");
			log.info(joinPoint.getSignature().getName() + "�޼��� ���� �ð� : " + stopWatch.getTotalTimeMillis());
		}
	
		
	}

}
