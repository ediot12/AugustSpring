package spring.chap01;

import org.springframework.stereotype.Component;

@Component
public interface WriteArticleService{
	void write(Article article);

}
