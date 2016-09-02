package spring.chap01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("ok")
public class MySQLArticleDAO implements ArticleDao{

	public void insert(Article article){
		System.out.println("MySQLArticleDao.insert() ½ÇÇà");
	}

}
