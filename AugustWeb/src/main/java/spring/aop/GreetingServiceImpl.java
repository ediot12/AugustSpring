package spring.aop;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component("greetingTarget")
public class GreetingServiceImpl implements GreetingService {

	private String greeting;

	@Value("hanzo")// Greeting=abc �� ����
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public void sayHello(String name) throws Exception{
		System.out.println("sayHello : " + greeting + " : " + name);
		throw new Exception("���� ���� �߻�");

	}

	@Override
	public void sayGoodbye(String name) {
		System.out.println("sayGoodbye : " + greeting + " : " + name);
	}

	

}
