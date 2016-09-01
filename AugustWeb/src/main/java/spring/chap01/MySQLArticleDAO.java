package spring.chap01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MySQLArticleDAO implements ArticleDao{

	@Override
	@Autowired
	@Qualifier("ok")
	public void insert(Article article){
		System.out.println("MySQLArticleDao.insert() ½ÇÇà");
	}

}
