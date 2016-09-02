package spring.chap01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.anno.Bar;
import spring.anno.Foo;

public class MainAnno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configLocations ="annoTest.xml";
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocations);
		Bar bar = context.getBean("bar",Bar.class);
		bar.doBar();
		Foo foo = context.getBean("scottFoo",Foo.class);
		System.out.println(foo.getName());
		context.registerShutdownHook();
	}

}
