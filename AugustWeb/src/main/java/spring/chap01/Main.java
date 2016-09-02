package spring.chap01;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

	public static void main(String args[]) {

		String configLocations = "applicationContext.xml";
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(configLocations);

		WriteArticleService articleService = context.getBean("writeArticleService", WriteArticleService.class);
		articleService.write(new Article());
		context.registerShutdownHook();
	}

}
