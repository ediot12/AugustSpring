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
		log.info("기록시작");
		StopWatch stopWatch = new StopWatch();
		try{
			stopWatch.start();
			Object retValue = joinPoint.proceed();//실제로 요청했떤 메서드를 실행함 (여기선 write메소드임)
			return retValue;
		}
		catch(Throwable e){
			throw e;
		}
		finally{
			stopWatch.stop();
			log.info("기록 종료");
			log.info(joinPoint.getSignature().getName() + "메서드 실행 시간 : " + stopWatch.getTotalTimeMillis());
		}
	
		
	}

}
