package com.sunha.jdbc.spring;

import java.util.List; 
 
 
 /** 
  * articleDao�� ����ؼ� �� ���, ��ȸ, �߰�, ����, ������ �Ѵ�. 
  *  
  * @author Jacob 
  */ 
 public class ArticleService { 
 
 
 	ArticleDao articleDao; 
 
 
 	public void setArticleDao(ArticleDao articleDao) { 
 		this.articleDao = articleDao; 
 	} 
 
 
 	/** 
 	 * �� ��� 
 	 */ 
 	public void listArticles() { 
 		List<Article> articles = articleDao.listArticles(); 
 		System.out.println(articles); 
 	} 

 
 	/** 
 	 * �� ��ȸ 
 	 */ 
 	public void getArticle() { 
 		Article article = articleDao.getArticle("3"); 
 		System.out.println(article); 
 	} 
 
 
 	/** 
 	 * �� ��� 
 	 */ 
 	public void addArticle() { 
 		Article article = new Article(); 
 		article.setTitle("���ο� '�͹̳�����' ��ȭ�� ��ƿ�� �����ƴ�(���� 6��)"); 
 		article.setContent( 
 				"���� 2��, ���ӽ� ī�޷� ������ �ڽ��� �������� ���ο� ���͹̳����͡� ��ȭ�� ������ �����ߴ�. ���͹̳����� : ��ũ ����Ʈ(Terminator: Dark Fate)��. �� ������ ���� ������ �ƴ� ���� ������ �ư�, 20���� ������ 4�� 6��, �� ��ȭ�� ��ƿ�� �����ߴ�."); 
 		article.setUserId("1"); 
 		article.setName("������"); 
 		if (articleDao.addArticle(article) > 0) 
 			System.out.println("���� �߰��߽��ϴ�."); 
 		else 
 			System.out.println("���� �߰����� ���߽��ϴ�."); 
 	} 
 
 
 	/** 
 	 * �� ���� 
 	 */ 
	public void updateArticle() { 
 		Article article = new Article(); 
 		article.setArticleId("7"); 
 		article.setTitle("This is modified title."); 
 		article.setContent("This is modified content"); 
		if (articleDao.updateArticle(article) > 0) 
 			System.out.println("���� �����߽��ϴ�."); 
 		else 
 			System.out.println("���� �������� ���߽��ϴ�."); 
 	} 
 
 	/** 
	 * �� ���� 
 	 */ 
 	public void deleteArticle() { 
 		if (articleDao.deleteArticle("8") > 0) 
 			System.out.println("���� �����߽��ϴ�."); 
 		else 
 			System.out.println("���� �������� ���߽��ϴ�."); 
 	} 
 }