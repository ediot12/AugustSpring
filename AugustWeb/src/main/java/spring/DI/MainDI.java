package spring.DI;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainDI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new GenericXmlApplicationContext("DIEx.xml");
		
		
		for(int i=0;i<1000000;i++){
			
		}
		
		Foo f = context.getBean("foo",Foo.class);
		
		f.doFoo();
		
		
		context.registerShutdownHook(); // 
	

	}

}
