package spring.aop;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component("greetingTarget")
public class GreetingServiceImpl implements GreetingService {

	private String greeting;

	@Value("hanzo")// Greeting=abc 랑 같음
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	@Override
	public void sayHello(String name) throws Exception{
		System.out.println("sayHello : " + greeting + " : " + name);
		throw new Exception("강제 예외 발생");

	}

	@Override
	public void sayGoodbye(String name) {
		System.out.println("sayGoodbye : " + greeting + " : " + name);
	}

	

}
