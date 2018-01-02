package com.dix.actions;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dix.entity.Exercise;
import com.dix.entity.Meal;

public class NewExerciseAction {
	
	private String name;
	private String description;
	private String specyfication;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSpecyfication() {
		return specyfication;
	}

	public void setSpecyfication(String specyfication) {
		this.specyfication = specyfication;
	}

	
	public String execute()
	{
		SessionFactory sessionFactory;
		Session session;
		
		sessionFactory=new Configuration().configure().buildSessionFactory();
		session=sessionFactory.openSession();
		session.beginTransaction();
		Exercise exer = new Exercise();
		exer.setDescription(this.description);
		exer.setName(this.name);
		exer.setSpecyfication(this.specyfication);
		session.save(exer);
		session.getTransaction().commit();
		session.close();	
		
		return "SUCCESS";
	}
}
