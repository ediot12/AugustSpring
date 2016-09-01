package spring.chap01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class WriteArticleServiceImpl implements WriteArticleService{
	
	
	private ArticleDao articleDao;

	
	public WriteArticleServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}

	public WriteArticleServiceImpl(ArticleDao articleDao){
		this.articleDao=articleDao;
	}
	
	@Override
	
	public void write(Article article){
		System.out.println("WriteArticleServicelmpl.write() 메서드 실행");
		articleDao.insert(article);
		
	}
	

}
