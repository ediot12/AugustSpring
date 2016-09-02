package spring.chap01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public interface ArticleDao {
	void insert(Article article);

}
