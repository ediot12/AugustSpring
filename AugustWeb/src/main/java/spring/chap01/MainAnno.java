package spring.chap01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.anno.Bar;

public class MainAnno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLocations ="annoTest.xml";
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocations);
		Bar bar = context.getBean("bar",Bar.class);
		bar.doBar();
		context.registerShutdownHook();
	}

}
