package spring.chap01;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import spring.anno.Bar;

public class Main {
	
	public static void main(String args[]){
		
	/*	String configLocations ="applicationContext.xml";
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocations);
		
		WriteArticleService articleService = context.getBean("bar",Bar.class);
		articleService.write(new Article());
		context.registerShutdownHook();*/
	}

}
