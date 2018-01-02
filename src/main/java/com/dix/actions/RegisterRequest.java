package com.dix.actions;

import org.hibernate.cfg.Configuration;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.dix.entity.NewUser;

public class RegisterRequest 
{
	
	private String name;
	private String surname;
	private String mail;
	private String gender;
	private String login;
	private String password;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String execute() throws Exception 
	{
		SessionFactory sessionFactory;
		Session session;
		sessionFactory=new Configuration().configure().buildSessionFactory();
		session=sessionFactory.openSession();
		session.beginTransaction();
		
		NewUser newUser = new NewUser();
		newUser.setName(name);
		newUser.setSurname(surname);
		newUser.setMail(mail);
		newUser.setGender(gender);
		newUser.setPassword(password);
		newUser.setLogin(login);
		session.save(newUser);
		session.getTransaction().commit();
		session.close();
		
		return "succed";
	}
}
