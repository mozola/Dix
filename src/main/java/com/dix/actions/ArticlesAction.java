package com.dix.actions;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.dix.entity.Articles;

public class ArticlesAction 
{
	private List <Articles> allArticles;
	private int id;
	private String title;
	private String text;
	private String author;
	private String date_add;
	private byte[] image;
	private SessionFactory sessionFactory;
	private Session session;
	
	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getDate_add() {
		return date_add;
	}


	public void setDate_add(String date_add) {
		this.date_add = date_add;
	}

	
	public List<Articles> getAllArticles() 
	{

		List<Articles> allArticles=new ArrayList<Articles>();
		sessionFactory=new Configuration().configure().buildSessionFactory();
		session=sessionFactory.openSession();
		session.beginTransaction();
		allArticles=session.createCriteria(Articles.class).list();
		session.getTransaction().commit();
		session.close();
		System.out.println(allArticles);
		return allArticles;
	}


	public void setAllArticles(List<Articles> allArticles) {
		this.allArticles = allArticles;
	}
	
	public String createNewArticle() throws Exception
	{		
		sessionFactory=new Configuration().configure().buildSessionFactory();
		session=sessionFactory.openSession();
		session.beginTransaction();
		Articles articles = new Articles();
		articles.setAuthor(author);
		articles.setDate_add(date_add);
		articles.setText(text);
		articles.setTitle(title);
		articles.setImage(image);
		session.save(articles);
		session.getTransaction().commit();
		session.close();
		return "createNewArticle";
	}
	

	public String execute() throws Exception
	{
		return "allArticles";
	}

}
