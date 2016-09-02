package spring.chap01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("oracle")
public class OracleArticleDao implements ArticleDao{

	public void insert(Article article) {
		// TODO Auto-generated method stub
		System.out.println("Oracle.insert() ½ÇÇà");
	}

	
	
}
