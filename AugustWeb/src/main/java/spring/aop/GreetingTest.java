package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GreetingTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("aopTest.xml");
		GreetingService bean = ctx.getBean("greetingTarget",GreetingService.class);
		bean.sayHello("ȫ�浿");
		System.out.println("======================================");
		/*bean.sayGoodbye("ȫ�浿");*/

	}

}
